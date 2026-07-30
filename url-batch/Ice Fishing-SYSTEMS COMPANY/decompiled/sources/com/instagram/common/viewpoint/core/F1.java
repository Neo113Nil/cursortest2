package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C0886Eu A00;

    public F1(C0886Eu c0886Eu) {
        this.A00 = c0886Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1713eg c1713eg;
        C0876Ek c0876Ek;
        E4 e42;
        EA ea;
        c1713eg = this.A00.A03;
        c1713eg.A07();
        c0876Ek = this.A00.A04;
        UM<UN, UL> eventBus = c0876Ek.getEventBus();
        e42 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e42, ea);
    }
}
