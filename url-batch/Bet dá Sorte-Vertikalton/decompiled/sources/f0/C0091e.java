package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2162c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0095i f2164f;

    public C0091e(C0095i c0095i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2164f = c0095i;
        this.f2160a = x2;
        this.f2161b = i;
        this.f2162c = view;
        this.d = i2;
        this.f2163e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2161b;
        View view = this.f2162c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2163e.setListener(null);
        C0095i c0095i = this.f2164f;
        X x2 = this.f2160a;
        c0095i.c(x2);
        c0095i.f2205p.remove(x2);
        c0095i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2164f.getClass();
    }
}
