package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f472a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f474c;

    public g0(m0 m0Var, View view) {
        this.f473b = m0Var;
        this.f474c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f472a) {
            case 0:
                ((m0) this.f473b).f497a.d(1.0f);
                i0.e((View) this.f474c);
                break;
            default:
                ((o.b) this.f473b).remove(animator);
                ((l0.m) this.f474c).f3122n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f472a) {
            case 1:
                ((l0.m) this.f474c).f3122n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g0(l0.m mVar, o.b bVar) {
        this.f474c = mVar;
        this.f473b = bVar;
    }
}
