package O;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1881a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.f1881a) {
        }
        float f8 = f7 - 1.0f;
        return (f8 * f8 * f8 * f8 * f8) + 1.0f;
    }
}
