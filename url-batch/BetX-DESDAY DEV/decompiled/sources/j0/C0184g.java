package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.luckyarcade.spinthrow.R;

/* renamed from: j0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2915a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2916b = false;

    public C0184g(View view) {
        this.f2915a = view;
    }

    @Override // j0.k
    public final void a(m mVar) {
    }

    @Override // j0.k
    public final void b() {
        View view = this.f2915a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f2967a.i(view) : 0.0f));
    }

    @Override // j0.k
    public final void c(m mVar) {
    }

    @Override // j0.k
    public final void d(m mVar) {
    }

    @Override // j0.k
    public final void e() {
        this.f2915a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // j0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f2967a.q(this.f2915a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2915a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2916b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2916b;
        View view = this.f2915a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0174C c0174c = w.f2967a;
        c0174c.q(view, 1.0f);
        c0174c.getClass();
    }
}
