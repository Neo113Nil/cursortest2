package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2097a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0095l f2098b;

    public C0094k(C0095l c0095l) {
        this.f2098b = c0095l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2097a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2097a) {
            this.f2097a = false;
            return;
        }
        C0095l c0095l = this.f2098b;
        if (((Float) c0095l.f2125z.getAnimatedValue()).floatValue() == 0.0f) {
            c0095l.f2101A = 0;
            c0095l.f(0);
        } else {
            c0095l.f2101A = 2;
            c0095l.f2118s.invalidate();
        }
    }
}
