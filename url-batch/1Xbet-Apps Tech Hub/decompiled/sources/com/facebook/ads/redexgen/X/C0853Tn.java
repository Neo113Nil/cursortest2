package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0853Tn implements N5 {
    public final /* synthetic */ InterfaceC0652Lt A00;
    public final /* synthetic */ C0851Tl A01;

    public C0853Tn(C0851Tl c0851Tl, InterfaceC0652Lt interfaceC0652Lt) {
        this.A01 = c0851Tl;
        this.A00 = interfaceC0652Lt;
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACG(String str) {
        C0682Mx c0682Mx;
        c0682Mx = this.A01.A0A;
        c0682Mx.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACI(String str) {
        C0681Mw c0681Mw;
        this.A01.A05 = true;
        c0681Mw = this.A01.A09;
        c0681Mw.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACa(int i) {
        boolean z;
        C0682Mx c0682Mx;
        z = this.A01.A05;
        if (z) {
            c0682Mx = this.A01.A0A;
            c0682Mx.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACf(String str) {
        C0681Mw c0681Mw;
        c0681Mw = this.A01.A09;
        c0681Mw.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACh() {
        this.A00.AAl(14);
    }
}
