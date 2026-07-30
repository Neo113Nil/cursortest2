package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vd0 extends tk3 implements wd0 {
    public final q9 r;
    public final ef0 s;
    public final nx1 t;

    public vd0(q9 q9Var, ef0 ef0Var, nx1 nx1Var) {
        this.r = q9Var;
        this.s = ef0Var;
        this.t = nx1Var;
    }

    public static boolean n0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(au1.d(j), au1.e(j));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.wd0
    public final void g(k91 k91Var) {
        zx1 zx1Var = this.t.b;
        ns nsVar = k91Var.m;
        long f = nsVar.f();
        q9 q9Var = this.r;
        q9Var.l(f);
        if (ql2.e(nsVar.f())) {
            k91Var.a();
            return;
        }
        k91Var.a();
        q9Var.o.getValue();
        Canvas a = z6.a(nsVar.n.o());
        ef0 ef0Var = this.s;
        boolean n0 = ef0.f(ef0Var.f) ? n0(270.0f, ap.i(-ql2.b(nsVar.f()), k91Var.D(zx1Var.a(k91Var.getLayoutDirection()))), ef0Var.c(), a) : false;
        if (ef0.f(ef0Var.d)) {
            n0 = n0(0.0f, ap.i(0.0f, k91Var.D(zx1Var.b)), ef0Var.e(), a) || n0;
        }
        if (ef0.f(ef0Var.g)) {
            n0 = n0(90.0f, ap.i(0.0f, k91Var.D(zx1Var.b(k91Var.getLayoutDirection())) + (-((float) si1.b(ql2.d(nsVar.f()))))), ef0Var.d(), a) || n0;
        }
        if (ef0.f(ef0Var.e)) {
            n0 = n0(180.0f, ap.i(-ql2.d(nsVar.f()), (-ql2.b(nsVar.f())) + k91Var.D(zx1Var.d)), ef0Var.b(), a) || n0;
        }
        if (n0) {
            q9Var.d();
        }
    }
}
