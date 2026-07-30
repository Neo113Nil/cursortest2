package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1421hi implements InterfaceC0730Re {
    public final /* synthetic */ AbstractC1434hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1159dL A03;
    public final /* synthetic */ boolean A04;

    public C1421hi(NH nh, C1159dL c1159dL, boolean z, AbstractC1434hy abstractC1434hy, NG ng) {
        this.A02 = nh;
        this.A03 = c1159dL;
        this.A04 = z;
        this.A00 = abstractC1434hy;
        this.A01 = ng;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0730Re
    public final void ACM() {
        ArrayList arrayList;
        if (U7.A1l(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1071bu.A01(this.A03, this.A00, 1, new C1422hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0730Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
