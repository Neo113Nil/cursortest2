package n0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2799a;

    /* renamed from: b, reason: collision with root package name */
    public float f2800b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2801c;
    public final long d;

    public x0(int i, Interpolator interpolator, long j4) {
        this.f2799a = i;
        this.f2801c = interpolator;
        this.d = j4;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        Interpolator interpolator = this.f2801c;
        return interpolator != null ? interpolator.getInterpolation(this.f2800b) : this.f2800b;
    }

    public int d() {
        return this.f2799a;
    }

    public void e(float f2) {
        this.f2800b = f2;
    }
}
