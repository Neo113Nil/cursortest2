package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f425a;

    /* renamed from: b, reason: collision with root package name */
    public float f426b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f427c;
    public final long d;

    public j0(int i, Interpolator interpolator, long j2) {
        this.f425a = i;
        this.f427c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f427c;
        return interpolator != null ? interpolator.getInterpolation(this.f426b) : this.f426b;
    }

    public int c() {
        return this.f425a;
    }

    public void d(float f2) {
        this.f426b = f2;
    }
}
