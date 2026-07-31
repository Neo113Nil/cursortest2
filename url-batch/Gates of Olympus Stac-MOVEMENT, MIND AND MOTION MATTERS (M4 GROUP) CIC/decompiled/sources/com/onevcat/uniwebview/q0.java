package com.onevcat.uniwebview;

import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class q0 implements Animation.AnimationListener {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public q0(s0 s0Var, boolean z, String str) {
        this.a = s0Var;
        this.b = z;
        this.c = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        g5 g5Var;
        String name;
        h5 h5Var;
        s0 s0Var = this.a;
        s0Var.j = null;
        boolean z = this.b;
        String str = this.c;
        if (z) {
            g5Var = s0Var.c;
            name = s0Var.p.getName();
            h5Var = h5.ShowTransitionFinished;
        } else {
            s0Var.e.setVisibility(4);
            g5Var = s0Var.c;
            name = s0Var.p.getName();
            h5Var = h5.HideTransitionFinished;
        }
        g5Var.a(name, h5Var, str);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
