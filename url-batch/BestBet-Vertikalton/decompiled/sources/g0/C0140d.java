package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2813a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f2814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2815c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0145i f2816e;

    public C0140d(C0145i c0145i, Y y2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2816e = c0145i;
        this.f2814b = y2;
        this.d = viewPropertyAnimator;
        this.f2815c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2813a) {
            case 1:
                this.f2815c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2813a) {
            case 0:
                this.d.setListener(null);
                this.f2815c.setAlpha(1.0f);
                C0145i c0145i = this.f2816e;
                Y y2 = this.f2814b;
                c0145i.c(y2);
                c0145i.f2864q.remove(y2);
                c0145i.i();
                break;
            default:
                this.d.setListener(null);
                C0145i c0145i2 = this.f2816e;
                Y y3 = this.f2814b;
                c0145i2.c(y3);
                c0145i2.f2862o.remove(y3);
                c0145i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2813a) {
            case 0:
                this.f2816e.getClass();
                break;
            default:
                this.f2816e.getClass();
                break;
        }
    }

    public C0140d(C0145i c0145i, Y y2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2816e = c0145i;
        this.f2814b = y2;
        this.f2815c = view;
        this.d = viewPropertyAnimator;
    }
}
