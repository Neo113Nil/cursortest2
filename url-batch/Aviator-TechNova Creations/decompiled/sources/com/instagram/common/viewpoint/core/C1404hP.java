package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1404hP extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C1460iS A00;
    public final /* synthetic */ NU A01;
    public final /* synthetic */ C02246y A02;

    public C1404hP(C02246y c02246y, NU nu, C1460iS c1460iS) {
        this.A02 = c02246y;
        this.A01 = nu;
        this.A00 = c1460iS;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        V1 A00 = V1.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5Y(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
