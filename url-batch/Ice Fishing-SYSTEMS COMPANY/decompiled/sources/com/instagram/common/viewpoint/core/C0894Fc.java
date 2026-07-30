package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0894Fc extends AbstractC1783fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C1677e5 A02;
    public final /* synthetic */ FY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0894Fc(FY fy, String str, C1677e5 c1677e5, VA va, Map map, Y2 y22) {
        this.A03 = fy;
        this.A04 = str;
        this.A02 = c1677e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y22;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1783fo
    public final void A03() {
        C1784fp c1784fp;
        SparseBooleanArray sparseBooleanArray;
        C1784fp c1784fp2;
        C1103Ng c1103Ng;
        C1839gi c1839gi;
        SparseBooleanArray sparseBooleanArray2;
        c1784fp = this.A03.A02;
        if (!c1784fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C1496b9 c1496b9 = new C1496b9(this.A05);
                c1784fp2 = this.A03.A03;
                va.ABJ(str, c1496b9.A03(c1784fp2).A02(this.A01).A05());
                c1103Ng = this.A03.A00;
                c1839gi = this.A03.A09;
                C1103Ng.A07(c1103Ng, c1839gi);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
