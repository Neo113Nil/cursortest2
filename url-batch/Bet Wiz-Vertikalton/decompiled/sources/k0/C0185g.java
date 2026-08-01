package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.neonpulse.gridlogic.R;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185g extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f2766a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2767b = false;

    public C0185g(View view) {
        this.f2766a = view;
    }

    @Override // k0.l
    public final void a() {
        View view = this.f2766a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.f2818a.k(view) : 0.0f));
    }

    @Override // k0.l
    public final void b(n nVar) {
    }

    @Override // k0.l
    public final void c() {
        this.f2766a.setTag(R.id.transition_pause_alpha, null);
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
        x.f2818a.r(this.f2766a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2766a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2767b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2767b;
        View view = this.f2766a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0177D c0177d = x.f2818a;
        c0177d.r(view, 1.0f);
        c0177d.getClass();
    }
}
