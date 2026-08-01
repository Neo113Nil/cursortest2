package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3355a;

    /* renamed from: b, reason: collision with root package name */
    public long f3356b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3357c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3358e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3357c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0280a.f3351b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3355a == cVar.f3355a && this.f3356b == cVar.f3356b && this.d == cVar.d && this.f3358e == cVar.f3358e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3355a;
        long j3 = this.f3356b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3358e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3355a + " duration: " + this.f3356b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3358e + "}\n";
    }
}
