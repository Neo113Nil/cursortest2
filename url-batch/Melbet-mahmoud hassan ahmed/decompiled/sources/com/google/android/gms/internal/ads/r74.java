package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r74 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11047a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11048b;

    public r74(long j7, long j8) {
        this.f11047a = j7;
        this.f11048b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r74)) {
            return false;
        }
        r74 r74Var = (r74) obj;
        return this.f11047a == r74Var.f11047a && this.f11048b == r74Var.f11048b;
    }

    public final int hashCode() {
        return (((int) this.f11047a) * 31) + ((int) this.f11048b);
    }
}
