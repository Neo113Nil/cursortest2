package z0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3851b;

    public b(float[] fArr) {
        this.f3850a = fArr;
        this.f3851b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3850a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f4 = this.f3851b;
        float f5 = (f2 - (min * f4)) / f4;
        float f6 = fArr[min];
        return ((fArr[min + 1] - f6) * f5) + f6;
    }
}
