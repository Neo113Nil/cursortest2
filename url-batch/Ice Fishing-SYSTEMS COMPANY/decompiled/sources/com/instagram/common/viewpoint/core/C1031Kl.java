package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1031Kl extends AbstractRunnableC1326Wc {
    public final /* synthetic */ AbstractC1524bb A00;

    public C1031Kl(AbstractC1524bb abstractC1524bb) {
        this.A00 = abstractC1524bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC1524bb abstractC1524bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC1524bb.postOnAnimationDelayed(runnable, i);
    }
}
