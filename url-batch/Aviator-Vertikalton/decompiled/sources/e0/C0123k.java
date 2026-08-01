package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: e0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2273a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0124l f2274b;

    public C0123k(C0124l c0124l) {
        this.f2274b = c0124l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2273a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2273a) {
            this.f2273a = false;
            return;
        }
        C0124l c0124l = this.f2274b;
        if (((Float) c0124l.f2302z.getAnimatedValue()).floatValue() == 0.0f) {
            c0124l.f2277A = 0;
            c0124l.f(0);
        } else {
            c0124l.f2277A = 2;
            c0124l.f2295s.invalidate();
        }
    }
}
