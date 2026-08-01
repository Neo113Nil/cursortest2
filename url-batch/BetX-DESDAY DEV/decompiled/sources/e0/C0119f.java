package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0120g f2235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0122i f2238e;

    public /* synthetic */ C0119f(C0122i c0122i, C0120g c0120g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2234a = i;
        this.f2238e = c0122i;
        this.f2235b = c0120g;
        this.f2236c = viewPropertyAnimator;
        this.f2237d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2234a) {
            case 0:
                this.f2236c.setListener(null);
                View view = this.f2237d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0120g c0120g = this.f2235b;
                X x2 = c0120g.f2245a;
                C0122i c0122i = this.f2238e;
                c0122i.c(x2);
                c0122i.f2275r.remove(c0120g.f2245a);
                c0122i.i();
                break;
            default:
                this.f2236c.setListener(null);
                View view2 = this.f2237d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0120g c0120g2 = this.f2235b;
                X x3 = c0120g2.f2246b;
                C0122i c0122i2 = this.f2238e;
                c0122i2.c(x3);
                c0122i2.f2275r.remove(c0120g2.f2246b);
                c0122i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2234a) {
            case 0:
                X x2 = this.f2235b.f2245a;
                this.f2238e.getClass();
                break;
            default:
                X x3 = this.f2235b.f2246b;
                this.f2238e.getClass();
                break;
        }
    }
}
