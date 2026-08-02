package S;

import a.AbstractC0132a;
import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public t.d[] f1006a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        t.d[] dVarArr = (t.d[]) obj;
        t.d[] dVarArr2 = (t.d[]) obj2;
        if (!AbstractC0132a.f(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC0132a.f(this.f1006a, dVarArr)) {
            this.f1006a = AbstractC0132a.q(dVarArr);
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            t.d dVar = this.f1006a[i2];
            t.d dVar2 = dVarArr[i2];
            t.d dVar3 = dVarArr2[i2];
            dVar.getClass();
            dVar.f3441a = dVar2.f3441a;
            int i3 = 0;
            while (true) {
                float[] fArr = dVar2.f3442b;
                if (i3 < fArr.length) {
                    dVar.f3442b[i3] = (dVar3.f3442b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                    i3++;
                }
            }
        }
        return this.f1006a;
    }
}
