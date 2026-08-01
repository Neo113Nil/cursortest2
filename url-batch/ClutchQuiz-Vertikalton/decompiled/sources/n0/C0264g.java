package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.clutchquizarena.app.R;

/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3150a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3151b = false;

    public C0264g(View view) {
        this.f3150a = view;
    }

    @Override // n0.k
    public final void a() {
        View view = this.f3150a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3199a.e(view) : 0.0f));
    }

    @Override // n0.k
    public final void b(m mVar) {
    }

    @Override // n0.k
    public final void c() {
        this.f3150a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // n0.k
    public final void d(m mVar) {
    }

    @Override // n0.k
    public final void e(m mVar) {
    }

    @Override // n0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3199a.l(this.f3150a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3150a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3151b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3151b;
        View view = this.f3150a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C c2 = w.f3199a;
        c2.l(view, 1.0f);
        c2.getClass();
    }
}
