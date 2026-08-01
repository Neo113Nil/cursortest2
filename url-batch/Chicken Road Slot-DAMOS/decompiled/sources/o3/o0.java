package o3;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f7429e;

    public o0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f7429e = windowInsetsAnimation;
    }

    @Override // o3.p0
    public final float a() {
        float alpha;
        alpha = this.f7429e.getAlpha();
        return alpha;
    }

    @Override // o3.p0
    public final long b() {
        long durationMillis;
        durationMillis = this.f7429e.getDurationMillis();
        return durationMillis;
    }

    @Override // o3.p0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f7429e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // o3.p0
    public final int d() {
        int typeMask;
        typeMask = this.f7429e.getTypeMask();
        return typeMask;
    }

    @Override // o3.p0
    public final void e(float f3) {
        this.f7429e.setFraction(f3);
    }
}
