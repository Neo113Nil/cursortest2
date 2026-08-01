package M;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class e0 extends f0 {
    public final WindowInsetsAnimation e;

    public e0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // M.f0
    public final long a() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // M.f0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // M.f0
    public final int c() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // M.f0
    public final void d(float f2) {
        this.e.setFraction(f2);
    }
}
