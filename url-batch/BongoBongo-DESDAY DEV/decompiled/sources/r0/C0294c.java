package r0;

import android.animation.TimeInterpolator;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294c {

    /* renamed from: a, reason: collision with root package name */
    public long f3571a;

    /* renamed from: b, reason: collision with root package name */
    public long f3572b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3573c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3574e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3573c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0292a.f3567b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0294c)) {
            return false;
        }
        C0294c c0294c = (C0294c) obj;
        if (this.f3571a == c0294c.f3571a && this.f3572b == c0294c.f3572b && this.d == c0294c.d && this.f3574e == c0294c.f3574e) {
            return a().getClass().equals(c0294c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3571a;
        long j3 = this.f3572b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3574e;
    }

    public final String toString() {
        return "\n" + C0294c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3571a + " duration: " + this.f3572b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3574e + "}\n";
    }
}
