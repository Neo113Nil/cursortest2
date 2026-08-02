package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1182dp extends AnimatorListenerAdapter {
    public final /* synthetic */ C01142y A00;

    public C1182dp(C01142y c01142y) {
        this.A00 = c01142y;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new D5(this), 2000L);
    }
}
