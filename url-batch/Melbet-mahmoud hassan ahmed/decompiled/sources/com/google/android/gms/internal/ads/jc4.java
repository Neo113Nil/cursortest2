package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jc4 implements pc4 {

    /* renamed from: b, reason: collision with root package name */
    private final fc1 f7080b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7081c;

    /* renamed from: d, reason: collision with root package name */
    private long f7082d;

    /* renamed from: f, reason: collision with root package name */
    private int f7084f;

    /* renamed from: g, reason: collision with root package name */
    private int f7085g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f7083e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7079a = new byte[4096];

    public jc4(fc1 fc1Var, long j7, long j8) {
        this.f7080b = fc1Var;
        this.f7082d = j7;
        this.f7081c = j8;
    }

    private final int q(byte[] bArr, int i7, int i8) {
        int i9 = this.f7085g;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.f7083e, 0, bArr, i7, min);
        v(min);
        return min;
    }

    private final int r(byte[] bArr, int i7, int i8, int i9, boolean z6) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int a7 = this.f7080b.a(bArr, i7 + i9, i8 - i9);
        if (a7 != -1) {
            return i9 + a7;
        }
        if (i9 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    private final int s(int i7) {
        int min = Math.min(this.f7085g, i7);
        v(min);
        return min;
    }

    private final void t(int i7) {
        if (i7 != -1) {
            this.f7082d += i7;
        }
    }

    private final void u(int i7) {
        int i8 = this.f7084f + i7;
        int length = this.f7083e.length;
        if (i8 > length) {
            this.f7083e = Arrays.copyOf(this.f7083e, n13.L(length + length, 65536 + i8, i8 + 524288));
        }
    }

    private final void v(int i7) {
        int i8 = this.f7085g - i7;
        this.f7085g = i8;
        this.f7084f = 0;
        byte[] bArr = this.f7083e;
        byte[] bArr2 = i8 < bArr.length + (-524288) ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f7083e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void E(int i7) {
        o(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final int F(int i7) {
        int s7 = s(1);
        if (s7 == 0) {
            s7 = r(this.f7079a, 0, Math.min(1, 4096), 0, true);
        }
        t(s7);
        return s7;
    }

    @Override // com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        int q7 = q(bArr, i7, i8);
        if (q7 == 0) {
            q7 = r(bArr, i7, i8, 0, true);
        }
        t(q7);
        return q7;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final long b() {
        return this.f7082d;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final long c() {
        return this.f7081c;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final int d(byte[] bArr, int i7, int i8) {
        int min;
        u(i8);
        int i9 = this.f7085g;
        int i10 = this.f7084f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = r(this.f7083e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f7085g += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f7083e, this.f7084f, bArr, i7, min);
        this.f7084f += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void e(byte[] bArr, int i7, int i8) {
        m(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void f(byte[] bArr, int i7, int i8) {
        n(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final long g() {
        return this.f7082d + this.f7084f;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void i() {
        this.f7084f = 0;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void l(int i7) {
        p(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final boolean m(byte[] bArr, int i7, int i8, boolean z6) {
        int q7 = q(bArr, i7, i8);
        while (q7 < i8 && q7 != -1) {
            q7 = r(bArr, i7, i8, q7, z6);
        }
        t(q7);
        return q7 != -1;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final boolean n(byte[] bArr, int i7, int i8, boolean z6) {
        if (!o(i8, z6)) {
            return false;
        }
        System.arraycopy(this.f7083e, this.f7084f - i8, bArr, i7, i8);
        return true;
    }

    public final boolean o(int i7, boolean z6) {
        u(i7);
        int i8 = this.f7085g - this.f7084f;
        while (i8 < i7) {
            i8 = r(this.f7083e, this.f7084f, i7, i8, z6);
            if (i8 == -1) {
                return false;
            }
            this.f7085g = this.f7084f + i8;
        }
        this.f7084f += i7;
        return true;
    }

    public final boolean p(int i7, boolean z6) {
        int s7 = s(i7);
        while (s7 < i7 && s7 != -1) {
            s7 = r(this.f7079a, -s7, Math.min(i7, s7 + 4096), s7, false);
        }
        t(s7);
        return s7 != -1;
    }
}
