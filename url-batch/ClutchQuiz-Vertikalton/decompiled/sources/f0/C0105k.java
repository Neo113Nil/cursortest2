package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2283a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0106l f2284b;

    public C0105k(C0106l c0106l) {
        this.f2284b = c0106l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2283a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2283a) {
            this.f2283a = false;
            return;
        }
        C0106l c0106l = this.f2284b;
        if (((Float) c0106l.f2311z.getAnimatedValue()).floatValue() == 0.0f) {
            c0106l.f2287A = 0;
            c0106l.f(0);
        } else {
            c0106l.f2287A = 2;
            c0106l.f2304s.invalidate();
        }
    }
}
