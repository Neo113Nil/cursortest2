package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1406hR extends AbstractRunnableC0846Vt {
    public final /* synthetic */ AbstractC1405hQ A00;
    public final /* synthetic */ V1 A01;

    public C1406hR(AbstractC1405hQ abstractC1405hQ, V1 v1) {
        this.A00 = abstractC1405hQ;
        this.A01 = v1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        this.A00.A0B.A0F().A5Y(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
