package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: e0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2277a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0125l f2278b;

    public C0124k(C0125l c0125l) {
        this.f2278b = c0125l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2277a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2277a) {
            this.f2277a = false;
            return;
        }
        C0125l c0125l = this.f2278b;
        if (((Float) c0125l.f2306z.getAnimatedValue()).floatValue() == 0.0f) {
            c0125l.f2281A = 0;
            c0125l.f(0);
        } else {
            c0125l.f2281A = 2;
            c0125l.f2299s.invalidate();
        }
    }
}
