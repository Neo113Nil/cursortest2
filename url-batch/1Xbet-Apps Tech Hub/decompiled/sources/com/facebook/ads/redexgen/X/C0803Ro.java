package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0803Ro extends AbstractC0763Qa {
    public final /* synthetic */ C7H A00;

    public C0803Ro(C7H c7h) {
        this.A00 = c7h;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    public final void A03() {
        LN ln;
        LN ln2;
        String str;
        C0764Qb c0764Qb;
        LN ln3;
        AbstractC1045aS abstractC1045aS;
        InterfaceC0565If interfaceC0565If;
        String str2;
        AbstractC1045aS abstractC1045aS2;
        YA ya;
        YA ya2;
        AbstractC1045aS abstractC1045aS3;
        ln = this.A00.A0E;
        if (!ln.A07()) {
            C7H c7h = this.A00;
            ln2 = c7h.A0E;
            c7h.setImpressionRecordingFlag(ln2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                NL nl = new NL();
                c0764Qb = this.A00.A09;
                NL A03 = nl.A03(c0764Qb);
                ln3 = this.A00.A0E;
                NL A02 = A03.A02(ln3);
                abstractC1045aS = ((AbstractC0844Td) ((AbstractC0844Td) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1045aS.A0N()).A05();
                interfaceC0565If = ((AbstractC0844Td) ((AbstractC0844Td) this.A00)).A0C;
                str2 = this.A00.A0A;
                interfaceC0565If.A9S(str2, A05);
                abstractC1045aS2 = ((AbstractC0844Td) ((AbstractC0844Td) this.A00)).A0A;
                C1R A0x = abstractC1045aS2.A0x();
                ya = this.A00.A0D;
                C1R.A07(A0x, ya);
                ya2 = this.A00.A0D;
                ya2.A0E().A2g();
                abstractC1045aS3 = this.A00.A03;
                C2C.A00(abstractC1045aS3.A0M());
            }
        }
    }
}
