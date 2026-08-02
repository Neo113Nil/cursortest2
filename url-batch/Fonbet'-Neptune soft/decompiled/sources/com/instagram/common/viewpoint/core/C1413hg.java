package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1413hg implements S7 {
    public final /* synthetic */ AbstractC1428hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1153dL A03;
    public final /* synthetic */ boolean A04;

    public C1413hg(NH nh, C1153dL c1153dL, boolean z, AbstractC1428hy abstractC1428hy, NG ng) {
        this.A02 = nh;
        this.A03 = c1153dL;
        this.A04 = z;
        this.A00 = abstractC1428hy;
        this.A01 = ng;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (U7.A1l(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC1065bu.A01(this.A03, this.A00, 1, new C1414hh(this)));
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
