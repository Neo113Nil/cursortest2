package b1;

import android.graphics.Paint;
import android.graphics.Shader;
import f7.i0;
import m2.k;
import z0.k0;
import z0.l0;
import z0.m;
import z0.p;
import z0.r;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public final a f1233f;

    /* renamed from: g, reason: collision with root package name */
    public final b f1234g;

    /* renamed from: h, reason: collision with root package name */
    public i0 f1235h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f1236i;

    public c() {
        g gVar = new g();
        a aVar = new a();
        aVar.f1225a = d.f1237a;
        aVar.f1226b = k.f6322f;
        aVar.f1227c = gVar;
        aVar.f1228d = 0L;
        this.f1233f = aVar;
        this.f1234g = new b(this);
    }

    public static i0 b(c cVar, long j8, f fVar, int i7) {
        i0 f9 = cVar.f(fVar);
        Paint paint = (Paint) f9.f3488b;
        if (!u.c(l0.c(paint.getColor()), j8)) {
            f9.e(j8);
        }
        if (((Shader) f9.f3489c) != null) {
            f9.h(null);
        }
        if (!r6.k.a((m) f9.f3490d, null)) {
            f9.f(null);
        }
        if (f9.f3487a != i7) {
            f9.d(i7);
        }
        if (paint.isFilterBitmap()) {
            return f9;
        }
        f9.g(1);
        return f9;
    }

    @Override // b1.e
    public final b B() {
        return this.f1234g;
    }

    @Override // b1.e
    public final void H(long j8, long j9, long j10, long j11, f fVar) {
        this.f1233f.f1227c.b(y0.c.d(j9), y0.c.e(j9), y0.f.d(j10) + y0.c.d(j9), y0.f.b(j10) + y0.c.e(j9), y0.a.b(j11), y0.a.c(j11), b(this, j8, fVar, 3));
    }

    @Override // b1.e
    public final void J(long j8, long j9, long j10, int i7) {
        this.f1233f.f1227c.g(y0.c.d(j9), y0.c.e(j9), y0.f.d(j10) + y0.c.d(j9), y0.f.b(j10) + y0.c.e(j9), b(this, j8, h.f1238a, i7));
    }

    @Override // b1.e
    public final void L(z0.h hVar, long j8, long j9, long j10, float f9, m mVar, int i7) {
        this.f1233f.f1227c.t(hVar, j8, j9, j10, c(null, h.f1238a, f9, mVar, 3, i7));
    }

    @Override // b1.e
    public final void P(long j8, long j9, long j10, float f9, int i7) {
        r rVar = this.f1233f.f1227c;
        i0 i0Var = this.f1236i;
        if (i0Var == null) {
            i0Var = l0.g();
            i0Var.l(1);
            this.f1236i = i0Var;
        }
        Paint paint = (Paint) i0Var.f3488b;
        if (!u.c(l0.c(paint.getColor()), j8)) {
            i0Var.e(j8);
        }
        if (((Shader) i0Var.f3489c) != null) {
            i0Var.h(null);
        }
        if (!r6.k.a((m) i0Var.f3490d, null)) {
            i0Var.f(null);
        }
        if (i0Var.f3487a != 3) {
            i0Var.d(3);
        }
        if (paint.getStrokeWidth() != f9) {
            i0Var.k(f9);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (i0Var.a() != i7) {
            i0Var.i(i7);
        }
        if (i0Var.b() != 0) {
            i0Var.j(0);
        }
        if (!paint.isFilterBitmap()) {
            i0Var.g(1);
        }
        rVar.a(j9, j10, i0Var);
    }

    @Override // b1.e
    public final void T(long j8, float f9, float f10, long j9, long j10, f fVar) {
        this.f1233f.f1227c.q(y0.c.d(j9), y0.c.e(j9), y0.f.d(j10) + y0.c.d(j9), y0.f.b(j10) + y0.c.e(j9), f9, f10, b(this, j8, fVar, 3));
    }

    @Override // b1.e
    public final void Y(k0 k0Var, long j8, f fVar) {
        this.f1233f.f1227c.d(k0Var, b(this, j8, fVar, 3));
    }

    @Override // b1.e
    public final void Z(k0 k0Var, p pVar, float f9, f fVar, int i7) {
        this.f1233f.f1227c.d(k0Var, c(pVar, fVar, f9, null, i7, 1));
    }

    @Override // m2.b
    public final float a() {
        return this.f1233f.f1225a.a();
    }

    public final i0 c(p pVar, f fVar, float f9, m mVar, int i7, int i8) {
        i0 f10 = f(fVar);
        Paint paint = (Paint) f10.f3488b;
        if (pVar != null) {
            pVar.a(f9, d(), f10);
        } else {
            if (((Shader) f10.f3489c) != null) {
                f10.h(null);
            }
            long c4 = l0.c(paint.getColor());
            long j8 = u.f10052b;
            if (!u.c(c4, j8)) {
                f10.e(j8);
            }
            if (paint.getAlpha() / 255.0f != f9) {
                f10.c(f9);
            }
        }
        if (!r6.k.a((m) f10.f3490d, mVar)) {
            f10.f(mVar);
        }
        if (f10.f3487a != i7) {
            f10.d(i7);
        }
        if (paint.isFilterBitmap() == i8) {
            return f10;
        }
        f10.g(i8);
        return f10;
    }

    public final void e(z0.h hVar, m mVar) {
        this.f1233f.f1227c.f(hVar, c(null, h.f1238a, 1.0f, mVar, 3, 1));
    }

    public final i0 f(f fVar) {
        if (r6.k.a(fVar, h.f1238a)) {
            i0 i0Var = this.f1235h;
            if (i0Var != null) {
                return i0Var;
            }
            i0 g9 = l0.g();
            g9.l(0);
            this.f1235h = g9;
            return g9;
        }
        if (!(fVar instanceof i)) {
            throw new b4.c();
        }
        i0 i0Var2 = this.f1236i;
        if (i0Var2 == null) {
            i0Var2 = l0.g();
            i0Var2.l(1);
            this.f1236i = i0Var2;
        }
        Paint paint = (Paint) i0Var2.f3488b;
        float strokeWidth = paint.getStrokeWidth();
        i iVar = (i) fVar;
        float f9 = iVar.f1239a;
        if (strokeWidth != f9) {
            i0Var2.k(f9);
        }
        int a3 = i0Var2.a();
        int i7 = iVar.f1241c;
        if (a3 != i7) {
            i0Var2.i(i7);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = iVar.f1240b;
        if (strokeMiter != f10) {
            paint.setStrokeMiter(f10);
        }
        int b9 = i0Var2.b();
        int i8 = iVar.f1242d;
        if (b9 == i8) {
            return i0Var2;
        }
        i0Var2.j(i8);
        return i0Var2;
    }

    @Override // b1.e
    public final k getLayoutDirection() {
        return this.f1233f.f1226b;
    }

    @Override // m2.b
    public final float m() {
        return this.f1233f.f1225a.m();
    }

    @Override // b1.e
    public final void r(float f9, long j8, long j9) {
        this.f1233f.f1227c.m(f9, j9, b(this, j8, h.f1238a, 3));
    }
}
