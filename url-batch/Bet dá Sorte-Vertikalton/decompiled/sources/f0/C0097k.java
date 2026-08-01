package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2209a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0098l f2210b;

    public C0097k(C0098l c0098l) {
        this.f2210b = c0098l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2209a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2209a) {
            this.f2209a = false;
            return;
        }
        C0098l c0098l = this.f2210b;
        if (((Float) c0098l.f2237z.getAnimatedValue()).floatValue() == 0.0f) {
            c0098l.f2213A = 0;
            c0098l.f(0);
        } else {
            c0098l.f2213A = 2;
            c0098l.f2230s.invalidate();
        }
    }
}
