package h1;

import a0.g1;
import android.graphics.Paint;
import android.graphics.Shader;
import f1.h;
import f1.j;
import f1.m;
import f1.p;
import f1.q;
import f1.s;
import q6.i;
import r2.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: d, reason: collision with root package name */
    public final a f3074d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f3075e;

    /* renamed from: f, reason: collision with root package name */
    public h f3076f;

    /* renamed from: g, reason: collision with root package name */
    public h f3077g;

    public b() {
        a aVar = new a();
        aVar.f3070a = c.f3078a;
        aVar.f3071b = l.f6529d;
        aVar.f3072c = e.f3079a;
        aVar.f3073d = 0L;
        this.f3074d = aVar;
        this.f3075e = new g1(this);
    }

    public static h a(b bVar, long j7, c cVar, int i) {
        h e8 = bVar.e(cVar);
        Paint paint = (Paint) e8.f2660b;
        if (!s.c(p.b(paint.getColor()), j7)) {
            e8.e(j7);
        }
        if (((Shader) e8.f2661c) != null) {
            e8.g(null);
        }
        if (!i.a((m) e8.f2662d, null)) {
            e8.f(null);
        }
        if (e8.f2659a != i) {
            e8.d(i);
        }
        if (paint.isFilterBitmap()) {
            return e8;
        }
        paint.setFilterBitmap(true);
        return e8;
    }

    @Override // h1.d
    public final void D(f1.g gVar, long j7, long j8, float f6, m mVar) {
        this.f3074d.f3072c.i(gVar, j7, j8, d(null, f.f3080b, f6, mVar, 3));
    }

    @Override // h1.d
    public final void I(j jVar, p pVar, float f6, c cVar, int i) {
        this.f3074d.f3072c.n(jVar, d(pVar, cVar, f6, null, i));
    }

    @Override // h1.d
    public final void L(long j7, long j8, long j9, float f6, int i) {
        q qVar = this.f3074d.f3072c;
        h hVar = this.f3077g;
        if (hVar == null) {
            hVar = p.f();
            hVar.j(1);
            this.f3077g = hVar;
        }
        Paint paint = (Paint) hVar.f2660b;
        if (!s.c(p.b(paint.getColor()), j7)) {
            hVar.e(j7);
        }
        if (((Shader) hVar.f2661c) != null) {
            hVar.g(null);
        }
        if (!i.a((m) hVar.f2662d, null)) {
            hVar.f(null);
        }
        if (hVar.f2659a != 3) {
            hVar.d(3);
        }
        if (paint.getStrokeWidth() != f6) {
            paint.setStrokeWidth(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (hVar.a() != i) {
            hVar.h(i);
        }
        if (hVar.b() != 0) {
            hVar.i(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        qVar.e(j8, j9, hVar);
    }

    @Override // h1.d
    public final void Y(long j7, long j8, long j9, c cVar, int i) {
        int i8 = (int) (j8 >> 32);
        int i9 = (int) (j8 & 4294967295L);
        this.f3074d.f3072c.o(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat(i8) + Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat(i9), a(this, j7, cVar, i));
    }

    @Override // r2.c
    public final float b() {
        return this.f3074d.f3070a.b();
    }

    public final h d(p pVar, c cVar, float f6, m mVar, int i) {
        h e8 = e(cVar);
        Paint paint = (Paint) e8.f2660b;
        if (pVar != null) {
            pVar.g(f6, c(), e8);
        } else {
            if (((Shader) e8.f2661c) != null) {
                e8.g(null);
            }
            long b8 = p.b(paint.getColor());
            long j7 = s.f2698b;
            if (!s.c(b8, j7)) {
                e8.e(j7);
            }
            if (paint.getAlpha() / 255.0f != f6) {
                e8.c(f6);
            }
        }
        if (!i.a((m) e8.f2662d, mVar)) {
            e8.f(mVar);
        }
        if (e8.f2659a != i) {
            e8.d(i);
        }
        if (paint.isFilterBitmap()) {
            return e8;
        }
        paint.setFilterBitmap(true);
        return e8;
    }

    public final h e(c cVar) {
        if (i.a(cVar, f.f3080b)) {
            h hVar = this.f3076f;
            if (hVar != null) {
                return hVar;
            }
            h f6 = p.f();
            f6.j(0);
            this.f3076f = f6;
            return f6;
        }
        if (!(cVar instanceof g)) {
            throw new a5.c();
        }
        h hVar2 = this.f3077g;
        if (hVar2 == null) {
            hVar2 = p.f();
            hVar2.j(1);
            this.f3077g = hVar2;
        }
        Paint paint = (Paint) hVar2.f2660b;
        float strokeWidth = paint.getStrokeWidth();
        g gVar = (g) cVar;
        float f8 = gVar.f3081b;
        if (strokeWidth != f8) {
            paint.setStrokeWidth(f8);
        }
        int a8 = hVar2.a();
        int i = gVar.f3083d;
        if (a8 != i) {
            hVar2.h(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f9 = gVar.f3082c;
        if (strokeMiter != f9) {
            paint.setStrokeMiter(f9);
        }
        int b8 = hVar2.b();
        int i8 = gVar.f3084e;
        if (b8 == i8) {
            return hVar2;
        }
        hVar2.i(i8);
        return hVar2;
    }

    @Override // h1.d
    public final l getLayoutDirection() {
        return this.f3074d.f3071b;
    }

    @Override // r2.c
    public final float i() {
        return this.f3074d.f3070a.i();
    }

    @Override // h1.d
    public final void n(float f6, long j7, long j8) {
        this.f3074d.f3072c.a(f6, j8, a(this, j7, f.f3080b, 3));
    }

    @Override // h1.d
    public final g1 y() {
        return this.f3075e;
    }
}
