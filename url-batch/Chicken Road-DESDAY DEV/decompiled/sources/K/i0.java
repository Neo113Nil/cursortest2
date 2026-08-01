package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f412a;

    /* renamed from: b, reason: collision with root package name */
    public float f413b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f414c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f412a = i;
        this.f414c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f414c;
        return interpolator != null ? interpolator.getInterpolation(this.f413b) : this.f413b;
    }

    public int c() {
        return this.f412a;
    }

    public void d(float f2) {
        this.f413b = f2;
    }
}
