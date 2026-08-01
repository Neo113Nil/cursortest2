package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0836Sv implements InterfaceC0621Km {
    public final /* synthetic */ C9D A00;

    public C0836Sv(C9D c9d) {
        this.A00 = c9d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0621Km
    public final void AAv() {
        AbstractC0651Ls abstractC0651Ls;
        AbstractC0651Ls abstractC0651Ls2;
        this.A00.A07 = false;
        abstractC0651Ls = this.A00.A04;
        if (abstractC0651Ls != null) {
            abstractC0651Ls2 = this.A00.A04;
            abstractC0651Ls2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0621Km
    public final void ACZ(float f) {
        AbstractC0651Ls abstractC0651Ls;
        AbstractC0651Ls abstractC0651Ls2;
        abstractC0651Ls = this.A00.A04;
        if (abstractC0651Ls != null) {
            abstractC0651Ls2 = this.A00.A04;
            abstractC0651Ls2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0G().A00())));
        }
    }
}
