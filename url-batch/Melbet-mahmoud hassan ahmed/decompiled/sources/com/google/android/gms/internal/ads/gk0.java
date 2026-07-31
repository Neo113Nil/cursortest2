package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gk0 {

    /* renamed from: d, reason: collision with root package name */
    public static final my3<gk0> f5672d = new my3() { // from class: com.google.android.gms.internal.ads.fj0
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f5673a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final c0[] f5674b;

    /* renamed from: c, reason: collision with root package name */
    private int f5675c;

    public gk0(c0... c0VarArr) {
        this.f5674b = c0VarArr;
        c(c0VarArr[0].f3651c);
        int i7 = c0VarArr[0].f3653e;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final int a(c0 c0Var) {
        for (int i7 = 0; i7 <= 0; i7++) {
            if (c0Var == this.f5674b[i7]) {
                return i7;
            }
        }
        return -1;
    }

    public final c0 b(int i7) {
        return this.f5674b[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gk0.class == obj.getClass() && Arrays.equals(this.f5674b, ((gk0) obj).f5674b);
    }

    public final int hashCode() {
        int i7 = this.f5675c;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f5674b) + 527;
        this.f5675c = hashCode;
        return hashCode;
    }
}
