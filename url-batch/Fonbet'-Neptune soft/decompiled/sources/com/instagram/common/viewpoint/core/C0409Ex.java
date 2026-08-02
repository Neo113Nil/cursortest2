package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0409Ex extends AbstractC1225eW {
    public final /* synthetic */ US A00;
    public final /* synthetic */ XH A01;
    public final /* synthetic */ C1120cn A02;
    public final /* synthetic */ C0407Ev A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0409Ex(C0407Ev c0407Ev, String str, C1120cn c1120cn, US us, Map map, XH xh) {
        this.A03 = c0407Ev;
        this.A04 = str;
        this.A02 = c1120cn;
        this.A00 = us;
        this.A05 = map;
        this.A01 = xh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A03() {
        C1226eX c1226eX;
        SparseBooleanArray sparseBooleanArray;
        C1226eX c1226eX2;
        N3 n3;
        C1153dL c1153dL;
        SparseBooleanArray sparseBooleanArray2;
        c1226eX = this.A03.A02;
        if (!c1226eX.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                US us = this.A00;
                String str = this.A04;
                C0938Zp c0938Zp = new C0938Zp(this.A05);
                c1226eX2 = this.A03.A03;
                us.AB5(str, c0938Zp.A03(c1226eX2).A02(this.A01).A05());
                n3 = this.A03.A00;
                c1153dL = this.A03.A09;
                N3.A07(n3, c1153dL);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
