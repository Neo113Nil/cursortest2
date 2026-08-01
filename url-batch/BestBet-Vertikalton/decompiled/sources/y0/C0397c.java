package y0;

import android.animation.TimeInterpolator;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397c {

    /* renamed from: a, reason: collision with root package name */
    public long f4575a;

    /* renamed from: b, reason: collision with root package name */
    public long f4576b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4577c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4578e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4577c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0395a.f4571b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0397c)) {
            return false;
        }
        C0397c c0397c = (C0397c) obj;
        if (this.f4575a == c0397c.f4575a && this.f4576b == c0397c.f4576b && this.d == c0397c.d && this.f4578e == c0397c.f4578e) {
            return a().getClass().equals(c0397c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4575a;
        long j3 = this.f4576b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f4578e;
    }

    public final String toString() {
        return "\n" + C0397c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4575a + " duration: " + this.f4576b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f4578e + "}\n";
    }
}
