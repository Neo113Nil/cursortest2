package Z;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306c implements r {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f4515a = AbstractC0307d.f4518a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f4516b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f4517c;

    @Override // Z.r
    public final void a(float f4, float f5, float f6, float f7, float f8, float f9, C0311h c0311h) {
        this.f4515a.drawRoundRect(f4, f5, f6, f7, f8, f9, (Paint) c0311h.f4525b);
    }

    @Override // Z.r
    public final void b() {
        this.f4515a.restore();
    }

    @Override // Z.r
    public final void c(J j4, C0311h c0311h) {
        Canvas canvas = this.f4515a;
        if (!(j4 instanceof C0313j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0313j) j4).f4530a, (Paint) c0311h.f4525b);
    }

    @Override // Z.r
    public final void e(float f4, long j4, C0311h c0311h) {
        this.f4515a.drawCircle(Y.c.d(j4), Y.c.e(j4), f4, (Paint) c0311h.f4525b);
    }

    @Override // Z.r
    public final void f(float f4, float f5) {
        this.f4515a.scale(f4, f5);
    }

    @Override // Z.r
    public final void g() {
        this.f4515a.save();
    }

    @Override // Z.r
    public final void h(long j4, long j5, C0311h c0311h) {
        this.f4515a.drawLine(Y.c.d(j4), Y.c.e(j4), Y.c.d(j5), Y.c.e(j5), (Paint) c0311h.f4525b);
    }

    @Override // Z.r
    public final void i(C0310g c0310g, long j4, long j5, long j6, long j7, C0311h c0311h) {
        if (this.f4516b == null) {
            this.f4516b = new Rect();
            this.f4517c = new Rect();
        }
        Canvas canvas = this.f4515a;
        Bitmap k4 = K.k(c0310g);
        Rect rect = this.f4516b;
        Intrinsics.c(rect);
        int i2 = (int) (j4 >> 32);
        rect.left = i2;
        int i4 = (int) (j4 & 4294967295L);
        rect.top = i4;
        rect.right = i2 + ((int) (j5 >> 32));
        rect.bottom = i4 + ((int) (j5 & 4294967295L));
        Unit unit = Unit.f7487a;
        Rect rect2 = this.f4517c;
        Intrinsics.c(rect2);
        int i5 = (int) (j6 >> 32);
        rect2.left = i5;
        int i6 = (int) (j6 & 4294967295L);
        rect2.top = i6;
        rect2.right = i5 + ((int) (j7 >> 32));
        rect2.bottom = i6 + ((int) (j7 & 4294967295L));
        canvas.drawBitmap(k4, rect, rect2, (Paint) c0311h.f4525b);
    }

    @Override // Z.r
    public final void j() {
        K.n(this.f4515a, false);
    }

    @Override // Z.r
    public final void k(J j4, int i2) {
        Canvas canvas = this.f4515a;
        if (!(j4 instanceof C0313j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0313j) j4).f4530a, i2 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // Z.r
    public final void m(float f4, float f5, float f6, float f7, C0311h c0311h) {
        this.f4515a.drawRect(f4, f5, f6, f7, (Paint) c0311h.f4525b);
    }

    @Override // Z.r
    public final void n(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                if (fArr[(i2 * 4) + i4] != (i2 == i4 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    K.x(matrix, fArr);
                    this.f4515a.concat(matrix);
                    return;
                }
                i4++;
            }
            i2++;
        }
    }

    @Override // Z.r
    public final void o() {
        K.n(this.f4515a, true);
    }

    @Override // Z.r
    public final void p(float f4, float f5, float f6, float f7, int i2) {
        this.f4515a.clipRect(f4, f5, f6, f7, i2 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // Z.r
    public final void q(float f4, float f5) {
        this.f4515a.translate(f4, f5);
    }

    @Override // Z.r
    public final void r() {
        this.f4515a.rotate(45.0f);
    }

    @Override // Z.r
    public final void s(Y.d dVar, C0311h c0311h) {
        Canvas canvas = this.f4515a;
        Paint paint = (Paint) c0311h.f4525b;
        canvas.saveLayer(dVar.f4374a, dVar.f4375b, dVar.f4376c, dVar.f4377d, paint, 31);
    }

    @Override // Z.r
    public final void t(C0310g c0310g, long j4, C0311h c0311h) {
        this.f4515a.drawBitmap(K.k(c0310g), Y.c.d(j4), Y.c.e(j4), (Paint) c0311h.f4525b);
    }

    public final Canvas u() {
        return this.f4515a;
    }

    public final void v(Canvas canvas) {
        this.f4515a = canvas;
    }
}
