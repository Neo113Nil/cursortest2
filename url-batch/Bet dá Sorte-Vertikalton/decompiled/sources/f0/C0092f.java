package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0093g f2173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2174c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0095i f2175e;

    public /* synthetic */ C0092f(C0095i c0095i, C0093g c0093g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2172a = i;
        this.f2175e = c0095i;
        this.f2173b = c0093g;
        this.f2174c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2172a) {
            case 0:
                this.f2174c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0093g c0093g = this.f2173b;
                X x2 = c0093g.f2181a;
                C0095i c0095i = this.f2175e;
                c0095i.c(x2);
                c0095i.f2207r.remove(c0093g.f2181a);
                c0095i.i();
                break;
            default:
                this.f2174c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0093g c0093g2 = this.f2173b;
                X x3 = c0093g2.f2182b;
                C0095i c0095i2 = this.f2175e;
                c0095i2.c(x3);
                c0095i2.f2207r.remove(c0093g2.f2182b);
                c0095i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2172a) {
            case 0:
                X x2 = this.f2173b.f2181a;
                this.f2175e.getClass();
                break;
            default:
                X x3 = this.f2173b.f2182b;
                this.f2175e.getClass();
                break;
        }
    }
}
