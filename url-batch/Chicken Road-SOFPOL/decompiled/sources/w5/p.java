package w5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final x[] f8150a = new x[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f8151b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f8152c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f8153d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f8154e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f8155f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final x f8156g = new x();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f8157h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f8158j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f8159k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8160l = true;

    public p() {
        for (int i = 0; i < 4; i++) {
            this.f8150a[i] = new x();
            this.f8151b[i] = new Matrix();
            this.f8152c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(n nVar, float[] fArr, float f6, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        x[] xVarArr;
        Matrix[] matrixArr2;
        boolean z3;
        float f8;
        boolean z7;
        int i8;
        path.rewind();
        Path path2 = this.f8154e;
        path2.rewind();
        Path path3 = this.f8155f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            matrixArr = this.f8152c;
            fArr2 = this.f8157h;
            xVarArr = this.f8150a;
            matrixArr2 = this.f8151b;
            z3 = 0;
            if (i9 >= 4) {
                break;
            }
            d cVar = fArr == null ? i9 != 1 ? i9 != 2 ? i9 != 3 ? nVar.f8143f : nVar.f8142e : nVar.f8145h : nVar.f8144g : new c(fArr[i9]);
            r2.r rVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? nVar.f8139b : nVar.f8138a : nVar.f8141d : nVar.f8140c;
            x xVar = xVarArr[i9];
            rVar.getClass();
            rVar.x(xVar, f6, cVar.a(rectF));
            int i10 = i9 + 1;
            float f9 = (i10 % 4) * 90;
            matrixArr2[i9].reset();
            PointF pointF = this.f8153d;
            if (i9 == 1) {
                i8 = i9;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i9 == 2) {
                i8 = i9;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i9 != 3) {
                i8 = i9;
                pointF.set(rectF.right, rectF.top);
            } else {
                i8 = i9;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i8].setTranslate(pointF.x, pointF.y);
            matrixArr2[i8].preRotate(f9);
            x xVar2 = xVarArr[i8];
            fArr2[0] = xVar2.f8180b;
            fArr2[1] = xVar2.f8181c;
            matrixArr2[i8].mapPoints(fArr2);
            matrixArr[i8].reset();
            matrixArr[i8].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i8].preRotate(f9);
            i9 = i10;
        }
        int i11 = 0;
        for (i = 4; i11 < i; i = 4) {
            x xVar3 = xVarArr[i11];
            xVar3.getClass();
            fArr2[z3] = 0.0f;
            fArr2[1] = xVar3.f8179a;
            matrixArr2[i11].mapPoints(fArr2);
            if (i11 == 0) {
                path.moveTo(fArr2[z3], fArr2[1]);
            } else {
                path.lineTo(fArr2[z3], fArr2[1]);
            }
            xVarArr[i11].b(matrixArr2[i11], path);
            if (gVar != null) {
                x xVar4 = xVarArr[i11];
                Matrix matrix = matrixArr2[i11];
                j jVar = gVar.f8086a;
                f8 = 0.0f;
                BitSet bitSet = jVar.f8108h;
                xVar4.getClass();
                bitSet.set(i11, z3);
                w[] wVarArr = jVar.f8106f;
                xVar4.a(xVar4.f8183e);
                wVarArr[i11] = new q(new ArrayList(xVar4.f8185g), new Matrix(matrix));
            } else {
                f8 = 0.0f;
            }
            int i12 = i11 + 1;
            int i13 = i12 % 4;
            x xVar5 = xVarArr[i11];
            fArr2[0] = xVar5.f8180b;
            fArr2[1] = xVar5.f8181c;
            matrixArr2[i11].mapPoints(fArr2);
            x xVar6 = xVarArr[i13];
            xVar6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f8;
            fArr3[1] = xVar6.f8179a;
            matrixArr2[i13].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            x[] xVarArr2 = xVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f8);
            x xVar7 = xVarArr2[i11];
            fArr2[0] = xVar7.f8180b;
            fArr2[1] = xVar7.f8181c;
            matrixArr2[i11].mapPoints(fArr2);
            if (i11 == 1 || i11 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            x xVar8 = this.f8156g;
            xVar8.d(0.0f, 270.0f, 0.0f);
            (i11 != 1 ? i11 != 2 ? i11 != 3 ? nVar.f8146j : nVar.i : nVar.f8148l : nVar.f8147k).getClass();
            xVar8.c(max, 0.0f);
            Path path4 = this.f8158j;
            path4.reset();
            xVar8.b(matrixArr3[i11], path4);
            if (this.f8160l && (b(path4, i11) || b(path4, i13))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = xVar8.f8179a;
                matrixArr3[i11].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                xVar8.b(matrixArr3[i11], path2);
            } else {
                xVar8.b(matrixArr3[i11], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i11];
                j jVar2 = gVar.f8086a;
                z7 = false;
                jVar2.f8108h.set(i11 + 4, false);
                w[] wVarArr2 = jVar2.f8107g;
                xVar8.a(xVar8.f8183e);
                wVarArr2[i11] = new q(new ArrayList(xVar8.f8185g), new Matrix(matrix2));
            } else {
                z7 = false;
            }
            matrixArr = matrixArr3;
            i11 = i12;
            z3 = z7;
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
        Path path2 = this.f8159k;
        path2.reset();
        this.f8150a[i].b(this.f8151b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
