package g5;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f3037a;

    /* renamed from: b, reason: collision with root package name */
    public long f3038b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3039c;

    /* renamed from: d, reason: collision with root package name */
    public int f3040d;

    /* renamed from: e, reason: collision with root package name */
    public int f3041e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3039c;
        return timeInterpolator != null ? timeInterpolator : a.f3032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3037a == cVar.f3037a && this.f3038b == cVar.f3038b && this.f3040d == cVar.f3040d && this.f3041e == cVar.f3041e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f3037a;
        long j8 = this.f3038b;
        return ((((a().getClass().hashCode() + (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31)) * 31) + this.f3040d) * 31) + this.f3041e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3037a + " duration: " + this.f3038b + " interpolator: " + a().getClass() + " repeatCount: " + this.f3040d + " repeatMode: " + this.f3041e + "}\n";
    }
}
