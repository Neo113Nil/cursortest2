package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2525a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0125l f2526b;

    public C0124k(C0125l c0125l) {
        this.f2526b = c0125l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2525a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2525a) {
            this.f2525a = false;
            return;
        }
        C0125l c0125l = this.f2526b;
        if (((Float) c0125l.f2553z.getAnimatedValue()).floatValue() == 0.0f) {
            c0125l.f2529A = 0;
            c0125l.f(0);
        } else {
            c0125l.f2529A = 2;
            c0125l.f2546s.invalidate();
        }
    }
}
