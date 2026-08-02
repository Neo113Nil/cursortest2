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
    private final String f5483a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5484b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5485c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f5483a = str;
        this.f5484b = bArr;
        this.f5485c = bArr2;
    }

    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f5484b, "AES");
            Cipher cipher = Cipher.getInstance(this.f5483a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f5485c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f5483a;
    }

    public byte[] getIV() {
        return this.f5485c;
    }

    public byte[] getPassword() {
        return this.f5484b;
    }

    public byte[] decrypt(byte[] bArr, int i3, int i4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f5484b, "AES");
            Cipher cipher = Cipher.getInstance(this.f5483a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f5485c));
            return cipher.doFinal(bArr, i3, i4);
        } catch (Throwable unused) {
            return null;
        }
    }
}
