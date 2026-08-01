package Z;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1027a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1028b;

    public b(float[] fArr) {
        this.f1027a = fArr;
        this.f1028b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1027a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1028b;
        float f4 = (f2 - (min * f3)) / f3;
        float f5 = fArr[min];
        return ((fArr[min + 1] - f5) * f4) + f5;
    }
}
