package o2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final y[] f2994a = new y[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f2995b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f2996c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f2997e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f2998f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final y f2999g = new y();
    public final float[] h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f3000j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f3001k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3002l = true;

    public q() {
        for (int i = 0; i < 4; i++) {
            this.f2994a[i] = new y();
            this.f2995b[i] = new Matrix();
            this.f2996c[i] = new Matrix();
        }
    }

    public static q b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? p.f2993a : new q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(o oVar, float[] fArr, float f5, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        y[] yVarArr;
        Matrix[] matrixArr2;
        boolean z4;
        float f6;
        boolean z5;
        int i4;
        path.rewind();
        Path path2 = this.f2997e;
        path2.rewind();
        Path path3 = this.f2998f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            matrixArr = this.f2996c;
            fArr2 = this.h;
            yVarArr = this.f2994a;
            matrixArr2 = this.f2995b;
            z4 = 0;
            if (i5 >= 4) {
                break;
            }
            d cVar = fArr == null ? i5 != 1 ? i5 != 2 ? i5 != 3 ? oVar.f2988f : oVar.f2987e : oVar.h : oVar.f2989g : new c(fArr[i5]);
            b4.d dVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? oVar.f2985b : oVar.f2984a : oVar.d : oVar.f2986c;
            y yVar = yVarArr[i5];
            dVar.getClass();
            dVar.w(yVar, f5, cVar.a(rectF));
            int i6 = i5 + 1;
            float f7 = (i6 % 4) * 90;
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
            matrixArr2[i4].preRotate(f7);
            y yVar2 = yVarArr[i4];
            fArr2[0] = yVar2.f3018b;
            fArr2[1] = yVar2.f3019c;
            matrixArr2[i4].mapPoints(fArr2);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i4].preRotate(f7);
            i5 = i6;
        }
        int i7 = 0;
        for (i = 4; i7 < i; i = 4) {
            y yVar3 = yVarArr[i7];
            yVar3.getClass();
            fArr2[z4] = 0.0f;
            fArr2[1] = yVar3.f3017a;
            matrixArr2[i7].mapPoints(fArr2);
            if (i7 == 0) {
                path.moveTo(fArr2[z4], fArr2[1]);
            } else {
                path.lineTo(fArr2[z4], fArr2[1]);
            }
            yVarArr[i7].b(matrixArr2[i7], path);
            if (gVar != null) {
                y yVar4 = yVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                j jVar = gVar.f2939a;
                f6 = 0.0f;
                BitSet bitSet = jVar.f2956j;
                yVar4.getClass();
                bitSet.set(i7, z4);
                x[] xVarArr = jVar.h;
                yVar4.a(yVar4.f3020e);
                xVarArr[i7] = new r(new ArrayList(yVar4.f3022g), new Matrix(matrix));
            } else {
                f6 = 0.0f;
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            y yVar5 = yVarArr[i7];
            fArr2[0] = yVar5.f3018b;
            fArr2[1] = yVar5.f3019c;
            matrixArr2[i7].mapPoints(fArr2);
            y yVar6 = yVarArr[i9];
            yVar6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f6;
            fArr3[1] = yVar6.f3017a;
            matrixArr2[i9].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            y[] yVarArr2 = yVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f6);
            y yVar7 = yVarArr2[i7];
            fArr2[0] = yVar7.f3018b;
            fArr2[1] = yVar7.f3019c;
            matrixArr2[i7].mapPoints(fArr2);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            y yVar8 = this.f2999g;
            yVar8.d(0.0f, 270.0f, 0.0f);
            (i7 != 1 ? i7 != 2 ? i7 != 3 ? oVar.f2990j : oVar.i : oVar.f2992l : oVar.f2991k).getClass();
            yVar8.c(max, 0.0f);
            Path path4 = this.f3000j;
            path4.reset();
            yVar8.b(matrixArr3[i7], path4);
            if (this.f3002l && (c(path4, i7) || c(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = yVar8.f3017a;
                matrixArr3[i7].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                yVar8.b(matrixArr3[i7], path2);
            } else {
                yVar8.b(matrixArr3[i7], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i7];
                j jVar2 = gVar.f2939a;
                z5 = false;
                jVar2.f2956j.set(i7 + 4, false);
                x[] xVarArr2 = jVar2.i;
                yVar8.a(yVar8.f3020e);
                xVarArr2[i7] = new r(new ArrayList(yVar8.f3022g), new Matrix(matrix2));
            } else {
                z5 = false;
            }
            matrixArr = matrixArr3;
            i7 = i8;
            z4 = z5;
            yVarArr = yVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.f3001k;
        path2.reset();
        this.f2994a[i].b(this.f2995b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
