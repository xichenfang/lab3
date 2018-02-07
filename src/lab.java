import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class lab {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] unused) {


        String hamlet = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] wordCount = hamlet.split(" ");
        int totalWorde = wordCount.length;
        System.out.print(totalWorde);

        String ham = hamlet.replaceAll("[Prince]","@");
        String hem = ham.replaceAll("[^@]","");
        int totalPrince = hem.length();
        System.out.print(totalPrince);

    }

}
