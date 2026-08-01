package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f2324a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2325b = false;

    public g(View view) {
        this.f2324a = view;
    }

    @Override // k1.l
    public final void c() {
        View view = this.f2324a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.f2379a.A(view) : 0.0f));
    }

    @Override // k1.l
    public final void e() {
        this.f2324a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.f2379a.T(this.f2324a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2324a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2325b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        boolean z5 = this.f2325b;
        View view = this.f2324a;
        if (z5) {
            view.setLayerType(0, null);
        }
        if (z4) {
            return;
        }
        d0 d0Var = x.f2379a;
        d0Var.T(view, 1.0f);
        d0Var.getClass();
    }

    @Override // k1.l
    public final void a(n nVar) {
    }

    @Override // k1.l
    public final void b(n nVar) {
    }

    @Override // k1.l
    public final void d(n nVar) {
    }

    @Override // k1.l
    public final void f(n nVar) {
    }
}
