package c1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public float f5554a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f5555b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5556c;

    public E(Interpolator interpolator, long j3) {
        this.f5555b = interpolator;
        this.f5556c = j3;
    }

    public long a() {
        return this.f5556c;
    }

    public float b() {
        Interpolator interpolator = this.f5555b;
        return interpolator != null ? interpolator.getInterpolation(this.f5554a) : this.f5554a;
    }

    public void c(float f3) {
        this.f5554a = f3;
    }
}
