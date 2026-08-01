package a1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f103a;

    /* renamed from: b, reason: collision with root package name */
    public final float f104b;

    public b(float[] fArr) {
        this.f103a = fArr;
        this.f104b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f103a;
        int min = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f6 = this.f104b;
        float f7 = (f5 - (min * f6)) / f6;
        float f8 = fArr[min];
        return ((fArr[min + 1] - f8) * f7) + f8;
    }
}
