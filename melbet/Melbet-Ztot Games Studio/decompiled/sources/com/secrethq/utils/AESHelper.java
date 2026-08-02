package com.secrethq.utils;

import android.os.Build;
import android.util.Base64;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class AESHelper {
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String DELIMITER = "]";
    private static final String HEX = "0123456789ABCDEF";
    private static final int ITERATION_COUNT = 1;
    private static final int KEY_LENGTH = 256;
    private static final String PBKDF2_DERIVATION_ALGORITHM = "PBKDF2WithHmacSHA1";
    private static final int PKCS5_SALT_LENGTH = 32;
    private static final SecureRandom random = new SecureRandom();

    public static String encrypt(String str) throws Exception {
        if (Build.VERSION.SDK_INT >= 26) {
            return encryptAPI26("androidx.multidexAF3D30", str);
        }
        return encryptOther("androidx.multidexAF3D30", str);
    }

    public static String decrypt(String str) throws Exception {
        if (Build.VERSION.SDK_INT >= 26) {
            return decryptAPI26(str, "androidx.multidexAF3D30");
        }
        return decryptOther(str, "androidx.multidexAF3D30");
    }

    public static String encryptAPI26(String str, String str2) throws Exception {
        byte[] generateSalt = generateSalt();
        SecretKey deriveKey = deriveKey(str, generateSalt);
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            byte[] generateIv = generateIv(cipher.getBlockSize());
            cipher.init(1, deriveKey, new IvParameterSpec(generateIv));
            byte[] doFinal = cipher.doFinal(str2.getBytes("UTF-8"));
            if (generateSalt != null) {
                return String.format("%s%s%s%s%s", toBase64(generateSalt), DELIMITER, toBase64(generateIv), DELIMITER, toBase64(doFinal));
            }
            return String.format("%s%s%s", toBase64(generateIv), DELIMITER, toBase64(doFinal));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String encryptOther(String str, String str2) throws Exception {
        return toHex(encrypt(getRawKey(str.getBytes()), str2.getBytes()));
    }

    public static String decryptAPI26(String str, String str2) {
        String[] split = str.split(DELIMITER);
        if (split.length != 3) {
            throw new IllegalArgumentException("Invalid encypted text format");
        }
        byte[] fromBase64 = fromBase64(split[0]);
        byte[] fromBase642 = fromBase64(split[1]);
        byte[] fromBase643 = fromBase64(split[2]);
        SecretKey deriveKey = deriveKey(str2, fromBase64);
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            cipher.init(2, deriveKey, new IvParameterSpec(fromBase642));
            return new String(cipher.doFinal(fromBase643), "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public static String decryptOther(String str, String str2) throws Exception {
        return new String(decrypt(getRawKey(str2.getBytes()), toByte(str)));
    }

    private static byte[] getRawKey(byte[] bArr) throws Exception {
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(bArr);
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    private static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bArr2);
    }

    private static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr2);
    }

    public static String toHex(String str) {
        return toHex(str.getBytes());
    }

    public static String fromHex(String str) {
        return new String(toByte(str));
    }

    public static byte[] toByte(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String toHex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            appendHex(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    private static void appendHex(StringBuffer stringBuffer, byte b) {
        stringBuffer.append(HEX.charAt((b >> 4) & 15)).append(HEX.charAt(b & Ascii.SI));
    }

    private static byte[] generateSalt() {
        byte[] bArr = new byte[32];
        random.nextBytes(bArr);
        return bArr;
    }

    private static byte[] generateIv(int i) {
        byte[] bArr = new byte[i];
        random.nextBytes(bArr);
        return bArr;
    }

    private static SecretKey deriveKey(String str, byte[] bArr) {
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance(PBKDF2_DERIVATION_ALGORITHM).generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 1, 256)).getEncoded(), "AES");
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    private static String toBase64(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    private static byte[] fromBase64(String str) {
        return Base64.decode(str, 2);
    }
}
