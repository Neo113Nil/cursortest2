package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class se3 extends ld3<zh3> {
    se3() {
        super(zh3.class, new qe3(wc3.class));
    }

    static /* bridge */ /* synthetic */ id3 k(int i7, int i8, int i9) {
        bi3 G = ci3.G();
        G.r(i7);
        ei3 G2 = fi3.G();
        G2.r(16);
        G.s(G2.o());
        return new id3(G.o(), i9);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, zh3> a() {
        return new re3(this, ci3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ zh3 b(uo3 uo3Var) {
        return zh3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(zh3 zh3Var) {
        zh3 zh3Var2 = zh3Var;
        wn3.b(zh3Var2.F(), 0);
        wn3.a(zh3Var2.K().q());
        if (zh3Var2.J().F() != 12 && zh3Var2.J().F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
