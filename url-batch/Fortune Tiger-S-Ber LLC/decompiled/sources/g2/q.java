package g2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final y[] f1896a = new y[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f1897b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f1898d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f1899e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f1900f = new Path();
    public final y g = new y();
    public final float[] h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1901i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f1902j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f1903k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1904l = true;

    public q() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f1896a[i4] = new y();
            this.f1897b[i4] = new Matrix();
            this.c[i4] = new Matrix();
        }
    }

    public static q b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? p.f1895a : new q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(o oVar, float[] fArr, float f4, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i4;
        y[] yVarArr;
        Matrix[] matrixArr2;
        boolean z3;
        float f5;
        boolean z4;
        int i5;
        path.rewind();
        Path path2 = this.f1899e;
        path2.rewind();
        Path path3 = this.f1900f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i6 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            yVarArr = this.f1896a;
            matrixArr2 = this.f1897b;
            z3 = 0;
            if (i6 >= 4) {
                break;
            }
            d cVar = fArr == null ? i6 != 1 ? i6 != 2 ? i6 != 3 ? oVar.f1890f : oVar.f1889e : oVar.h : oVar.g : new c(fArr[i6]);
            k3.d dVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? oVar.f1887b : oVar.f1886a : oVar.f1888d : oVar.c;
            y yVar = yVarArr[i6];
            dVar.getClass();
            dVar.E(yVar, f4, cVar.a(rectF));
            int i7 = i6 + 1;
            float f6 = (i7 % 4) * 90;
            matrixArr2[i6].reset();
            PointF pointF = this.f1898d;
            if (i6 == 1) {
                i5 = i6;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i6 == 2) {
                i5 = i6;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i6 != 3) {
                i5 = i6;
                pointF.set(rectF.right, rectF.top);
            } else {
                i5 = i6;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f6);
            y yVar2 = yVarArr[i5];
            fArr2[0] = yVar2.f1917b;
            fArr2[1] = yVar2.c;
            matrixArr2[i5].mapPoints(fArr2);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i5].preRotate(f6);
            i6 = i7;
        }
        int i8 = 0;
        for (i4 = 4; i8 < i4; i4 = 4) {
            y yVar3 = yVarArr[i8];
            yVar3.getClass();
            fArr2[z3] = 0.0f;
            fArr2[1] = yVar3.f1916a;
            matrixArr2[i8].mapPoints(fArr2);
            if (i8 == 0) {
                path.moveTo(fArr2[z3], fArr2[1]);
            } else {
                path.lineTo(fArr2[z3], fArr2[1]);
            }
            yVarArr[i8].b(matrixArr2[i8], path);
            if (gVar != null) {
                y yVar4 = yVarArr[i8];
                Matrix matrix = matrixArr2[i8];
                j jVar = gVar.f1842a;
                f5 = 0.0f;
                BitSet bitSet = jVar.f1859j;
                yVar4.getClass();
                bitSet.set(i8, z3);
                x[] xVarArr = jVar.h;
                yVar4.a(yVar4.f1919e);
                xVarArr[i8] = new r(new ArrayList(yVar4.g), new Matrix(matrix));
            } else {
                f5 = 0.0f;
            }
            int i9 = i8 + 1;
            int i10 = i9 % 4;
            y yVar5 = yVarArr[i8];
            fArr2[0] = yVar5.f1917b;
            fArr2[1] = yVar5.c;
            matrixArr2[i8].mapPoints(fArr2);
            y yVar6 = yVarArr[i10];
            yVar6.getClass();
            float[] fArr3 = this.f1901i;
            fArr3[0] = f5;
            fArr3[1] = yVar6.f1916a;
            matrixArr2[i10].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            y[] yVarArr2 = yVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f5);
            y yVar7 = yVarArr2[i8];
            fArr2[0] = yVar7.f1917b;
            fArr2[1] = yVar7.c;
            matrixArr2[i8].mapPoints(fArr2);
            if (i8 == 1 || i8 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            y yVar8 = this.g;
            yVar8.d(0.0f, 270.0f, 0.0f);
            (i8 != 1 ? i8 != 2 ? i8 != 3 ? oVar.f1892j : oVar.f1891i : oVar.f1894l : oVar.f1893k).getClass();
            yVar8.c(max, 0.0f);
            Path path4 = this.f1902j;
            path4.reset();
            yVar8.b(matrixArr3[i8], path4);
            if (this.f1904l && (c(path4, i8) || c(path4, i10))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = yVar8.f1916a;
                matrixArr3[i8].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                yVar8.b(matrixArr3[i8], path2);
            } else {
                yVar8.b(matrixArr3[i8], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i8];
                j jVar2 = gVar.f1842a;
                z4 = false;
                jVar2.f1859j.set(i8 + 4, false);
                x[] xVarArr2 = jVar2.f1858i;
                yVar8.a(yVar8.f1919e);
                xVarArr2[i8] = new r(new ArrayList(yVar8.g), new Matrix(matrix2));
            } else {
                z4 = false;
            }
            matrixArr = matrixArr3;
            i8 = i9;
            z3 = z4;
            yVarArr = yVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i4) {
        Path path2 = this.f1903k;
        path2.reset();
        this.f1896a[i4].b(this.f1897b[i4], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
