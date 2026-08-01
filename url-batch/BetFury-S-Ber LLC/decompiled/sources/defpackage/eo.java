package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eo extends AnimatorListenerAdapter implements hj0 {
    public final View a;
    public boolean b = false;

    public eo(View view) {
        this.a = view;
    }

    @Override // defpackage.hj0
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? cn0.a.g(view) : 0.0f));
    }

    @Override // defpackage.hj0
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cn0.a.j(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        in0 in0Var = cn0.a;
        in0Var.j(view, 1.0f);
        in0Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.hj0
    public final void a(kj0 kj0Var) {
    }

    @Override // defpackage.hj0
    public final void d(kj0 kj0Var) {
    }

    @Override // defpackage.hj0
    public final void e(kj0 kj0Var) {
    }

    @Override // defpackage.hj0
    public final void f(kj0 kj0Var) {
    }
}
