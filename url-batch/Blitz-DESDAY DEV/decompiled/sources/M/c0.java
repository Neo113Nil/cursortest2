package M;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f531a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f533c;

    public c0(i0 i0Var, View view) {
        this.f532b = i0Var;
        this.f533c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f531a) {
            case 0:
                ((i0) this.f532b).f559a.d(1.0f);
                e0.e((View) this.f533c);
                break;
            default:
                ((q.b) this.f532b).remove(animator);
                ((m0.m) this.f533c).f3182n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f531a) {
            case 1:
                ((m0.m) this.f533c).f3182n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public c0(m0.m mVar, q.b bVar) {
        this.f533c = mVar;
        this.f532b = bVar;
    }
}
