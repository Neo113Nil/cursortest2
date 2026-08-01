package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T2 extends K8 {
    public final /* synthetic */ C0685Na A00;

    public T2(C0685Na c0685Na) {
        this.A00 = c0685Na;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            C0685Na c0685Na = this.A00;
            i = c0685Na.A07;
            c0685Na.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            C0685Na c0685Na2 = this.A00;
            runnable = c0685Na2.A09;
            c0685Na2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
