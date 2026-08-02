package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1398hP extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C1454iS A00;
    public final /* synthetic */ NU A01;
    public final /* synthetic */ C02186y A02;

    public C1398hP(C02186y c02186y, NU nu, C1454iS c1454iS) {
        this.A02 = c02186y;
        this.A01 = nu;
        this.A00 = c1454iS;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        V1 A00 = V1.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5Y(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
