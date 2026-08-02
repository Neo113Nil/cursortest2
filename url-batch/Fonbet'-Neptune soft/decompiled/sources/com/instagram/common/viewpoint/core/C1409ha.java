package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1409ha implements InterfaceC0724Re {
    public final /* synthetic */ NH A00;

    public C1409ha(NH nh) {
        this.A00 = nh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACM() {
        NG ng;
        ng = this.A00.A04;
        ng.ACG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACN() {
        NG ng;
        ng = this.A00.A04;
        ng.ACF(AdError.CACHE_ERROR);
    }
}
