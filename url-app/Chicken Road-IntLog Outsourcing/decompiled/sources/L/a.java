package L;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1459a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        switch (this.f1459a) {
            case 0:
                float f6 = f3 - 1.0f;
                return (f6 * f6 * f6 * f6 * f6) + 1.0f;
            default:
                float f7 = f3 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }
}
