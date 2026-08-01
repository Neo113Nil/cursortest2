package L;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class k0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f541e;

    public k0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f541e = windowInsetsAnimation;
    }

    @Override // L.l0
    public final long a() {
        long durationMillis;
        durationMillis = this.f541e.getDurationMillis();
        return durationMillis;
    }

    @Override // L.l0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f541e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // L.l0
    public final int c() {
        int typeMask;
        typeMask = this.f541e.getTypeMask();
        return typeMask;
    }

    @Override // L.l0
    public final void d(float f2) {
        this.f541e.setFraction(f2);
    }
}
