package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class EI extends AbstractRunnableC0846Vt {
    public final /* synthetic */ EG A00;

    public EI(EG eg) {
        this.A00 = eg;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1162dO c1162dO;
        E1 e1;
        DR dr;
        DX dx;
        c1162dO = this.A00.A03;
        c1162dO.A07();
        e1 = this.A00.A04;
        C0781Te<AbstractC0782Tf, C0780Td> eventBus = e1.getEventBus();
        dr = this.A00.A06;
        dx = this.A00.A05;
        eventBus.A04(dr, dx);
    }
}
