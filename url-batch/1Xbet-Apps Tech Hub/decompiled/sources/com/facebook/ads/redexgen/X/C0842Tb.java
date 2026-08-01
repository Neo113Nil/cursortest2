package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0842Tb implements InterfaceC0690Nf {
    public final /* synthetic */ TU A00;

    public C0842Tb(TU tu) {
        this.A00 = tu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Nf
    public final void AAS() {
        boolean A0Y;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            this.A00.A0M();
            this.A00.A0Y.setToolbarActionMessage("");
            this.A00.A0Y.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Nf
    public final void ABz() {
        C0622Kn c0622Kn;
        this.A00.A0D = false;
        c0622Kn = this.A00.A0M;
        c0622Kn.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Nf
    public final void AC0() {
        C0622Kn c0622Kn;
        this.A00.A0D = true;
        c0622Kn = this.A00.A0M;
        c0622Kn.A07();
    }
}
