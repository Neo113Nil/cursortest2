package com.aiming.mdt.adt.interstitial;

import android.animation.ObjectAnimator;
import com.aiming.mdt.a.C0033;

/* renamed from: com.aiming.mdt.adt.interstitial.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0215 implements Runnable {

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ InterstitialActivity f723;

    RunnableC0215(InterstitialActivity interstitialActivity) {
        this.f723 = interstitialActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C0033 c0033;
        C0033 c00332;
        C0033 c00333;
        C0033 c00334;
        C0033 c00335;
        z = this.f723.isBackEnable;
        if (!z) {
            c0033 = this.f723.mDrawCrossMarkView;
            if (c0033 != null) {
                c00332 = this.f723.mDrawCrossMarkView;
                c00332.setVisibility(8);
                return;
            }
            return;
        }
        c00333 = this.f723.mDrawCrossMarkView;
        if (c00333 != null) {
            c00334 = this.f723.mDrawCrossMarkView;
            c00334.setVisibility(0);
            c00335 = this.f723.mDrawCrossMarkView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c00335, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
    }
}
