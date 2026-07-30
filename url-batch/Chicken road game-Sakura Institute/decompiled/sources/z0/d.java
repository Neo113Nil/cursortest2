package z0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f9984a = e.f9988a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f9985b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f9986c;

    @Override // z0.r
    public final void a(long j8, long j9, f7.i0 i0Var) {
        this.f9984a.drawLine(y0.c.d(j8), y0.c.e(j8), y0.c.d(j9), y0.c.e(j9), (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void b(float f9, float f10, float f11, float f12, float f13, float f14, f7.i0 i0Var) {
        this.f9984a.drawRoundRect(f9, f10, f11, f12, f13, f14, (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void c(float f9, float f10) {
        this.f9984a.scale(f9, f10);
    }

    @Override // z0.r
    public final void d(k0 k0Var, f7.i0 i0Var) {
        Canvas canvas = this.f9984a;
        if (!(k0Var instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((j) k0Var).f10002a, (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void e(y0.d dVar, f7.i0 i0Var) {
        this.f9984a.saveLayer(dVar.f9780a, dVar.f9781b, dVar.f9782c, dVar.f9783d, (Paint) i0Var.f3488b, 31);
    }

    @Override // z0.r
    public final void f(h hVar, f7.i0 i0Var) {
        this.f9984a.drawBitmap(l0.k(hVar), y0.c.d(0L), y0.c.e(0L), (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void g(float f9, float f10, float f11, float f12, f7.i0 i0Var) {
        this.f9984a.drawRect(f9, f10, f11, f12, (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void i(k0 k0Var) {
        Canvas canvas = this.f9984a;
        if (!(k0Var instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((j) k0Var).f10002a, Region.Op.INTERSECT);
    }

    @Override // z0.r
    public final void j(float f9, float f10, float f11, float f12, int i7) {
        this.f9984a.clipRect(f9, f10, f11, f12, i7 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // z0.r
    public final void k(float f9, float f10) {
        this.f9984a.translate(f9, f10);
    }

    @Override // z0.r
    public final void l() {
        this.f9984a.rotate(45.0f);
    }

    @Override // z0.r
    public final void m(float f9, long j8, f7.i0 i0Var) {
        this.f9984a.drawCircle(y0.c.d(j8), y0.c.e(j8), f9, (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void n() {
        this.f9984a.restore();
    }

    @Override // z0.r
    public final void o() {
        this.f9984a.save();
    }

    @Override // z0.r
    public final void p() {
        l0.n(this.f9984a, false);
    }

    @Override // z0.r
    public final void q(float f9, float f10, float f11, float f12, float f13, float f14, f7.i0 i0Var) {
        this.f9984a.drawArc(f9, f10, f11, f12, f13, f14, false, (Paint) i0Var.f3488b);
    }

    @Override // z0.r
    public final void r(float[] fArr) {
        int i7 = 0;
        while (i7 < 4) {
            int i8 = 0;
            while (i8 < 4) {
                if (fArr[(i7 * 4) + i8] != (i7 == i8 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    l0.q(matrix, fArr);
                    this.f9984a.concat(matrix);
                    return;
                }
                i8++;
            }
            i7++;
        }
    }

    @Override // z0.r
    public final void s() {
        l0.n(this.f9984a, true);
    }

    @Override // z0.r
    public final void t(h hVar, long j8, long j9, long j10, f7.i0 i0Var) {
        if (this.f9985b == null) {
            this.f9985b = new Rect();
            this.f9986c = new Rect();
        }
        Canvas canvas = this.f9984a;
        Bitmap k8 = l0.k(hVar);
        Rect rect = this.f9985b;
        r6.k.c(rect);
        int i7 = (int) (j8 >> 32);
        rect.left = i7;
        int i8 = (int) (j8 & 4294967295L);
        rect.top = i8;
        rect.right = i7 + ((int) (j9 >> 32));
        rect.bottom = i8 + ((int) (j9 & 4294967295L));
        Rect rect2 = this.f9986c;
        r6.k.c(rect2);
        int i9 = (int) 0;
        rect2.left = i9;
        int i10 = (int) 0;
        rect2.top = i10;
        rect2.right = i9 + ((int) (j10 >> 32));
        rect2.bottom = i10 + ((int) (4294967295L & j10));
        canvas.drawBitmap(k8, rect, rect2, (Paint) i0Var.f3488b);
    }
}
