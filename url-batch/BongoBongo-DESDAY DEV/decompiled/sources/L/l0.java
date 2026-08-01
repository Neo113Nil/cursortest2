package L;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f545a;

    /* renamed from: b, reason: collision with root package name */
    public float f546b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f547c;
    public final long d;

    public l0(int i, Interpolator interpolator, long j2) {
        this.f545a = i;
        this.f547c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f547c;
        return interpolator != null ? interpolator.getInterpolation(this.f546b) : this.f546b;
    }

    public int c() {
        return this.f545a;
    }

    public void d(float f2) {
        this.f546b = f2;
    }
}
