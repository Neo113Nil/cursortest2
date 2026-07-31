package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pd2 {

    /* renamed from: a, reason: collision with root package name */
    private int f10178a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f10179b = new long[32];

    public pd2(int i7) {
    }

    public final int a() {
        return this.f10178a;
    }

    public final long b(int i7) {
        if (i7 >= 0 && i7 < this.f10178a) {
            return this.f10179b[i7];
        }
        int i8 = this.f10178a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i7);
        sb.append(", size is ");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void c(long j7) {
        int i7 = this.f10178a;
        long[] jArr = this.f10179b;
        if (i7 == jArr.length) {
            this.f10179b = Arrays.copyOf(jArr, i7 + i7);
        }
        long[] jArr2 = this.f10179b;
        int i8 = this.f10178a;
        this.f10178a = i8 + 1;
        jArr2[i8] = j7;
    }
}
