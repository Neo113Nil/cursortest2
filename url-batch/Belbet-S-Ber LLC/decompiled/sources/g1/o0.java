package g1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o0 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1748a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        switch (this.f1748a) {
        }
        float f6 = f5 - 1.0f;
        return (f6 * f6 * f6 * f6 * f6) + 1.0f;
    }
}
