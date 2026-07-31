package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qv0 {

    /* renamed from: e, reason: collision with root package name */
    public static final my3<qv0> f10844e = new my3() { // from class: com.google.android.gms.internal.ads.pu0
    };

    /* renamed from: a, reason: collision with root package name */
    private final gk0 f10845a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f10846b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10847c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f10848d;

    public qv0(gk0 gk0Var, int[] iArr, int i7, boolean[] zArr) {
        int i8 = gk0Var.f5673a;
        this.f10845a = gk0Var;
        this.f10846b = (int[]) iArr.clone();
        this.f10847c = i7;
        this.f10848d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qv0.class == obj.getClass()) {
            qv0 qv0Var = (qv0) obj;
            if (this.f10847c == qv0Var.f10847c && this.f10845a.equals(qv0Var.f10845a) && Arrays.equals(this.f10846b, qv0Var.f10846b) && Arrays.equals(this.f10848d, qv0Var.f10848d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10845a.hashCode() * 31) + Arrays.hashCode(this.f10846b)) * 31) + this.f10847c) * 31) + Arrays.hashCode(this.f10848d);
    }
}
