package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class el extends AnimatorListenerAdapter implements x90 {
    public final View a;
    public boolean b = false;

    public el(View view) {
        this.a = view;
    }

    @Override // defpackage.x90
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? dd0.a.r(view) : 0.0f));
    }

    @Override // defpackage.x90
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        dd0.a.Q(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        jd0 jd0Var = dd0.a;
        jd0Var.Q(view, 1.0f);
        jd0Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.x90
    public final void a(z90 z90Var) {
    }

    @Override // defpackage.x90
    public final void d(z90 z90Var) {
    }

    @Override // defpackage.x90
    public final void e(z90 z90Var) {
    }

    @Override // defpackage.x90
    public final void f(z90 z90Var) {
    }
}
