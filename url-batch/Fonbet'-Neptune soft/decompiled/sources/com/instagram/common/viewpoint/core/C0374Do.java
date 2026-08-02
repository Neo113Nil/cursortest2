package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0374Do extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C01243i A00;

    public C0374Do(C01243i c01243i) {
        this.A00 = c01243i;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        E1 e1;
        DE de;
        AbstractC0776Tf abstractC0776Tf;
        AbstractC0776Tf abstractC0776Tf2;
        AbstractC0776Tf abstractC0776Tf3;
        AbstractC0776Tf abstractC0776Tf4;
        AbstractC0776Tf abstractC0776Tf5;
        AbstractC0776Tf abstractC0776Tf6;
        AbstractC0776Tf abstractC0776Tf7;
        AbstractC0776Tf abstractC0776Tf8;
        DN dn;
        AbstractC0776Tf abstractC0776Tf9;
        C1156dO c1156dO;
        C1156dO c1156dO2;
        e1 = this.A00.A0C;
        C0775Te<AbstractC0776Tf, C0774Td> eventBus = e1.getEventBus();
        de = this.A00.A0E;
        abstractC0776Tf = this.A00.A06;
        abstractC0776Tf2 = this.A00.A08;
        abstractC0776Tf3 = this.A00.A05;
        abstractC0776Tf4 = this.A00.A04;
        abstractC0776Tf5 = this.A00.A03;
        abstractC0776Tf6 = this.A00.A07;
        abstractC0776Tf7 = this.A00.A0A;
        abstractC0776Tf8 = this.A00.A0B;
        dn = this.A00.A0D;
        abstractC0776Tf9 = this.A00.A09;
        eventBus.A04(de, abstractC0776Tf, abstractC0776Tf2, abstractC0776Tf3, abstractC0776Tf4, abstractC0776Tf5, abstractC0776Tf6, abstractC0776Tf7, abstractC0776Tf8, dn, abstractC0776Tf9);
        c1156dO = this.A00.A01;
        if (c1156dO != null) {
            c1156dO2 = this.A00.A01;
            c1156dO2.A07();
        }
    }
}
