package M;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class g0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f549e;

    public g0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f549e = windowInsetsAnimation;
    }

    @Override // M.h0
    public final long a() {
        long durationMillis;
        durationMillis = this.f549e.getDurationMillis();
        return durationMillis;
    }

    @Override // M.h0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f549e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // M.h0
    public final int c() {
        int typeMask;
        typeMask = this.f549e.getTypeMask();
        return typeMask;
    }

    @Override // M.h0
    public final void d(float f2) {
        this.f549e.setFraction(f2);
    }
}
