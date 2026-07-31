package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class sg3 extends ld3<gk3> {
    public sg3() {
        super(gk3.class, new qg3(pd3.class));
    }

    public static final void l(gk3 gk3Var) {
        wn3.b(gk3Var.F(), 0);
        if (gk3Var.L().q() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(gk3Var.K());
    }

    static /* bridge */ /* synthetic */ id3 m(int i7, int i8, int i9, int i10) {
        ik3 G = jk3.G();
        mk3 G2 = nk3.G();
        G2.s(i9);
        G2.r(i8);
        G.s(G2.o());
        G.r(i7);
        return new id3(G.o(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(nk3 nk3Var) {
        if (nk3Var.F() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int K = nk3Var.K() - 2;
        if (K == 1) {
            if (nk3Var.F() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (K == 2) {
            if (nk3Var.F() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (K == 3) {
            if (nk3Var.F() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (K == 4) {
            if (nk3Var.F() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (K != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (nk3Var.F() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, gk3> a() {
        return new rg3(this, jk3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ gk3 b(uo3 uo3Var) {
        return gk3.J(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(gk3 gk3Var) {
        l(gk3Var);
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
