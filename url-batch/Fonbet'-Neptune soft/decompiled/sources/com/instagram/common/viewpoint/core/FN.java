package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class FN implements InterfaceC1111ce {
    public final /* synthetic */ C01333r A00;

    public FN(C01333r c01333r) {
        this.A00 = c01333r;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1111ce
    public final void A9d() {
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        abstractC0987ae = this.A00.A03;
        if (abstractC0987ae instanceof C01715d) {
            abstractC0987ae2 = this.A00.A03;
            ((C01715d) abstractC0987ae2).A1W();
            C0796Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1111ce
    public final void AJF() {
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        C01243i c01243i;
        abstractC0987ae = this.A00.A03;
        if (abstractC0987ae instanceof C01715d) {
            abstractC0987ae2 = this.A00.A03;
            c01243i = this.A00.A0M;
            ((C01715d) abstractC0987ae2).A1a(c01243i);
            C0796Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
        this.A00.A0k();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1111ce
    public final void AJT() {
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        this.A00.A0c();
        abstractC0987ae = this.A00.A03;
        if (abstractC0987ae instanceof C01715d) {
            abstractC0987ae2 = this.A00.A03;
            ((C01715d) abstractC0987ae2).getAdDetailsView().setVisibility(8);
        }
    }
}
