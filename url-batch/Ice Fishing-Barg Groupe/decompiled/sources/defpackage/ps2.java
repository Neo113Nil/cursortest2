package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ps2 extends AnimatorListenerAdapter {
    public final /* synthetic */ xs2 PxuCJdSBwIXG;
    public final /* synthetic */ View lS5Rgt96tfkO;

    public ps2(xs2 xs2Var, View view) {
        this.PxuCJdSBwIXG = xs2Var;
        this.lS5Rgt96tfkO = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xs2 xs2Var = this.PxuCJdSBwIXG;
        xs2Var.PxuCJdSBwIXG.e9gEMXR7LXtO(1.0f);
        ss2.a92UlCVFR9N8(xs2Var, this.lS5Rgt96tfkO);
    }
}
