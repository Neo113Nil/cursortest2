package M;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f744a;

    /* renamed from: b, reason: collision with root package name */
    public float f745b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f746c;

    /* renamed from: d, reason: collision with root package name */
    public final long f747d;

    public f0(int i, Interpolator interpolator, long j) {
        this.f744a = i;
        this.f746c = interpolator;
        this.f747d = j;
    }

    public long a() {
        return this.f747d;
    }

    public float b() {
        Interpolator interpolator = this.f746c;
        return interpolator != null ? interpolator.getInterpolation(this.f745b) : this.f745b;
    }

    public int c() {
        return this.f744a;
    }

    public void d(float f2) {
        this.f745b = f2;
    }
}
