package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f494a;

    /* renamed from: b, reason: collision with root package name */
    public float f495b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f496c;
    public final long d;

    public l0(int i, Interpolator interpolator, long j2) {
        this.f494a = i;
        this.f496c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f496c;
        return interpolator != null ? interpolator.getInterpolation(this.f495b) : this.f495b;
    }

    public int c() {
        return this.f494a;
    }

    public void d(float f2) {
        this.f495b = f2;
    }
}
