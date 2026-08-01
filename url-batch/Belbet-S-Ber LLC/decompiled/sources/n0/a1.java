package n0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2753a;

    /* renamed from: b, reason: collision with root package name */
    public float f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2755c;
    public final long d;

    public a1(int i, Interpolator interpolator, long j2) {
        this.f2753a = i;
        this.f2755c = interpolator;
        this.d = j2;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        Interpolator interpolator = this.f2755c;
        return interpolator != null ? interpolator.getInterpolation(this.f2754b) : this.f2754b;
    }

    public int d() {
        return this.f2753a;
    }

    public void e(float f5) {
        this.f2754b = f5;
    }
}
