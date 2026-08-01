package q0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3389a;

    /* renamed from: b, reason: collision with root package name */
    public long f3390b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3391c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3392e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3391c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0292a.f3385b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3389a == cVar.f3389a && this.f3390b == cVar.f3390b && this.d == cVar.d && this.f3392e == cVar.f3392e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3389a;
        long j3 = this.f3390b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3392e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3389a + " duration: " + this.f3390b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3392e + "}\n";
    }
}
