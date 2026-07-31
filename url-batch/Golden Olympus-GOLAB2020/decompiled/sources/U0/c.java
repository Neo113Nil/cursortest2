package U0;

import V0.f;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9362a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9363b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f9363b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z4) {
        String[] d4 = d(x509Certificate);
        String[] f4 = f(x509Certificate);
        f.b("", "cn is : " + Arrays.toString(d4));
        f.b("", "san is : " + Arrays.toString(f4));
        b(str, d4, f4, z4);
    }

    public static final void b(String str, String[] strArr, String[] strArr2, boolean z4) {
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append('>');
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(46, 2) == -1 || !c(lowerCase2) || g(str)) {
                z5 = lowerCase.equals(lowerCase2);
            } else {
                boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                z5 = (endsWith && z4) ? e(lowerCase) == e(lowerCase2) : endsWith;
            }
            if (z5) {
                break;
            }
        }
        if (z5) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length >= 7 && length <= 9) {
            int i4 = length - 3;
            if (str.charAt(i4) == '.') {
                return Arrays.binarySearch(f9363b, str.substring(2, i4)) < 0;
            }
        }
        return true;
    }

    public static String[] d(X509Certificate x509Certificate) {
        List d4 = new b(x509Certificate.getSubjectX500Principal()).d("cn");
        if (d4.isEmpty()) {
            return null;
        }
        String[] strArr = new String[d4.size()];
        d4.toArray(strArr);
        return strArr;
    }

    public static int e(String str) {
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            if (str.charAt(i5) == '.') {
                i4++;
            }
        }
        return i4;
    }

    public static String[] f(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e4) {
            f.c("", "Error parsing certificate.", e4);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    private static boolean g(String str) {
        return f9362a.matcher(str).matches();
    }
}
