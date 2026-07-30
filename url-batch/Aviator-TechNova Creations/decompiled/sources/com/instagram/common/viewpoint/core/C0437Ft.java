package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ft, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0437Ft extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C4H A00;

    public C0437Ft(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        AbstractC0993ae abstractC0993ae;
        AbstractC0993ae abstractC0993ae2;
        abstractC0993ae = this.A00.A00;
        if (abstractC0993ae != null) {
            abstractC0993ae2 = this.A00.A00;
            if (abstractC0993ae2.A1L()) {
                ((G2) this.A00).A01 = true;
                this.A00.A08.setToolbarActionMode(8);
            }
        }
    }
}
