package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class HA extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C4Z A00;

    public HA(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1034bJ c1034bJ;
        c1034bJ = this.A00.A0H;
        XP.A0D(1000, c1034bJ);
        this.A00.postDelayed(this, 2000L);
    }
}
