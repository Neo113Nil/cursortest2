package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class K9 extends AbstractRunnableC0846Vt {
    public final /* synthetic */ AbstractC0964aB A00;

    public K9(AbstractC0964aB abstractC0964aB) {
        this.A00 = abstractC0964aB;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC0964aB abstractC0964aB = this.A00;
            i = this.A00.A08;
            abstractC0964aB.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC0964aB abstractC0964aB2 = this.A00;
            runnable = this.A00.A0A;
            abstractC0964aB2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
