package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2120c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0100i f2122f;

    public C0096e(C0100i c0100i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2122f = c0100i;
        this.f2118a = x2;
        this.f2119b = i;
        this.f2120c = view;
        this.d = i2;
        this.f2121e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2119b;
        View view = this.f2120c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2121e.setListener(null);
        C0100i c0100i = this.f2122f;
        X x2 = this.f2118a;
        c0100i.c(x2);
        c0100i.f2163p.remove(x2);
        c0100i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2122f.getClass();
    }
}
