package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f394a;

    /* renamed from: b, reason: collision with root package name */
    public float f395b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f396c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f394a = i;
        this.f396c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f396c;
        return interpolator != null ? interpolator.getInterpolation(this.f395b) : this.f395b;
    }

    public int c() {
        return this.f394a;
    }

    public void d(float f2) {
        this.f395b = f2;
    }
}
