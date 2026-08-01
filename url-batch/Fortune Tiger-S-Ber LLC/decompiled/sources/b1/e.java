package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f767a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f768b;
    public final /* synthetic */ View c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f770e;

    public e(j jVar, c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f770e = jVar;
        this.f768b = c1Var;
        this.f769d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f767a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f767a) {
            case 0:
                this.f769d.setListener(null);
                this.c.setAlpha(1.0f);
                j jVar = this.f770e;
                c1 c1Var = this.f768b;
                jVar.c(c1Var);
                jVar.f814q.remove(c1Var);
                jVar.i();
                break;
            default:
                this.f769d.setListener(null);
                j jVar2 = this.f770e;
                c1 c1Var2 = this.f768b;
                jVar2.c(c1Var2);
                jVar2.f812o.remove(c1Var2);
                jVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f767a) {
            case 0:
                this.f770e.getClass();
                break;
            default:
                this.f770e.getClass();
                break;
        }
    }

    public e(j jVar, c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f770e = jVar;
        this.f768b = c1Var;
        this.c = view;
        this.f769d = viewPropertyAnimator;
    }
}
