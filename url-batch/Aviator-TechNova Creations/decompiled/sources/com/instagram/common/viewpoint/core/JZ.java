package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class JZ extends AbstractRunnableC0846Vt {
    public final /* synthetic */ JU A00;

    public JZ(JU ju) {
        this.A00 = ju;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        boolean z;
        C1034bJ c1034bJ;
        z = this.A00.A0e;
        if (!z) {
            c1034bJ = this.A00.A0O;
            XP.A0D(1000, c1034bJ);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
