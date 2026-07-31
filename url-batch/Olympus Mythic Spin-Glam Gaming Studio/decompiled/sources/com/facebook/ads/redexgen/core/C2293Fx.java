package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2293Fx extends AbstractC3162fo {
    public final /* synthetic */ C4U A00;

    public C2293Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3162fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        String str;
        C3163fp c3163fp;
        Y2 y23;
        AbstractC3383jd abstractC3383jd;
        VA va;
        String str2;
        AbstractC3383jd abstractC3383jd2;
        C3218gi c3218gi;
        C3218gi c3218gi2;
        AbstractC3383jd abstractC3383jd3;
        AbstractC3383jd abstractC3383jd4;
        y2 = this.A00.A04;
        if (!y2.A07()) {
            C4U c4u = this.A00;
            y22 = this.A00.A04;
            c4u.setImpressionRecordingFlag(y22);
            str = this.A00.A08;
            if (!TextUtils.isEmpty(str)) {
                C2875b9 c2875b9 = new C2875b9();
                c3163fp = this.A00.A07;
                C2875b9 A03 = c2875b9.A03(c3163fp);
                y23 = this.A00.A04;
                C2875b9 A02 = A03.A02(y23);
                abstractC3383jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC3383jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A08;
                va.ABJ(str2, A05);
                abstractC3383jd2 = this.A00.A0D;
                C2482Ng A2A = abstractC3383jd2.A2A();
                c3218gi = this.A00.A0E;
                C2482Ng.A07(A2A, c3218gi);
                c3218gi2 = this.A00.A0E;
                c3218gi2.A0F().A3L();
                abstractC3383jd3 = this.A00.A0D;
                String A0y = abstractC3383jd3.A0y();
                abstractC3383jd4 = this.A00.A0D;
                AbstractC2502Oa.A02(A0y, AbstractC2738Xm.A00(abstractC3383jd4.A10()));
            }
        }
    }
}
