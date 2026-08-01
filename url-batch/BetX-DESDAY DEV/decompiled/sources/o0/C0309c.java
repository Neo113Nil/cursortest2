package o0;

import android.animation.TimeInterpolator;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309c {

    /* renamed from: a, reason: collision with root package name */
    public long f3722a;

    /* renamed from: b, reason: collision with root package name */
    public long f3723b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3724c;

    /* renamed from: d, reason: collision with root package name */
    public int f3725d;

    /* renamed from: e, reason: collision with root package name */
    public int f3726e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3724c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0307a.f3717b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0309c)) {
            return false;
        }
        C0309c c0309c = (C0309c) obj;
        if (this.f3722a == c0309c.f3722a && this.f3723b == c0309c.f3723b && this.f3725d == c0309c.f3725d && this.f3726e == c0309c.f3726e) {
            return a().getClass().equals(c0309c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3722a;
        long j3 = this.f3723b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f3725d) * 31) + this.f3726e;
    }

    public final String toString() {
        return "\n" + C0309c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3722a + " duration: " + this.f3723b + " interpolator: " + a().getClass() + " repeatCount: " + this.f3725d + " repeatMode: " + this.f3726e + "}\n";
    }
}
