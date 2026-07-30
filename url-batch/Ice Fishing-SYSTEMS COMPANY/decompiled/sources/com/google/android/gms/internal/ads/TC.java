package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class TC implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final TC f27725v = new TC(new int[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public final int[] f27726n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27727u;

    public TC(int[] iArr, int i) {
        this.f27726n = iArr;
        this.f27727u = i;
    }

    public final int a(int i) {
        PA.a0(i, this.f27727u);
        return this.f27726n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TC)) {
            return false;
        }
        TC tc = (TC) obj;
        int i = tc.f27727u;
        int i4 = this.f27727u;
        if (i4 != i) {
            return false;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            if (a(i9) != tc.a(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f27727u; i4++) {
            i = (i * 31) + Integer.hashCode(this.f27726n[i4]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f27727u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f27726n;
        sb.append(iArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb.append(", ");
            sb.append(iArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
