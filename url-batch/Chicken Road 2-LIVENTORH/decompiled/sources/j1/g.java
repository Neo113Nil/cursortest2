package j1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1912a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1913b = false;

    public g(View view) {
        this.f1912a = view;
    }

    @Override // j1.m
    public final void d() {
        View view = this.f1912a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? y.f1970a.I(view) : 0.0f));
    }

    @Override // j1.m
    public final void e() {
        this.f1912a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        y.f1970a.m0(this.f1912a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f1912a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f1913b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z4 = this.f1913b;
        View view = this.f1912a;
        if (z4) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        d0 d0Var = y.f1970a;
        d0Var.m0(view, 1.0f);
        d0Var.getClass();
    }

    @Override // j1.m
    public final void a(o oVar) {
    }

    @Override // j1.m
    public final void b(o oVar) {
    }

    @Override // j1.m
    public final void c(o oVar) {
    }

    @Override // j1.m
    public final void f(o oVar) {
    }
}
