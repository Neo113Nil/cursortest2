package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2459a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0129m f2460b;

    public C0128l(C0129m c0129m) {
        this.f2460b = c0129m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2459a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2459a) {
            this.f2459a = false;
            return;
        }
        C0129m c0129m = this.f2460b;
        if (((Float) c0129m.f2487z.getAnimatedValue()).floatValue() == RecyclerView.f1559A0) {
            c0129m.f2463A = 0;
            c0129m.f(0);
        } else {
            c0129m.f2463A = 2;
            c0129m.f2480s.invalidate();
        }
    }
}
