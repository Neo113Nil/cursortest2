package w0;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class k {
    public static SecretKey a(e eVar) {
        if (eVar == null || !eVar.a()) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        Log.d("AGC_Keys", "build aes key, iterationCount:" + eVar.g());
        SecretKey generateSecret = SecretKeyFactory.getInstance(eVar.f()).generateSecret(new PBEKeySpec(AbstractC3483a.c(e(AbstractC3483a.b(eVar.b()), AbstractC3483a.b(eVar.c()), AbstractC3483a.b(eVar.d()))).toCharArray(), AbstractC3483a.b(eVar.e()), eVar.g(), eVar.h() * 8));
        Log.d("AGC_Keys", "build aes key end");
        return new SecretKeySpec(generateSecret.getEncoded(), "AES");
    }

    static byte[] b(SecretKey secretKey, byte[] bArr) {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKey, new IvParameterSpec(copyOfRange));
        return cipher.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
    }

    private static byte[] c(byte[] bArr, int i4) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null.");
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (i4 < 0) {
                bArr[i5] = (byte) (bArr[i5] << (-i4));
            } else {
                bArr[i5] = (byte) (bArr[i5] >> i4);
            }
        }
        return bArr;
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
        return bArr3;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return d(c(d(c(bArr, -4), bArr2), 6), bArr3);
    }
}
