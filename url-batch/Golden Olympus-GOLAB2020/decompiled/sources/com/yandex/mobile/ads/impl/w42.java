package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w42<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f33922a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f33923b;

    /* renamed from: c, reason: collision with root package name */
    private int f33924c;

    /* renamed from: d, reason: collision with root package name */
    private int f33925d;

    public w42() {
        this(0);
    }

    private static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j4) {
        try {
            if (this.f33925d > 0) {
                if (j4 <= this.f33922a[((this.f33924c + r0) - 1) % this.f33923b.length]) {
                    a();
                }
            }
            int length = this.f33923b.length;
            if (this.f33925d >= length) {
                int i4 = length * 2;
                long[] jArr = new long[i4];
                V[] vArr = (V[]) new Object[i4];
                int i5 = this.f33924c;
                int i6 = length - i5;
                System.arraycopy(this.f33922a, i5, jArr, 0, i6);
                System.arraycopy(this.f33923b, this.f33924c, vArr, 0, i6);
                int i7 = this.f33924c;
                if (i7 > 0) {
                    System.arraycopy(this.f33922a, 0, jArr, i6, i7);
                    System.arraycopy(this.f33923b, 0, vArr, i6, this.f33924c);
                }
                this.f33922a = jArr;
                this.f33923b = vArr;
                this.f33924c = 0;
            }
            int i8 = this.f33924c;
            int i9 = this.f33925d;
            Object[] objArr = (V[]) this.f33923b;
            int length2 = (i8 + i9) % objArr.length;
            this.f33922a[length2] = j4;
            objArr[length2] = obj;
            this.f33925d = i9 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized V c() {
        V v4;
        int i4 = this.f33925d;
        v4 = null;
        if (i4 != 0) {
            if (i4 <= 0) {
                throw new IllegalStateException();
            }
            V[] vArr = this.f33923b;
            int i5 = this.f33924c;
            V v5 = vArr[i5];
            vArr[i5] = null;
            this.f33924c = (i5 + 1) % vArr.length;
            this.f33925d = i4 - 1;
            v4 = v5;
        }
        return v4;
    }

    public final synchronized int d() {
        return this.f33925d;
    }

    public w42(int i4) {
        this.f33922a = new long[10];
        this.f33923b = (V[]) b();
    }

    public final synchronized V b(long j4) {
        V v4;
        v4 = null;
        while (true) {
            try {
                int i4 = this.f33925d;
                if (i4 <= 0) {
                    break;
                }
                long[] jArr = this.f33922a;
                int i5 = this.f33924c;
                if (j4 - jArr[i5] >= 0) {
                    if (i4 <= 0) {
                        throw new IllegalStateException();
                    }
                    V[] vArr = this.f33923b;
                    V v5 = vArr[i5];
                    vArr[i5] = null;
                    this.f33924c = (i5 + 1) % vArr.length;
                    this.f33925d = i4 - 1;
                    v4 = v5;
                }
            } finally {
            }
        }
        return v4;
    }

    public final synchronized void a() {
        this.f33924c = 0;
        this.f33925d = 0;
        Arrays.fill(this.f33923b, (Object) null);
    }

    public final synchronized V a(long j4) {
        V v4;
        long j5 = Long.MAX_VALUE;
        v4 = null;
        while (true) {
            try {
                int i4 = this.f33925d;
                if (i4 <= 0) {
                    break;
                }
                long[] jArr = this.f33922a;
                int i5 = this.f33924c;
                long j6 = j4 - jArr[i5];
                if (j6 >= 0 || (-j6) < j5) {
                    if (i4 > 0) {
                        V[] vArr = this.f33923b;
                        v4 = vArr[i5];
                        vArr[i5] = null;
                        this.f33924c = (i5 + 1) % vArr.length;
                        this.f33925d = i4 - 1;
                        j5 = j6;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } finally {
            }
        }
        return v4;
    }
}
