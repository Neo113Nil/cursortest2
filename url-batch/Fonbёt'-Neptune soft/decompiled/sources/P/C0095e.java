package P;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: P.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f891a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0097g f892b;

    public C0095e(C0097g c0097g) {
        this.f892b = c0097g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f891a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f891a) {
            this.f891a = false;
            return;
        }
        C0097g c0097g = this.f892b;
        if (((Float) c0097g.f916u.getAnimatedValue()).floatValue() == 0.0f) {
            c0097g.v = 0;
            c0097g.e(0);
        } else {
            c0097g.v = 2;
            c0097g.f909n.invalidate();
        }
    }
}
