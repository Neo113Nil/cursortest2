package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class bp implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final nz e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ nz o;
    public final /* synthetic */ ep p;

    public bp(ep epVar, nz nzVar, int i, float f, float f2, float f3, float f4, int i2, nz nzVar2) {
        this.p = epVar;
        this.n = i2;
        this.o = nzVar2;
        this.f = i;
        this.e = nzVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = ofFloat;
        ofFloat.addUpdateListener(new d8(2, this));
        ofFloat.setTarget(nzVar.a);
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
        nz nzVar = this.o;
        ep epVar = this.p;
        if (i <= 0) {
            epVar.m.getClass();
            or.b(nzVar);
        } else {
            epVar.a.add(nzVar.a);
            this.h = true;
            if (i > 0) {
                epVar.r.post(new f1(epVar, this, i));
            }
        }
        View view = epVar.w;
        View view2 = nzVar.a;
        if (view == view2 && view2 == view) {
            epVar.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
