package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: D0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f616a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f617b = false;

    public C0305g(View view) {
        this.f616a = view;
    }

    @Override // D0.m
    public final void b() {
        View view = this.f616a;
        view.setTag(C5284R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? y.f674a.j(view) : 0.0f));
    }

    @Override // D0.m
    public final void e() {
        this.f616a.setTag(C5284R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        y.f674a.o(this.f616a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f616a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f617b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        boolean z9 = this.f617b;
        View view = this.f616a;
        if (z9) {
            view.setLayerType(0, null);
        }
        if (z8) {
            return;
        }
        D d2 = y.f674a;
        d2.o(view, 1.0f);
        d2.getClass();
    }

    @Override // D0.m
    public final void a(o oVar) {
    }

    @Override // D0.m
    public final void c(o oVar) {
    }

    @Override // D0.m
    public final void d(o oVar) {
    }

    @Override // D0.m
    public final void f(o oVar) {
    }
}
