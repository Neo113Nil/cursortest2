package P0;

import S0.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class b {
    private static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] d4 = S0.a.d(12);
        return a(d4, c(bArr, bArr2, d4));
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            c.c(CodePackage.GCM, "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            c.c(CodePackage.GCM, "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            c.c(CodePackage.GCM, "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            c.c(CodePackage.GCM, "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            c.c(CodePackage.GCM, "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 12) {
            c.c(CodePackage.GCM, "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        if (!e()) {
            c.c(CodePackage.GCM, "encrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, d(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e4) {
            c.c(CodePackage.GCM, "GCM encrypt data error" + e4.getMessage());
            return new byte[0];
        } catch (GeneralSecurityException e5) {
            c.c(CodePackage.GCM, "GCM encrypt data error" + e5.getMessage());
            return new byte[0];
        }
    }

    public static AlgorithmParameterSpec d(byte[] bArr) {
        return new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr);
    }

    public static boolean e() {
        return true;
    }
}
