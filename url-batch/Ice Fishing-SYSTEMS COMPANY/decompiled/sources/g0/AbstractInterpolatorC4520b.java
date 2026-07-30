package g0;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.CL;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC4520b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37846a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37847b;

    public AbstractInterpolatorC4520b(float[] fArr) {
        this.f37846a = fArr;
        this.f37847b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f37846a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f9 = this.f37847b;
        float f10 = (f6 - (min * f9)) / f9;
        float f11 = fArr[min];
        return CL.a(fArr[min + 1], f11, f10, f11);
    }
}
