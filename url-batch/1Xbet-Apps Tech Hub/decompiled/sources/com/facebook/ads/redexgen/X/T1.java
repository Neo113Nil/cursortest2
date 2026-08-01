package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T1 extends K8 {
    public final /* synthetic */ C0685Na A00;

    public T1(C0685Na c0685Na) {
        this.A00 = c0685Na;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        C0685Na c0685Na = this.A00;
        runnable = c0685Na.A08;
        i = this.A00.A07;
        c0685Na.postOnAnimationDelayed(runnable, i);
    }
}
