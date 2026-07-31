package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2288Fs extends AbstractC3162fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C3056e5 A02;
    public final /* synthetic */ C2286Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C2288Fs(C2286Fq c2286Fq, String str, C3056e5 c3056e5, VA va, Map map, Y2 y2) {
        this.A03 = c2286Fq;
        this.A04 = str;
        this.A02 = c3056e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3162fo
    public final void A03() {
        C3163fp c3163fp;
        SparseBooleanArray sparseBooleanArray;
        C3163fp c3163fp2;
        C2482Ng c2482Ng;
        C3218gi c3218gi;
        SparseBooleanArray sparseBooleanArray2;
        c3163fp = this.A03.A02;
        if (!c3163fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C2875b9 c2875b9 = new C2875b9(this.A05);
                c3163fp2 = this.A03.A03;
                va.ABJ(str, c2875b9.A03(c3163fp2).A02(this.A01).A05());
                c2482Ng = this.A03.A00;
                c3218gi = this.A03.A06;
                C2482Ng.A07(c2482Ng, c3218gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
