package c1;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class D extends E {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f5553d;

    public D(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f5553d = windowInsetsAnimation;
    }

    @Override // c1.E
    public final long a() {
        long durationMillis;
        durationMillis = this.f5553d.getDurationMillis();
        return durationMillis;
    }

    @Override // c1.E
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f5553d.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // c1.E
    public final void c(float f3) {
        this.f5553d.setFraction(f3);
    }
}
