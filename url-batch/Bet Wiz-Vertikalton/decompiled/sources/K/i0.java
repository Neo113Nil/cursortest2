package K;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f465a;

    /* renamed from: b, reason: collision with root package name */
    public float f466b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f467c;
    public final long d;

    public i0(int i, Interpolator interpolator, long j2) {
        this.f465a = i;
        this.f467c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f467c;
        return interpolator != null ? interpolator.getInterpolation(this.f466b) : this.f466b;
    }

    public int c() {
        return this.f465a;
    }

    public void d(float f2) {
        this.f466b = f2;
    }
}
