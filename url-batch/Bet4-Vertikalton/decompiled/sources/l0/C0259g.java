package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.R;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3067a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3068b = false;

    public C0259g(View view) {
        this.f3067a = view;
    }

    @Override // l0.k
    public final void a() {
        View view = this.f3067a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3116a.j(view) : RecyclerView.f1530C0));
    }

    @Override // l0.k
    public final void b(m mVar) {
    }

    @Override // l0.k
    public final void c(m mVar) {
    }

    @Override // l0.k
    public final void d(m mVar) {
    }

    @Override // l0.k
    public final void e() {
        this.f3067a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // l0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3116a.p(this.f3067a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3067a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3068b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3068b;
        View view = this.f3067a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0250C c0250c = w.f3116a;
        c0250c.p(view, 1.0f);
        c0250c.getClass();
    }
}
