package M;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class a0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f724a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f726c;

    public a0(g0 g0Var, View view) {
        this.f725b = g0Var;
        this.f726c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f724a) {
            case 0:
                ((g0) this.f725b).f755a.d(1.0f);
                c0.e((View) this.f726c);
                break;
            default:
                ((q.b) this.f725b).remove(animator);
                ((p0.m) this.f726c).f3852n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f724a) {
            case 1:
                ((p0.m) this.f726c).f3852n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public a0(p0.m mVar, q.b bVar) {
        this.f726c = mVar;
        this.f725b = bVar;
    }
}
