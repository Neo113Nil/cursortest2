package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C06484x A00;

    public GZ(C06484x c06484x) {
        this.A00 = c06484x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        AbstractC1552c3 abstractC1552c3;
        AbstractC1552c3 abstractC1552c32;
        abstractC1552c3 = this.A00.A00;
        if (abstractC1552c3 != null) {
            abstractC1552c32 = this.A00.A00;
            if (abstractC1552c32.A1N()) {
                ((AbstractC0926Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
