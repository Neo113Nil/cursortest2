package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class pg3 extends ld3<ah3> {
    pg3() {
        super(ah3.class, new ng3(pd3.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(gh3 gh3Var) {
        if (gh3Var.F() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (gh3Var.F() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(int i7) {
        if (i7 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, ah3> a() {
        return new og3(this, dh3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ ah3 b(uo3 uo3Var) {
        return ah3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(ah3 ah3Var) {
        ah3 ah3Var2 = ah3Var;
        wn3.b(ah3Var2.F(), 0);
        n(ah3Var2.K().q());
        m(ah3Var2.J());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
