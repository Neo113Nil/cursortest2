package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dr2 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f4289a;

    /* renamed from: b, reason: collision with root package name */
    private int f4290b;

    /* renamed from: c, reason: collision with root package name */
    private int f4291c;

    public dr2() {
        this.f4289a = n13.f8870f;
    }

    public dr2(int i7) {
        this.f4289a = new byte[i7];
        this.f4291c = i7;
    }

    public dr2(byte[] bArr) {
        this.f4289a = bArr;
        this.f4291c = bArr.length;
    }

    public dr2(byte[] bArr, int i7) {
        this.f4289a = bArr;
        this.f4291c = i7;
    }

    public final long A() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f4290b = i10;
        byte b9 = bArr[i9];
        this.f4290b = i10 + 1;
        return ((b8 & 255) << 16) | ((b7 & 255) << 24) | ((b9 & 255) << 8) | (bArr[i10] & 255);
    }

    public final long B() {
        long z6 = z();
        if (z6 >= 0) {
            return z6;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(z6);
        throw new IllegalStateException(sb.toString());
    }

    public final long C() {
        int i7;
        int i8;
        long j7 = this.f4289a[this.f4290b];
        int i9 = 7;
        while (true) {
            i7 = 0;
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j7) != 0) {
                i9--;
            } else if (i9 < 6) {
                j7 &= r7 - 1;
                i7 = 7 - i9;
            } else if (i9 == 7) {
                i7 = 1;
            }
        }
        if (i7 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j7);
            throw new NumberFormatException(sb.toString());
        }
        for (i8 = 1; i8 < i7; i8++) {
            if ((this.f4289a[this.f4290b + i8] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j7);
                throw new NumberFormatException(sb2.toString());
            }
            j7 = (j7 << 6) | (r2 & 63);
        }
        this.f4290b += i7;
        return j7;
    }

    public final String D(char c7) {
        int i7 = this.f4291c;
        int i8 = this.f4290b;
        if (i7 - i8 == 0) {
            return null;
        }
        while (i8 < this.f4291c && this.f4289a[i8] != 0) {
            i8++;
        }
        byte[] bArr = this.f4289a;
        int i9 = this.f4290b;
        String e7 = n13.e(bArr, i9, i8 - i9);
        this.f4290b = i8;
        if (i8 < this.f4291c) {
            this.f4290b = i8 + 1;
        }
        return e7;
    }

    public final String E(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f4290b;
        int i9 = (i8 + i7) - 1;
        String e7 = n13.e(this.f4289a, i8, (i9 >= this.f4291c || this.f4289a[i9] != 0) ? i7 : i7 - 1);
        this.f4290b += i7;
        return e7;
    }

    public final String F(int i7, Charset charset) {
        String str = new String(this.f4289a, this.f4290b, i7, charset);
        this.f4290b += i7;
        return str;
    }

    public final short G() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        this.f4290b = i8 + 1;
        return (short) ((bArr[i8] & 255) | ((b7 & 255) << 8));
    }

    public final void H(int i7) {
        byte[] bArr = this.f4289a;
        if (i7 > bArr.length) {
            this.f4289a = Arrays.copyOf(bArr, i7);
        }
    }

    public final void a(cq2 cq2Var, int i7) {
        b(cq2Var.f3919a, 0, i7);
        cq2Var.h(0);
    }

    public final void b(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f4289a, this.f4290b, bArr, i7, i8);
        this.f4290b += i8;
    }

    public final void c(int i7) {
        byte[] bArr = this.f4289a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        d(bArr, i7);
    }

    public final void d(byte[] bArr, int i7) {
        this.f4289a = bArr;
        this.f4291c = i7;
        this.f4290b = 0;
    }

    public final void e(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 <= this.f4289a.length) {
            z6 = true;
        }
        wu1.d(z6);
        this.f4291c = i7;
    }

    public final void f(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 <= this.f4291c) {
            z6 = true;
        }
        wu1.d(z6);
        this.f4290b = i7;
    }

    public final void g(int i7) {
        f(this.f4290b + i7);
    }

    public final byte[] h() {
        return this.f4289a;
    }

    public final int i() {
        return this.f4291c - this.f4290b;
    }

    public final int j() {
        return this.f4289a.length;
    }

    public final int k() {
        return this.f4290b;
    }

    public final int l() {
        return this.f4291c;
    }

    public final int m() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f4290b = i10;
        byte b9 = bArr[i9];
        this.f4290b = i10 + 1;
        return (bArr[i10] & 255) | ((b7 & 255) << 24) | ((b8 & 255) << 16) | ((b9 & 255) << 8);
    }

    public final int n() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        this.f4290b = i9 + 1;
        return (bArr[i9] & 255) | (((b7 & 255) << 24) >> 8) | ((b8 & 255) << 8);
    }

    public final int o() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f4290b = i10;
        byte b9 = bArr[i9];
        this.f4290b = i10 + 1;
        return ((bArr[i10] & 255) << 24) | (b7 & 255) | ((b8 & 255) << 8) | ((b9 & 255) << 16);
    }

    public final int p() {
        int o7 = o();
        if (o7 >= 0) {
            return o7;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(o7);
        throw new IllegalStateException(sb.toString());
    }

    public final int q() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        this.f4290b = i8 + 1;
        return ((bArr[i8] & 255) << 8) | (b7 & 255);
    }

    public final int r() {
        return (s() << 21) | (s() << 14) | (s() << 7) | s();
    }

    public final int s() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        this.f4290b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int t() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        this.f4290b = i9 + 2;
        return (b8 & 255) | ((b7 & 255) << 8);
    }

    public final int u() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        this.f4290b = i9 + 1;
        return (bArr[i9] & 255) | ((b7 & 255) << 16) | ((b8 & 255) << 8);
    }

    public final int v() {
        int m7 = m();
        if (m7 >= 0) {
            return m7;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(m7);
        throw new IllegalStateException(sb.toString());
    }

    public final int w() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        this.f4290b = i8 + 1;
        return (bArr[i8] & 255) | ((b7 & 255) << 8);
    }

    public final long x() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f4290b = i10;
        byte b9 = bArr[i9];
        int i11 = i10 + 1;
        this.f4290b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4290b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4290b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f4290b = i14;
        byte b13 = bArr[i13];
        this.f4290b = i14 + 1;
        return ((b8 & 255) << 8) | (b7 & 255) | ((b9 & 255) << 16) | ((b10 & 255) << 24) | ((b11 & 255) << 32) | ((b12 & 255) << 40) | ((b13 & 255) << 48) | ((bArr[i14] & 255) << 56);
    }

    public final long y() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f4290b = i10;
        byte b9 = bArr[i9];
        this.f4290b = i10 + 1;
        return ((b8 & 255) << 8) | (b7 & 255) | ((b9 & 255) << 16) | ((bArr[i10] & 255) << 24);
    }

    public final long z() {
        byte[] bArr = this.f4289a;
        int i7 = this.f4290b;
        int i8 = i7 + 1;
        this.f4290b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f4290b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f4290b = i10;
        byte b9 = bArr[i9];
        int i11 = i10 + 1;
        this.f4290b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4290b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4290b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f4290b = i14;
        byte b13 = bArr[i13];
        this.f4290b = i14 + 1;
        return ((b8 & 255) << 48) | ((b7 & 255) << 56) | ((b9 & 255) << 40) | ((b10 & 255) << 32) | ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (bArr[i14] & 255);
    }
}
