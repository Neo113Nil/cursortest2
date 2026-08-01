package o3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7431a;

    /* renamed from: b, reason: collision with root package name */
    public float f7432b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f7433c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7434d;

    public p0(int i3, Interpolator interpolator, long j) {
        this.f7431a = i3;
        this.f7433c = interpolator;
        this.f7434d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f7434d;
    }

    public float c() {
        float f3 = this.f7432b;
        Interpolator interpolator = this.f7433c;
        return interpolator != null ? interpolator.getInterpolation(f3) : f3;
    }

    public int d() {
        return this.f7431a;
    }

    public void e(float f3) {
        this.f7432b = f3;
    }
}
