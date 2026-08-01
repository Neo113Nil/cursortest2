package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xv implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final x80 e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ x80 o;
    public final /* synthetic */ aw p;

    public xv(aw awVar, x80 x80Var, int i, float f, float f2, float f3, float f4, int i2, x80 x80Var2) {
        this.p = awVar;
        this.n = i2;
        this.o = x80Var2;
        this.f = i;
        this.e = x80Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = ofFloat;
        ofFloat.addUpdateListener(new d9(2, this));
        ofFloat.setTarget(x80Var.a);
        ofFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.o(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        x80 x80Var = this.o;
        aw awVar = this.p;
        if (i <= 0) {
            awVar.m.getClass();
            nz.b(x80Var);
        } else {
            awVar.a.add(x80Var.a);
            this.h = true;
            if (i > 0) {
                awVar.r.post(new j1(awVar, this, i));
            }
        }
        View view = awVar.w;
        View view2 = x80Var.a;
        if (view == view2 && view2 == view) {
            awVar.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
