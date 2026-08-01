package o0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3359a;

    /* renamed from: b, reason: collision with root package name */
    public long f3360b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3361c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3362e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3361c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0280a.f3355b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3359a == cVar.f3359a && this.f3360b == cVar.f3360b && this.d == cVar.d && this.f3362e == cVar.f3362e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3359a;
        long j3 = this.f3360b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f3362e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3359a + " duration: " + this.f3360b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f3362e + "}\n";
    }
}
