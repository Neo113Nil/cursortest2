package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class bf3 extends ld3<bj3> {
    bf3() {
        super(bj3.class, new ze3(wc3.class));
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, bj3> a() {
        return new af3(this, ej3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ bj3 b(uo3 uo3Var) {
        return bj3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(bj3 bj3Var) {
        bj3 bj3Var2 = bj3Var;
        wn3.b(bj3Var2.F(), 0);
        if (bj3Var2.J().q() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
