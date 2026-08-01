package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0101g f2252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2253c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0103i f2254e;

    public /* synthetic */ C0100f(C0103i c0103i, C0101g c0101g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2251a = i;
        this.f2254e = c0103i;
        this.f2252b = c0101g;
        this.f2253c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2251a) {
            case 0:
                this.f2253c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0101g c0101g = this.f2252b;
                W w2 = c0101g.f2259a;
                C0103i c0103i = this.f2254e;
                c0103i.c(w2);
                c0103i.f2281r.remove(c0101g.f2259a);
                c0103i.i();
                break;
            default:
                this.f2253c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0101g c0101g2 = this.f2252b;
                W w3 = c0101g2.f2260b;
                C0103i c0103i2 = this.f2254e;
                c0103i2.c(w3);
                c0103i2.f2281r.remove(c0101g2.f2260b);
                c0103i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2251a) {
            case 0:
                W w2 = this.f2252b.f2259a;
                this.f2254e.getClass();
                break;
            default:
                W w3 = this.f2252b.f2260b;
                this.f2254e.getClass();
                break;
        }
    }
}
