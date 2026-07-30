package a1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import k1.C4628a;

/* loaded from: classes.dex */
public final class m extends k {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f4322j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f4323k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f4324l;

    /* renamed from: m, reason: collision with root package name */
    public l f4325m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.f4322j = new float[2];
        this.f4323k = new float[2];
        this.f4324l = new PathMeasure();
    }

    @Override // a1.AbstractC0421e
    public final Object f(C4628a c4628a, float f6) {
        float f9;
        l lVar = (l) c4628a;
        Path path = lVar.f4320q;
        S0.s sVar = this.f4306e;
        if (sVar == null || c4628a.f38678h == null) {
            f9 = f6;
        } else {
            f9 = f6;
            PointF pointF = (PointF) sVar.h(lVar.f38677g, lVar.f38678h.floatValue(), (PointF) lVar.f38672b, (PointF) lVar.f38673c, d(), f9, this.f4305d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c4628a.f38672b;
        }
        l lVar2 = this.f4325m;
        PathMeasure pathMeasure = this.f4324l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f4325m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f9 * length;
        float[] fArr = this.f4322j;
        float[] fArr2 = this.f4323k;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
            return pointF2;
        }
        if (f10 > length) {
            float f11 = f10 - length;
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
        }
        return pointF2;
    }
}
