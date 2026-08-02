package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fev implements TypeEvaluator {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        float[] fArr = this.a;
        matrix.getValues(fArr);
        float[] fArr2 = this.b;
        matrix2.getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = f3 + ((f2 - f3) * f);
        }
        Matrix matrix3 = this.c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
