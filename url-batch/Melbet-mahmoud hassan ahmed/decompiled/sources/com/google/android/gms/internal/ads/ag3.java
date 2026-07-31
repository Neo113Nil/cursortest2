package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ag3 extends xd3<tj3, wj3> {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f2761d = new byte[0];

    ag3() {
        super(tj3.class, wj3.class, new yf3(ad3.class));
    }

    static /* bridge */ /* synthetic */ id3 l(int i7, int i8, int i9, gd3 gd3Var, byte[] bArr, int i10) {
        mj3 F = nj3.F();
        yj3 F2 = zj3.F();
        int i11 = 4;
        F2.s(4);
        F2.t(5);
        F2.r(uo3.J(bArr));
        zj3 o7 = F2.o();
        sk3 F3 = tk3.F();
        F3.r(gd3Var.a());
        F3.s(uo3.J(gd3Var.b()));
        int c7 = gd3Var.c() - 1;
        if (c7 == 0) {
            i11 = 3;
        } else if (c7 != 1) {
            i11 = c7 != 2 ? 6 : 5;
        }
        F3.t(i11);
        tk3 o8 = F3.o();
        ij3 F4 = kj3.F();
        F4.r(o8);
        kj3 o9 = F4.o();
        pj3 G = qj3.G();
        G.s(o7);
        G.r(o9);
        G.t(i9);
        F.r(G.o());
        return new id3(F.o(), i10);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<nj3, tj3> a() {
        return new zf3(this, nj3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ kr3 b(uo3 uo3Var) {
        return tj3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(kr3 kr3Var) {
        tj3 tj3Var = (tj3) kr3Var;
        if (tj3Var.K().l()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        wn3.b(tj3Var.F(), 0);
        kg3.a(tj3Var.J().G());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 4;
    }
}
