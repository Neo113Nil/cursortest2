package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hm0 {

    /* renamed from: d, reason: collision with root package name */
    public static final hm0 f6333d = new hm0(new gk0[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final my3<hm0> f6334e = new my3() { // from class: com.google.android.gms.internal.ads.gl0
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f6335a;

    /* renamed from: b, reason: collision with root package name */
    private final gk0[] f6336b;

    /* renamed from: c, reason: collision with root package name */
    private int f6337c;

    public hm0(gk0... gk0VarArr) {
        this.f6336b = gk0VarArr;
        this.f6335a = gk0VarArr.length;
    }

    public final int a(gk0 gk0Var) {
        for (int i7 = 0; i7 < this.f6335a; i7++) {
            if (this.f6336b[i7] == gk0Var) {
                return i7;
            }
        }
        return -1;
    }

    public final gk0 b(int i7) {
        return this.f6336b[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hm0.class == obj.getClass()) {
            hm0 hm0Var = (hm0) obj;
            if (this.f6335a == hm0Var.f6335a && Arrays.equals(this.f6336b, hm0Var.f6336b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f6337c;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f6336b);
        this.f6337c = hashCode;
        return hashCode;
    }
}
