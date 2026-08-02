package io.appmetrica.analytics.coreutils.internal.encryption;

import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a, reason: collision with root package name */
    private final String f9737a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9738b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9739c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f9737a = str;
        this.f9738b = bArr;
        this.f9739c = bArr2;
    }

    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f9738b, "AES");
            Cipher cipher = Cipher.getInstance(this.f9737a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f9739c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f9737a;
    }

    public byte[] getIV() {
        return this.f9739c;
    }

    public byte[] getPassword() {
        return this.f9738b;
    }

    public byte[] decrypt(byte[] bArr, int i4, int i5) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f9738b, "AES");
            Cipher cipher = Cipher.getInstance(this.f9737a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f9739c));
            return cipher.doFinal(bArr, i4, i5);
        } catch (Throwable unused) {
            return null;
        }
    }
}
