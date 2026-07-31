package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class lp3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8043a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8044b;

    lp3(Object obj, int i7) {
        this.f8043a = obj;
        this.f8044b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lp3)) {
            return false;
        }
        lp3 lp3Var = (lp3) obj;
        return this.f8043a == lp3Var.f8043a && this.f8044b == lp3Var.f8044b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8043a) * 65535) + this.f8044b;
    }
}
