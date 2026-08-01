package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2207a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0121i f2211e;

    public C0116d(C0121i c0121i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2211e = c0121i;
        this.f2208b = x2;
        this.f2210d = viewPropertyAnimator;
        this.f2209c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2207a) {
            case 1:
                this.f2209c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2207a) {
            case 0:
                this.f2210d.setListener(null);
                this.f2209c.setAlpha(1.0f);
                C0121i c0121i = this.f2211e;
                X x2 = this.f2208b;
                c0121i.c(x2);
                c0121i.f2270q.remove(x2);
                c0121i.i();
                break;
            default:
                this.f2210d.setListener(null);
                C0121i c0121i2 = this.f2211e;
                X x3 = this.f2208b;
                c0121i2.c(x3);
                c0121i2.f2268o.remove(x3);
                c0121i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2207a) {
            case 0:
                this.f2211e.getClass();
                break;
            default:
                this.f2211e.getClass();
                break;
        }
    }

    public C0116d(C0121i c0121i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2211e = c0121i;
        this.f2208b = x2;
        this.f2209c = view;
        this.f2210d = viewPropertyAnimator;
    }
}
