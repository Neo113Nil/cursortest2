package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2296Ga extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C20274x A00;

    public C2296Ga(C20274x c20274x) {
        this.A00 = c20274x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        AbstractC2931c3 abstractC2931c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC2931c3 abstractC2931c32;
        abstractC2931c3 = this.A00.A00;
        if (abstractC2931c3 != null) {
            abstractC2931c32 = this.A00.A00;
            abstractC2931c32.A1F();
        }
        AbstractC2753Yb abstractC2753Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC2753Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
