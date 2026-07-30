package b3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public float f1319a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f1320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1321c;

    public e0(Interpolator interpolator, long j8) {
        this.f1320b = interpolator;
        this.f1321c = j8;
    }

    public long a() {
        return this.f1321c;
    }

    public float b() {
        Interpolator interpolator = this.f1320b;
        return interpolator != null ? interpolator.getInterpolation(this.f1319a) : this.f1319a;
    }

    public void c(float f9) {
        this.f1319a = f9;
    }
}
