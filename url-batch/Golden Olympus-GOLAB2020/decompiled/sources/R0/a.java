package R0;

import S0.c;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map f9172a = new ConcurrentHashMap();

    private static SecretKey a(String str, Boolean bool) {
        c.d("GCMKS", "load key");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            if (!bool.booleanValue()) {
                return null;
            }
            c.d("GCMKS", "generate key");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(UserVerificationMethods.USER_VERIFY_HANDPRINT).build());
            return keyGenerator.generateKey();
        } catch (IOException e4) {
            c.c("GCMKS", "IOException : " + e4.getMessage());
            throw new b("IOException : " + e4.getMessage());
        } catch (InvalidAlgorithmParameterException e5) {
            c.c("GCMKS", "InvalidAlgorithmParameterException : " + e5.getMessage());
            throw new b("InvalidAlgorithmParameterException : " + e5.getMessage());
        } catch (KeyStoreException e6) {
            c.c("GCMKS", "KeyStoreException : " + e6.getMessage());
            throw new b("KeyStoreException : " + e6.getMessage());
        } catch (NoSuchAlgorithmException e7) {
            c.c("GCMKS", "NoSuchAlgorithmException : " + e7.getMessage());
            throw new b("NoSuchAlgorithmException : " + e7.getMessage());
        } catch (NoSuchProviderException e8) {
            c.c("GCMKS", "NoSuchProviderException : " + e8.getMessage());
            throw new b("NoSuchProviderException : " + e8.getMessage());
        } catch (UnrecoverableKeyException e9) {
            c.c("GCMKS", "UnrecoverableKeyException : " + e9.getMessage());
            throw new b("UnrecoverableKeyException : " + e9.getMessage());
        } catch (CertificateException e10) {
            c.c("GCMKS", "CertificateException : " + e10.getMessage());
            throw new b("CertificateException : " + e10.getMessage());
        } catch (Exception e11) {
            c.c("GCMKS", "Exception: " + e11.getMessage());
            throw new b("Exception : " + e11.getMessage());
        }
    }

    private static SecretKey c(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((SecretKey) f9172a.get(str)) == null) {
            synchronized (a.class) {
                try {
                    if (((SecretKey) f9172a.get(str)) == null) {
                        SecretKey a4 = a(str, bool);
                        if (a4 == null) {
                            c.c("GCMKS", "AES GCM is decrypt,but alias is null");
                            throw new b("AES GCM is decrypt,but alias is null");
                        }
                        f9172a.put(str, a4);
                    }
                } finally {
                }
            }
        }
        return (SecretKey) f9172a.get(str);
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            c.c("GCMKS", "decrypt alias is empty.");
            throw new b("decrypt alias is empty.");
        }
        if (TextUtils.isEmpty(str2)) {
            c.c("GCMKS", "decrypt content is empty.");
            throw new b("decrypt content is empty.");
        }
        try {
            return new String(e(str, S0.b.b(str2)), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            c.c("GCMKS", "decrypt content getBytes with utf-8 error.");
            throw new b("decrypt content getBytes with utf-8 error.");
        }
    }

    public static byte[] e(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            c.c("GCMKS", "decrypt alias is empty.");
            throw new b("decrypt alias is empty.");
        }
        if (bArr == null || bArr.length == 0) {
            c.c("GCMKS", "decrypt content byte is empty.");
            throw new b("decrypt content byte is empty.");
        }
        b();
        if (bArr.length > 12) {
            return f(c(str, Boolean.FALSE), bArr);
        }
        c.c("GCMKS", "decrypt content length is less than iv len.");
        throw new b("decrypt content length is less than iv len.");
    }

    public static byte[] f(SecretKey secretKey, byte[] bArr) {
        if (secretKey == null) {
            c.c("GCMKS", "decrypt secretKey is empty.");
            throw new b("decrypt secretKey is empty.");
        }
        if (bArr == null || bArr.length == 0) {
            c.c("GCMKS", "decrypt content is empty.");
            throw new b("decrypt content is empty.");
        }
        b();
        if (bArr.length <= 12) {
            c.c("GCMKS", "decrypt content length is less than iv len.");
            throw new b("decrypt content length is less than iv len.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, copyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e4) {
            c.c("GCMKS", "InvalidAlgorithmParameterException : " + e4.getMessage());
            throw new b("InvalidAlgorithmParameterException : " + e4.getMessage());
        } catch (InvalidKeyException e5) {
            c.c("GCMKS", "InvalidKeyException : " + e5.getMessage());
            throw new b("InvalidKeyException : " + e5.getMessage());
        } catch (NoSuchAlgorithmException e6) {
            c.c("GCMKS", "NoSuchAlgorithmException : " + e6.getMessage());
            throw new b("NoSuchAlgorithmException : " + e6.getMessage());
        } catch (BadPaddingException e7) {
            c.c("GCMKS", "BadPaddingException : " + e7.getMessage());
            throw new b("BadPaddingException : " + e7.getMessage());
        } catch (IllegalBlockSizeException e8) {
            c.c("GCMKS", "IllegalBlockSizeException : " + e8.getMessage());
            throw new b("IllegalBlockSizeException : " + e8.getMessage());
        } catch (NoSuchPaddingException e9) {
            c.c("GCMKS", "NoSuchPaddingException : " + e9.getMessage());
            throw new b("NoSuchPaddingException : " + e9.getMessage());
        } catch (Exception e10) {
            c.c("GCMKS", "Exception: " + e10.getMessage());
            throw new b("Exception: " + e10.getMessage());
        }
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            c.c("GCMKS", "encrypt alias is empty.");
            throw new b("encrypt alias is empty.");
        }
        if (TextUtils.isEmpty(str2)) {
            c.c("GCMKS", "encrypt content is empty.");
            throw new b("encrypt content is empty.");
        }
        try {
            return S0.b.a(h(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            c.c("GCMKS", "encrypt content getBytes with utf-8 error.");
            throw new b("encrypt content getBytes with utf-8 error.");
        }
    }

    public static byte[] h(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            c.c("GCMKS", "encrypt alias is empty.");
            throw new b("encrypt alias is empty.");
        }
        if (bArr == null || bArr.length == 0) {
            c.c("GCMKS", "encrypt content is empty.");
            throw new b("encrypt content is empty.");
        }
        b();
        return i(c(str, Boolean.TRUE), bArr);
    }

    public static byte[] i(SecretKey secretKey, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            c.c("GCMKS", "encrypt content is empty.");
            throw new b("encrypt content is empty.");
        }
        if (secretKey == null) {
            c.c("GCMKS", "encrypt secretKey is empty.");
            throw new b("encrypt secretKey is empty.");
        }
        b();
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv == null || iv.length != 12) {
                c.c("GCMKS", "encrypt content iv is invalid.");
                throw new b("encrypt content iv is invalid.");
            }
            byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
            System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
            return copyOf;
        } catch (InvalidKeyException e4) {
            c.c("GCMKS", "InvalidKeyException : " + e4.getMessage());
            throw new b("InvalidKeyException : " + e4.getMessage());
        } catch (NoSuchAlgorithmException e5) {
            c.c("GCMKS", "NoSuchAlgorithmException : " + e5.getMessage());
            throw new b("NoSuchAlgorithmException : " + e5.getMessage());
        } catch (BadPaddingException e6) {
            c.c("GCMKS", "BadPaddingException : " + e6.getMessage());
            throw new b("BadPaddingException : " + e6.getMessage());
        } catch (IllegalBlockSizeException e7) {
            c.c("GCMKS", "IllegalBlockSizeException : " + e7.getMessage());
            throw new b("IllegalBlockSizeException : " + e7.getMessage());
        } catch (NoSuchPaddingException e8) {
            c.c("GCMKS", "NoSuchPaddingException : " + e8.getMessage());
            throw new b("NoSuchPaddingException : " + e8.getMessage());
        } catch (Exception e9) {
            c.c("GCMKS", "Exception: " + e9.getMessage());
            throw new b("Exception : " + e9.getMessage());
        }
    }

    private static void b() {
    }
}
