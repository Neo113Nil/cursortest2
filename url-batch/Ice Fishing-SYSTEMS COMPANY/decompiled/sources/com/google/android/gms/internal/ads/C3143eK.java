package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.eK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3143eK implements InterfaceC3569mE {

    /* renamed from: a, reason: collision with root package name */
    public final YJ f30341a;

    /* renamed from: b, reason: collision with root package name */
    public final C3575mK f30342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30343c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f30344d;

    public C3143eK(YJ yj, C3575mK c3575mK, int i, byte[] bArr) {
        this.f30341a = yj;
        this.f30342b = c3575mK;
        this.f30343c = i;
        this.f30344d = bArr;
    }

    public static C3143eK b(CE ce) {
        byte[] b9 = ((C3791qK) ce.f24151c.f26395u).b();
        IE ie = ce.f24150b;
        YJ yj = new YJ(b9, ie.f25541c);
        String valueOf = String.valueOf(ie.f25544f);
        O5 o52 = new O5("HMAC".concat(valueOf), new SecretKeySpec(((C3791qK) ce.f24152d.f26395u).b(), "HMAC"));
        int i = ie.f25542d;
        return new C3143eK(yj, new C3575mK(o52, i), i, ce.f24153e.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f30344d;
        int length2 = bArr3.length;
        int i = this.f30343c;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i4 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i4);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i4, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] f6 = XC.f(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        C3575mK c3575mK = this.f30342b;
        byte[] bArr4 = c3575mK.f32682d;
        int length3 = bArr4.length;
        int i9 = c3575mK.f32680b;
        InterfaceC3140eH interfaceC3140eH = c3575mK.f32679a;
        byte[] bArr5 = c3575mK.f32681c;
        if (!MessageDigest.isEqual(length3 > 0 ? XC.f(bArr5, interfaceC3140eH.n(i9, XC.f(f6, bArr4))) : XC.f(bArr5, interfaceC3140eH.n(i9, f6)), copyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        YJ yj = this.f30341a;
        int length4 = copyOfRange.length;
        int i10 = yj.f28818b;
        if (length4 < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i10];
        System.arraycopy(copyOfRange, 0, bArr6, 0, i10);
        int i11 = length4 - i10;
        byte[] bArr7 = new byte[i11];
        Cipher cipher = (Cipher) YJ.f28816d.get();
        byte[] bArr8 = new byte[yj.f28819c];
        System.arraycopy(bArr6, 0, bArr8, 0, i10);
        cipher.init(2, yj.f28817a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(copyOfRange, i10, i11, bArr7, 0) == i11) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
