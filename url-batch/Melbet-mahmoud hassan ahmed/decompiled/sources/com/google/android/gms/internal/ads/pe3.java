package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class pe3 extends ld3<qh3> {
    pe3() {
        super(qh3.class, new ne3(mn3.class));
    }

    public static final void l(qh3 qh3Var) {
        wn3.b(qh3Var.F(), 0);
        wn3.a(qh3Var.L().q());
        m(qh3Var.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(wh3 wh3Var) {
        if (wh3Var.F() < 12 || wh3Var.F() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, qh3> a() {
        return new oe3(this, th3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ qh3 b(uo3 uo3Var) {
        return qh3.J(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(qh3 qh3Var) {
        l(qh3Var);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
