package com.baidu.mapauto.auth.util;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class AESECBPKCS5PaddingUtil {
    private static final Charset CHARSET_UTF8 = StandardCharsets.UTF_8;
    private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String DEFAULT_VALUE = "0";
    private static final String KEY_ALGORITHM = "AES";
    public static final int SECRET_KEY_LENGTH = 32;

    public static byte[] base64Decode(String str) {
        return Base64.decode(str, 2);
    }

    public static String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String decrypt(String str, String str2) {
        try {
            byte[] base64Decode = base64Decode(str);
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            cipher.init(2, getSecretKey(str2));
            return new String(cipher.doFinal(base64Decode), CHARSET_UTF8);
        } catch (Exception e8) {
            handleException(e8);
            return null;
        }
    }

    public static String encrypt(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            cipher.init(1, getSecretKey(str2));
            return base64Encode(cipher.doFinal(str.getBytes(CHARSET_UTF8)));
        } catch (Exception e8) {
            handleException(e8);
            return null;
        }
    }

    public static SecretKeySpec getSecretKey(String str) {
        return new SecretKeySpec(toMakeKey(str, 32, "0").getBytes(CHARSET_UTF8), KEY_ALGORITHM);
    }

    private static void handleException(Exception exc) {
        exc.printStackTrace();
    }

    private static String toMakeKey(String str, int i8, String str2) {
        int length = str.length();
        if (length < i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (int i9 = 0; i9 < i8 - length; i9++) {
                sb.append(str2);
            }
            str = sb.toString();
        }
        return str.substring(0, 32);
    }
}
