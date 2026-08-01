package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1033aG implements InterfaceC02715p {
    public final /* synthetic */ C01601f A00;

    public C1033aG(C01601f c01601f) {
        this.A00 = c01601f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02715p
    public final void AAW() {
        InterfaceC01591e interfaceC01591e;
        interfaceC01591e = this.A00.A04;
        interfaceC01591e.AAQ();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02715p
    public final void AAX() {
        InterfaceC01591e interfaceC01591e;
        interfaceC01591e = this.A00.A04;
        interfaceC01591e.AAP(AdError.CACHE_ERROR);
    }
}
