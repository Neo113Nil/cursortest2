package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1307fr extends AbstractRunnableC0827Vg {
    public final /* synthetic */ C1306fq A00;

    public C1307fr(C1306fq c1306fq) {
        this.A00 = c1306fq;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0827Vg
    public final void A01() {
        C0719Qz c0719Qz;
        C0719Qz c0719Qz2;
        C0719Qz c0719Qz3;
        c0719Qz = this.A00.A01;
        if (c0719Qz.A06() != null) {
            c0719Qz2 = this.A00.A01;
            AdListener A06 = c0719Qz2.A06();
            c0719Qz3 = this.A00.A01;
            A06.onLoggingImpression(c0719Qz3.A07());
        }
    }
}
