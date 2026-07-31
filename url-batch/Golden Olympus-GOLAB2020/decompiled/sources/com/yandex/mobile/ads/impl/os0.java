package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class os0 {

    /* renamed from: a, reason: collision with root package name */
    private int f30187a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f30188b;

    public os0() {
        this(0);
    }

    public final void a(long j4) {
        int i4 = this.f30187a;
        long[] jArr = this.f30188b;
        if (i4 == jArr.length) {
            this.f30188b = Arrays.copyOf(jArr, i4 * 2);
        }
        long[] jArr2 = this.f30188b;
        int i5 = this.f30187a;
        this.f30187a = i5 + 1;
        jArr2[i5] = j4;
    }

    public final long[] b() {
        return Arrays.copyOf(this.f30188b, this.f30187a);
    }

    public os0(int i4) {
        this.f30188b = new long[32];
    }

    public final long a(int i4) {
        if (i4 >= 0 && i4 < this.f30187a) {
            return this.f30188b[i4];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i4 + ", size is " + this.f30187a);
    }

    public final int a() {
        return this.f30187a;
    }
}
