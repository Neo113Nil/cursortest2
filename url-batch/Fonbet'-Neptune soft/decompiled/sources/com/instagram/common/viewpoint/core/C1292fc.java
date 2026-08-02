package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1292fc extends AbstractRunnableC0827Vg {
    public final /* synthetic */ C1291fb A00;

    public C1292fc(C1291fb c1291fb) {
        this.A00 = c1291fb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0827Vg
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
