package a1;

import android.view.WindowInsetsAnimation;

/* renamed from: a1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366B extends AbstractC0367C {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f4835d;

    public C0366B(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f4835d = windowInsetsAnimation;
    }

    @Override // a1.AbstractC0367C
    public final long a() {
        long durationMillis;
        durationMillis = this.f4835d.getDurationMillis();
        return durationMillis;
    }

    @Override // a1.AbstractC0367C
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f4835d.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // a1.AbstractC0367C
    public final void c(float f4) {
        this.f4835d.setFraction(f4);
    }
}
