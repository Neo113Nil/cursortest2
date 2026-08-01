package m1;

import a1.n;
import a2.r;
import android.graphics.Paint;
import android.graphics.Shader;
import k1.j;
import k1.p;
import k1.v;
import kotlin.jvm.internal.Intrinsics;
import y6.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: d, reason: collision with root package name */
    public final a f6405d;

    /* renamed from: e, reason: collision with root package name */
    public final n f6406e;

    /* renamed from: i, reason: collision with root package name */
    public l f6407i;

    /* renamed from: r, reason: collision with root package name */
    public l f6408r;

    public b() {
        x2.l lVar = x2.l.f10330d;
        a aVar = new a();
        aVar.f6401a = c.f6409a;
        aVar.f6402b = lVar;
        aVar.f6403c = e.f6410a;
        aVar.f6404d = 0L;
        this.f6405d = aVar;
        this.f6406e = new n(this);
    }

    public static l a(b bVar, long j, c cVar, int i3) {
        l c10 = bVar.c(cVar);
        Paint paint = (Paint) c10.f10660e;
        if (!p.c(v.b(paint.getColor()), j)) {
            c10.h(j);
        }
        if (((Shader) c10.f10661i) != null) {
            c10.f10661i = null;
            paint.setShader(null);
        }
        if (!Intrinsics.a((j) c10.f10662r, null)) {
            c10.i(null);
        }
        if (c10.f10659d != i3) {
            c10.g(i3);
        }
        if (paint.isFilterBitmap()) {
            return c10;
        }
        paint.setFilterBitmap(true);
        return c10;
    }

    @Override // m1.d
    public final void D(k1.g gVar, v vVar, float f3, c cVar) {
        this.f6405d.f6403c.p(gVar, b(vVar, cVar, f3, null, 1));
    }

    @Override // m1.d
    public final void M(k1.e eVar, long j, long j3, long j10, float f3, j jVar, int i3) {
        this.f6405d.f6403c.c(eVar, j, j3, j10, b(null, f.f6411b, f3, jVar, i3));
    }

    @Override // m1.d
    public final void R(long j, float f3, long j3, g gVar) {
        int i3 = (int) 0;
        int i10 = (int) 0;
        this.f6405d.f6403c.j(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i10), f3, a(this, j, gVar, 3));
    }

    public final l b(v vVar, c cVar, float f3, j jVar, int i3) {
        l c10 = c(cVar);
        Paint paint = (Paint) c10.f10660e;
        if (vVar != null) {
            vVar.f(f3, u(), c10);
        } else {
            if (((Shader) c10.f10661i) != null) {
                c10.f10661i = null;
                paint.setShader(null);
            }
            long b10 = v.b(paint.getColor());
            long j = p.f5336b;
            if (!p.c(b10, j)) {
                c10.h(j);
            }
            if (paint.getAlpha() / 255.0f != f3) {
                c10.f(f3);
            }
        }
        if (!Intrinsics.a((j) c10.f10662r, jVar)) {
            c10.i(jVar);
        }
        if (c10.f10659d != 3) {
            c10.g(3);
        }
        if (paint.isFilterBitmap() == i3) {
            return c10;
        }
        paint.setFilterBitmap(true ^ (i3 == 0));
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l c(c cVar) {
        int i3;
        int i10;
        float strokeMiter;
        float f3;
        int i11;
        int i12;
        int i13 = 0;
        if (Intrinsics.a(cVar, f.f6411b)) {
            l lVar = this.f6407i;
            if (lVar != null) {
                return lVar;
            }
            l e2 = v.e();
            e2.j(0);
            this.f6407i = e2;
            return e2;
        }
        if (!(cVar instanceof g)) {
            r.p();
            return null;
        }
        l lVar2 = this.f6408r;
        if (lVar2 == null) {
            lVar2 = v.e();
            lVar2.j(1);
            this.f6408r = lVar2;
        }
        Paint paint = (Paint) lVar2.f10660e;
        float strokeWidth = paint.getStrokeWidth();
        g gVar = (g) cVar;
        float f10 = gVar.f6412b;
        if (strokeWidth != f10) {
            paint.setStrokeWidth(f10);
        }
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i14 = strokeCap == null ? -1 : k1.f.f5319a[strokeCap.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                i3 = 1;
            } else if (i14 == 3) {
                i3 = 2;
            }
            i10 = gVar.f6414d;
            if (i3 != i10) {
                paint.setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
            }
            strokeMiter = paint.getStrokeMiter();
            f3 = gVar.f6413c;
            if (strokeMiter != f3) {
                paint.setStrokeMiter(f3);
            }
            Paint.Join strokeJoin = paint.getStrokeJoin();
            i11 = strokeJoin != null ? k1.f.f5320b[strokeJoin.ordinal()] : -1;
            if (i11 != 1) {
                if (i11 == 2) {
                    i13 = 2;
                } else if (i11 == 3) {
                    i13 = 1;
                }
            }
            i12 = gVar.f6415e;
            if (i13 != i12) {
                return lVar2;
            }
            paint.setStrokeJoin(i12 == 0 ? Paint.Join.MITER : i12 == 2 ? Paint.Join.BEVEL : i12 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
            return lVar2;
        }
        i3 = 0;
        i10 = gVar.f6414d;
        if (i3 != i10) {
        }
        strokeMiter = paint.getStrokeMiter();
        f3 = gVar.f6413c;
        if (strokeMiter != f3) {
        }
        Paint.Join strokeJoin2 = paint.getStrokeJoin();
        if (strokeJoin2 != null) {
        }
        if (i11 != 1) {
        }
        i12 = gVar.f6415e;
        if (i13 != i12) {
        }
    }

    @Override // x2.c
    public final float d() {
        return this.f6405d.f6401a.d();
    }

    @Override // x2.c
    public final float g() {
        return this.f6405d.f6401a.g();
    }

    @Override // m1.d
    public final x2.l getLayoutDirection() {
        return this.f6405d.f6402b;
    }

    @Override // m1.d
    public final void i(long j, long j3, long j10, c cVar, int i3) {
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        this.f6405d.f6403c.a(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11), a(this, j, cVar, i3));
    }

    @Override // m1.d
    public final n s() {
        return this.f6406e;
    }
}
