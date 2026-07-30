package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zf implements hu {
    public final yf d;
    public final i8 e;
    public xu1 g;
    public xu1 h;

    public zf() {
        or orVar = uq1.d;
        vc0 vc0Var = vc0.d;
        yf yfVar = new yf();
        yfVar.a = orVar;
        yfVar.b = vc0Var;
        yfVar.c = lv.a;
        yfVar.d = 0L;
        this.d = yfVar;
        this.e = new i8(this);
    }

    public static xu1 a(zf zfVar, long j, p4 p4Var, int i) {
        xu1 c = zfVar.c(p4Var);
        Paint paint = (Paint) c.b;
        if (!hi.c(la0.c(paint.getColor()), j)) {
            c.e(j);
        }
        if (((Shader) c.c) != null) {
            c.g(null);
        }
        if (!Intrinsics.a((md) c.d, null)) {
            c.f(null);
        }
        if (c.a != i) {
            c.d(i);
        }
        if (paint.isFilterBitmap()) {
            return c;
        }
        paint.setFilterBitmap(true);
        return c;
    }

    @Override // defpackage.hu
    public final void I(long j, long j2, long j3, p4 p4Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.d.c.a(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, p4Var, i));
    }

    @Override // defpackage.hu
    public final void L(long j, long j2, long j3, float f, int i) {
        xf xfVar = this.d.c;
        xu1 xu1Var = this.h;
        if (xu1Var == null) {
            xu1Var = m90.d();
            xu1Var.j(1);
            this.h = xu1Var;
        }
        Paint paint = (Paint) xu1Var.b;
        if (!hi.c(la0.c(paint.getColor()), j)) {
            xu1Var.e(j);
        }
        if (((Shader) xu1Var.c) != null) {
            xu1Var.g(null);
        }
        if (!Intrinsics.a((md) xu1Var.d, null)) {
            xu1Var.f(null);
        }
        if (xu1Var.a != 3) {
            xu1Var.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            paint.setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (xu1Var.a() != i) {
            xu1Var.h(i);
        }
        if (xu1Var.b() != 0) {
            xu1Var.i(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        xfVar.d(j2, j3, xu1Var);
    }

    public final xu1 b(op opVar, p4 p4Var, float f, md mdVar, int i, int i2) {
        xu1 c = c(p4Var);
        Paint paint = (Paint) c.b;
        if (opVar != null) {
            opVar.p(f, x(), c);
        } else {
            if (((Shader) c.c) != null) {
                c.g(null);
            }
            long c2 = la0.c(paint.getColor());
            long j = hi.b;
            if (!hi.c(c2, j)) {
                c.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c.c(f);
            }
        }
        if (!Intrinsics.a((md) c.d, mdVar)) {
            c.f(mdVar);
        }
        if (c.a != i) {
            c.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return c;
    }

    @Override // defpackage.hu
    public final void b0(c6 c6Var, op opVar, float f, p4 p4Var, int i) {
        this.d.c.e(c6Var, b(opVar, p4Var, f, null, i, 1));
    }

    public final xu1 c(p4 p4Var) {
        if (Intrinsics.a(p4Var, uy.q)) {
            xu1 xu1Var = this.g;
            if (xu1Var != null) {
                return xu1Var;
            }
            xu1 d = m90.d();
            d.j(0);
            this.g = d;
            return d;
        }
        if (!(p4Var instanceof ze1)) {
            l.a();
            return null;
        }
        xu1 xu1Var2 = this.h;
        if (xu1Var2 == null) {
            xu1Var2 = m90.d();
            xu1Var2.j(1);
            this.h = xu1Var2;
        }
        Paint paint = (Paint) xu1Var2.b;
        float strokeWidth = paint.getStrokeWidth();
        ze1 ze1Var = (ze1) p4Var;
        float f = ze1Var.q;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        int a = xu1Var2.a();
        int i = ze1Var.s;
        if (a != i) {
            xu1Var2.h(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = ze1Var.r;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int b = xu1Var2.b();
        int i2 = ze1Var.t;
        if (b == i2) {
            return xu1Var2;
        }
        xu1Var2.i(i2);
        return xu1Var2;
    }

    @Override // defpackage.hu
    public final void d(long j, float f, float f2, long j2, long j3, ze1 ze1Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.r(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, ze1Var, 3));
    }

    @Override // defpackage.hu
    public final void e(t5 t5Var, long j, long j2, long j3, long j4, float f, md mdVar, int i) {
        this.d.c.f(t5Var, j, j2, j3, j4, b(null, uy.q, f, mdVar, 3, i));
    }

    @Override // defpackage.nr
    public final float f() {
        return this.d.a.f();
    }

    @Override // defpackage.hu
    public final vc0 getLayoutDirection() {
        return this.d.b;
    }

    @Override // defpackage.hu
    public final void j(float f, long j, long j2) {
        this.d.c.m(f, j2, a(this, j, uy.q, 3));
    }

    @Override // defpackage.nr
    public final float k() {
        return this.d.a.k();
    }

    @Override // defpackage.hu
    public final void o(long j, long j2, long j3, long j4, p4 p4Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, p4Var, 3));
    }

    @Override // defpackage.hu
    public final void u(xf1 xf1Var, long j, p4 p4Var) {
        this.d.c.r(Float.intBitsToFloat(0), Float.intBitsToFloat(0), Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat(0), Float.intBitsToFloat((int) (4294967295L & j)) + Float.intBitsToFloat(0), 0.0f, 284.0f, b(xf1Var, p4Var, 1.0f, null, 3, 1));
    }

    @Override // defpackage.hu
    public final i8 v() {
        return this.e;
    }
}
