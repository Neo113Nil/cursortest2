package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0432Fu extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C4H A00;

    public C0432Fu(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        AbstractC0987ae abstractC0987ae;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0987ae abstractC0987ae2;
        abstractC0987ae = this.A00.A00;
        if (abstractC0987ae != null) {
            abstractC0987ae2 = this.A00.A00;
            abstractC0987ae2.A1E();
        }
        AbstractC0883Xm abstractC0883Xm = this.A00.A08;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0883Xm.setToolbarActionMode(closeButtonStyle);
        this.A00.A08.A07();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
