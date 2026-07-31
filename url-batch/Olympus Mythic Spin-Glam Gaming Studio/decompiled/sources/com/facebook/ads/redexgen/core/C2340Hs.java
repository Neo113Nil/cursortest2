package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2340Hs extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C5F A00;

    public C2340Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C2967cd c2967cd;
        c2967cd = this.A00.A0H;
        YB.A0F(1000, c2967cd);
        this.A00.postDelayed(this, 2000L);
    }
}
