package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2415Kq extends AbstractRunnableC2705Wc {
    public final /* synthetic */ AbstractC2903bb A00;

    public C2415Kq(AbstractC2903bb abstractC2903bb) {
        this.A00 = abstractC2903bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC2903bb abstractC2903bb = this.A00;
            i = this.A00.A08;
            abstractC2903bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC2903bb abstractC2903bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC2903bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
