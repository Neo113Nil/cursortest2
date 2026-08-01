package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f477a;

    /* renamed from: b, reason: collision with root package name */
    public float f478b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f479c;
    public final long d;

    public l0(int i, Interpolator interpolator, long j2) {
        this.f477a = i;
        this.f479c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f479c;
        return interpolator != null ? interpolator.getInterpolation(this.f478b) : this.f478b;
    }

    public int c() {
        return this.f477a;
    }

    public void d(float f2) {
        this.f478b = f2;
    }
}
