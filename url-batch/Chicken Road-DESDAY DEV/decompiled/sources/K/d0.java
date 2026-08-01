package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f392a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f394c;

    public d0(j0 j0Var, View view) {
        this.f393b = j0Var;
        this.f394c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f392a) {
            case 0:
                ((j0) this.f393b).f416a.d(1.0f);
                f0.e((View) this.f394c);
                break;
            default:
                ((o.b) this.f393b).remove(animator);
                ((k0.n) this.f394c).f2747n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f392a) {
            case 1:
                ((k0.n) this.f394c).f2747n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(k0.n nVar, o.b bVar) {
        this.f394c = nVar;
        this.f393b = bVar;
    }
}
