package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f447c;

    public d0(j0 j0Var, View view) {
        this.f446b = j0Var;
        this.f447c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f445a) {
            case 0:
                ((j0) this.f446b).f469a.d(1.0f);
                f0.e((View) this.f447c);
                break;
            default:
                ((o.b) this.f446b).remove(animator);
                ((k0.n) this.f447c).f2796n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f445a) {
            case 1:
                ((k0.n) this.f447c).f2796n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(k0.n nVar, o.b bVar) {
        this.f447c = nVar;
        this.f446b = bVar;
    }
}
