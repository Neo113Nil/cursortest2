package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0121i f2221f;

    public C0117e(C0121i c0121i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2221f = c0121i;
        this.f2216a = x2;
        this.f2217b = i;
        this.f2218c = view;
        this.f2219d = i2;
        this.f2220e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2217b;
        View view = this.f2218c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2219d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2220e.setListener(null);
        C0121i c0121i = this.f2221f;
        X x2 = this.f2216a;
        c0121i.c(x2);
        c0121i.f2269p.remove(x2);
        c0121i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2221f.getClass();
    }
}
