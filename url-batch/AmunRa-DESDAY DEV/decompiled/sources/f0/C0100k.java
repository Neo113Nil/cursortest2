package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2166a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0101l f2167b;

    public C0100k(C0101l c0101l) {
        this.f2167b = c0101l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2166a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2166a) {
            this.f2166a = false;
            return;
        }
        C0101l c0101l = this.f2167b;
        if (((Float) c0101l.f2194z.getAnimatedValue()).floatValue() == 0.0f) {
            c0101l.f2170A = 0;
            c0101l.f(0);
        } else {
            c0101l.f2170A = 2;
            c0101l.f2187s.invalidate();
        }
    }
}
