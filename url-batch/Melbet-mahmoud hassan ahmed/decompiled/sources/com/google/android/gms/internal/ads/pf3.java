package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class pf3 implements wc3 {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f10228b = new of3();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f10229a;

    public pf3(byte[] bArr) {
        wn3.a(bArr.length);
        this.f10229a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.wc3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] a7 = un3.a(12);
        System.arraycopy(a7, 0, bArr3, 0, 12);
        int length2 = a7.length;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, a7, 0, length2);
        } catch (ClassNotFoundException unused) {
            if (!vn3.b()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(a7, 0, length2);
        }
        ThreadLocal<Cipher> threadLocal = f10228b;
        threadLocal.get().init(1, this.f10229a, ivParameterSpec);
        int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
        if (doFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
    }
}
