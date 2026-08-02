package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02186y extends AbstractC1399hQ {
    public C02186y(C1153dL c1153dL, NT nt) {
        super(c1153dL, nt);
    }

    private C1397hO A00(Runnable runnable) {
        return new C1397hO(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1399hQ
    public final AbstractC0606Mo A0I() {
        C1454iS successfullyLoadedAdapter = (C1454iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1399hQ
    public final void A0P() {
        C1454iS interstitialAdapter = (C1454iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1399hQ
    public final void A0R(MP mp, TE te, TC tc, NU nu) {
        C1454iS c1454iS = (C1454iS) mp;
        C1398hP c1398hP = new C1398hP(this, nu, c1454iS);
        A0H().postDelayed(c1398hP, te.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1454iS.A0A(this.A0B, A00(c1398hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
