package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import q3.q0;
import q3.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1685a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1687c;

    public j(View view, u0 u0Var) {
        this.f1686b = u0Var;
        this.f1687c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1685a) {
            case 0:
                ((o.e) this.f1686b).remove(animator);
                ((o) this.f1687c).f1715q.remove(animator);
                break;
            default:
                u0 u0Var = (u0) this.f1686b;
                u0Var.f6160a.e(1.0f);
                q0.f((View) this.f1687c, u0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1685a) {
            case 0:
                ((o) this.f1687c).f1715q.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(o oVar, o.e eVar) {
        this.f1687c = oVar;
        this.f1686b = eVar;
    }
}
