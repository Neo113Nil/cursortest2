package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mv implements Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    public final lp h;
    final int i;
    final ValueAnimator j;
    boolean k;
    float l;
    float m;
    boolean n = false;
    boolean o = false;
    public float p;

    public mv(lp lpVar, int i, float f, float f2, float f3, float f4) {
        this.i = i;
        this.h = lpVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new mu(this, 0));
        ofFloat.setTarget(lpVar.a);
        ofFloat.addListener(this);
        this.p = 0.0f;
    }

    public final void a() {
        this.j.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.p = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.o) {
            this.h.m(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
