package n0;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w0 extends x0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2798e;

    public w0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2798e = windowInsetsAnimation;
    }

    @Override // n0.x0
    public final float a() {
        float alpha;
        alpha = this.f2798e.getAlpha();
        return alpha;
    }

    @Override // n0.x0
    public final long b() {
        long durationMillis;
        durationMillis = this.f2798e.getDurationMillis();
        return durationMillis;
    }

    @Override // n0.x0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f2798e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // n0.x0
    public final int d() {
        int typeMask;
        typeMask = this.f2798e.getTypeMask();
        return typeMask;
    }

    @Override // n0.x0
    public final void e(float f2) {
        this.f2798e.setFraction(f2);
    }
}
