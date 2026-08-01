package r1;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f3212a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3214c = null;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3215e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f3213b = 150;

    public f(long j2) {
        this.f3212a = j2;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f3212a);
        objectAnimator.setDuration(this.f3213b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.f3215e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f3214c;
        return timeInterpolator != null ? timeInterpolator : a.f3206b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3212a == fVar.f3212a && this.f3213b == fVar.f3213b && this.d == fVar.d && this.f3215e == fVar.f3215e) {
            return b().getClass().equals(fVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3212a;
        long j4 = this.f3213b;
        return ((((b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31)) * 31) + this.d) * 31) + this.f3215e;
    }

    public final String toString() {
        return "\n" + f.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3212a + " duration: " + this.f3213b + " interpolator: " + b().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3215e + "}\n";
    }
}
