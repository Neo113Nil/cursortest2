package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p20 {
    public final x20[] a = new x20[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final x20 g = new x20();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public p20() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new x20();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static p20 b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? o20.a : new p20();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(n20 n20Var, float[] fArr, float f, RectF rectF, ot otVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        x20[] x20VarArr;
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
            x20VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            xd oaVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? n20Var.f : n20Var.e : n20Var.h : n20Var.g : new oa(fArr[i3]);
            op opVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? n20Var.b : n20Var.a : n20Var.d : n20Var.c;
            x20 x20Var = x20VarArr[i3];
            opVar.getClass();
            opVar.y(x20Var, f, oaVar.a(rectF));
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
            x20 x20Var2 = x20VarArr[i2];
            fArr2[0] = x20Var2.b;
            fArr2[1] = x20Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            x20 x20Var3 = x20VarArr[i5];
            x20Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = x20Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            x20VarArr[i5].b(matrixArr2[i5], path);
            if (otVar != null) {
                x20 x20Var4 = x20VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                rt rtVar = otVar.a;
                f2 = 0.0f;
                BitSet bitSet = rtVar.j;
                x20Var4.getClass();
                bitSet.set(i5, z);
                w20[] w20VarArr = rtVar.h;
                x20Var4.a(x20Var4.e);
                w20VarArr[i5] = new q20(new ArrayList(x20Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            x20 x20Var5 = x20VarArr[i5];
            fArr2[0] = x20Var5.b;
            fArr2[1] = x20Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            x20 x20Var6 = x20VarArr[i7];
            x20Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = x20Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            x20[] x20VarArr2 = x20VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            x20 x20Var7 = x20VarArr2[i5];
            fArr2[0] = x20Var7.b;
            fArr2[1] = x20Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            x20 x20Var8 = this.g;
            x20Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? n20Var.j : n20Var.i : n20Var.l : n20Var.k).getClass();
            x20Var8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            x20Var8.b(matrixArr3[i5], path4);
            if (this.l && (c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = x20Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                x20Var8.b(matrixArr3[i5], path2);
            } else {
                x20Var8.b(matrixArr3[i5], path);
            }
            if (otVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                rt rtVar2 = otVar.a;
                z2 = false;
                rtVar2.j.set(i5 + 4, false);
                w20[] w20VarArr2 = rtVar2.i;
                x20Var8.a(x20Var8.e);
                w20VarArr2[i5] = new q20(new ArrayList(x20Var8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            x20VarArr = x20VarArr2;
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
