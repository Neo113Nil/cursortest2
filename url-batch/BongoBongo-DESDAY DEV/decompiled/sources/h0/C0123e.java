package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2487a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f2488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2489c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0128j f2490e;

    public C0123e(C0128j c0128j, a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2490e = c0128j;
        this.f2488b = a0Var;
        this.d = viewPropertyAnimator;
        this.f2489c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2487a) {
            case 1:
                this.f2489c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2487a) {
            case 0:
                this.d.setListener(null);
                this.f2489c.setAlpha(1.0f);
                C0128j c0128j = this.f2490e;
                a0 a0Var = this.f2488b;
                c0128j.c(a0Var);
                c0128j.f2539q.remove(a0Var);
                c0128j.i();
                break;
            default:
                this.d.setListener(null);
                C0128j c0128j2 = this.f2490e;
                a0 a0Var2 = this.f2488b;
                c0128j2.c(a0Var2);
                c0128j2.f2537o.remove(a0Var2);
                c0128j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2487a) {
            case 0:
                this.f2490e.getClass();
                break;
            default:
                this.f2490e.getClass();
                break;
        }
    }

    public C0123e(C0128j c0128j, a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2490e = c0128j;
        this.f2488b = a0Var;
        this.f2489c = view;
        this.d = viewPropertyAnimator;
    }
}
