package L;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        float f8 = f7 - 1.0f;
        return (f8 * f8 * f8 * f8 * f8) + 1.0f;
    }
}
