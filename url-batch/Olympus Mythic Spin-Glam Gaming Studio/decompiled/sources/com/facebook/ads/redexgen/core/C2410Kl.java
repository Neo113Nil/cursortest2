package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2410Kl extends AbstractRunnableC2705Wc {
    public final /* synthetic */ AbstractC2903bb A00;

    public C2410Kl(AbstractC2903bb abstractC2903bb) {
        this.A00 = abstractC2903bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC2903bb abstractC2903bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC2903bb.postOnAnimationDelayed(runnable, i);
    }
}
