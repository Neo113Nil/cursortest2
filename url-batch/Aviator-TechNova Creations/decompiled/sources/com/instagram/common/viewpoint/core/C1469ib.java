package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1469ib extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C1467iZ A00;
    public final /* synthetic */ C5G A01;

    public C1469ib(C1467iZ c1467iZ, C5G c5g) {
        this.A00 = c1467iZ;
        this.A01 = c5g;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1232eX c1232eX;
        C1232eX c1232eX2;
        C1232eX c1232eX3;
        this.A00.A00.A0A();
        c1232eX = this.A00.A00.A0C;
        if (c1232eX != null) {
            C5G c5g = this.A01;
            c1232eX2 = this.A00.A00.A0C;
            c5g.setAdViewabilityChecker(c1232eX2);
            c1232eX3 = this.A00.A00.A0C;
            c1232eX3.A0U();
        }
    }
}
