package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2211a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0122i f2215e;

    public C0117d(C0122i c0122i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2215e = c0122i;
        this.f2212b = x2;
        this.f2214d = viewPropertyAnimator;
        this.f2213c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2211a) {
            case 1:
                this.f2213c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2211a) {
            case 0:
                this.f2214d.setListener(null);
                this.f2213c.setAlpha(1.0f);
                C0122i c0122i = this.f2215e;
                X x2 = this.f2212b;
                c0122i.c(x2);
                c0122i.f2274q.remove(x2);
                c0122i.i();
                break;
            default:
                this.f2214d.setListener(null);
                C0122i c0122i2 = this.f2215e;
                X x3 = this.f2212b;
                c0122i2.c(x3);
                c0122i2.f2272o.remove(x3);
                c0122i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2211a) {
            case 0:
                this.f2215e.getClass();
                break;
            default:
                this.f2215e.getClass();
                break;
        }
    }

    public C0117d(C0122i c0122i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2215e = c0122i;
        this.f2212b = x2;
        this.f2213c = view;
        this.f2214d = viewPropertyAnimator;
    }
}
