package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm {

    /* renamed from: a, reason: collision with root package name */
    private int f8615a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f8616b = new long[32];

    public mm(int i7) {
    }

    public final int a() {
        return this.f8615a;
    }

    public final long b(int i7) {
        if (i7 >= 0 && i7 < this.f8615a) {
            return this.f8616b[i7];
        }
        int i8 = this.f8615a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i7);
        sb.append(", size is ");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void c(long j7) {
        int i7 = this.f8615a;
        long[] jArr = this.f8616b;
        if (i7 == jArr.length) {
            this.f8616b = Arrays.copyOf(jArr, i7 + i7);
        }
        long[] jArr2 = this.f8616b;
        int i8 = this.f8615a;
        this.f8615a = i8 + 1;
        jArr2[i8] = j7;
    }
}
