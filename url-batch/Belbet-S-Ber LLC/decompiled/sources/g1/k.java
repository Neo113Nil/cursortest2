package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f1696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1698c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f1700f;

    public k(o oVar, q1 q1Var, int i, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1700f = oVar;
        this.f1696a = q1Var;
        this.f1697b = i;
        this.f1698c = view;
        this.d = i4;
        this.f1699e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f1697b;
        View view = this.f1698c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1699e.setListener(null);
        o oVar = this.f1700f;
        q1 q1Var = this.f1696a;
        oVar.c(q1Var);
        oVar.f1745p.remove(q1Var);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1700f.getClass();
    }
}
