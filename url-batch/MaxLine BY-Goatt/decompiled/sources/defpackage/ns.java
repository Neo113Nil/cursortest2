package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ns implements yd0 {
    public final ms m;
    public final mh n;
    public vs3 o;
    public vs3 p;

    public ns() {
        da0 da0Var = o70.d;
        u81 u81Var = u81.m;
        ms msVar = new ms();
        msVar.a = da0Var;
        msVar.b = u81Var;
        msVar.c = yg0.a;
        msVar.d = 0L;
        this.m = msVar;
        this.n = new mh(this);
    }

    public static vs3 a(ns nsVar, long j, int i) {
        vs3 e = nsVar.e(vl0.a);
        Paint paint = (Paint) e.b;
        if (!aw.c(ap.c(paint.getColor()), j)) {
            e.e(j);
        }
        if (((Shader) e.c) != null) {
            e.c = null;
            paint.setShader(null);
        }
        if (!Intrinsics.b((mo) e.d, null)) {
            e.f(null);
        }
        if (e.a != i) {
            e.d(i);
        }
        if (paint.isFilterBitmap()) {
            return e;
        }
        paint.setFilterBitmap(true);
        return e;
    }

    @Override // defpackage.yd0
    public final mh F() {
        return this.n;
    }

    @Override // defpackage.yd0
    public final void P(long j, long j2, long j3, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.m.c.a(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, i));
    }

    @Override // defpackage.yd0
    public final void Q(y9 y9Var, long j, long j2, long j3, float f, mo moVar, int i) {
        this.m.c.d(y9Var, j, j2, j3, b(null, vl0.a, f, moVar, 3, i));
    }

    public final vs3 b(cq cqVar, ae0 ae0Var, float f, mo moVar, int i, int i2) {
        vs3 e = e(ae0Var);
        Paint paint = (Paint) e.b;
        if (cqVar != null) {
            cqVar.a(f, f(), e);
        } else {
            if (((Shader) e.c) != null) {
                e.c = null;
                paint.setShader(null);
            }
            long c = ap.c(paint.getColor());
            long j = aw.b;
            if (!aw.c(c, j)) {
                e.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                e.c(f);
            }
        }
        if (!Intrinsics.b((mo) e.d, moVar)) {
            e.f(moVar);
        }
        if (e.a != i) {
            e.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return e;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return e;
    }

    @Override // defpackage.yd0
    public final void b0(oa oaVar, long j) {
        this.m.c.f(oaVar, a(this, j, 3));
    }

    public final void c(y9 y9Var, mo moVar) {
        this.m.c.b(y9Var, b(null, vl0.a, 1.0f, moVar, 3, 1));
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m.a.d();
    }

    public final vs3 e(ae0 ae0Var) {
        if (Intrinsics.b(ae0Var, vl0.a)) {
            vs3 vs3Var = this.o;
            if (vs3Var != null) {
                return vs3Var;
            }
            vs3 e = yj1.e();
            e.i(0);
            this.o = e;
            return e;
        }
        if (!(ae0Var instanceof xp2)) {
            a.b();
            return null;
        }
        vs3 vs3Var2 = this.p;
        if (vs3Var2 == null) {
            vs3Var2 = yj1.e();
            vs3Var2.i(1);
            this.p = vs3Var2;
        }
        Paint paint = (Paint) vs3Var2.b;
        float strokeWidth = paint.getStrokeWidth();
        xp2 xp2Var = (xp2) ae0Var;
        float f = xp2Var.a;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        int a = vs3Var2.a();
        int i = xp2Var.c;
        if (a != i) {
            vs3Var2.g(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = xp2Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int b = vs3Var2.b();
        int i2 = xp2Var.d;
        if (b == i2) {
            return vs3Var2;
        }
        vs3Var2.h(i2);
        return vs3Var2;
    }

    @Override // defpackage.yd0
    public final u81 getLayoutDirection() {
        return this.m.b;
    }

    @Override // defpackage.yd0
    public final void k(oa oaVar, cq cqVar, float f, ae0 ae0Var, int i) {
        this.m.c.f(oaVar, b(cqVar, ae0Var, f, null, i, 1));
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.m.a.p();
    }

    @Override // defpackage.yd0
    public final void t(float f, long j, long j2) {
        this.m.c.o(f, j2, a(this, j, 3));
    }

    @Override // defpackage.yd0
    public final void z(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.m.c.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, 3));
    }
}
