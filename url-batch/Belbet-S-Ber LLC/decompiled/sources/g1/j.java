package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1692a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f1693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1694c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1695e;

    public j(o oVar, q1 q1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1695e = oVar;
        this.f1693b = q1Var;
        this.d = viewPropertyAnimator;
        this.f1694c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1692a) {
            case 1:
                this.f1694c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1692a) {
            case 0:
                this.d.setListener(null);
                this.f1694c.setAlpha(1.0f);
                o oVar = this.f1695e;
                q1 q1Var = this.f1693b;
                oVar.c(q1Var);
                oVar.f1746q.remove(q1Var);
                oVar.i();
                break;
            default:
                this.d.setListener(null);
                o oVar2 = this.f1695e;
                q1 q1Var2 = this.f1693b;
                oVar2.c(q1Var2);
                oVar2.f1744o.remove(q1Var2);
                oVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1692a) {
            case 0:
                this.f1695e.getClass();
                break;
            default:
                this.f1695e.getClass();
                break;
        }
    }

    public j(o oVar, q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1695e = oVar;
        this.f1693b = q1Var;
        this.f1694c = view;
        this.d = viewPropertyAnimator;
    }
}
