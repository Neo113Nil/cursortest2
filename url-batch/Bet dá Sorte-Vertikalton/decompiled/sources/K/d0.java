package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f374a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f376c;

    public d0(j0 j0Var, View view) {
        this.f375b = j0Var;
        this.f376c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f374a) {
            case 0:
                ((j0) this.f375b).f398a.d(1.0f);
                f0.e((View) this.f376c);
                break;
            default:
                ((o.b) this.f375b).remove(animator);
                ((k0.m) this.f376c).f2780n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f374a) {
            case 1:
                ((k0.m) this.f376c).f2780n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(k0.m mVar, o.b bVar) {
        this.f376c = mVar;
        this.f375b = bVar;
    }
}
