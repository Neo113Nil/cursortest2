package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class FN implements InterfaceC1117ce {
    public final /* synthetic */ C01393r A00;

    public FN(C01393r c01393r) {
        this.A00 = c01393r;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1117ce
    public final void A9d() {
        AbstractC0993ae abstractC0993ae;
        AbstractC0993ae abstractC0993ae2;
        abstractC0993ae = this.A00.A03;
        if (abstractC0993ae instanceof C01775d) {
            abstractC0993ae2 = this.A00.A03;
            ((C01775d) abstractC0993ae2).A1W();
            C0802Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1117ce
    public final void AJF() {
        AbstractC0993ae abstractC0993ae;
        AbstractC0993ae abstractC0993ae2;
        C01303i c01303i;
        abstractC0993ae = this.A00.A03;
        if (abstractC0993ae instanceof C01775d) {
            abstractC0993ae2 = this.A00.A03;
            c01303i = this.A00.A0M;
            ((C01775d) abstractC0993ae2).A1a(c01303i);
            C0802Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
        this.A00.A0k();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1117ce
    public final void AJT() {
        AbstractC0993ae abstractC0993ae;
        AbstractC0993ae abstractC0993ae2;
        this.A00.A0c();
        abstractC0993ae = this.A00.A03;
        if (abstractC0993ae instanceof C01775d) {
            abstractC0993ae2 = this.A00.A03;
            ((C01775d) abstractC0993ae2).getAdDetailsView().setVisibility(8);
        }
    }
}
