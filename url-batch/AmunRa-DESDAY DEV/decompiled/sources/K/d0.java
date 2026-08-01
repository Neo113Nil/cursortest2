package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f385a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f387c;

    public d0(j0 j0Var, View view) {
        this.f386b = j0Var;
        this.f387c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f385a) {
            case 0:
                ((j0) this.f386b).f409a.d(1.0f);
                f0.e((View) this.f387c);
                break;
            default:
                ((o.b) this.f386b).remove(animator);
                ((k0.m) this.f387c).f2734n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f385a) {
            case 1:
                ((k0.m) this.f387c).f2734n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(k0.m mVar, o.b bVar) {
        this.f387c = mVar;
        this.f386b = bVar;
    }
}
