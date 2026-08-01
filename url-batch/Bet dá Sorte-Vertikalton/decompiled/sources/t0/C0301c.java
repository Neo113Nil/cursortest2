package t0;

import android.animation.TimeInterpolator;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301c {

    /* renamed from: a, reason: collision with root package name */
    public long f3827a;

    /* renamed from: b, reason: collision with root package name */
    public long f3828b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3829c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3830e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3829c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0299a.f3823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0301c)) {
            return false;
        }
        C0301c c0301c = (C0301c) obj;
        if (this.f3827a == c0301c.f3827a && this.f3828b == c0301c.f3828b && this.d == c0301c.d && this.f3830e == c0301c.f3830e) {
            return a().getClass().equals(c0301c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3827a;
        long j3 = this.f3828b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3830e;
    }

    public final String toString() {
        return "\n" + C0301c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3827a + " duration: " + this.f3828b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3830e + "}\n";
    }
}
