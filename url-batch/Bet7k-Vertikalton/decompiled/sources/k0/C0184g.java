package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.shotwins.games.R;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184g extends AnimatorListenerAdapter implements InterfaceC0188k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2789a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2790b = false;

    public C0184g(View view) {
        this.f2789a = view;
    }

    @Override // k0.InterfaceC0188k
    public final void a() {
        View view = this.f2789a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0200w.f2838a.j(view) : 0.0f));
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
    }

    @Override // k0.InterfaceC0188k
    public final void c() {
        this.f2789a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // k0.InterfaceC0188k
    public final void d(AbstractC0190m abstractC0190m) {
    }

    @Override // k0.InterfaceC0188k
    public final void e(AbstractC0190m abstractC0190m) {
    }

    @Override // k0.InterfaceC0188k
    public final void f(AbstractC0190m abstractC0190m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0200w.f2838a.r(this.f2789a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2789a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2790b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2790b;
        View view = this.f2789a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0173C c0173c = AbstractC0200w.f2838a;
        c0173c.r(view, 1.0f);
        c0173c.getClass();
    }
}
