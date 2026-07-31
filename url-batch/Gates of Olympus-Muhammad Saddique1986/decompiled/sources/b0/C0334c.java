package b0;

import a0.C0238c;
import a0.C0239d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334c implements r {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f5405a = AbstractC0335d.f5408a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f5406b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f5407c;

    @Override // b0.r
    public final void a() {
        this.f5405a.restore();
    }

    @Override // b0.r
    public final void b(float f3, float f4, float f5, float f6, C0339h c0339h) {
        this.f5405a.drawRect(f3, f4, f5, f6, (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void c(C0338g c0338g, long j3, long j4, long j5, long j6, C0339h c0339h) {
        if (this.f5406b == null) {
            this.f5406b = new Rect();
            this.f5407c = new Rect();
        }
        Canvas canvas = this.f5405a;
        Bitmap l3 = M.l(c0338g);
        Rect rect = this.f5406b;
        f2.j.c(rect);
        int i3 = (int) (j3 >> 32);
        rect.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect.top = i4;
        rect.right = i3 + ((int) (j4 >> 32));
        rect.bottom = i4 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f5407c;
        f2.j.c(rect2);
        int i5 = (int) (j5 >> 32);
        rect2.left = i5;
        int i6 = (int) (j5 & 4294967295L);
        rect2.top = i6;
        rect2.right = i5 + ((int) (j6 >> 32));
        rect2.bottom = i6 + ((int) (j6 & 4294967295L));
        canvas.drawBitmap(l3, rect, rect2, (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void e(float f3, float f4) {
        this.f5405a.scale(f3, f4);
    }

    @Override // b0.r
    public final void f() {
        this.f5405a.save();
    }

    @Override // b0.r
    public final void g(long j3, long j4, C0339h c0339h) {
        this.f5405a.drawLine(C0238c.d(j3), C0238c.e(j3), C0238c.d(j4), C0238c.e(j4), (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void h() {
        M.o(this.f5405a, false);
    }

    @Override // b0.r
    public final void i(L l3, int i3) {
        Canvas canvas = this.f5405a;
        if (!(l3 instanceof C0341j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0341j) l3).f5420a, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // b0.r
    public final void j(float f3, long j3, C0339h c0339h) {
        this.f5405a.drawCircle(C0238c.d(j3), C0238c.e(j3), f3, (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void k(L l3, C0339h c0339h) {
        Canvas canvas = this.f5405a;
        if (!(l3 instanceof C0341j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0341j) l3).f5420a, (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void m(float f3, float f4, float f5, float f6, float f7, float f8, C0339h c0339h) {
        this.f5405a.drawRoundRect(f3, f4, f5, f6, f7, f8, (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void n(C0239d c0239d, C0339h c0339h) {
        Canvas canvas = this.f5405a;
        Paint paint = (Paint) c0339h.f5415b;
        canvas.saveLayer(c0239d.f4724a, c0239d.f4725b, c0239d.f4726c, c0239d.f4727d, paint, 31);
    }

    @Override // b0.r
    public final void o(float[] fArr) {
        int i3 = 0;
        while (i3 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                if (fArr[(i3 * 4) + i4] != (i3 == i4 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    M.x(matrix, fArr);
                    this.f5405a.concat(matrix);
                    return;
                }
                i4++;
            }
            i3++;
        }
    }

    @Override // b0.r
    public final void p(C0338g c0338g, long j3, C0339h c0339h) {
        this.f5405a.drawBitmap(M.l(c0338g), C0238c.d(j3), C0238c.e(j3), (Paint) c0339h.f5415b);
    }

    @Override // b0.r
    public final void q() {
        M.o(this.f5405a, true);
    }

    @Override // b0.r
    public final void r(float f3, float f4, float f5, float f6, int i3) {
        this.f5405a.clipRect(f3, f4, f5, f6, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // b0.r
    public final void s(float f3, float f4) {
        this.f5405a.translate(f3, f4);
    }

    @Override // b0.r
    public final void t() {
        this.f5405a.rotate(45.0f);
    }

    public final Canvas u() {
        return this.f5405a;
    }

    public final void v(Canvas canvas) {
        this.f5405a = canvas;
    }
}
