package K0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f439a = new u[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f440b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f441c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f442e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f443f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final u f444g = new u();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f445h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f446j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f447k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f448l = true;

    public m() {
        for (int i = 0; i < 4; i++) {
            this.f439a[i] = new u();
            this.f440b[i] = new Matrix();
            this.f441c[i] = new Matrix();
        }
    }

    public final void a(k kVar, float f2, RectF rectF, D.g gVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i;
        float[] fArr;
        int i2;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f442e;
        path2.rewind();
        Path path3 = mVar.f443f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = mVar.f441c;
            matrixArr2 = mVar.f440b;
            uVarArr = mVar.f439a;
            i = 4;
            fArr = mVar.f445h;
            if (i3 >= 4) {
                break;
            }
            c cVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f432f : kVar.f431e : kVar.f434h : kVar.f433g;
            A1.d dVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f429b : kVar.f428a : kVar.d : kVar.f430c;
            u uVar = uVarArr[i3];
            dVar.getClass();
            dVar.E(uVar, f2, cVar.a(rectF));
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
            fArr[0] = uVar2.f465b;
            fArr[1] = uVar2.f466c;
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
            fArr[1] = uVar3.f464a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i5].b(matrixArr2[i5], path);
            if (gVar != null) {
                u uVar4 = uVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                g gVar2 = (g) gVar.f122b;
                BitSet bitSet = gVar2.d;
                uVar4.getClass();
                bitSet.set(i5, false);
                uVar4.a(uVar4.f467e);
                gVar2.f398b[i5] = new n(new ArrayList(uVar4.f469g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            u uVar5 = uVarArr[i5];
            fArr[0] = uVar5.f465b;
            fArr[1] = uVar5.f466c;
            matrixArr2[i5].mapPoints(fArr);
            u uVar6 = uVarArr[i7];
            uVar6.getClass();
            float[] fArr2 = mVar.i;
            fArr2[0] = 0.0f;
            fArr2[1] = uVar6.f464a;
            matrixArr2[i7].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, RecyclerView.A0);
            u uVar7 = uVarArr[i5];
            fArr[0] = uVar7.f465b;
            fArr[1] = uVar7.f466c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = mVar.f444g;
            uVar8.d(RecyclerView.A0, 270.0f, RecyclerView.A0);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f435j : kVar.i : kVar.f437l : kVar.f436k).getClass();
            uVar8.c(max, RecyclerView.A0);
            Path path4 = mVar.f446j;
            path4.reset();
            uVar8.b(matrixArr[i5], path4);
            if (mVar.f448l && (mVar.b(path4, i5) || mVar.b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f464a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i5], path2);
            } else {
                uVar8.b(matrixArr[i5], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr[i5];
                g gVar3 = (g) gVar.f122b;
                gVar3.d.set(i5 + 4, false);
                uVar8.a(uVar8.f467e);
                gVar3.f399c[i5] = new n(new ArrayList(uVar8.f469g), new Matrix(matrix2));
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
        Path path2 = this.f447k;
        path2.reset();
        this.f439a[i].b(this.f440b[i], path2);
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
