package a1;

import android.view.WindowInsetsAnimation;

/* renamed from: a1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160B extends AbstractC0161C {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f3507d;

    public C0160B(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f3507d = windowInsetsAnimation;
    }

    @Override // a1.AbstractC0161C
    public final long a() {
        long durationMillis;
        durationMillis = this.f3507d.getDurationMillis();
        return durationMillis;
    }

    @Override // a1.AbstractC0161C
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f3507d.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // a1.AbstractC0161C
    public final void c(float f3) {
        this.f3507d.setFraction(f3);
    }
}
