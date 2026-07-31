package a1;

import android.view.animation.Interpolator;

/* renamed from: a1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0161C {

    /* renamed from: a, reason: collision with root package name */
    public float f3508a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f3509b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3510c;

    public AbstractC0161C(Interpolator interpolator, long j3) {
        this.f3509b = interpolator;
        this.f3510c = j3;
    }

    public long a() {
        return this.f3510c;
    }

    public float b() {
        Interpolator interpolator = this.f3509b;
        return interpolator != null ? interpolator.getInterpolation(this.f3508a) : this.f3508a;
    }

    public void c(float f3) {
        this.f3508a = f3;
    }
}
