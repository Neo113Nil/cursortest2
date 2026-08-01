package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.winpower.neonfit.R;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330f extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3825a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3826b = false;

    public C0330f(View view) {
        this.f3825a = view;
    }

    @Override // p0.k
    public final void a() {
        View view = this.f3825a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3874a.B(view) : 0.0f));
    }

    @Override // p0.k
    public final void b(m mVar) {
    }

    @Override // p0.k
    public final void c(m mVar) {
    }

    @Override // p0.k
    public final void d(m mVar) {
    }

    @Override // p0.k
    public final void e() {
        this.f3825a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3874a.e0(this.f3825a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3825a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3826b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3826b;
        View view = this.f3825a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0321B c0321b = w.f3874a;
        c0321b.e0(view, 1.0f);
        c0321b.getClass();
    }
}
