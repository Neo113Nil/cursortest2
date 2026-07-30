package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0917Ga extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C06484x A00;

    public C0917Ga(C06484x c06484x) {
        this.A00 = c06484x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        AbstractC1552c3 abstractC1552c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1552c3 abstractC1552c32;
        abstractC1552c3 = this.A00.A00;
        if (abstractC1552c3 != null) {
            abstractC1552c32 = this.A00.A00;
            abstractC1552c32.A1F();
        }
        AbstractC1374Yb abstractC1374Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1374Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
