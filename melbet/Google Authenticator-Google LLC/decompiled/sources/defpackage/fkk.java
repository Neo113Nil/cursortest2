package defpackage;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fkk implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float f2 = fArr[0];
        float f3 = fArr2[0];
        TimeInterpolator timeInterpolator = fes.a;
        float f4 = fArr[1];
        float f5 = f4 + ((fArr2[1] - f4) * f);
        float f6 = fArr[2];
        float f7 = f6 + ((fArr2[2] - f6) * f);
        float f8 = fArr[3];
        float f9 = f8 + ((fArr2[3] - f8) * f);
        float f10 = fArr[4];
        float f11 = f10 + ((fArr2[4] - f10) * f);
        float f12 = fArr[5];
        float f13 = f12 + ((fArr2[5] - f12) * f);
        float f14 = fArr[6];
        float f15 = f14 + ((fArr2[6] - f14) * f);
        float f16 = fArr[7];
        return new float[]{f2 + ((f3 - f2) * f), f5, f7, f9, f11, f13, f15, f16 + ((fArr2[7] - f16) * f)};
    }
}
