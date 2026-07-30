package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1309fn extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C1308fm A00;
    public final /* synthetic */ C5G A01;

    public C1309fn(C1308fm c1308fm, C5G c5g) {
        this.A00 = c1308fm;
        this.A01 = c5g;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1B());
        this.A00.A02.A1f(true, true);
    }
}
