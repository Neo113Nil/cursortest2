package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f783b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f785e;

    public /* synthetic */ g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.f782a = i4;
        this.f785e = jVar;
        this.f783b = hVar;
        this.c = viewPropertyAnimator;
        this.f784d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f782a) {
            case 0:
                this.c.setListener(null);
                View view = this.f784d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f783b;
                c1 c1Var = hVar.f791a;
                j jVar = this.f785e;
                jVar.c(c1Var);
                jVar.f815r.remove(hVar.f791a);
                jVar.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.f784d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f783b;
                c1 c1Var2 = hVar2.f792b;
                j jVar2 = this.f785e;
                jVar2.c(c1Var2);
                jVar2.f815r.remove(hVar2.f792b);
                jVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f782a) {
            case 0:
                c1 c1Var = this.f783b.f791a;
                this.f785e.getClass();
                break;
            default:
                c1 c1Var2 = this.f783b.f792b;
                this.f785e.getClass();
                break;
        }
    }
}
