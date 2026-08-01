package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f475a;

    /* renamed from: b, reason: collision with root package name */
    public float f476b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f477c;

    /* renamed from: d, reason: collision with root package name */
    public final long f478d;

    public n0(int i, Interpolator interpolator, long j2) {
        this.f475a = i;
        this.f477c = interpolator;
        this.f478d = j2;
    }

    public long a() {
        return this.f478d;
    }

    public float b() {
        Interpolator interpolator = this.f477c;
        return interpolator != null ? interpolator.getInterpolation(this.f476b) : this.f476b;
    }

    public int c() {
        return this.f475a;
    }

    public void d(float f2) {
        this.f476b = f2;
    }
}
