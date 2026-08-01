package k0;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u0 extends v0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2783e;

    public u0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2783e = windowInsetsAnimation;
    }

    @Override // k0.v0
    public final float a() {
        float alpha;
        alpha = this.f2783e.getAlpha();
        return alpha;
    }

    @Override // k0.v0
    public final long b() {
        long durationMillis;
        durationMillis = this.f2783e.getDurationMillis();
        return durationMillis;
    }

    @Override // k0.v0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f2783e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // k0.v0
    public final int d() {
        int typeMask;
        typeMask = this.f2783e.getTypeMask();
        return typeMask;
    }

    @Override // k0.v0
    public final void e(float f4) {
        this.f2783e.setFraction(f4);
    }
}
