package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qd4 {

    /* renamed from: c, reason: collision with root package name */
    public static final qd4 f10660c = new qd4(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f10661a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10662b;

    public qd4(long j7, long j8) {
        this.f10661a = j7;
        this.f10662b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qd4.class == obj.getClass()) {
            qd4 qd4Var = (qd4) obj;
            if (this.f10661a == qd4Var.f10661a && this.f10662b == qd4Var.f10662b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10661a) * 31) + ((int) this.f10662b);
    }

    public final String toString() {
        long j7 = this.f10661a;
        long j8 = this.f10662b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j7);
        sb.append(", position=");
        sb.append(j8);
        sb.append("]");
        return sb.toString();
    }
}
