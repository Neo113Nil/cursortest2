package K;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class k0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f473e;

    public k0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f473e = windowInsetsAnimation;
    }

    @Override // K.l0
    public final long a() {
        long durationMillis;
        durationMillis = this.f473e.getDurationMillis();
        return durationMillis;
    }

    @Override // K.l0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f473e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // K.l0
    public final int c() {
        int typeMask;
        typeMask = this.f473e.getTypeMask();
        return typeMask;
    }

    @Override // K.l0
    public final void d(float f2) {
        this.f473e.setFraction(f2);
    }
}
