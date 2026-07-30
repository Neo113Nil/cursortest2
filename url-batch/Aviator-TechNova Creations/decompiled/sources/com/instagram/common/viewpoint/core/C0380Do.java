package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0380Do extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C01303i A00;

    public C0380Do(C01303i c01303i) {
        this.A00 = c01303i;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        E1 e1;
        DE de;
        AbstractC0782Tf abstractC0782Tf;
        AbstractC0782Tf abstractC0782Tf2;
        AbstractC0782Tf abstractC0782Tf3;
        AbstractC0782Tf abstractC0782Tf4;
        AbstractC0782Tf abstractC0782Tf5;
        AbstractC0782Tf abstractC0782Tf6;
        AbstractC0782Tf abstractC0782Tf7;
        AbstractC0782Tf abstractC0782Tf8;
        DN dn;
        AbstractC0782Tf abstractC0782Tf9;
        C1162dO c1162dO;
        C1162dO c1162dO2;
        e1 = this.A00.A0C;
        C0781Te<AbstractC0782Tf, C0780Td> eventBus = e1.getEventBus();
        de = this.A00.A0E;
        abstractC0782Tf = this.A00.A06;
        abstractC0782Tf2 = this.A00.A08;
        abstractC0782Tf3 = this.A00.A05;
        abstractC0782Tf4 = this.A00.A04;
        abstractC0782Tf5 = this.A00.A03;
        abstractC0782Tf6 = this.A00.A07;
        abstractC0782Tf7 = this.A00.A0A;
        abstractC0782Tf8 = this.A00.A0B;
        dn = this.A00.A0D;
        abstractC0782Tf9 = this.A00.A09;
        eventBus.A04(de, abstractC0782Tf, abstractC0782Tf2, abstractC0782Tf3, abstractC0782Tf4, abstractC0782Tf5, abstractC0782Tf6, abstractC0782Tf7, abstractC0782Tf8, dn, abstractC0782Tf9);
        c1162dO = this.A00.A01;
        if (c1162dO != null) {
            c1162dO2 = this.A00.A01;
            c1162dO2.A07();
        }
    }
}
