package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j3 implements xf {
    public Canvas a = k3.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.xf
    public final void a(float f, float f2, float f3, float f4, xu1 xu1Var) {
        this.a.drawRect(f, f2, f3, f4, (Paint) xu1Var.b);
    }

    @Override // defpackage.xf
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.xf
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.xf
    public final void d(long j, long j2, xu1 xu1Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) xu1Var.b);
    }

    @Override // defpackage.xf
    public final void e(c6 c6Var, xu1 xu1Var) {
        Canvas canvas = this.a;
        if (!(c6Var instanceof c6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c6Var.a, (Paint) xu1Var.b);
    }

    @Override // defpackage.xf
    public final void f(t5 t5Var, long j, long j2, long j3, long j4, xu1 xu1Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (!(t5Var instanceof t5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = t5Var.a;
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) xu1Var.b);
    }

    @Override // defpackage.xf
    public final void g(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.xf
    public final void h(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.xf
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.xf
    public final void j(s11 s11Var, xu1 xu1Var) {
        this.a.saveLayer(s11Var.a, s11Var.b, s11Var.c, s11Var.d, (Paint) xu1Var.b, 31);
    }

    @Override // defpackage.xf
    public final void k() {
        this.a.save();
    }

    @Override // defpackage.xf
    public final void l() {
        this.a.disableZ();
    }

    @Override // defpackage.xf
    public final void m(float f, long j, xu1 xu1Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) xu1Var.b);
    }

    @Override // defpackage.xf
    public final void n(float f, float f2, float f3, float f4, float f5, float f6, xu1 xu1Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) xu1Var.b);
    }

    @Override // defpackage.xf
    public final void o(float[] fArr) {
        if (ca0.q(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.a.concat(matrix);
    }

    @Override // defpackage.xf
    public final void p() {
        this.a.enableZ();
    }

    @Override // defpackage.xf
    public final void q(c6 c6Var) {
        Canvas canvas = this.a;
        if (!(c6Var instanceof c6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c6Var.a, Region.Op.INTERSECT);
    }

    @Override // defpackage.xf
    public final void r(float f, float f2, float f3, float f4, float f5, float f6, xu1 xu1Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) xu1Var.b);
    }
}
