package w0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3584a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3585b;

    public b(float[] fArr) {
        this.f3584a = fArr;
        this.f3585b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3584a;
        int min = Math.min((int) ((fArr.length - 1) * f4), fArr.length - 2);
        float f5 = this.f3585b;
        float f6 = (f4 - (min * f5)) / f5;
        float f7 = fArr[min];
        return ((fArr[min + 1] - f7) * f6) + f7;
    }
}
