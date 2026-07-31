package f1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f2622a = c.f2629a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f2623b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f2624c;

    @Override // f1.q
    public final void a(float f6, long j7, h hVar) {
        this.f2622a.drawCircle(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f6, (Paint) hVar.f2660b);
    }

    @Override // f1.q
    public final void b(float f6, float f8) {
        this.f2622a.scale(f6, f8);
    }

    @Override // f1.q
    public final void c(float f6, float f8, float f9, float f10, int i) {
        this.f2622a.clipRect(f6, f8, f9, f10, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // f1.q
    public final void d(float f6, float f8) {
        this.f2622a.translate(f6, f8);
    }

    @Override // f1.q
    public final void e(long j7, long j8, h hVar) {
        this.f2622a.drawLine(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), (Paint) hVar.f2660b);
    }

    @Override // f1.q
    public final void f() {
        this.f2622a.restore();
    }

    @Override // f1.q
    public final void g(j jVar) {
        Canvas canvas = this.f2622a;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(jVar.f2669a, Region.Op.INTERSECT);
    }

    @Override // f1.q
    public final void h() {
        this.f2622a.save();
    }

    @Override // f1.q
    public final void i(g gVar, long j7, long j8, h hVar) {
        if (this.f2623b == null) {
            this.f2623b = new Rect();
            this.f2624c = new Rect();
        }
        Canvas canvas = this.f2622a;
        if (gVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = gVar.f2643a;
        Rect rect = this.f2623b;
        q6.i.b(rect);
        int i = (int) 0;
        rect.left = i;
        int i8 = (int) 0;
        rect.top = i8;
        rect.right = ((int) (j7 >> 32)) + i;
        rect.bottom = ((int) (j7 & 4294967295L)) + i8;
        Rect rect2 = this.f2624c;
        q6.i.b(rect2);
        rect2.left = i;
        rect2.top = i8;
        rect2.right = i + ((int) (j8 >> 32));
        rect2.bottom = i8 + ((int) (j8 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) hVar.f2660b);
    }

    @Override // f1.q
    public final void j(float f6, float f8, float f9, float f10, float f11, float f12, h hVar) {
        this.f2622a.drawRoundRect(f6, f8, f9, f10, f11, f12, (Paint) hVar.f2660b);
    }

    @Override // f1.q
    public final void k() {
        p.j(this.f2622a, false);
    }

    @Override // f1.q
    public final void l(float[] fArr) {
        if (p.l(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f6 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        fArr[0] = f6;
        fArr[1] = f11;
        fArr[2] = f16;
        fArr[3] = f8;
        fArr[4] = f12;
        fArr[5] = f17;
        fArr[6] = f10;
        fArr[7] = f14;
        fArr[8] = f18;
        matrix.setValues(fArr);
        fArr[0] = f6;
        fArr[1] = f8;
        fArr[2] = f9;
        fArr[3] = f10;
        fArr[4] = f11;
        fArr[5] = f12;
        fArr[6] = f13;
        fArr[7] = f14;
        fArr[8] = f15;
        this.f2622a.concat(matrix);
    }

    @Override // f1.q
    public final void m() {
        p.j(this.f2622a, true);
    }

    @Override // f1.q
    public final void n(j jVar, h hVar) {
        Canvas canvas = this.f2622a;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(jVar.f2669a, (Paint) hVar.f2660b);
    }

    @Override // f1.q
    public final void o(float f6, float f8, float f9, float f10, h hVar) {
        this.f2622a.drawRect(f6, f8, f9, f10, (Paint) hVar.f2660b);
    }
}
