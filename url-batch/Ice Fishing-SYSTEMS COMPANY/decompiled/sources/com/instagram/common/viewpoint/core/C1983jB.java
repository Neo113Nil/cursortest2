package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1983jB implements SM {
    public final /* synthetic */ C1117Nu A00;

    public C1983jB(C1117Nu c1117Nu) {
        this.A00 = c1117Nu;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        InterfaceC1116Nt interfaceC1116Nt;
        interfaceC1116Nt = this.A00.A04;
        interfaceC1116Nt.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        InterfaceC1116Nt interfaceC1116Nt;
        interfaceC1116Nt = this.A00.A04;
        interfaceC1116Nt.ACo(AdError.CACHE_ERROR);
    }
}
