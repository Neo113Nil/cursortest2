package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4904a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0426f f4905b;

    public C0424d(C0426f c0426f) {
        this.f4905b = c0426f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4904a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4904a) {
            this.f4904a = false;
            return;
        }
        C0426f c0426f = this.f4905b;
        if (((Float) c0426f.f4928u.getAnimatedValue()).floatValue() == 0.0f) {
            c0426f.f4929v = 0;
            c0426f.e(0);
        } else {
            c0426f.f4929v = 2;
            c0426f.f4921n.invalidate();
        }
    }
}
