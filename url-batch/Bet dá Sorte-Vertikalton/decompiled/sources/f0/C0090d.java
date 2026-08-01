package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2153a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2155c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0095i f2156e;

    public C0090d(C0095i c0095i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2156e = c0095i;
        this.f2154b = x2;
        this.d = viewPropertyAnimator;
        this.f2155c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2153a) {
            case 1:
                this.f2155c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2153a) {
            case 0:
                this.d.setListener(null);
                this.f2155c.setAlpha(1.0f);
                C0095i c0095i = this.f2156e;
                X x2 = this.f2154b;
                c0095i.c(x2);
                c0095i.f2206q.remove(x2);
                c0095i.i();
                break;
            default:
                this.d.setListener(null);
                C0095i c0095i2 = this.f2156e;
                X x3 = this.f2154b;
                c0095i2.c(x3);
                c0095i2.f2204o.remove(x3);
                c0095i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2153a) {
            case 0:
                this.f2156e.getClass();
                break;
            default:
                this.f2156e.getClass();
                break;
        }
    }

    public C0090d(C0095i c0095i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2156e = c0095i;
        this.f2154b = x2;
        this.f2155c = view;
        this.d = viewPropertyAnimator;
    }
}
