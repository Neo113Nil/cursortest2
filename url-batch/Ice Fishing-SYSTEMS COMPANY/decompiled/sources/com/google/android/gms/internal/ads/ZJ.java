package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class ZJ implements InterfaceC3569mE {

    /* renamed from: e, reason: collision with root package name */
    public static final H7.b f28976e = new H7.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f28977a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3140eH f28978b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f28979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28980d;

    public ZJ(int i, byte[] bArr, byte[] bArr2) {
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f28980d = i;
        int length = bArr.length;
        AbstractC3137eE.c(length);
        this.f28979c = new SecretKeySpec(bArr, "AES");
        this.f28978b = C3686oN.i(C3031cH.j(C3086dH.b(length), new Mu(7, C3791qK.a(bArr))));
        this.f28977a = bArr2;
    }

    public static ZJ b(JE je) {
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        je.getClass();
        return new ZJ(je.f25749b.f26314b, ((C3791qK) je.f25750c.f26395u).b(), je.f25751d.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f28977a;
        int length2 = bArr3.length;
        int i = this.f28980d;
        int i4 = ((length - length2) - i) - 16;
        if (i4 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] c4 = c(0, length2, i, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] c9 = c(1, 0, bArr2.length, bArr2);
        byte[] c10 = c(2, length2 + i, i4, bArr);
        int i9 = length - 16;
        byte b9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b9 = (byte) (b9 | (((bArr[i9 + i10] ^ c9[i10]) ^ c4[i10]) ^ c10[i10]));
        }
        if (b9 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f28976e.get();
        cipher.init(1, this.f28979c, new IvParameterSpec(c4));
        return cipher.doFinal(bArr, bArr3.length + i, i4);
    }

    public final byte[] c(int i, int i4, int i9, byte[] bArr) {
        byte[] bArr2 = new byte[i9 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i4, bArr2, 16, i9);
        return this.f28978b.n(16, bArr2);
    }
}
