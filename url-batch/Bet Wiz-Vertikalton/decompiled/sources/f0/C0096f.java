package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0097g f2198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2199c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0099i f2200e;

    public /* synthetic */ C0096f(C0099i c0099i, C0097g c0097g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2197a = i;
        this.f2200e = c0099i;
        this.f2198b = c0097g;
        this.f2199c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2197a) {
            case 0:
                this.f2199c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0097g c0097g = this.f2198b;
                X x2 = c0097g.f2206a;
                C0099i c0099i = this.f2200e;
                c0099i.c(x2);
                c0099i.f2232r.remove(c0097g.f2206a);
                c0099i.i();
                break;
            default:
                this.f2199c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0097g c0097g2 = this.f2198b;
                X x3 = c0097g2.f2207b;
                C0099i c0099i2 = this.f2200e;
                c0099i2.c(x3);
                c0099i2.f2232r.remove(c0097g2.f2207b);
                c0099i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2197a) {
            case 0:
                X x2 = this.f2198b.f2206a;
                this.f2200e.getClass();
                break;
            default:
                X x3 = this.f2198b.f2207b;
                this.f2200e.getClass();
                break;
        }
    }
}
