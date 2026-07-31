package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bh {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f3421g = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    private final tl f3422a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3423b;

    /* renamed from: c, reason: collision with root package name */
    private long f3424c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f3425d = new byte[65536];

    /* renamed from: e, reason: collision with root package name */
    private int f3426e;

    /* renamed from: f, reason: collision with root package name */
    private int f3427f;

    public bh(tl tlVar, long j7, long j8) {
        this.f3422a = tlVar;
        this.f3424c = j7;
        this.f3423b = j8;
    }

    private final int j(byte[] bArr, int i7, int i8, int i9, boolean z6) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int d7 = this.f3422a.d(bArr, i7 + i9, i8 - i9);
        if (d7 != -1) {
            return i9 + d7;
        }
        if (i9 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    private final int k(byte[] bArr, int i7, int i8) {
        int i9 = this.f3427f;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.f3425d, 0, bArr, i7, min);
        n(min);
        return min;
    }

    private final int l(int i7) {
        int min = Math.min(this.f3427f, i7);
        n(min);
        return min;
    }

    private final void m(int i7) {
        if (i7 != -1) {
            this.f3424c += i7;
        }
    }

    private final void n(int i7) {
        int i8 = this.f3427f - i7;
        this.f3427f = i8;
        this.f3426e = 0;
        byte[] bArr = this.f3425d;
        byte[] bArr2 = i8 < bArr.length + (-524288) ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f3425d = bArr2;
    }

    public final int a(byte[] bArr, int i7, int i8) {
        int k7 = k(bArr, i7, i8);
        if (k7 == 0) {
            k7 = j(bArr, i7, i8, 0, true);
        }
        m(k7);
        return k7;
    }

    public final int b(int i7) {
        int l7 = l(i7);
        if (l7 == 0) {
            l7 = j(f3421g, 0, Math.min(i7, 4096), 0, true);
        }
        m(l7);
        return l7;
    }

    public final long c() {
        return this.f3423b;
    }

    public final long d() {
        return this.f3424c;
    }

    public final void e() {
        this.f3426e = 0;
    }

    public final boolean f(int i7, boolean z6) {
        int i8 = this.f3426e + i7;
        int length = this.f3425d.length;
        if (i8 > length) {
            this.f3425d = Arrays.copyOf(this.f3425d, zm.e(length + length, 65536 + i8, i8 + 524288));
        }
        int min = Math.min(this.f3427f - this.f3426e, i7);
        while (min < i7) {
            min = j(this.f3425d, this.f3426e, i7, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i9 = this.f3426e + i7;
        this.f3426e = i9;
        this.f3427f = Math.max(this.f3427f, i9);
        return true;
    }

    public final boolean g(byte[] bArr, int i7, int i8, boolean z6) {
        if (!f(i8, false)) {
            return false;
        }
        System.arraycopy(this.f3425d, this.f3426e - i8, bArr, i7, i8);
        return true;
    }

    public final boolean h(byte[] bArr, int i7, int i8, boolean z6) {
        int k7 = k(bArr, i7, i8);
        while (k7 < i8 && k7 != -1) {
            k7 = j(bArr, i7, i8, k7, z6);
        }
        m(k7);
        return k7 != -1;
    }

    public final boolean i(int i7, boolean z6) {
        int l7 = l(i7);
        while (l7 < i7 && l7 != -1) {
            l7 = j(f3421g, -l7, Math.min(i7, l7 + 4096), l7, false);
        }
        m(l7);
        return l7 != -1;
    }
}
