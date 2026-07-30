package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1984jC implements O3 {
    public final /* synthetic */ C1117Nu A00;

    public C1984jC(C1117Nu c1117Nu) {
        this.A00 = c1117Nu;
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFF(AdError adError) {
        InterfaceC1116Nt interfaceC1116Nt;
        interfaceC1116Nt = this.A00.A04;
        interfaceC1116Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFG() {
        InterfaceC1116Nt interfaceC1116Nt;
        interfaceC1116Nt = this.A00.A04;
        interfaceC1116Nt.ACp();
    }
}
