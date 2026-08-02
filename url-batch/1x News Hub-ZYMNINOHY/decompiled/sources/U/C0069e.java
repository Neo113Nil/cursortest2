package U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: U.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1400a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0071g f1401b;

    public C0069e(C0071g c0071g) {
        this.f1401b = c0071g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1400a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1400a) {
            this.f1400a = false;
            return;
        }
        C0071g c0071g = this.f1401b;
        if (((Float) c0071g.f1423u.getAnimatedValue()).floatValue() == 0.0f) {
            c0071g.v = 0;
            c0071g.e(0);
        } else {
            c0071g.v = 2;
            c0071g.f1417n.invalidate();
        }
    }
}
