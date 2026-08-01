package r0;

import android.animation.TimeInterpolator;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262c {

    /* renamed from: a, reason: collision with root package name */
    public long f3425a;

    /* renamed from: b, reason: collision with root package name */
    public long f3426b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3427c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3428e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3427c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0260a.f3421b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0262c)) {
            return false;
        }
        C0262c c0262c = (C0262c) obj;
        if (this.f3425a == c0262c.f3425a && this.f3426b == c0262c.f3426b && this.d == c0262c.d && this.f3428e == c0262c.f3428e) {
            return a().getClass().equals(c0262c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3425a;
        long j3 = this.f3426b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3428e;
    }

    public final String toString() {
        return "\n" + C0262c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3425a + " duration: " + this.f3426b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3428e + "}\n";
    }
}
