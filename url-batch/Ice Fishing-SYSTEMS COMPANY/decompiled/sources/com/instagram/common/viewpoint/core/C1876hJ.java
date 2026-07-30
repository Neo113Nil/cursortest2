package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1876hJ extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C1875hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1876hJ(C1875hI c1875hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c1875hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
