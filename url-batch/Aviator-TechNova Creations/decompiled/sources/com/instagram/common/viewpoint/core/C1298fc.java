package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1298fc extends AbstractRunnableC0833Vg {
    public final /* synthetic */ C1297fb A00;

    public C1298fc(C1297fb c1297fb) {
        this.A00 = c1297fb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0833Vg
    public final void A01() {
        RO ro;
        RO ro2;
        ro = this.A00.A01.A00;
        if (ro.A00() != null) {
            ro2 = this.A00.A01.A00;
            ro2.A00().onAdsLoaded();
        }
    }
}
