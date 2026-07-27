package a1;

import android.view.animation.Interpolator;

/* renamed from: a1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0367C {

    /* renamed from: a, reason: collision with root package name */
    public float f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f4837b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4838c;

    public AbstractC0367C(Interpolator interpolator, long j4) {
        this.f4837b = interpolator;
        this.f4838c = j4;
    }

    public long a() {
        return this.f4838c;
    }

    public float b() {
        Interpolator interpolator = this.f4837b;
        return interpolator != null ? interpolator.getInterpolation(this.f4836a) : this.f4836a;
    }

    public void c(float f4) {
        this.f4836a = f4;
    }
}
