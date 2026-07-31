package q3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6155a;

    /* renamed from: b, reason: collision with root package name */
    public float f6156b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f6157c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6158d;

    public t0(int i, Interpolator interpolator, long j7) {
        this.f6155a = i;
        this.f6157c = interpolator;
        this.f6158d = j7;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f6158d;
    }

    public float c() {
        Interpolator interpolator = this.f6157c;
        return interpolator != null ? interpolator.getInterpolation(this.f6156b) : this.f6156b;
    }

    public int d() {
        return this.f6155a;
    }

    public void e(float f6) {
        this.f6156b = f6;
    }
}
