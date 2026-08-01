package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3660a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3661b = false;

    public g(View view) {
        this.f3660a = view;
    }

    @Override // p0.k
    public final void a() {
        View view = this.f3660a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3709a.r(view) : RecyclerView.f1937A0));
    }

    @Override // p0.k
    public final void b(m mVar) {
    }

    @Override // p0.k
    public final void c(m mVar) {
    }

    @Override // p0.k
    public final void d(m mVar) {
    }

    @Override // p0.k
    public final void e() {
        this.f3660a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3709a.y(this.f3660a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3660a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3661b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3661b;
        View view = this.f3660a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        B b2 = w.f3709a;
        b2.y(view, 1.0f);
        b2.getClass();
    }
}
