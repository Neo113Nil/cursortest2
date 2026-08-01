package l2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final x[] f2639a = new x[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f2640b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f2641c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f2642e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f2643f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final x f2644g = new x();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f2645h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f2646j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f2647k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2648l = true;

    public p() {
        for (int i = 0; i < 4; i++) {
            this.f2639a[i] = new x();
            this.f2640b[i] = new Matrix();
            this.f2641c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(n nVar, float[] fArr, float f2, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        x[] xVarArr;
        Matrix[] matrixArr2;
        boolean z3;
        float f4;
        boolean z4;
        int i4;
        path.rewind();
        Path path2 = this.f2642e;
        path2.rewind();
        Path path3 = this.f2643f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            matrixArr = this.f2641c;
            fArr2 = this.f2645h;
            xVarArr = this.f2639a;
            matrixArr2 = this.f2640b;
            z3 = 0;
            if (i5 >= 4) {
                break;
            }
            d cVar = fArr == null ? i5 != 1 ? i5 != 2 ? i5 != 3 ? nVar.f2632f : nVar.f2631e : nVar.f2634h : nVar.f2633g : new c(fArr[i5]);
            h.a aVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? nVar.f2629b : nVar.f2628a : nVar.d : nVar.f2630c;
            x xVar = xVarArr[i5];
            aVar.getClass();
            aVar.v(xVar, f2, cVar.a(rectF));
            int i6 = i5 + 1;
            float f5 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = this.d;
            if (i5 == 1) {
                i4 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                i4 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                i4 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f5);
            x xVar2 = xVarArr[i4];
            fArr2[0] = xVar2.f2665b;
            fArr2[1] = xVar2.f2666c;
            matrixArr2[i4].mapPoints(fArr2);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i4].preRotate(f5);
            i5 = i6;
        }
        int i7 = 0;
        for (i = 4; i7 < i; i = 4) {
            x xVar3 = xVarArr[i7];
            xVar3.getClass();
            fArr2[z3] = 0.0f;
            fArr2[1] = xVar3.f2664a;
            matrixArr2[i7].mapPoints(fArr2);
            if (i7 == 0) {
                path.moveTo(fArr2[z3], fArr2[1]);
            } else {
                path.lineTo(fArr2[z3], fArr2[1]);
            }
            xVarArr[i7].b(matrixArr2[i7], path);
            if (gVar != null) {
                x xVar4 = xVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                j jVar = gVar.f2580a;
                f4 = 0.0f;
                BitSet bitSet = jVar.f2600j;
                xVar4.getClass();
                bitSet.set(i7, z3);
                w[] wVarArr = jVar.f2599h;
                xVar4.a(xVar4.f2667e);
                wVarArr[i7] = new q(new ArrayList(xVar4.f2669g), new Matrix(matrix));
            } else {
                f4 = 0.0f;
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            x xVar5 = xVarArr[i7];
            fArr2[0] = xVar5.f2665b;
            fArr2[1] = xVar5.f2666c;
            matrixArr2[i7].mapPoints(fArr2);
            x xVar6 = xVarArr[i9];
            xVar6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f4;
            fArr3[1] = xVar6.f2664a;
            matrixArr2[i9].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            x[] xVarArr2 = xVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f4);
            x xVar7 = xVarArr2[i7];
            fArr2[0] = xVar7.f2665b;
            fArr2[1] = xVar7.f2666c;
            matrixArr2[i7].mapPoints(fArr2);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            x xVar8 = this.f2644g;
            xVar8.d(0.0f, 270.0f, 0.0f);
            (i7 != 1 ? i7 != 2 ? i7 != 3 ? nVar.f2635j : nVar.i : nVar.f2637l : nVar.f2636k).getClass();
            xVar8.c(max, 0.0f);
            Path path4 = this.f2646j;
            path4.reset();
            xVar8.b(matrixArr3[i7], path4);
            if (this.f2648l && (b(path4, i7) || b(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = xVar8.f2664a;
                matrixArr3[i7].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                xVar8.b(matrixArr3[i7], path2);
            } else {
                xVar8.b(matrixArr3[i7], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i7];
                j jVar2 = gVar.f2580a;
                z4 = false;
                jVar2.f2600j.set(i7 + 4, false);
                w[] wVarArr2 = jVar2.i;
                xVar8.a(xVar8.f2667e);
                wVarArr2[i7] = new q(new ArrayList(xVar8.f2669g), new Matrix(matrix2));
            } else {
                z4 = false;
            }
            matrixArr = matrixArr3;
            i7 = i8;
            z3 = z4;
            xVarArr = xVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f2647k;
        path2.reset();
        this.f2639a[i].b(this.f2640b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
