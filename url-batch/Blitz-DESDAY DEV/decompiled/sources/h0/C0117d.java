package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2468a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2470c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0122i f2471e;

    public C0117d(C0122i c0122i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2471e = c0122i;
        this.f2469b = x2;
        this.d = viewPropertyAnimator;
        this.f2470c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2468a) {
            case 1:
                this.f2470c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2468a) {
            case 0:
                this.d.setListener(null);
                this.f2470c.setAlpha(1.0f);
                C0122i c0122i = this.f2471e;
                X x2 = this.f2469b;
                c0122i.c(x2);
                c0122i.f2519q.remove(x2);
                c0122i.i();
                break;
            default:
                this.d.setListener(null);
                C0122i c0122i2 = this.f2471e;
                X x3 = this.f2469b;
                c0122i2.c(x3);
                c0122i2.f2517o.remove(x3);
                c0122i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2468a) {
            case 0:
                this.f2471e.getClass();
                break;
            default:
                this.f2471e.getClass();
                break;
        }
    }

    public C0117d(C0122i c0122i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2471e = c0122i;
        this.f2469b = x2;
        this.f2470c = view;
        this.d = viewPropertyAnimator;
    }
}
