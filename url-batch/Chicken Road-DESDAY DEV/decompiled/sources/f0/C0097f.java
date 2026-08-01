package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0098g f2131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2132c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0100i f2133e;

    public /* synthetic */ C0097f(C0100i c0100i, C0098g c0098g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2130a = i;
        this.f2133e = c0100i;
        this.f2131b = c0098g;
        this.f2132c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2130a) {
            case 0:
                this.f2132c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0098g c0098g = this.f2131b;
                X x2 = c0098g.f2139a;
                C0100i c0100i = this.f2133e;
                c0100i.c(x2);
                c0100i.f2165r.remove(c0098g.f2139a);
                c0100i.i();
                break;
            default:
                this.f2132c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0098g c0098g2 = this.f2131b;
                X x3 = c0098g2.f2140b;
                C0100i c0100i2 = this.f2133e;
                c0100i2.c(x3);
                c0100i2.f2165r.remove(c0098g2.f2140b);
                c0100i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2130a) {
            case 0:
                X x2 = this.f2131b.f2139a;
                this.f2133e.getClass();
                break;
            default:
                X x3 = this.f2131b.f2140b;
                this.f2133e.getClass();
                break;
        }
    }
}
