package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2551a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0131m f2552b;

    public C0130l(C0131m c0131m) {
        this.f2552b = c0131m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2551a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2551a) {
            this.f2551a = false;
            return;
        }
        C0131m c0131m = this.f2552b;
        if (((Float) c0131m.f2583z.getAnimatedValue()).floatValue() == RecyclerView.A0) {
            c0131m.f2558A = 0;
            c0131m.f(0);
        } else {
            c0131m.f2558A = 2;
            c0131m.f2576s.invalidate();
        }
    }
}
