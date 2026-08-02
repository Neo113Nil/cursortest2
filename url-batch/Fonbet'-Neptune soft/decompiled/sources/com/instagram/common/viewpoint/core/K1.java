package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC0840Vt {
    public final /* synthetic */ AbstractC0958aB A00;

    public K1(AbstractC0958aB abstractC0958aB) {
        this.A00 = abstractC0958aB;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC0958aB abstractC0958aB = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC0958aB.postOnAnimationDelayed(runnable, i);
    }
}
