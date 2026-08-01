package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h50 {
    public final p50[] a = new p50[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final p50 g = new p50();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public h50() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new p50();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static h50 b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? g50.a : new h50();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(f50 f50Var, float[] fArr, float f, RectF rectF, aw awVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        p50[] p50VarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            p50VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            ve ebVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? f50Var.f : f50Var.e : f50Var.h : f50Var.g : new eb(fArr[i3]);
            la0 la0Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? f50Var.b : f50Var.a : f50Var.d : f50Var.c;
            p50 p50Var = p50VarArr[i3];
            la0Var.getClass();
            la0Var.y(p50Var, f, ebVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            p50 p50Var2 = p50VarArr[i2];
            fArr2[0] = p50Var2.b;
            fArr2[1] = p50Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            p50 p50Var3 = p50VarArr[i5];
            p50Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = p50Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            p50VarArr[i5].b(matrixArr2[i5], path);
            if (awVar != null) {
                p50 p50Var4 = p50VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                dw dwVar = awVar.a;
                f2 = 0.0f;
                BitSet bitSet = dwVar.j;
                p50Var4.getClass();
                bitSet.set(i5, z);
                o50[] o50VarArr = dwVar.h;
                p50Var4.a(p50Var4.e);
                o50VarArr[i5] = new i50(new ArrayList(p50Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            p50 p50Var5 = p50VarArr[i5];
            fArr2[0] = p50Var5.b;
            fArr2[1] = p50Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            p50 p50Var6 = p50VarArr[i7];
            p50Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = p50Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            p50[] p50VarArr2 = p50VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            p50 p50Var7 = p50VarArr2[i5];
            fArr2[0] = p50Var7.b;
            fArr2[1] = p50Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            p50 p50Var8 = this.g;
            p50Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? f50Var.j : f50Var.i : f50Var.l : f50Var.k).getClass();
            p50Var8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            p50Var8.b(matrixArr3[i5], path4);
            if (this.l && (c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = p50Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                p50Var8.b(matrixArr3[i5], path2);
            } else {
                p50Var8.b(matrixArr3[i5], path);
            }
            if (awVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                dw dwVar2 = awVar.a;
                z2 = false;
                dwVar2.j.set(i5 + 4, false);
                o50[] o50VarArr2 = dwVar2.i;
                p50Var8.a(p50Var8.e);
                o50VarArr2[i5] = new i50(new ArrayList(p50Var8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            p50VarArr = p50VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
