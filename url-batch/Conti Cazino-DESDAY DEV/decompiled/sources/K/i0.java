package K;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class i0 extends j0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f423e;

    public i0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f423e = windowInsetsAnimation;
    }

    @Override // K.j0
    public final long a() {
        long durationMillis;
        durationMillis = this.f423e.getDurationMillis();
        return durationMillis;
    }

    @Override // K.j0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f423e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // K.j0
    public final int c() {
        int typeMask;
        typeMask = this.f423e.getTypeMask();
        return typeMask;
    }

    @Override // K.j0
    public final void d(float f2) {
        this.f423e.setFraction(f2);
    }
}
