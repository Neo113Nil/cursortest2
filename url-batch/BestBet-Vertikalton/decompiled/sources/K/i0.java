package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f625a;

    /* renamed from: b, reason: collision with root package name */
    public float f626b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f627c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f625a = i;
        this.f627c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f627c;
        return interpolator != null ? interpolator.getInterpolation(this.f626b) : this.f626b;
    }

    public int c() {
        return this.f625a;
    }

    public void d(float f2) {
        this.f626b = f2;
    }
}
