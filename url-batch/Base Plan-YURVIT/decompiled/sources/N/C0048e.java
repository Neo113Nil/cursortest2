package N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: N.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f714a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0050g f715b;

    public C0048e(C0050g c0050g) {
        this.f715b = c0050g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f714a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f714a) {
            this.f714a = false;
            return;
        }
        C0050g c0050g = this.f715b;
        if (((Float) c0050g.f738u.getAnimatedValue()).floatValue() == 0.0f) {
            c0050g.f739v = 0;
            c0050g.e(0);
        } else {
            c0050g.f739v = 2;
            c0050g.f732n.invalidate();
        }
    }
}
