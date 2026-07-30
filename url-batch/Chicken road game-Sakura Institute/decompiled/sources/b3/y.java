package b3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1379b;

    public y(View view, f0 f0Var) {
        this.f1378a = f0Var;
        this.f1379b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f0 f0Var = this.f1378a;
        f0Var.f1322a.c(1.0f);
        b0.d(this.f1379b, f0Var);
    }
}
