package l1;

import android.view.animation.Interpolator;

/* renamed from: l1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC1267n implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        float f5 = f4 - 1.0f;
        return (f5 * f5 * f5 * f5 * f5) + 1.0f;
    }
}
