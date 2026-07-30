package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ET extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C4L A00;

    public ET(C4L c4l) {
        this.A00 = c4l;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C0876Ek c0876Ek;
        AbstractC0857Dr abstractC0857Dr;
        UN un;
        UN un2;
        UN un3;
        UN un4;
        UN un5;
        UN un6;
        UN un7;
        UN un8;
        E0 e02;
        UN un9;
        C1713eg c1713eg;
        C1713eg c1713eg2;
        c0876Ek = this.A00.A0C;
        UM<UN, UL> eventBus = c0876Ek.getEventBus();
        abstractC0857Dr = this.A00.A0E;
        un = this.A00.A06;
        un2 = this.A00.A08;
        un3 = this.A00.A05;
        un4 = this.A00.A04;
        un5 = this.A00.A03;
        un6 = this.A00.A07;
        un7 = this.A00.A0A;
        un8 = this.A00.A0B;
        e02 = this.A00.A0D;
        un9 = this.A00.A09;
        eventBus.A04(abstractC0857Dr, un, un2, un3, un4, un5, un6, un7, un8, e02, un9);
        c1713eg = this.A00.A01;
        if (c1713eg != null) {
            c1713eg2 = this.A00.A01;
            c1713eg2.A07();
        }
    }
}
