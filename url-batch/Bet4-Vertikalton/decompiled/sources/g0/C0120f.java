package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2364a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f2365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2366c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0125k f2367e;

    public C0120f(C0125k c0125k, c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2367e = c0125k;
        this.f2365b = c0Var;
        this.d = viewPropertyAnimator;
        this.f2366c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2364a) {
            case 1:
                this.f2366c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2364a) {
            case 0:
                this.d.setListener(null);
                this.f2366c.setAlpha(1.0f);
                C0125k c0125k = this.f2367e;
                c0 c0Var = this.f2365b;
                c0125k.c(c0Var);
                c0125k.f2414q.remove(c0Var);
                c0125k.i();
                break;
            default:
                this.d.setListener(null);
                C0125k c0125k2 = this.f2367e;
                c0 c0Var2 = this.f2365b;
                c0125k2.c(c0Var2);
                c0125k2.f2412o.remove(c0Var2);
                c0125k2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2364a) {
            case 0:
                this.f2367e.getClass();
                break;
            default:
                this.f2367e.getClass();
                break;
        }
    }

    public C0120f(C0125k c0125k, c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2367e = c0125k;
        this.f2365b = c0Var;
        this.f2366c = view;
        this.d = viewPropertyAnimator;
    }
}
