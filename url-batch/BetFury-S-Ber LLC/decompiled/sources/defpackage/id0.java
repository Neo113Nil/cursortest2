package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class id0 {
    public final qd0[] a = new qd0[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final qd0 g = new qd0();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public id0() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new qd0();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static id0 b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? hd0.a : new id0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(gd0 gd0Var, float[] fArr, float f, RectF rectF, d10 d10Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        qd0[] qd0VarArr;
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
            qd0VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            ng bcVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? gd0Var.f : gd0Var.e : gd0Var.h : gd0Var.g : new bc(fArr[i3]);
            n9 n9Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? gd0Var.b : gd0Var.a : gd0Var.d : gd0Var.c;
            qd0 qd0Var = qd0VarArr[i3];
            n9Var.getClass();
            n9Var.m(qd0Var, f, bcVar.a(rectF));
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
            qd0 qd0Var2 = qd0VarArr[i2];
            fArr2[0] = qd0Var2.b;
            fArr2[1] = qd0Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            qd0 qd0Var3 = qd0VarArr[i5];
            qd0Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = qd0Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            qd0VarArr[i5].b(matrixArr2[i5], path);
            if (d10Var != null) {
                qd0 qd0Var4 = qd0VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                g10 g10Var = d10Var.a;
                f2 = 0.0f;
                BitSet bitSet = g10Var.j;
                qd0Var4.getClass();
                bitSet.set(i5, z);
                pd0[] pd0VarArr = g10Var.h;
                qd0Var4.a(qd0Var4.e);
                pd0VarArr[i5] = new jd0(new ArrayList(qd0Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            qd0 qd0Var5 = qd0VarArr[i5];
            fArr2[0] = qd0Var5.b;
            fArr2[1] = qd0Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            qd0 qd0Var6 = qd0VarArr[i7];
            qd0Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = qd0Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            qd0[] qd0VarArr2 = qd0VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            qd0 qd0Var7 = qd0VarArr2[i5];
            fArr2[0] = qd0Var7.b;
            fArr2[1] = qd0Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            qd0 qd0Var8 = this.g;
            qd0Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? gd0Var.j : gd0Var.i : gd0Var.l : gd0Var.k).getClass();
            qd0Var8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            qd0Var8.b(matrixArr3[i5], path4);
            if (this.l && (c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = qd0Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                qd0Var8.b(matrixArr3[i5], path2);
            } else {
                qd0Var8.b(matrixArr3[i5], path);
            }
            if (d10Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                g10 g10Var2 = d10Var.a;
                z2 = false;
                g10Var2.j.set(i5 + 4, false);
                pd0[] pd0VarArr2 = g10Var2.i;
                qd0Var8.a(qd0Var8.e);
                pd0VarArr2[i5] = new jd0(new ArrayList(qd0Var8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            qd0VarArr = qd0VarArr2;
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
