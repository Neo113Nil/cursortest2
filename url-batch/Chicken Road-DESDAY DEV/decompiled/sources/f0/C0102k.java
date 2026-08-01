package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2167a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0103l f2168b;

    public C0102k(C0103l c0103l) {
        this.f2168b = c0103l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2167a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2167a) {
            this.f2167a = false;
            return;
        }
        C0103l c0103l = this.f2168b;
        if (((Float) c0103l.f2195z.getAnimatedValue()).floatValue() == 0.0f) {
            c0103l.f2171A = 0;
            c0103l.f(0);
        } else {
            c0103l.f2171A = 2;
            c0103l.f2188s.invalidate();
        }
    }
}
