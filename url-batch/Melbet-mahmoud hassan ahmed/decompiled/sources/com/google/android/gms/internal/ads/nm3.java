package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class nm3 implements zc3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Collection<Integer> f9174c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9175d = new byte[16];

    /* renamed from: a, reason: collision with root package name */
    private final pn3 f9176a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9177b;

    public nm3(byte[] bArr) {
        if (!qf3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection<Integer> collection = f9174c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i7 = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i7);
            this.f9177b = Arrays.copyOfRange(bArr, i7, length);
            this.f9176a = new pn3(copyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zc3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] c7;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher a7 = cn3.f3891e.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] a8 = this.f9176a.a(f9175d, 16);
        for (int i7 = 0; i7 <= 0; i7++) {
            byte[] bArr4 = bArr3[i7];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            a8 = pm3.c(om3.b(a8), this.f9176a.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = a8.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i8 = length - length2;
            c7 = Arrays.copyOf(bArr5, length);
            for (int i9 = 0; i9 < a8.length; i9++) {
                int i10 = i8 + i9;
                c7[i10] = (byte) (c7[i10] ^ a8[i9]);
            }
        } else {
            c7 = pm3.c(om3.a(bArr5), om3.b(a8));
        }
        byte[] a9 = this.f9176a.a(c7, 16);
        byte[] bArr6 = (byte[]) a9.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        a7.init(1, new SecretKeySpec(this.f9177b, "AES"), new IvParameterSpec(bArr6));
        return pm3.b(a9, a7.doFinal(bArr));
    }
}
