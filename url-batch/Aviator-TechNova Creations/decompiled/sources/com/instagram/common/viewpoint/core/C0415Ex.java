package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0415Ex extends AbstractC1231eW {
    public final /* synthetic */ US A00;
    public final /* synthetic */ XH A01;
    public final /* synthetic */ C1126cn A02;
    public final /* synthetic */ C0413Ev A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0415Ex(C0413Ev c0413Ev, String str, C1126cn c1126cn, US us, Map map, XH xh) {
        this.A03 = c0413Ev;
        this.A04 = str;
        this.A02 = c1126cn;
        this.A00 = us;
        this.A05 = map;
        this.A01 = xh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    public final void A03() {
        C1232eX c1232eX;
        SparseBooleanArray sparseBooleanArray;
        C1232eX c1232eX2;
        N3 n3;
        C1159dL c1159dL;
        SparseBooleanArray sparseBooleanArray2;
        c1232eX = this.A03.A02;
        if (!c1232eX.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                US us = this.A00;
                String str = this.A04;
                C0944Zp c0944Zp = new C0944Zp(this.A05);
                c1232eX2 = this.A03.A03;
                us.AB5(str, c0944Zp.A03(c1232eX2).A02(this.A01).A05());
                n3 = this.A03.A00;
                c1159dL = this.A03.A09;
                N3.A07(n3, c1159dL);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
