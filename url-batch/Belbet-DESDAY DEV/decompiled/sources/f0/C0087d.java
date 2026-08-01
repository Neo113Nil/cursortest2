package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2045a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2047c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0092i f2048e;

    public C0087d(C0092i c0092i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2048e = c0092i;
        this.f2046b = x2;
        this.d = viewPropertyAnimator;
        this.f2047c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2045a) {
            case 1:
                this.f2047c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2045a) {
            case 0:
                this.d.setListener(null);
                this.f2047c.setAlpha(1.0f);
                C0092i c0092i = this.f2048e;
                X x2 = this.f2046b;
                c0092i.c(x2);
                c0092i.f2098q.remove(x2);
                c0092i.i();
                break;
            default:
                this.d.setListener(null);
                C0092i c0092i2 = this.f2048e;
                X x3 = this.f2046b;
                c0092i2.c(x3);
                c0092i2.f2096o.remove(x3);
                c0092i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2045a) {
            case 0:
                this.f2048e.getClass();
                break;
            default:
                this.f2048e.getClass();
                break;
        }
    }

    public C0087d(C0092i c0092i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2048e = c0092i;
        this.f2046b = x2;
        this.f2047c = view;
        this.d = viewPropertyAnimator;
    }
}
