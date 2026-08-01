package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1709c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1710e;

    public /* synthetic */ l(o oVar, m mVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f1707a = i;
        this.f1710e = oVar;
        this.f1708b = mVar;
        this.f1709c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1707a) {
            case 0:
                this.f1709c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                m mVar = this.f1708b;
                q1 q1Var = mVar.f1712a;
                o oVar = this.f1710e;
                oVar.c(q1Var);
                oVar.f1747r.remove(mVar.f1712a);
                oVar.i();
                break;
            default:
                this.f1709c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                m mVar2 = this.f1708b;
                q1 q1Var2 = mVar2.f1713b;
                o oVar2 = this.f1710e;
                oVar2.c(q1Var2);
                oVar2.f1747r.remove(mVar2.f1713b);
                oVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1707a) {
            case 0:
                q1 q1Var = this.f1708b.f1712a;
                this.f1710e.getClass();
                break;
            default:
                q1 q1Var2 = this.f1708b.f1713b;
                this.f1710e.getClass();
                break;
        }
    }
}
