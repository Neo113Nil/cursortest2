package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2475c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0122i f2477f;

    public C0118e(C0122i c0122i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2477f = c0122i;
        this.f2473a = x2;
        this.f2474b = i;
        this.f2475c = view;
        this.d = i2;
        this.f2476e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2474b;
        View view = this.f2475c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2476e.setListener(null);
        C0122i c0122i = this.f2477f;
        X x2 = this.f2473a;
        c0122i.c(x2);
        c0122i.f2518p.remove(x2);
        c0122i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2477f.getClass();
    }
}
