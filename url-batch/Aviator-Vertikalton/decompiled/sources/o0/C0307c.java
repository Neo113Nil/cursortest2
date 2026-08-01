package o0;

import android.animation.TimeInterpolator;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307c {

    /* renamed from: a, reason: collision with root package name */
    public long f3718a;

    /* renamed from: b, reason: collision with root package name */
    public long f3719b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3720c;

    /* renamed from: d, reason: collision with root package name */
    public int f3721d;

    /* renamed from: e, reason: collision with root package name */
    public int f3722e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3720c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0305a.f3713b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0307c)) {
            return false;
        }
        C0307c c0307c = (C0307c) obj;
        if (this.f3718a == c0307c.f3718a && this.f3719b == c0307c.f3719b && this.f3721d == c0307c.f3721d && this.f3722e == c0307c.f3722e) {
            return a().getClass().equals(c0307c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3718a;
        long j3 = this.f3719b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f3721d) * 31) + this.f3722e;
    }

    public final String toString() {
        return "\n" + C0307c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3718a + " duration: " + this.f3719b + " interpolator: " + a().getClass() + " repeatCount: " + this.f3721d + " repeatMode: " + this.f3722e + "}\n";
    }
}
