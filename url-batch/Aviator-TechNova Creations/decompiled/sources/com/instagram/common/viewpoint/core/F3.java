package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class F3 extends AbstractC1231eW {
    public final /* synthetic */ C01383q A00;

    public F3(C01383q c01383q) {
        this.A00 = c01383q;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    public final void A03() {
        XH xh;
        XH xh2;
        String str;
        C1232eX c1232eX;
        XH xh3;
        AbstractC1434hy abstractC1434hy;
        US us;
        String str2;
        AbstractC1434hy abstractC1434hy2;
        C1159dL c1159dL;
        C1159dL c1159dL2;
        AbstractC1434hy abstractC1434hy3;
        AbstractC1434hy abstractC1434hy4;
        xh = this.A00.A0E;
        if (!xh.A07()) {
            C01383q c01383q = this.A00;
            xh2 = this.A00.A0E;
            c01383q.setImpressionRecordingFlag(xh2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C0944Zp c0944Zp = new C0944Zp();
                c1232eX = this.A00.A09;
                C0944Zp A03 = c0944Zp.A03(c1232eX);
                xh3 = this.A00.A0E;
                C0944Zp A02 = A03.A02(xh3);
                abstractC1434hy = ((NI) ((NI) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1434hy.A0u()).A05();
                us = ((NI) ((NI) this.A00)).A0C;
                str2 = this.A00.A0A;
                us.AB5(str2, A05);
                abstractC1434hy2 = ((NI) ((NI) this.A00)).A0A;
                N3 A21 = abstractC1434hy2.A21();
                c1159dL = this.A00.A0D;
                N3.A07(A21, c1159dL);
                c1159dL2 = this.A00.A0D;
                c1159dL2.A0F().A3D();
                abstractC1434hy3 = this.A00.A03;
                String A0t = abstractC1434hy3.A0t();
                abstractC1434hy4 = ((NI) ((NI) this.A00)).A0A;
                AbstractC0646Nw.A02(A0t, X0.A00(abstractC1434hy4.A0v()));
            }
        }
    }
}
