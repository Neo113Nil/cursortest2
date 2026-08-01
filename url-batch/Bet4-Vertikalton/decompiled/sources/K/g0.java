package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f455a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f457c;

    public g0(m0 m0Var, View view) {
        this.f456b = m0Var;
        this.f457c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f455a) {
            case 0:
                ((m0) this.f456b).f480a.d(1.0f);
                i0.e((View) this.f457c);
                break;
            default:
                ((o.b) this.f456b).remove(animator);
                ((l0.m) this.f457c).f3094n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f455a) {
            case 1:
                ((l0.m) this.f457c).f3094n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g0(l0.m mVar, o.b bVar) {
        this.f457c = mVar;
        this.f456b = bVar;
    }
}
