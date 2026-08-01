package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2222c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0122i f2225f;

    public C0118e(C0122i c0122i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2225f = c0122i;
        this.f2220a = x2;
        this.f2221b = i;
        this.f2222c = view;
        this.f2223d = i2;
        this.f2224e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2221b;
        View view = this.f2222c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2223d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2224e.setListener(null);
        C0122i c0122i = this.f2225f;
        X x2 = this.f2220a;
        c0122i.c(x2);
        c0122i.f2273p.remove(x2);
        c0122i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2225f.getClass();
    }
}
