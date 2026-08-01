package n0;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z0 extends a1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2857e;

    public z0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2857e = windowInsetsAnimation;
    }

    @Override // n0.a1
    public final float a() {
        float alpha;
        alpha = this.f2857e.getAlpha();
        return alpha;
    }

    @Override // n0.a1
    public final long b() {
        long durationMillis;
        durationMillis = this.f2857e.getDurationMillis();
        return durationMillis;
    }

    @Override // n0.a1
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f2857e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // n0.a1
    public final int d() {
        int typeMask;
        typeMask = this.f2857e.getTypeMask();
        return typeMask;
    }

    @Override // n0.a1
    public final void e(float f5) {
        this.f2857e.setFraction(f5);
    }
}
