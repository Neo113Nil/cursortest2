package k0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2784a;

    /* renamed from: b, reason: collision with root package name */
    public float f2785b;
    public final Interpolator c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2786d;

    public v0(int i4, Interpolator interpolator, long j4) {
        this.f2784a = i4;
        this.c = interpolator;
        this.f2786d = j4;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f2786d;
    }

    public float c() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.f2785b) : this.f2785b;
    }

    public int d() {
        return this.f2784a;
    }

    public void e(float f4) {
        this.f2785b = f4;
    }
}
