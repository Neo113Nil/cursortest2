package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y6 implements ls {
    public Canvas a = z6.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.ls
    public final void a(float f, float f2, float f3, float f4, vs3 vs3Var) {
        this.a.drawRect(f, f2, f3, f4, (Paint) vs3Var.b);
    }

    @Override // defpackage.ls
    public final void b(y9 y9Var, vs3 vs3Var) {
        this.a.drawBitmap(k31.a(y9Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) vs3Var.b);
    }

    @Override // defpackage.ls
    public final void c(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ls
    public final void d(y9 y9Var, long j, long j2, long j3, vs3 vs3Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = k31.a(y9Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Unit unit = Unit.a;
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(a, rect, rect2, (Paint) vs3Var.b);
    }

    @Override // defpackage.ls
    public final void e(long j, long j2, vs3 vs3Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) vs3Var.b);
    }

    @Override // defpackage.ls
    public final void f(oa oaVar, vs3 vs3Var) {
        Canvas canvas = this.a;
        if (oaVar instanceof oa) {
            canvas.drawPath(oaVar.a, (Paint) vs3Var.b);
        } else {
            ch2.h("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.ls
    public final void g(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.ls
    public final void h(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ls
    public final void i() {
        this.a.rotate(45.0f);
    }

    @Override // defpackage.ls
    public final void j() {
        this.a.restore();
    }

    @Override // defpackage.ls
    public final void k(w72 w72Var, vs3 vs3Var) {
        this.a.saveLayer(w72Var.a, w72Var.b, w72Var.c, w72Var.d, (Paint) vs3Var.b, 31);
    }

    @Override // defpackage.ls
    public final void m() {
        this.a.save();
    }

    @Override // defpackage.ls
    public final void n() {
        ap.v(this.a, false);
    }

    @Override // defpackage.ls
    public final void o(float f, long j, vs3 vs3Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) vs3Var.b);
    }

    @Override // defpackage.ls
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, vs3 vs3Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) vs3Var.b);
    }

    @Override // defpackage.ls
    public final void q(float[] fArr) {
        if (ll3.M(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        l41.Y(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.ls
    public final void r() {
        ap.v(this.a, true);
    }

    @Override // defpackage.ls
    public final void s(oa oaVar) {
        Canvas canvas = this.a;
        if (oaVar instanceof oa) {
            canvas.clipPath(oaVar.a, Region.Op.INTERSECT);
        } else {
            ch2.h("Unable to obtain android.graphics.Path");
        }
    }
}
