package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1356c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f1357e;

    public /* synthetic */ g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f1354a = i;
        this.f1357e = jVar;
        this.f1355b = hVar;
        this.f1356c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1354a) {
            case 0:
                this.f1356c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f1355b;
                b1 b1Var = hVar.f1359a;
                j jVar = this.f1357e;
                jVar.c(b1Var);
                jVar.f1398r.remove(hVar.f1359a);
                jVar.i();
                break;
            default:
                this.f1356c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f1355b;
                b1 b1Var2 = hVar2.f1360b;
                j jVar2 = this.f1357e;
                jVar2.c(b1Var2);
                jVar2.f1398r.remove(hVar2.f1360b);
                jVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1354a) {
            case 0:
                b1 b1Var = this.f1355b.f1359a;
                this.f1357e.getClass();
                break;
            default:
                b1 b1Var2 = this.f1355b.f1360b;
                this.f1357e.getClass();
                break;
        }
    }
}
