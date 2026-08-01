package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1337a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f1338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1339c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f1340e;

    public e(j jVar, b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1340e = jVar;
        this.f1338b = b1Var;
        this.d = viewPropertyAnimator;
        this.f1339c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1337a) {
            case 1:
                this.f1339c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1337a) {
            case 0:
                this.d.setListener(null);
                this.f1339c.setAlpha(1.0f);
                j jVar = this.f1340e;
                b1 b1Var = this.f1338b;
                jVar.c(b1Var);
                jVar.f1397q.remove(b1Var);
                jVar.i();
                break;
            default:
                this.d.setListener(null);
                j jVar2 = this.f1340e;
                b1 b1Var2 = this.f1338b;
                jVar2.c(b1Var2);
                jVar2.f1395o.remove(b1Var2);
                jVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1337a) {
            case 0:
                this.f1340e.getClass();
                break;
            default:
                this.f1340e.getClass();
                break;
        }
    }

    public e(j jVar, b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1340e = jVar;
        this.f1338b = b1Var;
        this.f1339c = view;
        this.d = viewPropertyAnimator;
    }
}
