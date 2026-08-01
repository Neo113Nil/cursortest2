package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2234a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0102l f2235b;

    public C0101k(C0102l c0102l) {
        this.f2235b = c0102l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2234a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2234a) {
            this.f2234a = false;
            return;
        }
        C0102l c0102l = this.f2235b;
        if (((Float) c0102l.f2262z.getAnimatedValue()).floatValue() == 0.0f) {
            c0102l.f2238A = 0;
            c0102l.f(0);
        } else {
            c0102l.f2238A = 2;
            c0102l.f2255s.invalidate();
        }
    }
}
