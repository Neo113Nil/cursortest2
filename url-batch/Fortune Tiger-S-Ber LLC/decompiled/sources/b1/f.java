package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f776b;
    public final /* synthetic */ View c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f779f;

    public f(j jVar, c1 c1Var, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f779f = jVar;
        this.f775a = c1Var;
        this.f776b = i4;
        this.c = view;
        this.f777d = i5;
        this.f778e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.f776b;
        View view = this.c;
        if (i4 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f777d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f778e.setListener(null);
        j jVar = this.f779f;
        c1 c1Var = this.f775a;
        jVar.c(c1Var);
        jVar.f813p.remove(c1Var);
        jVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f779f.getClass();
    }
}
