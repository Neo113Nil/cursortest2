package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC0846Vt {
    public final /* synthetic */ AbstractC0964aB A00;

    public K1(AbstractC0964aB abstractC0964aB) {
        this.A00 = abstractC0964aB;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC0964aB abstractC0964aB = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC0964aB.postOnAnimationDelayed(runnable, i);
    }
}
