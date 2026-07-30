package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class EV implements InterfaceC1257ew {
    public final /* synthetic */ C1156dI A00;

    public EV(C1156dI c1156dI) {
        this.A00 = c1156dI;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1257ew
    public final void AGQ() {
        InterfaceC0890Xn interfaceC0890Xn;
        InterfaceC0890Xn interfaceC0890Xn2;
        YY yy;
        interfaceC0890Xn = this.A00.A02;
        if (interfaceC0890Xn == null) {
            return;
        }
        interfaceC0890Xn2 = this.A00.A02;
        yy = this.A00.A03;
        interfaceC0890Xn2.A4b(yy.A8w());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1257ew
    public final void AGS(C1259ey c1259ey) {
        InterfaceC0890Xn interfaceC0890Xn;
        InterfaceC0890Xn interfaceC0890Xn2;
        YY yy;
        InterfaceC0890Xn interfaceC0890Xn3;
        YY yy2;
        interfaceC0890Xn = this.A00.A02;
        if (interfaceC0890Xn == null) {
            return;
        }
        if (c1259ey == null || !c1259ey.A00()) {
            interfaceC0890Xn2 = this.A00.A02;
            yy = this.A00.A03;
            interfaceC0890Xn2.A4b(yy.A8w());
        } else {
            interfaceC0890Xn3 = this.A00.A02;
            yy2 = this.A00.A03;
            interfaceC0890Xn3.A4b(yy2.A8x());
        }
    }
}
