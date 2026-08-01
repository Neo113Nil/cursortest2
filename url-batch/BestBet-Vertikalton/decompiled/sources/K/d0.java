package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f605a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f607c;

    public d0(j0 j0Var, View view) {
        this.f606b = j0Var;
        this.f607c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f605a) {
            case 0:
                ((j0) this.f606b).f628a.d(1.0f);
                f0.e((View) this.f607c);
                break;
            default:
                ((o.b) this.f606b).remove(animator);
                ((p0.m) this.f607c).f3687n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f605a) {
            case 1:
                ((p0.m) this.f607c).f3687n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(p0.m mVar, o.b bVar) {
        this.f607c = mVar;
        this.f606b = bVar;
    }
}
