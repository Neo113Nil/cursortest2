package q0;

import android.animation.TimeInterpolator;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291c {

    /* renamed from: a, reason: collision with root package name */
    public long f3503a;

    /* renamed from: b, reason: collision with root package name */
    public long f3504b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3505c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3506e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3505c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0289a.f3499b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0291c)) {
            return false;
        }
        C0291c c0291c = (C0291c) obj;
        if (this.f3503a == c0291c.f3503a && this.f3504b == c0291c.f3504b && this.d == c0291c.d && this.f3506e == c0291c.f3506e) {
            return a().getClass().equals(c0291c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3503a;
        long j3 = this.f3504b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3506e;
    }

    public final String toString() {
        return "\n" + C0291c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3503a + " duration: " + this.f3504b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3506e + "}\n";
    }
}
