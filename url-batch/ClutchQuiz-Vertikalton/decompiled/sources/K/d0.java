package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f383a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f385c;

    public d0(j0 j0Var, View view) {
        this.f384b = j0Var;
        this.f385c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f383a) {
            case 0:
                ((j0) this.f384b).f411a.d(1.0f);
                f0.e((View) this.f385c);
                break;
            default:
                ((o.b) this.f384b).remove(animator);
                ((n0.m) this.f385c).f3177n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f383a) {
            case 1:
                ((n0.m) this.f385c).f3177n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(n0.m mVar, o.b bVar) {
        this.f385c = mVar;
        this.f384b = bVar;
    }
}
