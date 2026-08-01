package m1;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f2910a;

    /* renamed from: b, reason: collision with root package name */
    public long f2911b;
    public TimeInterpolator c;

    /* renamed from: d, reason: collision with root package name */
    public int f2912d;

    /* renamed from: e, reason: collision with root package name */
    public int f2913e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.f2906b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2910a == cVar.f2910a && this.f2911b == cVar.f2911b && this.f2912d == cVar.f2912d && this.f2913e == cVar.f2913e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2910a;
        long j5 = this.f2911b;
        return ((((a().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.f2912d) * 31) + this.f2913e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f2910a + " duration: " + this.f2911b + " interpolator: " + a().getClass() + " repeatCount: " + this.f2912d + " repeatMode: " + this.f2913e + "}\n";
    }
}
