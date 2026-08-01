package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0096g f2130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2131c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0098i f2132e;

    public /* synthetic */ C0095f(C0098i c0098i, C0096g c0096g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2129a = i;
        this.f2132e = c0098i;
        this.f2130b = c0096g;
        this.f2131c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2129a) {
            case 0:
                this.f2131c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0096g c0096g = this.f2130b;
                X x2 = c0096g.f2138a;
                C0098i c0098i = this.f2132e;
                c0098i.c(x2);
                c0098i.f2164r.remove(c0096g.f2138a);
                c0098i.i();
                break;
            default:
                this.f2131c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0096g c0096g2 = this.f2130b;
                X x3 = c0096g2.f2139b;
                C0098i c0098i2 = this.f2132e;
                c0098i2.c(x3);
                c0098i2.f2164r.remove(c0096g2.f2139b);
                c0098i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2129a) {
            case 0:
                X x2 = this.f2130b.f2138a;
                this.f2132e.getClass();
                break;
            default:
                X x3 = this.f2130b.f2139b;
                this.f2132e.getClass();
                break;
        }
    }
}
