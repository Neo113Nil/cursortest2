package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2102a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0095l f2103b;

    public C0094k(C0095l c0095l) {
        this.f2103b = c0095l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2102a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2102a) {
            this.f2102a = false;
            return;
        }
        C0095l c0095l = this.f2103b;
        if (((Float) c0095l.f2130z.getAnimatedValue()).floatValue() == 0.0f) {
            c0095l.f2106A = 0;
            c0095l.f(0);
        } else {
            c0095l.f2106A = 2;
            c0095l.f2123s.invalidate();
        }
    }
}
