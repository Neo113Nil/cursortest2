package u0;

import android.animation.TimeInterpolator;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391c {

    /* renamed from: a, reason: collision with root package name */
    public long f4375a;

    /* renamed from: b, reason: collision with root package name */
    public long f4376b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4377c;

    /* renamed from: d, reason: collision with root package name */
    public int f4378d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4377c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0389a.f4370b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0391c)) {
            return false;
        }
        C0391c c0391c = (C0391c) obj;
        if (this.f4375a == c0391c.f4375a && this.f4376b == c0391c.f4376b && this.f4378d == c0391c.f4378d && this.e == c0391c.e) {
            return a().getClass().equals(c0391c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4375a;
        long j2 = this.f4376b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f4378d) * 31) + this.e;
    }

    public final String toString() {
        return "\n" + C0391c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4375a + " duration: " + this.f4376b + " interpolator: " + a().getClass() + " repeatCount: " + this.f4378d + " repeatMode: " + this.e + "}\n";
    }
}
