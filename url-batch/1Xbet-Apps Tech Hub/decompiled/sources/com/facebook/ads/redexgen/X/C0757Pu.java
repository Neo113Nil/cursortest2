package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0757Pu extends AnimatorListenerAdapter {
    public final /* synthetic */ C02896l A00;

    public C0757Pu(C02896l c02896l) {
        this.A00 = c02896l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0606Jx(this), 2000L);
    }
}
