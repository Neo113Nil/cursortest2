package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3047a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0161k f3048b;

    public C0160j(C0161k c0161k) {
        this.f3048b = c0161k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3047a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3047a) {
            this.f3047a = false;
            return;
        }
        C0161k c0161k = this.f3048b;
        if (((Float) c0161k.f3075z.getAnimatedValue()).floatValue() == 0.0f) {
            c0161k.f3051A = 0;
            c0161k.f(0);
        } else {
            c0161k.f3051A = 2;
            c0161k.f3068s.invalidate();
        }
    }
}
