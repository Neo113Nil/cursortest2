package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.hb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1416hb implements NP {
    public final /* synthetic */ NH A00;

    public C1416hb(NH nh) {
        this.A00 = nh;
    }

    @Override // com.instagram.common.viewpoint.core.NP
    public final void AEZ(AdError adError) {
        NG ng;
        ng = this.A00.A04;
        ng.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.NP
    public final void AEa() {
        NG ng;
        ng = this.A00.A04;
        ng.ACG();
    }
}
