package g2;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1896a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1897b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f1898c = new Matrix();
    public final /* synthetic */ i d;

    public f(i iVar) {
        this.d = iVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f5, Object obj, Object obj2) {
        this.d.f1914p = f5;
        float[] fArr = this.f1896a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f1897b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f6 = fArr2[i];
            float f7 = fArr[i];
            fArr2[i] = ((f6 - f7) * f5) + f7;
        }
        Matrix matrix = this.f1898c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
