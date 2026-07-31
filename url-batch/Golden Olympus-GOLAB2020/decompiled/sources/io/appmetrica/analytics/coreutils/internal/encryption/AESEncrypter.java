package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a, reason: collision with root package name */
    private final String f37022a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37023b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f37024c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f37022a = str;
        this.f37023b = bArr;
        this.f37024c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f37023b, "AES");
            Cipher cipher = Cipher.getInstance(this.f37022a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f37024c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f37022a;
    }

    public byte[] getIV() {
        return this.f37024c;
    }

    public byte[] getPassword() {
        return this.f37023b;
    }

    public byte[] decrypt(@NonNull byte[] bArr, int i4, int i5) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f37023b, "AES");
            Cipher cipher = Cipher.getInstance(this.f37022a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f37024c));
            return cipher.doFinal(bArr, i4, i5);
        } catch (Throwable unused) {
            return null;
        }
    }
}
