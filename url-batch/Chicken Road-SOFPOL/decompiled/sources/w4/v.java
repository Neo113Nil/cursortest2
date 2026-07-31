package w4;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8049a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        switch (this.f8049a) {
        }
        float f8 = f6 - 1.0f;
        return (f8 * f8 * f8 * f8 * f8) + 1.0f;
    }
}
