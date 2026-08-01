package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3095a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3096b = false;

    public C0262g(View view) {
        this.f3095a = view;
    }

    @Override // l0.k
    public final void a() {
        View view = this.f3095a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3144a.l(view) : RecyclerView.f1559A0));
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
        this.f3095a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // l0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3144a.q(this.f3095a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3095a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3096b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3096b;
        View view = this.f3095a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0253C c0253c = w.f3144a;
        c0253c.q(view, 1.0f);
        c0253c.getClass();
    }
}
