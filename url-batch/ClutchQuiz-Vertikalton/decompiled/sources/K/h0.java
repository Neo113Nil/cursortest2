package K;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class h0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f401e;

    public h0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f401e = windowInsetsAnimation;
    }

    @Override // K.i0
    public final long a() {
        long durationMillis;
        durationMillis = this.f401e.getDurationMillis();
        return durationMillis;
    }

    @Override // K.i0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f401e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // K.i0
    public final int c() {
        int typeMask;
        typeMask = this.f401e.getTypeMask();
        return typeMask;
    }

    @Override // K.i0
    public final void d(float f2) {
        this.f401e.setFraction(f2);
    }
}
