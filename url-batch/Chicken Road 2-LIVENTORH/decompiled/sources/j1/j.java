package j1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import n0.u0;
import n0.y0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1923a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1925c;

    public j(View view, y0 y0Var) {
        this.f1924b = y0Var;
        this.f1925c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1923a) {
            case 0:
                ((q.f) this.f1924b).remove(animator);
                ((o) this.f1925c).f1950t.remove(animator);
                break;
            default:
                y0 y0Var = (y0) this.f1924b;
                y0Var.f2803a.e(1.0f);
                u0.f((View) this.f1925c, y0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1923a) {
            case 0:
                ((o) this.f1925c).f1950t.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(o oVar, q.f fVar) {
        this.f1925c = oVar;
        this.f1924b = fVar;
    }
}
