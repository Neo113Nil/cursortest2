package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f405a;

    /* renamed from: b, reason: collision with root package name */
    public float f406b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f407c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f405a = i;
        this.f407c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f407c;
        return interpolator != null ? interpolator.getInterpolation(this.f406b) : this.f406b;
    }

    public int c() {
        return this.f405a;
    }

    public void d(float f2) {
        this.f406b = f2;
    }
}
