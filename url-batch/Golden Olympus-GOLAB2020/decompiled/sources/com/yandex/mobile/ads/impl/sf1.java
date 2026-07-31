package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sf1 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f31725a;

    /* renamed from: b, reason: collision with root package name */
    private int f31726b;

    /* renamed from: c, reason: collision with root package name */
    private int f31727c;

    public sf1() {
        this.f31725a = u82.f32878f;
    }

    public final long A() {
        int i4;
        int i5;
        long j4 = this.f31725a[this.f31726b];
        int i6 = 7;
        while (true) {
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j4) != 0) {
                i6--;
            } else if (i6 < 6) {
                j4 &= r6 - 1;
                i5 = 7 - i6;
            } else if (i6 == 7) {
                i5 = 1;
            }
        }
        i5 = 0;
        if (i5 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j4);
        }
        for (i4 = 1; i4 < i5; i4++) {
            if ((this.f31725a[this.f31726b + i4] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j4);
            }
            j4 = (j4 << 6) | (r3 & 63);
        }
        this.f31726b += i5;
        return j4;
    }

    public final int a() {
        return this.f31727c - this.f31726b;
    }

    public final int b() {
        return this.f31725a.length;
    }

    public final byte[] c() {
        return this.f31725a;
    }

    public final int d() {
        return this.f31726b;
    }

    public final int e() {
        return this.f31727c;
    }

    public final char f() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        return (char) ((bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8));
    }

    public final int g() {
        return this.f31725a[this.f31726b] & 255;
    }

    public final int h() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24);
        int i6 = i4 + 3;
        int i7 = i5 | ((bArr[i4 + 2] & 255) << 8);
        this.f31726b = i4 + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final int i() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 2;
        int i6 = ((bArr[i4 + 1] & 255) << 8) | (((bArr[i4] & 255) << 24) >> 8);
        this.f31726b = i4 + 3;
        return (bArr[i5] & 255) | i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j() {
        int i4 = this.f31727c;
        int i5 = this.f31726b;
        if (i4 - i5 == 0) {
            return null;
        }
        while (i5 < this.f31727c) {
            byte b4 = this.f31725a[i5];
            int i6 = u82.f32873a;
            if (b4 == 10 || b4 == 13) {
                break;
            }
            i5++;
        }
        int i7 = this.f31726b;
        if (i5 - i7 >= 3) {
            byte[] bArr = this.f31725a;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f31726b = i7 + 3;
            }
        }
        byte[] bArr2 = this.f31725a;
        int i8 = this.f31726b;
        String a4 = u82.a(bArr2, i8, i5 - i8);
        this.f31726b = i5;
        int i9 = this.f31727c;
        if (i5 != i9) {
            byte[] bArr3 = this.f31725a;
            if (bArr3[i5] == 13) {
                int i10 = i5 + 1;
                this.f31726b = i10;
            }
            int i11 = this.f31726b;
            if (bArr3[i11] == 10) {
                this.f31726b = i11 + 1;
            }
        }
        return a4;
    }

    public final int k() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = ((bArr[i4 + 1] & 255) << 8) | (bArr[i4] & 255);
        int i6 = i4 + 3;
        int i7 = i5 | ((bArr[i4 + 2] & 255) << 16);
        this.f31726b = i4 + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long l() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 7;
        long j4 = (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
        this.f31726b = i4 + 8;
        return ((bArr[i5] & 255) << 56) | j4;
    }

    public final short m() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 1;
        int i6 = bArr[i4] & 255;
        this.f31726b = i4 + 2;
        return (short) (((bArr[i5] & 255) << 8) | i6);
    }

    public final long n() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        this.f31726b = i4 + 4;
        return ((bArr[i5] & 255) << 24) | j4;
    }

    public final int o() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 1;
        int i6 = bArr[i4] & 255;
        this.f31726b = i4 + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    public final long p() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 7;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
        this.f31726b = i4 + 8;
        return (bArr[i5] & 255) | j4;
    }

    public final String q() {
        int i4 = this.f31727c;
        int i5 = this.f31726b;
        if (i4 - i5 == 0) {
            return null;
        }
        while (i5 < this.f31727c && this.f31725a[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.f31725a;
        int i6 = this.f31726b;
        String a4 = u82.a(bArr, i6, i5 - i6);
        this.f31726b = i5;
        if (i5 < this.f31727c) {
            this.f31726b = i5 + 1;
        }
        return a4;
    }

    public final short r() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 1;
        int i6 = (bArr[i4] & 255) << 8;
        this.f31726b = i4 + 2;
        return (short) ((bArr[i5] & 255) | i6);
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        this.f31726b = i4 + 1;
        return bArr[i4] & 255;
    }

    public final int u() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = (bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8);
        this.f31726b = i4 + 4;
        return i5;
    }

    public final long v() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
        this.f31726b = i4 + 4;
        return (bArr[i5] & 255) | j4;
    }

    public final int w() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 2;
        int i6 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
        this.f31726b = i4 + 3;
        return (bArr[i5] & 255) | i6;
    }

    public final int x() {
        int h4 = h();
        if (h4 >= 0) {
            return h4;
        }
        throw new IllegalStateException(C1877de.a("Top bit not zero: ", h4));
    }

    public final long y() {
        long p4 = p();
        if (p4 >= 0) {
            return p4;
        }
        throw new IllegalStateException("Top bit not zero: " + p4);
    }

    public final int z() {
        byte[] bArr = this.f31725a;
        int i4 = this.f31726b;
        int i5 = i4 + 1;
        int i6 = (bArr[i4] & 255) << 8;
        this.f31726b = i4 + 2;
        return (bArr[i5] & 255) | i6;
    }

    public final void a(int i4) {
        byte[] bArr = this.f31725a;
        if (i4 > bArr.length) {
            this.f31725a = Arrays.copyOf(bArr, i4);
        }
    }

    public final String b(int i4) {
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f31726b;
        int i6 = (i5 + i4) - 1;
        String a4 = u82.a(this.f31725a, i5, (i6 >= this.f31727c || this.f31725a[i6] != 0) ? i4 : i4 - 1);
        this.f31726b += i4;
        return a4;
    }

    public final void c(int i4) {
        byte[] bArr = this.f31725a;
        if (bArr.length < i4) {
            bArr = new byte[i4];
        }
        this.f31725a = bArr;
        this.f31727c = i4;
        this.f31726b = 0;
    }

    public final void d(int i4) {
        if (i4 < 0 || i4 > this.f31725a.length) {
            throw new IllegalArgumentException();
        }
        this.f31727c = i4;
    }

    public final void e(int i4) {
        if (i4 < 0 || i4 > this.f31727c) {
            throw new IllegalArgumentException();
        }
        this.f31726b = i4;
    }

    public final void f(int i4) {
        e(this.f31726b + i4);
    }

    public sf1(int i4) {
        this.f31725a = new byte[i4];
        this.f31727c = i4;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        System.arraycopy(this.f31725a, this.f31726b, bArr, i4, i5);
        this.f31726b += i5;
    }

    public sf1(int i4, byte[] bArr) {
        this.f31725a = bArr;
        this.f31727c = i4;
    }

    public final void a(int i4, byte[] bArr) {
        this.f31725a = bArr;
        this.f31727c = i4;
        this.f31726b = 0;
    }

    public sf1(byte[] bArr) {
        this.f31725a = bArr;
        this.f31727c = bArr.length;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f31725a = bArr;
        this.f31727c = length;
        this.f31726b = 0;
    }

    public final String a(int i4, Charset charset) {
        String str = new String(this.f31725a, this.f31726b, i4, charset);
        this.f31726b += i4;
        return str;
    }
}
