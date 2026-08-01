package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2053c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0092i f2055f;

    public C0088e(C0092i c0092i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2055f = c0092i;
        this.f2051a = x2;
        this.f2052b = i;
        this.f2053c = view;
        this.d = i2;
        this.f2054e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2052b;
        View view = this.f2053c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2054e.setListener(null);
        C0092i c0092i = this.f2055f;
        X x2 = this.f2051a;
        c0092i.c(x2);
        c0092i.f2096p.remove(x2);
        c0092i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2055f.getClass();
    }
}
