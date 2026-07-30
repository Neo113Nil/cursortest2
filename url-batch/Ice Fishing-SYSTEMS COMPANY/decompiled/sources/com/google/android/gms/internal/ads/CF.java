package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class CF implements InterfaceC3569mE {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24156b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3140eH f24157c;

    public CF(byte[] bArr, C3791qK c3791qK, int i) {
        this.f24157c = C3686oN.i(C3031cH.j(C3086dH.b(bArr.length), new Mu(7, C3791qK.a(bArr))));
        this.f24155a = c3791qK.b();
        this.f24156b = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f24155a;
        int length2 = bArr3.length;
        int i = this.f24156b + length2;
        int i4 = i + 28;
        if (length < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        InterfaceC3140eH interfaceC3140eH = this.f24157c;
        System.arraycopy(interfaceC3140eH.n(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(interfaceC3140eH.n(16, bArr5), 0, bArr6, 16, 16);
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        H7.b bVar = AbstractC3786qF.f33675a;
        AbstractC3137eE.c(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i9 = i + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, i9);
        if (copyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, copyOfRange2, 0, 12);
        Cipher cipher = (Cipher) AbstractC3786qF.f33675a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i9, length - i9);
    }
}
