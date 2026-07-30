package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1409hU implements S7 {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC1409hU(boolean z) {
        this.A00 = z;
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACh() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACq() {
        A01(true);
    }
}
