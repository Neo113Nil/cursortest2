package o1;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f2869a;

    /* renamed from: b, reason: collision with root package name */
    public long f2870b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f2871c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2872e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f2871c;
        return timeInterpolator != null ? timeInterpolator : a.f2865b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2869a == cVar.f2869a && this.f2870b == cVar.f2870b && this.d == cVar.d && this.f2872e == cVar.f2872e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2869a;
        long j5 = this.f2870b;
        return ((((a().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.d) * 31) + this.f2872e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f2869a + " duration: " + this.f2870b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f2872e + "}\n";
    }
}
