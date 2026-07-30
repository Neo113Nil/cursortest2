package o5;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6853a = "0123456789abcdef".toCharArray();

    public static String a(double d8) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d8);
        for (int i7 = 7; i7 >= 0; i7--) {
            int i8 = (int) ((doubleToLongBits >>> (i7 * 8)) & 255);
            char[] cArr = f6853a;
            sb.append(cArr[(i8 >> 4) & 15]);
            sb.append(cArr[i8 & 15]);
        }
        return sb.toString();
    }

    public static void b(String str, boolean z8) {
        if (z8) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    public static void c(boolean z8) {
        b("", z8);
    }

    public static g d(String str) {
        String str2;
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = parse.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = parse.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            l5.j jVar = new l5.j();
            jVar.f6044a = host.toLowerCase(Locale.US);
            int port = parse.getPort();
            if (port != -1) {
                jVar.f6045b = scheme.equals("https") || scheme.equals("wss");
                jVar.f6044a += ":" + port;
            } else {
                jVar.f6045b = true;
            }
            jVar.f6046c = queryParameter;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new g5.b("Firebase Database URL is missing URL scheme");
            }
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 != -1) {
                int indexOf3 = substring.indexOf("?");
                str2 = indexOf3 != -1 ? substring.substring(indexOf2 + 1, indexOf3) : substring.substring(indexOf2 + 1);
            } else {
                str2 = "";
            }
            String replace = str2.replace("+", " ");
            k.b(replace);
            g gVar = new g();
            gVar.f6850b = new l5.f(replace);
            gVar.f6849a = jVar;
            return gVar;
        } catch (Exception e9) {
            throw new g5.b("Invalid Firebase Database url specified: " + str, e9);
        }
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e9) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e9);
        }
    }

    public static String f(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return "\"" + replace + '\"';
    }

    public static Integer g(String str) {
        boolean z8;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i7 = 0;
        if (str.charAt(0) == '-') {
            z8 = true;
            if (str.length() == 1) {
                return null;
            }
            i7 = 1;
        } else {
            z8 = false;
        }
        long j8 = 0;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j8 = (j8 * 10) + (charAt - '0');
            i7++;
        }
        if (!z8) {
            if (j8 > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j8);
        }
        long j9 = -j8;
        if (j9 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j9);
    }
}
