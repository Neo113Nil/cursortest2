package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2103a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0096l f2104b;

    public C0095k(C0096l c0096l) {
        this.f2104b = c0096l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2103a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2103a) {
            this.f2103a = false;
            return;
        }
        C0096l c0096l = this.f2104b;
        if (((Float) c0096l.f2131z.getAnimatedValue()).floatValue() == 0.0f) {
            c0096l.f2107A = 0;
            c0096l.f(0);
        } else {
            c0096l.f2107A = 2;
            c0096l.f2124s.invalidate();
        }
    }
}
