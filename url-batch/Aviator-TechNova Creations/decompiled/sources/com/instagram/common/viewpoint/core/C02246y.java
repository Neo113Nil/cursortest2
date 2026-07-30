package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02246y extends AbstractC1405hQ {
    public C02246y(C1159dL c1159dL, NT nt) {
        super(c1159dL, nt);
    }

    private C1403hO A00(Runnable runnable) {
        return new C1403hO(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final AbstractC0612Mo A0I() {
        C1460iS successfullyLoadedAdapter = (C1460iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final void A0P() {
        C1460iS interstitialAdapter = (C1460iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final void A0R(MP mp, TE te, TC tc, NU nu) {
        C1460iS c1460iS = (C1460iS) mp;
        C1404hP c1404hP = new C1404hP(this, nu, c1460iS);
        A0H().postDelayed(c1404hP, te.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1460iS.A0A(this.A0B, A00(c1404hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
