package Q0;

import S0.c;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9166a = "PBKDF2";

    private static byte[] a(char[] cArr, byte[] bArr, int i4, int i5, boolean z4) {
        if (cArr == null || cArr.length <= 0) {
            c.c(f9166a, "pbkdf password is empty.");
            return new byte[0];
        }
        if (bArr == null || bArr.length <= 0) {
            c.c(f9166a, "pbkdf salt is empty.");
            return new byte[0];
        }
        if (bArr.length < 16) {
            c.c(f9166a, "pbkdf salt parameter length is not enough, length must be more than 16.");
            return new byte[0];
        }
        if (i4 < 1000) {
            c.c(f9166a, "pbkdf iterations parameter count is less than 1000.");
            return new byte[0];
        }
        if (i5 >= 256) {
            return c(cArr, bArr, i4, i5, z4);
        }
        c.c(f9166a, "pbkdf bytes parameter count is less than 256.");
        return new byte[0];
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i4, int i5) {
        return a(cArr, bArr, i4, i5, false);
    }

    public static byte[] c(char[] cArr, byte[] bArr, int i4, int i5, boolean z4) {
        try {
            return (z4 ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, i4, i5)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e4) {
            c.c(f9166a, "pbkdf exception : " + e4.getMessage());
            return new byte[0];
        }
    }
}
