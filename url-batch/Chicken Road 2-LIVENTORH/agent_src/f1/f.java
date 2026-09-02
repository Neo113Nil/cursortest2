package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1345c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f1347f;

    public f(j jVar, b1 b1Var, int i, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1347f = jVar;
        this.f1343a = b1Var;
        this.f1344b = i;
        this.f1345c = view;
        this.d = i4;
        this.f1346e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f1344b;
        View view = this.f1345c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1346e.setListener(null);
        j jVar = this.f1347f;
        b1 b1Var = this.f1343a;
        jVar.c(b1Var);
        jVar.f1396p.remove(b1Var);
        jVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1347f.getClass();
    }
}
