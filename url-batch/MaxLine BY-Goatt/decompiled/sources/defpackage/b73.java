package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b73 extends AnimatorListenerAdapter {
    public final /* synthetic */ i73 a;
    public final /* synthetic */ View b;

    public b73(i73 i73Var, View view) {
        this.a = i73Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i73 i73Var = this.a;
        i73Var.a.e(1.0f);
        d73.f(i73Var, this.b);
    }
}
