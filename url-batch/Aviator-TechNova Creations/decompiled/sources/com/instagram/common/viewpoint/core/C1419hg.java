package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1419hg implements S7 {
    public final /* synthetic */ AbstractC1434hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1159dL A03;
    public final /* synthetic */ boolean A04;

    public C1419hg(NH nh, C1159dL c1159dL, boolean z, AbstractC1434hy abstractC1434hy, NG ng) {
        this.A02 = nh;
        this.A03 = c1159dL;
        this.A04 = z;
        this.A00 = abstractC1434hy;
        this.A01 = ng;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (U7.A1l(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC1071bu.A01(this.A03, this.A00, 1, new C1420hh(this)));
                return;
            } else {
                this.A01.ACG();
                return;
            }
        }
        this.A01.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACq() {
        A00(true);
    }
}
