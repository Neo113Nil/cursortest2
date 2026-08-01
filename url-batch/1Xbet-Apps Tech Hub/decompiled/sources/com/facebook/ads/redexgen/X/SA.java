package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SA extends K8 {
    public final /* synthetic */ C8B A00;

    public SA(C8B c8b) {
        this.A00 = c8b;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        AbstractC0706Nv abstractC0706Nv;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0706Nv abstractC0706Nv2;
        abstractC0706Nv = this.A00.A00;
        if (abstractC0706Nv != null) {
            abstractC0706Nv2 = this.A00.A00;
            abstractC0706Nv2.A0x();
        }
        AbstractC0651Ls abstractC0651Ls = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0651Ls.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A04();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
