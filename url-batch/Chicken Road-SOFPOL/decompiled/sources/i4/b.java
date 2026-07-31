package i4;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3449a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3450b;

    public b(float[] fArr) {
        this.f3449a = fArr;
        this.f3450b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3449a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f8 = this.f3450b;
        float f9 = (f6 - (min * f8)) / f8;
        float f10 = fArr[min];
        return ((fArr[min + 1] - f10) * f9) + f10;
    }
}
