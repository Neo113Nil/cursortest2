package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f408a;

    /* renamed from: b, reason: collision with root package name */
    public float f409b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f410c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f408a = i;
        this.f410c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f410c;
        return interpolator != null ? interpolator.getInterpolation(this.f409b) : this.f409b;
    }

    public int c() {
        return this.f408a;
    }

    public void d(float f2) {
        this.f409b = f2;
    }
}
