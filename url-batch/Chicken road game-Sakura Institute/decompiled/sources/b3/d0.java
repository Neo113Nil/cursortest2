package b3;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f1317d;

    public d0(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f1317d = windowInsetsAnimation;
    }

    @Override // b3.e0
    public final long a() {
        long durationMillis;
        durationMillis = this.f1317d.getDurationMillis();
        return durationMillis;
    }

    @Override // b3.e0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f1317d.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // b3.e0
    public final void c(float f9) {
        this.f1317d.setFraction(f9);
    }
}
