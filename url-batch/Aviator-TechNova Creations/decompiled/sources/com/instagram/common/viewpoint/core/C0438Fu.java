package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0438Fu extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C4H A00;

    public C0438Fu(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        AbstractC0993ae abstractC0993ae;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0993ae abstractC0993ae2;
        abstractC0993ae = this.A00.A00;
        if (abstractC0993ae != null) {
            abstractC0993ae2 = this.A00.A00;
            abstractC0993ae2.A1E();
        }
        AbstractC0889Xm abstractC0889Xm = this.A00.A08;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0889Xm.setToolbarActionMode(closeButtonStyle);
        this.A00.A08.A07();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
