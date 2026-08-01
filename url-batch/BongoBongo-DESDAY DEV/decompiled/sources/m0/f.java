package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.winrandom.R;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f3261a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3262b = false;

    public f(View view) {
        this.f3261a = view;
    }

    @Override // m0.j
    public final void a() {
        View view = this.f3261a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? v.f3311a.m(view) : RecyclerView.A0));
    }

    @Override // m0.j
    public final void b(l lVar) {
    }

    @Override // m0.j
    public final void c(l lVar) {
    }

    @Override // m0.j
    public final void d() {
        this.f3261a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // m0.j
    public final void e(l lVar) {
    }

    @Override // m0.j
    public final void f(l lVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        v.f3311a.r(this.f3261a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3261a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3262b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3262b;
        View view = this.f3261a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0253A c0253a = v.f3311a;
        c0253a.r(view, 1.0f);
        c0253a.getClass();
    }
}
