package b0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271d implements InterfaceC0285r {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f4263a = AbstractC0272e.f4266a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f4264b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f4265c;

    @Override // b0.InterfaceC0285r
    public final void a() {
        this.f4263a.restore();
    }

    @Override // b0.InterfaceC0285r
    public final void b(float f3, float f4, float f5, float f6, C0276i c0276i) {
        this.f4263a.drawRect(f3, f4, f5, f6, (Paint) c0276i.f4273b);
    }

    @Override // b0.InterfaceC0285r
    public final void c(C0275h c0275h, long j3, long j4, long j5, long j6, C0276i c0276i) {
        if (this.f4264b == null) {
            this.f4264b = new Rect();
            this.f4265c = new Rect();
        }
        Canvas canvas = this.f4263a;
        if (!(c0275h instanceof C0275h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = c0275h.f4271a;
        Rect rect = this.f4264b;
        Z1.i.c(rect);
        int i3 = (int) (j3 >> 32);
        rect.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect.top = i4;
        rect.right = i3 + ((int) (j4 >> 32));
        rect.bottom = i4 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f4265c;
        Z1.i.c(rect2);
        int i5 = (int) (j5 >> 32);
        rect2.left = i5;
        int i6 = (int) (j5 & 4294967295L);
        rect2.top = i6;
        rect2.right = i5 + ((int) (j6 >> 32));
        rect2.bottom = i6 + ((int) (j6 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) c0276i.f4273b);
    }

    @Override // b0.InterfaceC0285r
    public final void e(float f3, float f4) {
        this.f4263a.scale(f3, f4);
    }

    @Override // b0.InterfaceC0285r
    public final void f() {
        this.f4263a.save();
    }

    @Override // b0.InterfaceC0285r
    public final void g(long j3, long j4, C0276i c0276i) {
        this.f4263a.drawLine(a0.c.d(j3), a0.c.e(j3), a0.c.d(j4), a0.c.e(j4), (Paint) c0276i.f4273b);
    }

    @Override // b0.InterfaceC0285r
    public final void h() {
        AbstractC0259J.m(this.f4263a, false);
    }

    @Override // b0.InterfaceC0285r
    public final void i(InterfaceC0258I interfaceC0258I, int i3) {
        Canvas canvas = this.f4263a;
        if (!(interfaceC0258I instanceof C0278k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0278k) interfaceC0258I).f4278a, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // b0.InterfaceC0285r
    public final void j(float f3, long j3, C0276i c0276i) {
        this.f4263a.drawCircle(a0.c.d(j3), a0.c.e(j3), f3, (Paint) c0276i.f4273b);
    }

    @Override // b0.InterfaceC0285r
    public final void k(InterfaceC0258I interfaceC0258I, C0276i c0276i) {
        Canvas canvas = this.f4263a;
        if (!(interfaceC0258I instanceof C0278k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0278k) interfaceC0258I).f4278a, (Paint) c0276i.f4273b);
    }

    @Override // b0.InterfaceC0285r
    public final void m(float f3, float f4, float f5, float f6, float f7, float f8, C0276i c0276i) {
        this.f4263a.drawRoundRect(f3, f4, f5, f6, f7, f8, (Paint) c0276i.f4273b);
    }

    @Override // b0.InterfaceC0285r
    public final void n(a0.d dVar, C0276i c0276i) {
        Canvas canvas = this.f4263a;
        Paint paint = (Paint) c0276i.f4273b;
        canvas.saveLayer(dVar.f3491a, dVar.f3492b, dVar.f3493c, dVar.f3494d, paint, 31);
    }

    @Override // b0.InterfaceC0285r
    public final void o(float[] fArr) {
        int i3 = 0;
        while (i3 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                if (fArr[(i3 * 4) + i4] != (i3 == i4 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    float f3 = fArr[0];
                    float f4 = fArr[1];
                    float f5 = fArr[2];
                    float f6 = fArr[3];
                    float f7 = fArr[4];
                    float f8 = fArr[5];
                    float f9 = fArr[6];
                    float f10 = fArr[7];
                    float f11 = fArr[8];
                    float f12 = fArr[12];
                    float f13 = fArr[13];
                    float f14 = fArr[15];
                    fArr[0] = f3;
                    fArr[1] = f7;
                    fArr[2] = f12;
                    fArr[3] = f4;
                    fArr[4] = f8;
                    fArr[5] = f13;
                    fArr[6] = f6;
                    fArr[7] = f10;
                    fArr[8] = f14;
                    matrix.setValues(fArr);
                    fArr[0] = f3;
                    fArr[1] = f4;
                    fArr[2] = f5;
                    fArr[3] = f6;
                    fArr[4] = f7;
                    fArr[5] = f8;
                    fArr[6] = f9;
                    fArr[7] = f10;
                    fArr[8] = f11;
                    this.f4263a.concat(matrix);
                    return;
                }
                i4++;
            }
            i3++;
        }
    }

    @Override // b0.InterfaceC0285r
    public final void p() {
        AbstractC0259J.m(this.f4263a, true);
    }

    @Override // b0.InterfaceC0285r
    public final void q(float f3, float f4, float f5, float f6, int i3) {
        this.f4263a.clipRect(f3, f4, f5, f6, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // b0.InterfaceC0285r
    public final void r(float f3, float f4) {
        this.f4263a.translate(f3, f4);
    }

    @Override // b0.InterfaceC0285r
    public final void s(float f3, float f4, float f5, float f6, C0276i c0276i) {
        this.f4263a.drawOval(f3, f4, f5, f6, (Paint) c0276i.f4273b);
    }

    public final Canvas t() {
        return this.f4263a;
    }

    public final void u(Canvas canvas) {
        this.f4263a = canvas;
    }
}
