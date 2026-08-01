package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1047aU implements NK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1046aT A01;
    public final /* synthetic */ UJ A02;

    public C1047aU(AbstractC1046aT abstractC1046aT, int i, UJ uj) {
        this.A01 = abstractC1046aT;
        this.A00 = i;
        this.A02 = uj;
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final void ABX(boolean z) {
        AbstractC0763Qa abstractC0763Qa;
        if (this.A00 == 0) {
            UJ uj = this.A02;
            abstractC0763Qa = this.A01.A04;
            uj.A1Z(abstractC0763Qa);
        }
        this.A02.A1c(z, true);
    }
}
