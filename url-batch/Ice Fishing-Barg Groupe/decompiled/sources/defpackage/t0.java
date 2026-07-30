package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t0 implements gi {
    public Canvas PxuCJdSBwIXG = u0.PxuCJdSBwIXG;
    public Rect TSizfFm2Yiuu;
    public Rect lS5Rgt96tfkO;

    @Override // defpackage.gi
    public final void BRwzKIf41E4i(yj1 yj1Var) {
        Canvas canvas = this.PxuCJdSBwIXG;
        if (!(yj1Var instanceof r4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((r4) yj1Var).PxuCJdSBwIXG;
        pk.Companion.getClass();
        canvas.clipPath(path, Region.Op.INTERSECT);
    }

    @Override // defpackage.gi
    public final void PxuCJdSBwIXG(float f, float f2) {
        this.PxuCJdSBwIXG.scale(f, f2);
    }

    @Override // defpackage.gi
    public final void QrzZRwfaDlRX(qt1 qt1Var, j4 j4Var) {
        this.PxuCJdSBwIXG.saveLayer(qt1Var.PxuCJdSBwIXG, qt1Var.lS5Rgt96tfkO, qt1Var.TSizfFm2Yiuu, qt1Var.Y1f8riQaR6yg, (Paint) j4Var.TSizfFm2Yiuu, 31);
    }

    @Override // defpackage.gi
    public final void RAsUl2FVSrh6() {
        this.PxuCJdSBwIXG.restore();
    }

    @Override // defpackage.gi
    public final void RfyTYNmI9Srp() {
        bs0.XL4ISE6Oc65B(this.PxuCJdSBwIXG, true);
    }

    @Override // defpackage.gi
    public final void TSizfFm2Yiuu(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.PxuCJdSBwIXG;
        pk.Companion.getClass();
        canvas.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.gi
    public final void XL4ISE6Oc65B(float[] fArr) {
        if (vi0.J54yh1s3n4Aq(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        fx1.iSxsmagYqzHM(matrix, fArr);
        this.PxuCJdSBwIXG.concat(matrix);
    }

    @Override // defpackage.gi
    public final void Y1f8riQaR6yg(float f, float f2) {
        this.PxuCJdSBwIXG.translate(f, f2);
    }

    @Override // defpackage.gi
    public final void a92UlCVFR9N8(yj1 yj1Var, j4 j4Var) {
        Canvas canvas = this.PxuCJdSBwIXG;
        if (!(yj1Var instanceof r4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((r4) yj1Var).PxuCJdSBwIXG, ov2.kpCQ9veP6n3I(j4Var));
    }

    @Override // defpackage.gi
    public final void cpQdD2nAriOS() {
        bs0.XL4ISE6Oc65B(this.PxuCJdSBwIXG, false);
    }

    @Override // defpackage.gi
    public final void dgRBjINgWbAK(long j, long j2, j4 j4Var) {
        this.PxuCJdSBwIXG.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) j4Var.TSizfFm2Yiuu);
    }

    @Override // defpackage.gi
    public final void e9gEMXR7LXtO() {
        this.PxuCJdSBwIXG.rotate(45.0f);
    }

    @Override // defpackage.gi
    public final void gPXPFXrUH4XX(float f, float f2, float f3, float f4, j4 j4Var) {
        this.PxuCJdSBwIXG.drawRect(f, f2, f3, f4, ov2.kpCQ9veP6n3I(j4Var));
    }

    @Override // defpackage.gi
    public final void lS5Rgt96tfkO(float f, long j, j4 j4Var) {
        this.PxuCJdSBwIXG.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) j4Var.TSizfFm2Yiuu);
    }

    @Override // defpackage.gi
    public final void r3s1LDPKFs1S(ym0 ym0Var, long j, long j2, long j3, j4 j4Var) {
        if (this.lS5Rgt96tfkO == null) {
            this.lS5Rgt96tfkO = new Rect();
            this.TSizfFm2Yiuu = new Rect();
        }
        Canvas canvas = this.PxuCJdSBwIXG;
        Bitmap xfACYKDMU6Dj = b51.xfACYKDMU6Dj(ym0Var);
        Rect rect = this.lS5Rgt96tfkO;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.TSizfFm2Yiuu;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(xfACYKDMU6Dj, rect, rect2, (Paint) j4Var.TSizfFm2Yiuu);
    }

    @Override // defpackage.gi
    public final void rtx2ld2ELZv4(float f, float f2, float f3, float f4, float f5, float f6, j4 j4Var) {
        this.PxuCJdSBwIXG.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) j4Var.TSizfFm2Yiuu);
    }

    @Override // defpackage.gi
    public final void wdg6QnbFHrFF() {
        this.PxuCJdSBwIXG.save();
    }

    @Override // defpackage.gi
    public final void x50lh2ztY7Y5(ym0 ym0Var, j4 j4Var) {
        this.PxuCJdSBwIXG.drawBitmap(b51.xfACYKDMU6Dj(ym0Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) j4Var.TSizfFm2Yiuu);
    }
}
