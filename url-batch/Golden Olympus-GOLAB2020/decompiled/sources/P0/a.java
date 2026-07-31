package P0;

import S0.c;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class a {
    private static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            c.c("CBC", "decrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            c.c("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            c.c("CBC", "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            c.c("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            c.c("CBC", "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            c.c("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e4) {
            c.c("CBC", "NullPointerException: " + e4.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e5) {
            c.c("CBC", "InvalidAlgorithmParameterException: " + e5.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e6) {
            c.c("CBC", "InvalidKeyException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e7) {
            c.c("CBC", "NoSuchAlgorithmException: " + e7.getMessage());
            return new byte[0];
        } catch (BadPaddingException e8) {
            c.c("CBC", "BadPaddingException: " + e8.getMessage());
            c.c("CBC", "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e9) {
            c.c("CBC", "IllegalBlockSizeException: " + e9.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e10) {
            c.c("CBC", "NoSuchPaddingException: " + e10.getMessage());
            return new byte[0];
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] d4 = S0.a.d(16);
        byte[] d5 = d(bArr, bArr2, d4);
        if (!Arrays.equals(d5, new byte[0])) {
            return a(d4, d5);
        }
        c.c("CBC", "encrypt encryptContent is null");
        return new byte[0];
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            c.c("CBC", "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            c.c("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            c.c("CBC", "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            c.c("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            c.c("CBC", "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            c.c("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e4) {
            c.c("CBC", "NullPointerException: " + e4.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e5) {
            c.c("CBC", "InvalidAlgorithmParameterException: " + e5.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e6) {
            c.c("CBC", "InvalidKeyException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e7) {
            c.c("CBC", "NoSuchAlgorithmException: " + e7.getMessage());
            return new byte[0];
        } catch (BadPaddingException e8) {
            c.c("CBC", "BadPaddingException: " + e8.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e9) {
            c.c("CBC", "IllegalBlockSizeException: " + e9.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e10) {
            c.c("CBC", "NoSuchPaddingException: " + e10.getMessage());
            return new byte[0];
        }
    }
}
