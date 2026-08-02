package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1463ib extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C1461iZ A00;
    public final /* synthetic */ C5G A01;

    public C1463ib(C1461iZ c1461iZ, C5G c5g) {
        this.A00 = c1461iZ;
        this.A01 = c5g;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1226eX c1226eX;
        C1226eX c1226eX2;
        C1226eX c1226eX3;
        this.A00.A00.A0A();
        c1226eX = this.A00.A00.A0C;
        if (c1226eX != null) {
            C5G c5g = this.A01;
            c1226eX2 = this.A00.A00.A0C;
            c5g.setAdViewabilityChecker(c1226eX2);
            c1226eX3 = this.A00.A00.A0C;
            c1226eX3.A0U();
        }
    }
}
