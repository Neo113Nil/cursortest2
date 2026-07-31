package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class gm3 implements mn3 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f5685d = new fm3();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f5686a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5687b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5688c;

    public gm3(byte[] bArr, int i7) {
        if (!qf3.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        wn3.a(bArr.length);
        this.f5686a = new SecretKeySpec(bArr, "AES");
        int blockSize = f5685d.get().getBlockSize();
        this.f5688c = blockSize;
        if (i7 < 12 || i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f5687b = i7;
    }

    @Override // com.google.android.gms.internal.ads.mn3
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i7 = this.f5687b;
        int i8 = Integer.MAX_VALUE - i7;
        if (length > i8) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i8);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[i7 + length];
        byte[] a7 = un3.a(i7);
        System.arraycopy(a7, 0, bArr2, 0, this.f5687b);
        int i9 = this.f5687b;
        Cipher cipher = f5685d.get();
        byte[] bArr3 = new byte[this.f5688c];
        System.arraycopy(a7, 0, bArr3, 0, this.f5687b);
        cipher.init(1, this.f5686a, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i9) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
