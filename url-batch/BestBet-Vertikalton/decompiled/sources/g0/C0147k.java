package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2870a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0148l f2871b;

    public C0147k(C0148l c0148l) {
        this.f2871b = c0148l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2870a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2870a) {
            this.f2870a = false;
            return;
        }
        C0148l c0148l = this.f2871b;
        if (((Float) c0148l.f2898z.getAnimatedValue()).floatValue() == RecyclerView.f1937A0) {
            c0148l.f2874A = 0;
            c0148l.f(0);
        } else {
            c0148l.f2874A = 2;
            c0148l.f2891s.invalidate();
        }
    }
}
