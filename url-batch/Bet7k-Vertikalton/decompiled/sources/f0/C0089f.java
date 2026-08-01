package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0090g f2064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2065c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0092i f2066e;

    public /* synthetic */ C0089f(C0092i c0092i, C0090g c0090g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2063a = i;
        this.f2066e = c0092i;
        this.f2064b = c0090g;
        this.f2065c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2063a) {
            case 0:
                this.f2065c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0090g c0090g = this.f2064b;
                X x2 = c0090g.f2072a;
                C0092i c0092i = this.f2066e;
                c0092i.c(x2);
                c0092i.f2098r.remove(c0090g.f2072a);
                c0092i.i();
                break;
            default:
                this.f2065c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0090g c0090g2 = this.f2064b;
                X x3 = c0090g2.f2073b;
                C0092i c0092i2 = this.f2066e;
                c0092i2.c(x3);
                c0092i2.f2098r.remove(c0090g2.f2073b);
                c0092i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2063a) {
            case 0:
                X x2 = this.f2064b.f2072a;
                this.f2066e.getClass();
                break;
            default:
                X x3 = this.f2064b.f2073b;
                this.f2066e.getClass();
                break;
        }
    }
}
