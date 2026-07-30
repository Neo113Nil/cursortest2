package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1299fd extends AbstractRunnableC0833Vg {
    public final /* synthetic */ C1296fa A00;
    public final /* synthetic */ V1 A01;

    public C1299fd(C1296fa c1296fa, V1 v1) {
        this.A00 = c1296fa;
        this.A01 = v1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0833Vg
    public final void A01() {
        RO ro;
        RO ro2;
        ro = this.A00.A00;
        if (ro.A00() != null) {
            ro2 = this.A00.A00;
            ro2.A00().onAdError(WT.A00(this.A01));
        }
    }
}
