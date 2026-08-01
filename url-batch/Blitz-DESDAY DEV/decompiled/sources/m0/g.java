package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.winfour.neondrop.R;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3155a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3156b = false;

    public g(View view) {
        this.f3155a = view;
    }

    @Override // m0.k
    public final void a() {
        View view = this.f3155a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3204a.l(view) : 0.0f));
    }

    @Override // m0.k
    public final void b(m mVar) {
    }

    @Override // m0.k
    public final void c(m mVar) {
    }

    @Override // m0.k
    public final void d() {
        this.f3155a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // m0.k
    public final void e(m mVar) {
    }

    @Override // m0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3204a.r(this.f3155a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3155a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3156b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3156b;
        View view = this.f3155a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0230B c0230b = w.f3204a;
        c0230b.r(view, 1.0f);
        c0230b.getClass();
    }
}
