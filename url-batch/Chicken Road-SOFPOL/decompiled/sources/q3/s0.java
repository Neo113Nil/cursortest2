package q3;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f6154e;

    public s0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f6154e = windowInsetsAnimation;
    }

    @Override // q3.t0
    public final float a() {
        float alpha;
        alpha = this.f6154e.getAlpha();
        return alpha;
    }

    @Override // q3.t0
    public final long b() {
        long durationMillis;
        durationMillis = this.f6154e.getDurationMillis();
        return durationMillis;
    }

    @Override // q3.t0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f6154e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // q3.t0
    public final int d() {
        int typeMask;
        typeMask = this.f6154e.getTypeMask();
        return typeMask;
    }

    @Override // q3.t0
    public final void e(float f6) {
        this.f6154e.setFraction(f6);
    }
}
