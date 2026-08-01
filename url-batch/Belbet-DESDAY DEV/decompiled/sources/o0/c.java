package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3360a;

    /* renamed from: b, reason: collision with root package name */
    public long f3361b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3362c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3363e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3362c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0280a.f3356b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3360a == cVar.f3360a && this.f3361b == cVar.f3361b && this.d == cVar.d && this.f3363e == cVar.f3363e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3360a;
        long j3 = this.f3361b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3363e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3360a + " duration: " + this.f3361b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3363e + "}\n";
    }
}
