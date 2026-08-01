package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.skydrop.fallring.R;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185g extends AnimatorListenerAdapter implements InterfaceC0189k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2773a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2774b = false;

    public C0185g(View view) {
        this.f2773a = view;
    }

    @Override // k0.InterfaceC0189k
    public final void a() {
        View view = this.f2773a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0201w.f2822a.j(view) : 0.0f));
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
    }

    @Override // k0.InterfaceC0189k
    public final void c() {
        this.f2773a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // k0.InterfaceC0189k
    public final void d(AbstractC0191m abstractC0191m) {
    }

    @Override // k0.InterfaceC0189k
    public final void e(AbstractC0191m abstractC0191m) {
    }

    @Override // k0.InterfaceC0189k
    public final void f(AbstractC0191m abstractC0191m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0201w.f2822a.r(this.f2773a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2773a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2774b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2774b;
        View view = this.f2773a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0174C c0174c = AbstractC0201w.f2822a;
        c0174c.r(view, 1.0f);
        c0174c.getClass();
    }
}
