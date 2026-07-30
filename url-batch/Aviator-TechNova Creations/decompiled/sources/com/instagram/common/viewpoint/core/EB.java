package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class EB extends AbstractRunnableC0846Vt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ E1 A02;

    public EB(E1 e1, int i, int i2) {
        this.A02 = e1;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C0781Te c0781Te;
        c0781Te = this.A02.A0C;
        c0781Te.A02(new DL(this.A00, this.A01));
    }
}
