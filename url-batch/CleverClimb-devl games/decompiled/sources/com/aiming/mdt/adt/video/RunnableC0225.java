package com.aiming.mdt.adt.video;

import android.animation.ObjectAnimator;
import com.aiming.mdt.a.C0033;

/* renamed from: com.aiming.mdt.adt.video.ʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0225 implements Runnable {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ VideoActivity f731;

    RunnableC0225(VideoActivity videoActivity) {
        this.f731 = videoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C0033 c0033;
        C0033 c00332;
        C0033 c00333;
        C0033 c00334;
        C0033 c00335;
        z = this.f731.isBackEnable;
        if (!z) {
            c0033 = this.f731.mDrawCrossMarkView;
            if (c0033 != null) {
                c00332 = this.f731.mDrawCrossMarkView;
                c00332.setVisibility(8);
                return;
            }
            return;
        }
        c00333 = this.f731.mDrawCrossMarkView;
        if (c00333 != null) {
            c00334 = this.f731.mDrawCrossMarkView;
            c00334.setVisibility(0);
            c00335 = this.f731.mDrawCrossMarkView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c00335, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
    }
}
