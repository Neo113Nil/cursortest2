package H0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f295a = new u[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f296b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f297c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f298e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f299f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final u f300g = new u();
    public final float[] h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f301j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f302k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f303l = true;

    public m() {
        for (int i = 0; i < 4; i++) {
            this.f295a[i] = new u();
            this.f296b[i] = new Matrix();
            this.f297c[i] = new Matrix();
        }
    }

    public final void a(k kVar, float f2, RectF rectF, B0.d dVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i;
        float[] fArr;
        int i2;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f298e;
        path2.rewind();
        Path path3 = mVar.f299f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = mVar.f297c;
            matrixArr2 = mVar.f296b;
            uVarArr = mVar.f295a;
            i = 4;
            fArr = mVar.h;
            if (i3 >= 4) {
                break;
            }
            c cVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f289f : kVar.f288e : kVar.h : kVar.f290g;
            q1.d dVar2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f286b : kVar.f285a : kVar.d : kVar.f287c;
            u uVar = uVarArr[i3];
            dVar2.getClass();
            dVar2.B(uVar, f2, cVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = mVar.d;
            if (i3 == 1) {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            u uVar2 = uVarArr[i3];
            fArr[0] = uVar2.f319b;
            fArr[1] = uVar2.f320c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f3);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            u uVar3 = uVarArr[i5];
            uVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = uVar3.f318a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i5].b(matrixArr2[i5], path);
            if (dVar != null) {
                u uVar4 = uVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                g gVar = (g) dVar.f59b;
                BitSet bitSet = gVar.d;
                uVar4.getClass();
                bitSet.set(i5, false);
                uVar4.a(uVar4.f321e);
                gVar.f257b[i5] = new n(new ArrayList(uVar4.f323g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            u uVar5 = uVarArr[i5];
            fArr[0] = uVar5.f319b;
            fArr[1] = uVar5.f320c;
            matrixArr2[i5].mapPoints(fArr);
            u uVar6 = uVarArr[i7];
            uVar6.getClass();
            float[] fArr2 = mVar.i;
            fArr2[0] = 0.0f;
            fArr2[1] = uVar6.f318a;
            matrixArr2[i7].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i5];
            fArr[0] = uVar7.f319b;
            fArr[1] = uVar7.f320c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = mVar.f300g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f291j : kVar.i : kVar.f293l : kVar.f292k).getClass();
            uVar8.c(max, 0.0f);
            Path path4 = mVar.f301j;
            path4.reset();
            uVar8.b(matrixArr[i5], path4);
            if (mVar.f303l && (mVar.b(path4, i5) || mVar.b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f318a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i5], path2);
            } else {
                uVar8.b(matrixArr[i5], path);
            }
            if (dVar != null) {
                Matrix matrix2 = matrixArr[i5];
                g gVar2 = (g) dVar.f59b;
                gVar2.d.set(i5 + 4, false);
                uVar8.a(uVar8.f321e);
                gVar2.f258c[i5] = new n(new ArrayList(uVar8.f323g), new Matrix(matrix2));
            }
            i = 4;
            mVar = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f302k;
        path2.reset();
        this.f295a[i].b(this.f296b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
