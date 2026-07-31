package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class me3 extends ld3<kh3> {
    me3() {
        super(kh3.class, new ke3(wc3.class));
    }

    static /* bridge */ /* synthetic */ id3 k(int i7, int i8, int i9, int i10, int i11, int i12) {
        sh3 G = th3.G();
        vh3 G2 = wh3.G();
        G2.r(16);
        G.s(G2.o());
        G.r(i7);
        th3 o7 = G.o();
        ik3 G3 = jk3.G();
        mk3 G4 = nk3.G();
        G4.s(5);
        G4.r(i10);
        G3.s(G4.o());
        G3.r(32);
        jk3 o8 = G3.o();
        mh3 F = nh3.F();
        F.r(o7);
        F.s(o8);
        return new id3(F.o(), i12);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, kh3> a() {
        return new le3(this, nh3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ kh3 b(uo3 uo3Var) {
        return kh3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(kh3 kh3Var) {
        kh3 kh3Var2 = kh3Var;
        wn3.b(kh3Var2.F(), 0);
        new pe3();
        pe3.l(kh3Var2.J());
        new sg3();
        sg3.l(kh3Var2.K());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int i() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
