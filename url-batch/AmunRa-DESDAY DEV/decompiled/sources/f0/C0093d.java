package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2110a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2112c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0098i f2113e;

    public C0093d(C0098i c0098i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2113e = c0098i;
        this.f2111b = x2;
        this.d = viewPropertyAnimator;
        this.f2112c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2110a) {
            case 1:
                this.f2112c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2110a) {
            case 0:
                this.d.setListener(null);
                this.f2112c.setAlpha(1.0f);
                C0098i c0098i = this.f2113e;
                X x2 = this.f2111b;
                c0098i.c(x2);
                c0098i.f2163q.remove(x2);
                c0098i.i();
                break;
            default:
                this.d.setListener(null);
                C0098i c0098i2 = this.f2113e;
                X x3 = this.f2111b;
                c0098i2.c(x3);
                c0098i2.f2161o.remove(x3);
                c0098i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2110a) {
            case 0:
                this.f2113e.getClass();
                break;
            default:
                this.f2113e.getClass();
                break;
        }
    }

    public C0093d(C0098i c0098i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2113e = c0098i;
        this.f2111b = x2;
        this.f2112c = view;
        this.d = viewPropertyAnimator;
    }
}
