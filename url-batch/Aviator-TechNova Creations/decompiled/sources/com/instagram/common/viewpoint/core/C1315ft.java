package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.ft, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1315ft extends AbstractRunnableC0833Vg {
    public final /* synthetic */ C1312fq A00;

    public C1315ft(C1312fq c1312fq) {
        this.A00 = c1312fq;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0833Vg
    public final void A01() {
        C0725Qz c0725Qz;
        C0725Qz c0725Qz2;
        C0725Qz c0725Qz3;
        c0725Qz = this.A00.A01;
        if (c0725Qz.A06() != null) {
            c0725Qz2 = this.A00.A01;
            AdListener A06 = c0725Qz2.A06();
            c0725Qz3 = this.A00.A01;
            A06.onAdLoaded(c0725Qz3.A07());
        }
    }
}
