package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class FF implements InterfaceC3569mE {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24936a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24937b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f24938c;

    public FF(byte[] bArr, byte[] bArr2, Provider provider) {
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f24936a = bArr;
        this.f24937b = bArr2;
        this.f24938c = provider;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f24937b;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] d2 = AbstractC4109wF.d(AbstractC4109wF.c(this.f24936a), AbstractC4109wF.c(bArr4));
        ByteBuffer order = ByteBuffer.allocate(d2.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = C4001uF.f34569d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f24938c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 24 + length2, (length - length2) - 24);
    }
}
