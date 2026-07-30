package O;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class l0 extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2290e;

    public l0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2290e = windowInsetsAnimation;
    }

    @Override // O.m0
    public final long a() {
        long durationMillis;
        durationMillis = this.f2290e.getDurationMillis();
        return durationMillis;
    }

    @Override // O.m0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f2290e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // O.m0
    public final int c() {
        int typeMask;
        typeMask = this.f2290e.getTypeMask();
        return typeMask;
    }

    @Override // O.m0
    public final void d(float f6) {
        this.f2290e.setFraction(f6);
    }
}
