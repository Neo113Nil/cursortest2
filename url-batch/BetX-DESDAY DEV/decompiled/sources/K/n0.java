package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f476a;

    /* renamed from: b, reason: collision with root package name */
    public float f477b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f478c;

    /* renamed from: d, reason: collision with root package name */
    public final long f479d;

    public n0(int i, Interpolator interpolator, long j2) {
        this.f476a = i;
        this.f478c = interpolator;
        this.f479d = j2;
    }

    public long a() {
        return this.f479d;
    }

    public float b() {
        Interpolator interpolator = this.f478c;
        return interpolator != null ? interpolator.getInterpolation(this.f477b) : this.f477b;
    }

    public int c() {
        return this.f476a;
    }

    public void d(float f2) {
        this.f477b = f2;
    }
}
