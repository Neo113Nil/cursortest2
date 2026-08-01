package p0;

import android.animation.TimeInterpolator;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283c {

    /* renamed from: a, reason: collision with root package name */
    public long f3385a;

    /* renamed from: b, reason: collision with root package name */
    public long f3386b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3387c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3388e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3387c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0281a.f3381b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0283c)) {
            return false;
        }
        C0283c c0283c = (C0283c) obj;
        if (this.f3385a == c0283c.f3385a && this.f3386b == c0283c.f3386b && this.d == c0283c.d && this.f3388e == c0283c.f3388e) {
            return a().getClass().equals(c0283c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3385a;
        long j3 = this.f3386b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3388e;
    }

    public final String toString() {
        return "\n" + C0283c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3385a + " duration: " + this.f3386b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3388e + "}\n";
    }
}
