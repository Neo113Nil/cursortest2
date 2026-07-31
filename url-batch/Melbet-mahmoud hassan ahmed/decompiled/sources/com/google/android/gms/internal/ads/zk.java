package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zk {

    /* renamed from: a, reason: collision with root package name */
    public final int f15166a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final xe[] f15167b;

    /* renamed from: c, reason: collision with root package name */
    private int f15168c;

    public zk(xe... xeVarArr) {
        this.f15167b = xeVarArr;
    }

    public final int a(xe xeVar) {
        for (int i7 = 0; i7 <= 0; i7++) {
            if (xeVar == this.f15167b[i7]) {
                return i7;
            }
        }
        return -1;
    }

    public final xe b(int i7) {
        return this.f15167b[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zk.class == obj.getClass() && Arrays.equals(this.f15167b, ((zk) obj).f15167b);
    }

    public final int hashCode() {
        int i7 = this.f15168c;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f15167b) + 527;
        this.f15168c = hashCode;
        return hashCode;
    }
}
