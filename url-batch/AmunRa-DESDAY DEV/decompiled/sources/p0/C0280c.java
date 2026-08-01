package p0;

import android.animation.TimeInterpolator;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280c {

    /* renamed from: a, reason: collision with root package name */
    public long f3460a;

    /* renamed from: b, reason: collision with root package name */
    public long f3461b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3462c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3463e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3462c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0278a.f3456b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0280c)) {
            return false;
        }
        C0280c c0280c = (C0280c) obj;
        if (this.f3460a == c0280c.f3460a && this.f3461b == c0280c.f3461b && this.d == c0280c.d && this.f3463e == c0280c.f3463e) {
            return a().getClass().equals(c0280c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3460a;
        long j3 = this.f3461b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3463e;
    }

    public final String toString() {
        return "\n" + C0280c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3460a + " duration: " + this.f3461b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3463e + "}\n";
    }
}
