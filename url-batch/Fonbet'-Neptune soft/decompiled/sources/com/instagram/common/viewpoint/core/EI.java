package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class EI extends AbstractRunnableC0840Vt {
    public final /* synthetic */ EG A00;

    public EI(EG eg) {
        this.A00 = eg;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1156dO c1156dO;
        E1 e1;
        DR dr;
        DX dx;
        c1156dO = this.A00.A03;
        c1156dO.A07();
        e1 = this.A00.A04;
        C0775Te<AbstractC0776Tf, C0774Td> eventBus = e1.getEventBus();
        dr = this.A00.A06;
        dx = this.A00.A05;
        eventBus.A04(dr, dx);
    }
}
