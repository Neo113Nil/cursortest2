package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3337a;

    /* renamed from: b, reason: collision with root package name */
    public long f3338b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3339c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3340e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3339c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0280a.f3333b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3337a == cVar.f3337a && this.f3338b == cVar.f3338b && this.d == cVar.d && this.f3340e == cVar.f3340e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3337a;
        long j3 = this.f3338b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3340e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3337a + " duration: " + this.f3338b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3340e + "}\n";
    }
}
