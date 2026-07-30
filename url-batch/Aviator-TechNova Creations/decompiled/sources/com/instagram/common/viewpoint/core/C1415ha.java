package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1415ha implements InterfaceC0730Re {
    public final /* synthetic */ NH A00;

    public C1415ha(NH nh) {
        this.A00 = nh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0730Re
    public final void ACM() {
        NG ng;
        ng = this.A00.A04;
        ng.ACG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0730Re
    public final void ACN() {
        NG ng;
        ng = this.A00.A04;
        ng.ACF(AdError.CACHE_ERROR);
    }
}
