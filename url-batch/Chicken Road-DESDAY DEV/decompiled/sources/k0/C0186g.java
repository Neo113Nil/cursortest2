package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.playgen.securelock.R;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186g extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f2717a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2718b = false;

    public C0186g(View view) {
        this.f2717a = view;
    }

    @Override // k0.l
    public final void a() {
        View view = this.f2717a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.f2769a.k(view) : 0.0f));
    }

    @Override // k0.l
    public final void b(n nVar) {
    }

    @Override // k0.l
    public final void c() {
        this.f2717a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // k0.l
    public final void d(n nVar) {
    }

    @Override // k0.l
    public final void e(n nVar) {
    }

    @Override // k0.l
    public final void f(n nVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.f2769a.s(this.f2717a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2717a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2718b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2718b;
        View view = this.f2717a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0178D c0178d = x.f2769a;
        c0178d.s(view, 1.0f);
        c0178d.getClass();
    }
}
