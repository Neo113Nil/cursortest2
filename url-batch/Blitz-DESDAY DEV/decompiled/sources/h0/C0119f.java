package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0120g f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2483c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0122i f2484e;

    public /* synthetic */ C0119f(C0122i c0122i, C0120g c0120g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2481a = i;
        this.f2484e = c0122i;
        this.f2482b = c0120g;
        this.f2483c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2481a) {
            case 0:
                this.f2483c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0120g c0120g = this.f2482b;
                X x2 = c0120g.f2492a;
                C0122i c0122i = this.f2484e;
                c0122i.c(x2);
                c0122i.f2520r.remove(c0120g.f2492a);
                c0122i.i();
                break;
            default:
                this.f2483c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0120g c0120g2 = this.f2482b;
                X x3 = c0120g2.f2493b;
                C0122i c0122i2 = this.f2484e;
                c0122i2.c(x3);
                c0122i2.f2520r.remove(c0120g2.f2493b);
                c0122i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2481a) {
            case 0:
                X x2 = this.f2482b.f2492a;
                this.f2484e.getClass();
                break;
            default:
                X x3 = this.f2482b.f2493b;
                this.f2484e.getClass();
                break;
        }
    }
}
