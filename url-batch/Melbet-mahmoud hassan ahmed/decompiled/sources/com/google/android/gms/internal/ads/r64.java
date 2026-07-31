package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class r64 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11042a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11043b;

    public r64(int i7, boolean z6) {
        this.f11042a = i7;
        this.f11043b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r64.class == obj.getClass()) {
            r64 r64Var = (r64) obj;
            if (this.f11042a == r64Var.f11042a && this.f11043b == r64Var.f11043b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11042a * 31) + (this.f11043b ? 1 : 0);
    }
}
