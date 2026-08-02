package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class F3 extends AbstractC1225eW {
    public final /* synthetic */ C01323q A00;

    public F3(C01323q c01323q) {
        this.A00 = c01323q;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A03() {
        XH xh;
        XH xh2;
        String str;
        C1226eX c1226eX;
        XH xh3;
        AbstractC1428hy abstractC1428hy;
        US us;
        String str2;
        AbstractC1428hy abstractC1428hy2;
        C1153dL c1153dL;
        C1153dL c1153dL2;
        AbstractC1428hy abstractC1428hy3;
        AbstractC1428hy abstractC1428hy4;
        xh = this.A00.A0E;
        if (!xh.A07()) {
            C01323q c01323q = this.A00;
            xh2 = this.A00.A0E;
            c01323q.setImpressionRecordingFlag(xh2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C0938Zp c0938Zp = new C0938Zp();
                c1226eX = this.A00.A09;
                C0938Zp A03 = c0938Zp.A03(c1226eX);
                xh3 = this.A00.A0E;
                C0938Zp A02 = A03.A02(xh3);
                abstractC1428hy = ((NI) ((NI) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1428hy.A0u()).A05();
                us = ((NI) ((NI) this.A00)).A0C;
                str2 = this.A00.A0A;
                us.AB5(str2, A05);
                abstractC1428hy2 = ((NI) ((NI) this.A00)).A0A;
                N3 A21 = abstractC1428hy2.A21();
                c1153dL = this.A00.A0D;
                N3.A07(A21, c1153dL);
                c1153dL2 = this.A00.A0D;
                c1153dL2.A0F().A3D();
                abstractC1428hy3 = this.A00.A03;
                String A0t = abstractC1428hy3.A0t();
                abstractC1428hy4 = ((NI) ((NI) this.A00)).A0A;
                AbstractC0640Nw.A02(A0t, X0.A00(abstractC1428hy4.A0v()));
            }
        }
    }
}
