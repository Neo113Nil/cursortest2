package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.glasspulse.glasspulse.R;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2753a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2754b = false;

    public C0178g(View view) {
        this.f2753a = view;
    }

    @Override // k0.k
    public final void a() {
        View view = this.f2753a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.f2803a.j(view) : 0.0f));
    }

    @Override // k0.k
    public final void b(m mVar) {
    }

    @Override // k0.k
    public final void c() {
        this.f2753a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
    }

    @Override // k0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.f2803a.o(this.f2753a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2753a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2754b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2754b;
        View view = this.f2753a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        E e2 = x.f2803a;
        e2.o(view, 1.0f);
        e2.getClass();
    }
}
