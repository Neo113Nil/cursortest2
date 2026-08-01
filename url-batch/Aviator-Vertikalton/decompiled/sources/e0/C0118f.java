package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0119g f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0121i f2234e;

    public /* synthetic */ C0118f(C0121i c0121i, C0119g c0119g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2230a = i;
        this.f2234e = c0121i;
        this.f2231b = c0119g;
        this.f2232c = viewPropertyAnimator;
        this.f2233d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2230a) {
            case 0:
                this.f2232c.setListener(null);
                View view = this.f2233d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0119g c0119g = this.f2231b;
                X x2 = c0119g.f2241a;
                C0121i c0121i = this.f2234e;
                c0121i.c(x2);
                c0121i.f2271r.remove(c0119g.f2241a);
                c0121i.i();
                break;
            default:
                this.f2232c.setListener(null);
                View view2 = this.f2233d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0119g c0119g2 = this.f2231b;
                X x3 = c0119g2.f2242b;
                C0121i c0121i2 = this.f2234e;
                c0121i2.c(x3);
                c0121i2.f2271r.remove(c0119g2.f2242b);
                c0121i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2230a) {
            case 0:
                X x2 = this.f2231b.f2241a;
                this.f2234e.getClass();
                break;
            default:
                X x3 = this.f2231b.f2242b;
                this.f2234e.getClass();
                break;
        }
    }
}
