package N;

import android.view.animation.Interpolator;

/* renamed from: N.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC0060q implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
