package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2396a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f2397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2398c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0126j f2399e;

    public C0121e(C0126j c0126j, a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2399e = c0126j;
        this.f2397b = a0Var;
        this.d = viewPropertyAnimator;
        this.f2398c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2396a) {
            case 1:
                this.f2398c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2396a) {
            case 0:
                this.d.setListener(null);
                this.f2398c.setAlpha(1.0f);
                C0126j c0126j = this.f2399e;
                a0 a0Var = this.f2397b;
                c0126j.c(a0Var);
                c0126j.f2449q.remove(a0Var);
                c0126j.i();
                break;
            default:
                this.d.setListener(null);
                C0126j c0126j2 = this.f2399e;
                a0 a0Var2 = this.f2397b;
                c0126j2.c(a0Var2);
                c0126j2.f2447o.remove(a0Var2);
                c0126j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2396a) {
            case 0:
                this.f2399e.getClass();
                break;
            default:
                this.f2399e.getClass();
                break;
        }
    }

    public C0121e(C0126j c0126j, a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2399e = c0126j;
        this.f2397b = a0Var;
        this.f2398c = view;
        this.d = viewPropertyAnimator;
    }
}
