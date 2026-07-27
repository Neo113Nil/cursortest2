package j2;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import b2.C0518b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: j2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0720j {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7166a = "0123456789abcdef".toCharArray();

    public static String a(double d4) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d4);
        for (int i2 = 7; i2 >= 0; i2--) {
            int i4 = (int) ((doubleToLongBits >>> (i2 * 8)) & 255);
            char[] cArr = f7166a;
            sb.append(cArr[(i4 >> 4) & 15]);
            sb.append(cArr[i4 & 15]);
        }
        return sb.toString();
    }

    public static void b(String str, boolean z4) {
        if (z4) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    public static void c(boolean z4) {
        b("", z4);
    }

    public static C0717g d(String str) {
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
            g2.i iVar = new g2.i();
            iVar.f6715a = host.toLowerCase(Locale.US);
            int port = parse.getPort();
            if (port != -1) {
                iVar.f6716b = scheme.equals("https") || scheme.equals("wss");
                iVar.f6715a += ":" + port;
            } else {
                iVar.f6716b = true;
            }
            iVar.f6717c = queryParameter;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new C0518b("Firebase Database URL is missing URL scheme");
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
            AbstractC0721k.b(replace);
            C0717g c0717g = new C0717g();
            c0717g.f7163b = new g2.e(replace);
            c0717g.f7162a = iVar;
            return c0717g;
        } catch (Exception e4) {
            throw new C0518b("Invalid Firebase Database url specified: " + str, e4);
        }
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e4);
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
        boolean z4;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i2 = 0;
        if (str.charAt(0) == '-') {
            z4 = true;
            if (str.length() == 1) {
                return null;
            }
            i2 = 1;
        } else {
            z4 = false;
        }
        long j4 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j4 = (j4 * 10) + (charAt - '0');
            i2++;
        }
        if (!z4) {
            if (j4 > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j4);
        }
        long j5 = -j4;
        if (j5 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j5);
    }
}
