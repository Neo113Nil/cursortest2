package v0;

import android.animation.TimeInterpolator;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374c {

    /* renamed from: a, reason: collision with root package name */
    public long f3986a;

    /* renamed from: b, reason: collision with root package name */
    public long f3987b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3988c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3989e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3988c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0372a.f3982b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0374c)) {
            return false;
        }
        C0374c c0374c = (C0374c) obj;
        if (this.f3986a == c0374c.f3986a && this.f3987b == c0374c.f3987b && this.d == c0374c.d && this.f3989e == c0374c.f3989e) {
            return a().getClass().equals(c0374c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3986a;
        long j3 = this.f3987b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3989e;
    }

    public final String toString() {
        return "\n" + C0374c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3986a + " duration: " + this.f3987b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3989e + "}\n";
    }
}
