package Q0;

import S0.c;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9167a = "SHA";

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9168b = {"SHA-256", "SHA-384", "SHA-512"};

    private static boolean a(String str) {
        for (String str2 : f9168b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return c(str, "SHA-256");
    }

    public static String c(String str, String str2) {
        byte[] bArr;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            c.c(f9167a, "content or algorithm is null.");
            return "";
        }
        if (!a(str2)) {
            c.c(f9167a, "algorithm is not safe or legal");
            return "";
        }
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = new byte[0];
            c.c(f9167a, "Error in generate SHA UnsupportedEncodingException");
        }
        return S0.b.a(d(bArr, str2));
    }

    public static byte[] d(byte[] bArr, String str) {
        if (bArr == null || TextUtils.isEmpty(str)) {
            c.c(f9167a, "content or algorithm is null.");
            return new byte[0];
        }
        if (!a(str)) {
            c.c(f9167a, "algorithm is not safe or legal");
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            c.c(f9167a, "Error in generate SHA NoSuchAlgorithmException");
            return new byte[0];
        }
    }
}
