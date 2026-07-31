package com.linecorp.android.security.encryption;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class StringCipher {
    private static final int AES_KEY_SIZE_IN_BIT = 256;
    private static final int DEFAULT_ITERATIONS = 10000;
    private static final int HMAC_KEY_SIZE_IN_BIT = 256;
    private static final int HMAC_SIZE_IN_BYTE = 32;
    private static final int IV_SIZE_IN_BYTE = 16;
    private static final String SALT_SHARED_PREFERENCE_KEY = "salt";
    private static final int SALT_SIZE_IN_BYTE = 16;

    @NonNull
    private final Cipher cipher;

    @NonNull
    private final Mac hmac;
    private boolean isSerialIncludedInDevicePackageSpecificId;

    @NonNull
    private final SecretKeyFactory keyFactory;
    private final int pbkdf2IterationCount;
    private SecretKeys secretKeys;

    @NonNull
    private final SecureRandom secureRandom;

    @NonNull
    private final String sharedPreferenceName;

    @NonNull
    private final Object syncObject;

    private static class SecretKeys {

        @NonNull
        private final SecretKey encryptionKey;

        @NonNull
        private final SecretKey integrityKey;

        SecretKeys(@NonNull SecretKey secretKey, @NonNull SecretKey secretKey2) {
            this.encryptionKey = secretKey;
            this.integrityKey = secretKey2;
        }
    }

    public StringCipher(@NonNull String str) {
        this(str, 10000, false);
    }

    @NonNull
    private String generateDevicePackageSpecificId(@NonNull Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return Build.MODEL + Build.MANUFACTURER + (this.isSerialIncludedInDevicePackageSpecificId ? Build.SERIAL : "") + string + context.getPackageName();
    }

    @NonNull
    private byte[] getSalt(@NonNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.sharedPreferenceName, 0);
        String string = sharedPreferences.getString(SALT_SHARED_PREFERENCE_KEY, null);
        if (!TextUtils.isEmpty(string)) {
            return Base64.decode(string, 0);
        }
        byte[] bArr = new byte[16];
        this.secureRandom.nextBytes(bArr);
        sharedPreferences.edit().putString(SALT_SHARED_PREFERENCE_KEY, Base64.encodeToString(bArr, 0)).apply();
        return bArr;
    }

    @NonNull
    private SecretKeys getSecretKeys(@NonNull Context context) {
        String generateDevicePackageSpecificId = generateDevicePackageSpecificId(context);
        try {
            byte[] encoded = this.keyFactory.generateSecret(new PBEKeySpec(generateDevicePackageSpecificId.toCharArray(), getSalt(context), this.pbkdf2IterationCount, UserVerificationMethods.USER_VERIFY_NONE)).getEncoded();
            return new SecretKeys(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e4) {
            throw new RuntimeException(e4);
        }
    }

    @NonNull
    public String decrypt(@NonNull Context context, @NonNull String str) {
        String str2;
        synchronized (this.syncObject) {
            initialize(context);
            try {
                byte[] decode = Base64.decode(str, 0);
                byte[] copyOfRange = Arrays.copyOfRange(decode, decode.length - 32, decode.length);
                this.hmac.init(this.secretKeys.integrityKey);
                this.hmac.update(decode, 0, decode.length - 32);
                if (!MessageDigest.isEqual(this.hmac.doFinal(), copyOfRange)) {
                    throw new EncryptionException("Cipher text has been tampered with.");
                }
                this.cipher.init(2, this.secretKeys.encryptionKey, new IvParameterSpec(decode, 0, 16));
                str2 = new String(this.cipher.doFinal(decode, 16, decode.length - 48), "UTF-8");
            } catch (UnsupportedEncodingException e4) {
                e = e4;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e5) {
                e = e5;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e6) {
                e = e6;
                throw new RuntimeException(e);
            } catch (BadPaddingException e7) {
                throw new EncryptionException(e7);
            } catch (IllegalBlockSizeException e8) {
                e = e8;
                throw new RuntimeException(e);
            }
        }
        return str2;
    }

    @NonNull
    public String encrypt(@NonNull Context context, @NonNull String str) {
        String encodeToString;
        synchronized (this.syncObject) {
            try {
                initialize(context);
                try {
                    int blockSize = this.cipher.getBlockSize();
                    byte[] bArr = new byte[blockSize];
                    this.secureRandom.nextBytes(bArr);
                    this.cipher.init(1, this.secretKeys.encryptionKey, new IvParameterSpec(bArr));
                    byte[] doFinal = this.cipher.doFinal(str.getBytes("UTF-8"));
                    byte[] bArr2 = new byte[doFinal.length + blockSize + 32];
                    System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                    System.arraycopy(doFinal, 0, bArr2, blockSize, doFinal.length);
                    this.hmac.init(this.secretKeys.integrityKey);
                    this.hmac.update(bArr2, 0, doFinal.length + blockSize);
                    byte[] doFinal2 = this.hmac.doFinal();
                    System.arraycopy(doFinal2, 0, bArr2, blockSize + doFinal.length, doFinal2.length);
                    encodeToString = Base64.encodeToString(bArr2, 0);
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                    throw new RuntimeException(e);
                } catch (InvalidAlgorithmParameterException e5) {
                    e = e5;
                    throw new RuntimeException(e);
                } catch (InvalidKeyException e6) {
                    e = e6;
                    throw new RuntimeException(e);
                } catch (BadPaddingException e7) {
                    throw new EncryptionException(e7);
                } catch (IllegalBlockSizeException e8) {
                    e = e8;
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return encodeToString;
    }

    public void initialize(@NonNull Context context) {
        synchronized (this.syncObject) {
            try {
                if (this.secretKeys == null) {
                    this.secretKeys = getSecretKeys(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public StringCipher(@NonNull String str, int i4, boolean z4) {
        this.syncObject = new Object();
        this.sharedPreferenceName = str;
        this.pbkdf2IterationCount = i4;
        this.isSerialIncludedInDevicePackageSpecificId = z4;
        try {
            this.secureRandom = new SecureRandom();
            this.keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            this.hmac = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            throw new RuntimeException(e4);
        }
    }
}
