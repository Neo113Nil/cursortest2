package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class nf3 extends ld3<bm3> {
    nf3() {
        super(bm3.class, new lf3(wc3.class));
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, bm3> a() {
        return new mf3(this, em3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ bm3 b(uo3 uo3Var) {
        return bm3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(bm3 bm3Var) {
        bm3 bm3Var2 = bm3Var;
        wn3.b(bm3Var2.F(), 0);
        if (bm3Var2.J().q() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
