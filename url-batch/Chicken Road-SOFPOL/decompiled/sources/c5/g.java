package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1666a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1667b = false;

    public g(View view) {
        this.f1666a = view;
    }

    @Override // c5.m
    public final void b() {
        View view = this.f1666a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? z.f1741a.n(view) : 0.0f));
    }

    @Override // c5.m
    public final void c() {
        this.f1666a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        z.f1741a.y(this.f1666a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f1666a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f1667b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z7 = this.f1667b;
        View view = this.f1666a;
        if (z7) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        e0 e0Var = z.f1741a;
        e0Var.y(view, 1.0f);
        e0Var.getClass();
    }

    @Override // c5.m
    public final void a(o oVar) {
    }

    @Override // c5.m
    public final void d(o oVar) {
    }

    @Override // c5.m
    public final void e(o oVar) {
    }

    @Override // c5.m
    public final void f(o oVar) {
    }
}
