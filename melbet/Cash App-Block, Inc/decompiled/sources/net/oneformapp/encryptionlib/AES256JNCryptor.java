package net.oneformapp.encryptionlib;

import com.miteksystems.misnap.core.DateUtil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes9.dex */
public final class AES256JNCryptor {
    public static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static boolean arraysEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                z = false;
            }
        }
        return z;
    }

    public static byte[] decryptData(byte[] bArr, SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2) {
        DateUtil.notNull(bArr, "Ciphertext cannot be null.", new Object[0]);
        try {
            DateUtil.isTrue(bArr.length > 0, "Data must be at least one byte long to read version number.", new Object[0]);
            byte b = bArr[0];
            if (b == 2) {
                return decryptV2Data(new AES256v2Ciphertext(bArr, 0), secretKeySpec, secretKeySpec2);
            }
            if (b == 3) {
                return decryptV3Data(new AES256v2Ciphertext(bArr, 1), secretKeySpec, secretKeySpec2);
            }
            throw new CryptorException(String.format("Unrecognised version number: %d.", Integer.valueOf(b)));
        } catch (InvalidDataException e) {
            throw new CryptorException("Unable to parse ciphertext.", e);
        }
    }

    public static byte[] decryptV2Data(AES256v2Ciphertext aES256v2Ciphertext, SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec2);
            byte[] rawData = aES256v2Ciphertext.getRawData();
            int length = rawData.length - 32;
            byte[] bArr = new byte[length];
            System.arraycopy(rawData, 0, bArr, 0, length);
            if (!arraysEqual(mac.doFinal(bArr), aES256v2Ciphertext.hmac)) {
                throw new InvalidHMACException("Incorrect HMAC value.");
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(aES256v2Ciphertext.iv));
            return cipher.doFinal(aES256v2Ciphertext.ciphertext);
        } catch (InvalidKeyException e) {
            throw new CryptorException("Caught InvalidKeyException. Do you have unlimited strength jurisdiction files installed?", e);
        } catch (GeneralSecurityException e2) {
            throw new CryptorException("Failed to decrypt message.", e2);
        }
    }

    public static byte[] decryptV3Data(AES256v2Ciphertext aES256v2Ciphertext, SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec2);
            byte[] rawData = aES256v2Ciphertext.getRawData();
            int length = rawData.length - 32;
            byte[] bArr = new byte[length];
            System.arraycopy(rawData, 0, bArr, 0, length);
            if (!arraysEqual(mac.doFinal(bArr), aES256v2Ciphertext.hmac)) {
                throw new InvalidHMACException("Incorrect HMAC value.");
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(aES256v2Ciphertext.iv));
            return cipher.doFinal(aES256v2Ciphertext.ciphertext);
        } catch (InvalidKeyException e) {
            throw new CryptorException("Caught InvalidKeyException. Do you have unlimited strength jurisdiction files installed?", e);
        } catch (GeneralSecurityException e2) {
            throw new CryptorException("Failed to decrypt message.", e2);
        }
    }

    public final SecretKeySpec keyForPassword(char[] cArr, byte[] bArr) {
        DateUtil.notNull(bArr, "Salt value cannot be null.", new Object[0]);
        DateUtil.isTrue(bArr.length == 8, "Salt value must be %d bytes.", 8);
        DateUtil.notNull(cArr, "Password cannot be null.", new Object[0]);
        DateUtil.isTrue(cArr.length > 0, "Password cannot be empty.", new Object[0]);
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            synchronized (this) {
            }
            return new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(cArr, bArr, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 256)).getEncoded(), "AES");
        } catch (GeneralSecurityException e) {
            throw new CryptorException("Failed to generate key from password using PBKDF2WithHmacSHA1.", e);
        }
    }
}
