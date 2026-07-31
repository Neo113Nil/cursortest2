package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jx2<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f7270a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private V[] f7271b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f7272c;

    /* renamed from: d, reason: collision with root package name */
    private int f7273d;

    public jx2(int i7) {
    }

    private final V f() {
        wu1.f(this.f7273d > 0);
        V[] vArr = this.f7271b;
        int i7 = this.f7272c;
        V v6 = vArr[i7];
        vArr[i7] = null;
        this.f7272c = (i7 + 1) % vArr.length;
        this.f7273d--;
        return v6;
    }

    public final synchronized int a() {
        return this.f7273d;
    }

    public final synchronized V b() {
        if (this.f7273d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized V c(long j7) {
        V v6;
        v6 = null;
        while (this.f7273d > 0 && j7 - this.f7270a[this.f7272c] >= 0) {
            v6 = f();
        }
        return v6;
    }

    public final synchronized void d(long j7, V v6) {
        if (this.f7273d > 0) {
            if (j7 <= this.f7270a[((this.f7272c + r0) - 1) % this.f7271b.length]) {
                e();
            }
        }
        int length = this.f7271b.length;
        if (this.f7273d >= length) {
            int i7 = length + length;
            long[] jArr = new long[i7];
            V[] vArr = (V[]) new Object[i7];
            int i8 = this.f7272c;
            int i9 = length - i8;
            System.arraycopy(this.f7270a, i8, jArr, 0, i9);
            System.arraycopy(this.f7271b, this.f7272c, vArr, 0, i9);
            int i10 = this.f7272c;
            if (i10 > 0) {
                System.arraycopy(this.f7270a, 0, jArr, i9, i10);
                System.arraycopy(this.f7271b, 0, vArr, i9, this.f7272c);
            }
            this.f7270a = jArr;
            this.f7271b = vArr;
            this.f7272c = 0;
        }
        int i11 = this.f7272c;
        int i12 = this.f7273d;
        V[] vArr2 = this.f7271b;
        int length2 = (i11 + i12) % vArr2.length;
        this.f7270a[length2] = j7;
        vArr2[length2] = v6;
        this.f7273d = i12 + 1;
    }

    public final synchronized void e() {
        this.f7272c = 0;
        this.f7273d = 0;
        Arrays.fill(this.f7271b, (Object) null);
    }
}
