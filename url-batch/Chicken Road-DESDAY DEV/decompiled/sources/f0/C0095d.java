package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2111a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2113c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0100i f2114e;

    public C0095d(C0100i c0100i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2114e = c0100i;
        this.f2112b = x2;
        this.d = viewPropertyAnimator;
        this.f2113c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2111a) {
            case 1:
                this.f2113c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2111a) {
            case 0:
                this.d.setListener(null);
                this.f2113c.setAlpha(1.0f);
                C0100i c0100i = this.f2114e;
                X x2 = this.f2112b;
                c0100i.c(x2);
                c0100i.f2164q.remove(x2);
                c0100i.i();
                break;
            default:
                this.d.setListener(null);
                C0100i c0100i2 = this.f2114e;
                X x3 = this.f2112b;
                c0100i2.c(x3);
                c0100i2.f2162o.remove(x3);
                c0100i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2111a) {
            case 0:
                this.f2114e.getClass();
                break;
            default:
                this.f2114e.getClass();
                break;
        }
    }

    public C0095d(C0100i c0100i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2114e = c0100i;
        this.f2112b = x2;
        this.f2113c = view;
        this.d = viewPropertyAnimator;
    }
}
