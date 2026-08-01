package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f835a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f836b;

    public l(n nVar) {
        this.f836b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f835a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f835a) {
            this.f835a = false;
            return;
        }
        n nVar = this.f836b;
        if (((Float) nVar.f873z.getAnimatedValue()).floatValue() == 0.0f) {
            nVar.A = 0;
            nVar.f(0);
        } else {
            nVar.A = 2;
            nVar.f866s.invalidate();
        }
    }
}
