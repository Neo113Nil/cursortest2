package k1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f5296a = c.f5301a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f5297b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f5298c;

    @Override // k1.n
    public final void a(float f3, float f10, float f11, float f12, y6.l lVar) {
        Canvas canvas = this.f5296a;
        if (lVar == null) {
            x.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + wd.c0.a(lVar.getClass()).b());
        }
        canvas.drawRect(f3, f10, f11, f12, (Paint) lVar.f10660e);
    }

    @Override // k1.n
    public final void b(float f3, float f10) {
        this.f5296a.scale(f3, f10);
    }

    @Override // k1.n
    public final void c(e eVar, long j, long j3, long j10, y6.l lVar) {
        if (this.f5297b == null) {
            this.f5297b = new Rect();
            this.f5298c = new Rect();
        }
        Canvas canvas = this.f5296a;
        if (!(eVar instanceof e)) {
            a2.r.r("Unable to obtain android.graphics.Bitmap");
            return;
        }
        Bitmap bitmap = eVar.f5314a;
        Rect rect = this.f5297b;
        rect.getClass();
        int i3 = (int) (j >> 32);
        rect.left = i3;
        int i10 = (int) (j & 4294967295L);
        rect.top = i10;
        rect.right = i3 + ((int) (j3 >> 32));
        rect.bottom = i10 + ((int) (j3 & 4294967295L));
        Rect rect2 = this.f5298c;
        rect2.getClass();
        int i11 = (int) 0;
        rect2.left = i11;
        int i12 = (int) 0;
        rect2.top = i12;
        rect2.right = i11 + ((int) (j10 >> 32));
        rect2.bottom = i12 + ((int) (4294967295L & j10));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) lVar.f10660e);
    }

    @Override // k1.n
    public final void d(float f3, float f10, float f11, float f12, float f13, float f14, y6.l lVar) {
        this.f5296a.drawRoundRect(f3, f10, f11, f12, f13, f14, (Paint) lVar.f10660e);
    }

    @Override // k1.n
    public final void e(float f3, float f10) {
        this.f5296a.translate(f3, f10);
    }

    @Override // k1.n
    public final void f() {
        this.f5296a.restore();
    }

    @Override // k1.n
    public final void g(float f3, long j, y6.l lVar) {
        this.f5296a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f3, (Paint) lVar.f10660e);
    }

    @Override // k1.n
    public final void h() {
        this.f5296a.save();
    }

    @Override // k1.n
    public final void i() {
        v.h(this.f5296a, false);
    }

    @Override // k1.n
    public final void j(float f3, float f10, float f11, float f12, float f13, y6.l lVar) {
        this.f5296a.drawArc(f3, f10, f11, f12, -90.0f, f13, false, (Paint) lVar.f10660e);
    }

    @Override // k1.n
    public final void k(j1.c cVar, y6.l lVar) {
        this.f5296a.saveLayer(cVar.f4916a, cVar.f4917b, cVar.f4918c, cVar.f4919d, (Paint) lVar.f10660e, 31);
    }

    @Override // k1.n
    public final void l(float f3, float f10, float f11, float f12) {
        this.f5296a.clipRect(f3, f10, f11, f12, Region.Op.INTERSECT);
    }

    @Override // k1.n
    public final void m(float[] fArr) {
        if (v.l(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f3;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f3;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
        this.f5296a.concat(matrix);
    }

    @Override // k1.n
    public final void n(g gVar) {
        Canvas canvas = this.f5296a;
        if (gVar instanceof g) {
            canvas.clipPath(gVar.f5321a, Region.Op.INTERSECT);
        } else {
            a2.r.r("Unable to obtain android.graphics.Path");
        }
    }

    @Override // k1.n
    public final void o() {
        v.h(this.f5296a, true);
    }

    @Override // k1.n
    public final void p(g gVar, y6.l lVar) {
        Canvas canvas = this.f5296a;
        if (gVar instanceof g) {
            canvas.drawPath(gVar.f5321a, (Paint) lVar.f10660e);
        } else {
            a2.r.r("Unable to obtain android.graphics.Path");
        }
    }
}
