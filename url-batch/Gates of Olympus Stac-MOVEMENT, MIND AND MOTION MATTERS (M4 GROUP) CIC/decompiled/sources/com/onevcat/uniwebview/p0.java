package com.onevcat.uniwebview;

import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class p0 implements Animation.AnimationListener {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public p0(s0 s0Var, int i, int i2, int i3, int i4, String str) {
        this.a = s0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        s0 s0Var = this.a;
        s0Var.j = null;
        s0Var.a(this.b, this.c, this.d, this.e);
        s0 s0Var2 = this.a;
        s0Var2.c.a(s0Var2.p.getName(), h5.AnimateToFinished, this.f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
