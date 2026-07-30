package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1880hN extends WP {
    public final /* synthetic */ C1879hM A00;

    public C1880hN(C1879hM c1879hM) {
        this.A00 = c1879hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C1200Rd c1200Rd;
        C1200Rd c1200Rd2;
        C1200Rd c1200Rd3;
        c1200Rd = this.A00.A01;
        if (c1200Rd.A06() != null) {
            c1200Rd2 = this.A00.A01;
            AdListener A06 = c1200Rd2.A06();
            c1200Rd3 = this.A00.A01;
            A06.onLoggingImpression(c1200Rd3.A07());
        }
    }
}
