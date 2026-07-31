package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class pn3 implements xg3 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f10295a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f10296b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f10297c;

    public pn3(byte[] bArr) {
        wn3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f10295a = secretKeySpec;
        Cipher b7 = b();
        b7.init(1, secretKeySpec);
        byte[] b8 = om3.b(b7.doFinal(new byte[16]));
        this.f10296b = b8;
        this.f10297c = om3.b(b8);
    }

    private static Cipher b() {
        if (qf3.a(1)) {
            return cn3.f3891e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.xg3
    public final byte[] a(byte[] bArr, int i7) {
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher b7 = b();
        b7.init(1, this.f10295a);
        int length = bArr.length;
        double d7 = length;
        Double.isNaN(d7);
        int max = Math.max(1, (int) Math.ceil(d7 / 16.0d));
        byte[] d8 = max * 16 == length ? pm3.d(bArr, (max - 1) * 16, this.f10296b, 0, 16) : pm3.c(om3.a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f10297c);
        byte[] bArr2 = new byte[16];
        for (int i8 = 0; i8 < max - 1; i8++) {
            bArr2 = b7.doFinal(pm3.d(bArr2, 0, bArr, i8 * 16, 16));
        }
        return Arrays.copyOf(b7.doFinal(pm3.c(d8, bArr2)), i7);
    }
}
