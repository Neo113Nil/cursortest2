package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2230a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2232c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0103i f2233e;

    public C0098d(C0103i c0103i, W w2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2233e = c0103i;
        this.f2231b = w2;
        this.d = viewPropertyAnimator;
        this.f2232c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2230a) {
            case 1:
                this.f2232c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2230a) {
            case 0:
                this.d.setListener(null);
                this.f2232c.setAlpha(1.0f);
                C0103i c0103i = this.f2233e;
                W w2 = this.f2231b;
                c0103i.c(w2);
                c0103i.f2280q.remove(w2);
                c0103i.i();
                break;
            default:
                this.d.setListener(null);
                C0103i c0103i2 = this.f2233e;
                W w3 = this.f2231b;
                c0103i2.c(w3);
                c0103i2.f2278o.remove(w3);
                c0103i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2230a) {
            case 0:
                this.f2233e.getClass();
                break;
            default:
                this.f2233e.getClass();
                break;
        }
    }

    public C0098d(C0103i c0103i, W w2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2233e = c0103i;
        this.f2231b = w2;
        this.f2232c = view;
        this.d = viewPropertyAnimator;
    }
}
