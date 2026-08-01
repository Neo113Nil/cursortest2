package M;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f556a;

    /* renamed from: b, reason: collision with root package name */
    public float f557b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f558c;
    public final long d;

    public h0(int i, Interpolator interpolator, long j2) {
        this.f556a = i;
        this.f558c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f558c;
        return interpolator != null ? interpolator.getInterpolation(this.f557b) : this.f557b;
    }

    public int c() {
        return this.f556a;
    }

    public void d(float f2) {
        this.f557b = f2;
    }
}
