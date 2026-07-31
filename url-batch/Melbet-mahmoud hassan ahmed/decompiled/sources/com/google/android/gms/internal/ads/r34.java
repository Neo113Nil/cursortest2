package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r34 {

    /* renamed from: d, reason: collision with root package name */
    public static final r34 f11016d = new r34(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final my3<r34> f11017e = new my3() { // from class: com.google.android.gms.internal.ads.q24
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f11018a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f11019b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11020c;

    public r34(int i7, int i8, int i9) {
        this.f11019b = i8;
        this.f11020c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return false;
        }
        r34 r34Var = (r34) obj;
        int i7 = r34Var.f11018a;
        return this.f11019b == r34Var.f11019b && this.f11020c == r34Var.f11020c;
    }

    public final int hashCode() {
        return ((this.f11019b + 16337) * 31) + this.f11020c;
    }
}
