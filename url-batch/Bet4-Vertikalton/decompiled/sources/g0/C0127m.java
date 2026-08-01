package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2426a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0128n f2427b;

    public C0127m(C0128n c0128n) {
        this.f2427b = c0128n;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2426a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2426a) {
            this.f2426a = false;
            return;
        }
        C0128n c0128n = this.f2427b;
        if (((Float) c0128n.f2457z.getAnimatedValue()).floatValue() == RecyclerView.f1530C0) {
            c0128n.f2433A = 0;
            c0128n.f(0);
        } else {
            c0128n.f2433A = 2;
            c0128n.f2450s.invalidate();
        }
    }
}
