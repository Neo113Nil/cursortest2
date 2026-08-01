package p0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3291a;

    /* renamed from: b, reason: collision with root package name */
    public long f3292b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3293c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3294e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3293c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0280a.f3287b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3291a == cVar.f3291a && this.f3292b == cVar.f3292b && this.d == cVar.d && this.f3294e == cVar.f3294e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3291a;
        long j3 = this.f3292b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3294e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3291a + " duration: " + this.f3292b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3294e + "}\n";
    }
}
