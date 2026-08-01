package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1034aH implements InterfaceC01681n {
    public final /* synthetic */ C01601f A00;

    public C1034aH(C01601f c01601f) {
        this.A00 = c01601f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01681n
    public final void ACM(AdError adError) {
        InterfaceC01591e interfaceC01591e;
        interfaceC01591e = this.A00.A04;
        interfaceC01591e.AAP(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01681n
    public final void ACN() {
        InterfaceC01591e interfaceC01591e;
        interfaceC01591e = this.A00.A04;
        interfaceC01591e.AAQ();
    }
}
