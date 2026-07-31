package O0;

import android.util.Pair;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1145a = Charset.forName("UTF-8");

    public static Pair a(String str, int i4) {
        if (str == null || str.length() < i4) {
            return new Pair(new byte[0], str);
        }
        String substring = str.substring(0, i4);
        return new Pair(S0.b.b(substring), str.substring(i4));
    }

    public static String b(String str, String str2) {
        Pair a4 = a(str, 32);
        return new String(P0.a.b(S0.b.b((String) a4.second), S0.b.b(str2), (byte[]) a4.first), f1145a);
    }

    public static String c(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] b4 = S0.b.b(str);
            if (b4.length >= 16) {
                return S0.b.a(P0.b.b(bArr, b4));
            }
            str2 = "key length is not right";
        }
        j0.e("AesCipher", str2);
        return "";
    }

    public static String d(String str, String str2) {
        return S0.b.a(P0.a.c(str.getBytes(f1145a), S0.b.b(str2)));
    }
}
