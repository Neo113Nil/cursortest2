package o3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7408b;

    public j0(View view, q0 q0Var) {
        this.f7407a = q0Var;
        this.f7408b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q0 q0Var = this.f7407a;
        q0Var.f7435a.e(1.0f);
        l0.f(this.f7408b, q0Var);
    }
}
