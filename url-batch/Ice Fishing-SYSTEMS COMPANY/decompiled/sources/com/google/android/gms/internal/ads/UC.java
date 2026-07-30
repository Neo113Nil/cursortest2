package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class UC implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final UC f27943v = new UC(new long[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public final long[] f27944n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27945u;

    public UC(long[] jArr, int i) {
        this.f27944n = jArr;
        this.f27945u = i;
    }

    public final long a(int i) {
        PA.a0(i, this.f27945u);
        return this.f27944n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UC)) {
            return false;
        }
        UC uc = (UC) obj;
        int i = uc.f27945u;
        int i4 = this.f27945u;
        if (i4 != i) {
            return false;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            if (a(i9) != uc.a(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f27945u; i4++) {
            i = (i * 31) + Long.hashCode(this.f27944n[i4]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f27945u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.f27944n;
        sb.append(jArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb.append(", ");
            sb.append(jArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
