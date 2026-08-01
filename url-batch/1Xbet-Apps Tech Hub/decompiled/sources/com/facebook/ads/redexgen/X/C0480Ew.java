package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0480Ew extends AbstractC1026a9 {
    public C0480Ew(YA ya, C01721r c01721r) {
        super(ya, c01721r);
    }

    private C1023a6 A00(Runnable runnable) {
        return new C1023a6(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final C1C A0F() {
        C1062aj successfullyLoadedAdapter = (C1062aj) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0L() {
        C1062aj interstitialAdapter = (C1062aj) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0N(InterfaceC01430o interfaceC01430o, C8F c8f, C8D c8d, C01731s c01731s) {
        C1062aj c1062aj = (C1062aj) interfaceC01430o;
        C1024a7 c1024a7 = new C1024a7(this, c01731s, c1062aj);
        A0E().postDelayed(c1024a7, c8f.A05().A05());
        c1062aj.A0A(this.A0B, A00(c1024a7), c01731s, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }
}
