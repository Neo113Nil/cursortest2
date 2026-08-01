package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1673a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1674b = false;

    public g(View view) {
        this.f1673a = view;
    }

    @Override // f1.m
    public final void b() {
        View view = this.f1673a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? y.f1726a.A(view) : 0.0f));
    }

    @Override // f1.m
    public final void c() {
        this.f1673a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        y.f1726a.U(this.f1673a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f1673a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f1674b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z4 = this.f1674b;
        View view = this.f1673a;
        if (z4) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        d0 d0Var = y.f1726a;
        d0Var.U(view, 1.0f);
        d0Var.getClass();
    }

    @Override // f1.m
    public final void a(o oVar) {
    }

    @Override // f1.m
    public final void d(o oVar) {
    }

    @Override // f1.m
    public final void e(o oVar) {
    }

    @Override // f1.m
    public final void f(o oVar) {
    }
}
