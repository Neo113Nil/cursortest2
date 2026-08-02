package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1415hi implements InterfaceC0724Re {
    public final /* synthetic */ AbstractC1428hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1153dL A03;
    public final /* synthetic */ boolean A04;

    public C1415hi(NH nh, C1153dL c1153dL, boolean z, AbstractC1428hy abstractC1428hy, NG ng) {
        this.A02 = nh;
        this.A03 = c1153dL;
        this.A04 = z;
        this.A00 = abstractC1428hy;
        this.A01 = ng;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACM() {
        ArrayList arrayList;
        if (U7.A1l(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1065bu.A01(this.A03, this.A00, 1, new C1416hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
