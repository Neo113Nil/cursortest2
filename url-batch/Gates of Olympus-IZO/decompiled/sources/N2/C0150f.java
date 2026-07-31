package N2;

import H2.AbstractC0080b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: N2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150f implements InterfaceC0152h, InterfaceC0151g, Cloneable, ByteChannel {

    /* renamed from: d, reason: collision with root package name */
    public A f2928d;

    /* renamed from: e, reason: collision with root package name */
    public long f2929e;

    public final A D(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        A a3 = this.f2928d;
        if (a3 == null) {
            A b2 = B.b();
            this.f2928d = b2;
            b2.f2898g = b2;
            b2.f2897f = b2;
            return b2;
        }
        A a4 = a3.f2898g;
        Z1.i.c(a4);
        if (a4.f2894c + i3 <= 8192 && a4.f2896e) {
            return a4;
        }
        A b3 = B.b();
        a4.b(b3);
        return b3;
    }

    @Override // N2.InterfaceC0151g
    public final /* bridge */ /* synthetic */ InterfaceC0151g F(String str) {
        U(str);
        return this;
    }

    @Override // N2.InterfaceC0152h
    public final int G(u uVar) {
        Z1.i.f(uVar, "options");
        int b2 = O2.a.b(this, uVar, false);
        if (b2 == -1) {
            return -1;
        }
        x(uVar.f2964d[b2].b());
        return b2;
    }

    public final void L(C0153i c0153i) {
        Z1.i.f(c0153i, "byteString");
        c0153i.p(this, c0153i.b());
    }

    @Override // N2.InterfaceC0152h
    public final String N(Charset charset) {
        return u(this.f2929e, charset);
    }

    public final void O(byte[] bArr, int i3, int i4) {
        Z1.i.f(bArr, "source");
        long j3 = i4;
        I2.d.q(bArr.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            A D = D(1);
            int min = Math.min(i5 - i3, 8192 - D.f2894c);
            int i6 = i3 + min;
            M1.k.V(D.f2894c, i3, i6, bArr, D.f2892a);
            D.f2894c += min;
            i3 = i6;
        }
        this.f2929e += j3;
    }

    public final void P(F f3) {
        Z1.i.f(f3, "source");
        while (f3.l(this, 8192L) != -1) {
        }
    }

    public final void Q(int i3) {
        A D = D(1);
        int i4 = D.f2894c;
        D.f2894c = i4 + 1;
        D.f2892a[i4] = (byte) i3;
        this.f2929e++;
    }

    public final void R(long j3) {
        if (j3 == 0) {
            Q(48);
            return;
        }
        long j4 = (j3 >>> 1) | j3;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i3 = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + 3) / 4);
        A D = D(i3);
        int i4 = D.f2894c;
        for (int i5 = (i4 + i3) - 1; i5 >= i4; i5--) {
            D.f2892a[i5] = O2.a.f2990a[(int) (15 & j3)];
            j3 >>>= 4;
        }
        D.f2894c += i3;
        this.f2929e += i3;
    }

    public final void S(int i3) {
        A D = D(4);
        int i4 = D.f2894c;
        byte[] bArr = D.f2892a;
        bArr[i4] = (byte) ((i3 >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i3 & 255);
        D.f2894c = i4 + 4;
        this.f2929e += 4;
    }

    public final void T(int i3, int i4, String str) {
        char charAt;
        Z1.i.f(str, "string");
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("beginIndex < 0: ", i3).toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(AbstractC0080b.g(i4, i3, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > str.length()) {
            StringBuilder l3 = AbstractC0080b.l("endIndex > string.length: ", i4, " > ");
            l3.append(str.length());
            throw new IllegalArgumentException(l3.toString().toString());
        }
        while (i3 < i4) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < 128) {
                A D = D(1);
                int i5 = D.f2894c - i3;
                int min = Math.min(i4, 8192 - i5);
                int i6 = i3 + 1;
                byte[] bArr = D.f2892a;
                bArr[i3 + i5] = (byte) charAt2;
                while (true) {
                    i3 = i6;
                    if (i3 >= min || (charAt = str.charAt(i3)) >= 128) {
                        break;
                    }
                    i6 = i3 + 1;
                    bArr[i3 + i5] = (byte) charAt;
                }
                int i7 = D.f2894c;
                int i8 = (i5 + i3) - i7;
                D.f2894c = i7 + i8;
                this.f2929e += i8;
            } else {
                if (charAt2 < 2048) {
                    A D3 = D(2);
                    int i9 = D3.f2894c;
                    byte[] bArr2 = D3.f2892a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    D3.f2894c = i9 + 2;
                    this.f2929e += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    A D4 = D(3);
                    int i10 = D4.f2894c;
                    byte[] bArr3 = D4.f2892a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    D4.f2894c = i10 + 3;
                    this.f2929e += 3;
                } else {
                    int i11 = i3 + 1;
                    char charAt3 = i11 < i4 ? str.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        Q(63);
                        i3 = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        A D5 = D(4);
                        int i13 = D5.f2894c;
                        byte[] bArr4 = D5.f2892a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        D5.f2894c = i13 + 4;
                        this.f2929e += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    public final void U(String str) {
        Z1.i.f(str, "string");
        T(0, str.length(), str);
    }

    public final void V(int i3) {
        String str;
        int i4 = 0;
        if (i3 < 128) {
            Q(i3);
            return;
        }
        if (i3 < 2048) {
            A D = D(2);
            int i5 = D.f2894c;
            byte[] bArr = D.f2892a;
            bArr[i5] = (byte) ((i3 >> 6) | 192);
            bArr[1 + i5] = (byte) ((i3 & 63) | 128);
            D.f2894c = i5 + 2;
            this.f2929e += 2;
            return;
        }
        if (55296 <= i3 && i3 < 57344) {
            Q(63);
            return;
        }
        if (i3 < 65536) {
            A D3 = D(3);
            int i6 = D3.f2894c;
            byte[] bArr2 = D3.f2892a;
            bArr2[i6] = (byte) ((i3 >> 12) | 224);
            bArr2[1 + i6] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[2 + i6] = (byte) ((i3 & 63) | 128);
            D3.f2894c = i6 + 3;
            this.f2929e += 3;
            return;
        }
        if (i3 <= 1114111) {
            A D4 = D(4);
            int i7 = D4.f2894c;
            byte[] bArr3 = D4.f2892a;
            bArr3[i7] = (byte) ((i3 >> 18) | 240);
            bArr3[1 + i7] = (byte) (((i3 >> 12) & 63) | 128);
            bArr3[2 + i7] = (byte) (((i3 >> 6) & 63) | 128);
            bArr3[3 + i7] = (byte) ((i3 & 63) | 128);
            D4.f2894c = i7 + 4;
            this.f2929e += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i3 != 0) {
            char[] cArr = O2.b.f2991a;
            char[] cArr2 = {cArr[(i3 >> 28) & 15], cArr[(i3 >> 24) & 15], cArr[(i3 >> 20) & 15], cArr[(i3 >> 16) & 15], cArr[(i3 >> 12) & 15], cArr[(i3 >> 8) & 15], cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
            while (i4 < 8 && cArr2[i4] == '0') {
                i4++;
            }
            I2.d.o(i4, 8, 8);
            str = new String(cArr2, i4, 8 - i4);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean a() {
        return this.f2929e == 0;
    }

    public final byte b(long j3) {
        I2.d.q(this.f2929e, j3, 1L);
        A a3 = this.f2928d;
        if (a3 == null) {
            Z1.i.c(null);
            throw null;
        }
        long j4 = this.f2929e;
        if (j4 - j3 < j3) {
            while (j4 > j3) {
                a3 = a3.f2898g;
                Z1.i.c(a3);
                j4 -= a3.f2894c - a3.f2893b;
            }
            return a3.f2892a[(int) ((a3.f2893b + j3) - j4)];
        }
        long j5 = 0;
        while (true) {
            int i3 = a3.f2894c;
            int i4 = a3.f2893b;
            long j6 = (i3 - i4) + j5;
            if (j6 > j3) {
                return a3.f2892a[(int) ((i4 + j3) - j5)];
            }
            a3 = a3.f2897f;
            Z1.i.c(a3);
            j5 = j6;
        }
    }

    @Override // N2.F
    public final H c() {
        return H.f2905d;
    }

    public final Object clone() {
        C0150f c0150f = new C0150f();
        if (this.f2929e != 0) {
            A a3 = this.f2928d;
            Z1.i.c(a3);
            A c3 = a3.c();
            c0150f.f2928d = c3;
            c3.f2898g = c3;
            c3.f2897f = c3;
            for (A a4 = a3.f2897f; a4 != a3; a4 = a4.f2897f) {
                A a5 = c3.f2898g;
                Z1.i.c(a5);
                Z1.i.c(a4);
                a5.b(a4.c());
            }
            c0150f.f2929e = this.f2929e;
        }
        return c0150f;
    }

    public final long e(C0153i c0153i) {
        int i3;
        int i4;
        Z1.i.f(c0153i, "targetBytes");
        A a3 = this.f2928d;
        if (a3 == null) {
            return -1L;
        }
        long j3 = this.f2929e;
        long j4 = 0;
        byte[] bArr = c0153i.f2931d;
        if (j3 < 0) {
            while (j3 > 0) {
                a3 = a3.f2898g;
                Z1.i.c(a3);
                j3 -= a3.f2894c - a3.f2893b;
            }
            if (bArr.length == 2) {
                byte b2 = bArr[0];
                byte b3 = bArr[1];
                while (j3 < this.f2929e) {
                    i3 = (int) ((a3.f2893b + j4) - j3);
                    int i5 = a3.f2894c;
                    while (i3 < i5) {
                        byte b4 = a3.f2892a[i3];
                        if (b4 != b2 && b4 != b3) {
                            i3++;
                        }
                        i4 = a3.f2893b;
                    }
                    j4 = (a3.f2894c - a3.f2893b) + j3;
                    a3 = a3.f2897f;
                    Z1.i.c(a3);
                    j3 = j4;
                }
                return -1L;
            }
            while (j3 < this.f2929e) {
                i3 = (int) ((a3.f2893b + j4) - j3);
                int i6 = a3.f2894c;
                while (i3 < i6) {
                    byte b5 = a3.f2892a[i3];
                    for (byte b6 : bArr) {
                        if (b5 == b6) {
                            i4 = a3.f2893b;
                        }
                    }
                    i3++;
                }
                j4 = (a3.f2894c - a3.f2893b) + j3;
                a3 = a3.f2897f;
                Z1.i.c(a3);
                j3 = j4;
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j5 = (a3.f2894c - a3.f2893b) + j3;
            if (j5 > 0) {
                break;
            }
            a3 = a3.f2897f;
            Z1.i.c(a3);
            j3 = j5;
        }
        if (bArr.length == 2) {
            byte b7 = bArr[0];
            byte b8 = bArr[1];
            while (j3 < this.f2929e) {
                i3 = (int) ((a3.f2893b + j4) - j3);
                int i7 = a3.f2894c;
                while (i3 < i7) {
                    byte b9 = a3.f2892a[i3];
                    if (b9 != b7 && b9 != b8) {
                        i3++;
                    }
                    i4 = a3.f2893b;
                }
                j4 = (a3.f2894c - a3.f2893b) + j3;
                a3 = a3.f2897f;
                Z1.i.c(a3);
                j3 = j4;
            }
            return -1L;
        }
        while (j3 < this.f2929e) {
            i3 = (int) ((a3.f2893b + j4) - j3);
            int i8 = a3.f2894c;
            while (i3 < i8) {
                byte b10 = a3.f2892a[i3];
                for (byte b11 : bArr) {
                    if (b10 == b11) {
                        i4 = a3.f2893b;
                    }
                }
                i3++;
            }
            j4 = (a3.f2894c - a3.f2893b) + j3;
            a3 = a3.f2897f;
            Z1.i.c(a3);
            j3 = j4;
        }
        return -1L;
        return (i3 - i4) + j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0150f) {
                long j3 = this.f2929e;
                C0150f c0150f = (C0150f) obj;
                if (j3 == c0150f.f2929e) {
                    if (j3 != 0) {
                        A a3 = this.f2928d;
                        Z1.i.c(a3);
                        A a4 = c0150f.f2928d;
                        Z1.i.c(a4);
                        int i3 = a3.f2893b;
                        int i4 = a4.f2893b;
                        long j4 = 0;
                        while (j4 < this.f2929e) {
                            long min = Math.min(a3.f2894c - i3, a4.f2894c - i4);
                            long j5 = 0;
                            while (j5 < min) {
                                int i5 = i3 + 1;
                                byte b2 = a3.f2892a[i3];
                                int i6 = i4 + 1;
                                if (b2 == a4.f2892a[i4]) {
                                    j5++;
                                    i4 = i6;
                                    i3 = i5;
                                }
                            }
                            if (i3 == a3.f2894c) {
                                A a5 = a3.f2897f;
                                Z1.i.c(a5);
                                i3 = a5.f2893b;
                                a3 = a5;
                            }
                            if (i4 == a4.f2894c) {
                                a4 = a4.f2897f;
                                Z1.i.c(a4);
                                i4 = a4.f2893b;
                            }
                            j4 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        A b2;
        Z1.i.f(c0150f, "source");
        if (c0150f == this) {
            throw new IllegalArgumentException("source == this");
        }
        I2.d.q(c0150f.f2929e, 0L, j3);
        while (j3 > 0) {
            A a3 = c0150f.f2928d;
            Z1.i.c(a3);
            int i3 = a3.f2894c;
            A a4 = c0150f.f2928d;
            Z1.i.c(a4);
            long j4 = i3 - a4.f2893b;
            int i4 = 0;
            if (j3 < j4) {
                A a5 = this.f2928d;
                A a6 = a5 != null ? a5.f2898g : null;
                if (a6 != null && a6.f2896e) {
                    if ((a6.f2894c + j3) - (a6.f2895d ? 0 : a6.f2893b) <= 8192) {
                        A a7 = c0150f.f2928d;
                        Z1.i.c(a7);
                        a7.d(a6, (int) j3);
                        c0150f.f2929e -= j3;
                        this.f2929e += j3;
                        return;
                    }
                }
                A a8 = c0150f.f2928d;
                Z1.i.c(a8);
                int i5 = (int) j3;
                if (i5 <= 0 || i5 > a8.f2894c - a8.f2893b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i5 >= 1024) {
                    b2 = a8.c();
                } else {
                    b2 = B.b();
                    int i6 = a8.f2893b;
                    M1.k.V(0, i6, i6 + i5, a8.f2892a, b2.f2892a);
                }
                b2.f2894c = b2.f2893b + i5;
                a8.f2893b += i5;
                A a9 = a8.f2898g;
                Z1.i.c(a9);
                a9.b(b2);
                c0150f.f2928d = b2;
            }
            A a10 = c0150f.f2928d;
            Z1.i.c(a10);
            long j5 = a10.f2894c - a10.f2893b;
            c0150f.f2928d = a10.a();
            A a11 = this.f2928d;
            if (a11 == null) {
                this.f2928d = a10;
                a10.f2898g = a10;
                a10.f2897f = a10;
            } else {
                A a12 = a11.f2898g;
                Z1.i.c(a12);
                a12.b(a10);
                A a13 = a10.f2898g;
                if (a13 == a10) {
                    throw new IllegalStateException("cannot compact");
                }
                Z1.i.c(a13);
                if (a13.f2896e) {
                    int i7 = a10.f2894c - a10.f2893b;
                    A a14 = a10.f2898g;
                    Z1.i.c(a14);
                    int i8 = 8192 - a14.f2894c;
                    A a15 = a10.f2898g;
                    Z1.i.c(a15);
                    if (!a15.f2895d) {
                        A a16 = a10.f2898g;
                        Z1.i.c(a16);
                        i4 = a16.f2893b;
                    }
                    if (i7 <= i8 + i4) {
                        A a17 = a10.f2898g;
                        Z1.i.c(a17);
                        a10.d(a17, i7);
                        a10.a();
                        B.a(a10);
                    }
                }
            }
            c0150f.f2929e -= j5;
            this.f2929e += j5;
            j3 -= j5;
        }
    }

    public final boolean h(C0153i c0153i) {
        Z1.i.f(c0153i, "bytes");
        byte[] bArr = c0153i.f2931d;
        int length = bArr.length;
        if (length < 0 || this.f2929e < length || bArr.length < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (b(i3) != bArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        A a3 = this.f2928d;
        if (a3 == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = a3.f2894c;
            for (int i5 = a3.f2893b; i5 < i4; i5++) {
                i3 = (i3 * 31) + a3.f2892a[i5];
            }
            a3 = a3.f2897f;
            Z1.i.c(a3);
        } while (a3 != this.f2928d);
        return i3;
    }

    public final int i(byte[] bArr, int i3, int i4) {
        Z1.i.f(bArr, "sink");
        I2.d.q(bArr.length, i3, i4);
        A a3 = this.f2928d;
        if (a3 == null) {
            return -1;
        }
        int min = Math.min(i4, a3.f2894c - a3.f2893b);
        int i5 = a3.f2893b;
        M1.k.V(i3, i5, i5 + min, a3.f2892a, bArr);
        int i6 = a3.f2893b + min;
        a3.f2893b = i6;
        this.f2929e -= min;
        if (i6 == a3.f2894c) {
            this.f2928d = a3.a();
            B.a(a3);
        }
        return min;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j() {
        if (this.f2929e == 0) {
            throw new EOFException();
        }
        A a3 = this.f2928d;
        Z1.i.c(a3);
        int i3 = a3.f2893b;
        int i4 = a3.f2894c;
        int i5 = i3 + 1;
        byte b2 = a3.f2892a[i3];
        this.f2929e--;
        if (i5 == i4) {
            this.f2928d = a3.a();
            B.a(a3);
        } else {
            a3.f2893b = i5;
        }
        return b2;
    }

    public final byte[] k(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f2929e < j3) {
            throw new EOFException();
        }
        int i3 = (int) j3;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i(bArr, i4, i3 - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
        return bArr;
    }

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        Z1.i.f(c0150f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j4 = this.f2929e;
        if (j4 == 0) {
            return -1L;
        }
        if (j3 > j4) {
            j3 = j4;
        }
        c0150f.g(this, j3);
        return j3;
    }

    public final C0153i m(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f2929e < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new C0153i(k(j3));
        }
        C0153i z3 = z((int) j3);
        x(j3);
        return z3;
    }

    public final int o() {
        if (this.f2929e < 4) {
            throw new EOFException();
        }
        A a3 = this.f2928d;
        Z1.i.c(a3);
        int i3 = a3.f2893b;
        int i4 = a3.f2894c;
        if (i4 - i3 < 4) {
            return ((j() & 255) << 24) | ((j() & 255) << 16) | ((j() & 255) << 8) | (j() & 255);
        }
        byte[] bArr = a3.f2892a;
        int i5 = i3 + 3;
        int i6 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i7 = i3 + 4;
        int i8 = i6 | (bArr[i5] & 255);
        this.f2929e -= 4;
        if (i7 == i4) {
            this.f2928d = a3.a();
            B.a(a3);
        } else {
            a3.f2893b = i7;
        }
        return i8;
    }

    public final short p() {
        if (this.f2929e < 2) {
            throw new EOFException();
        }
        A a3 = this.f2928d;
        Z1.i.c(a3);
        int i3 = a3.f2893b;
        int i4 = a3.f2894c;
        if (i4 - i3 < 2) {
            return (short) (((j() & 255) << 8) | (j() & 255));
        }
        int i5 = i3 + 1;
        byte[] bArr = a3.f2892a;
        int i6 = (bArr[i3] & 255) << 8;
        int i7 = i3 + 2;
        int i8 = (bArr[i5] & 255) | i6;
        this.f2929e -= 2;
        if (i7 == i4) {
            this.f2928d = a3.a();
            B.a(a3);
        } else {
            a3.f2893b = i7;
        }
        return (short) i8;
    }

    public final short r() {
        short p = p();
        return (short) (((p & 255) << 8) | ((65280 & p) >>> 8));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        Z1.i.f(byteBuffer, "sink");
        A a3 = this.f2928d;
        if (a3 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), a3.f2894c - a3.f2893b);
        byteBuffer.put(a3.f2892a, a3.f2893b, min);
        int i3 = a3.f2893b + min;
        a3.f2893b = i3;
        this.f2929e -= min;
        if (i3 == a3.f2894c) {
            this.f2928d = a3.a();
            B.a(a3);
        }
        return min;
    }

    public final String toString() {
        long j3 = this.f2929e;
        if (j3 <= 2147483647L) {
            return z((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2929e).toString());
    }

    public final String u(long j3, Charset charset) {
        Z1.i.f(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f2929e < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        A a3 = this.f2928d;
        Z1.i.c(a3);
        int i3 = a3.f2893b;
        if (i3 + j3 > a3.f2894c) {
            return new String(k(j3), charset);
        }
        int i4 = (int) j3;
        String str = new String(a3.f2892a, i3, i4, charset);
        int i5 = a3.f2893b + i4;
        a3.f2893b = i5;
        this.f2929e -= j3;
        if (i5 == a3.f2894c) {
            this.f2928d = a3.a();
            B.a(a3);
        }
        return str;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        Z1.i.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            A D = D(1);
            int min = Math.min(i3, 8192 - D.f2894c);
            byteBuffer.get(D.f2892a, D.f2894c, min);
            i3 -= min;
            D.f2894c += min;
        }
        this.f2929e += remaining;
        return remaining;
    }

    public final void x(long j3) {
        while (j3 > 0) {
            A a3 = this.f2928d;
            if (a3 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j3, a3.f2894c - a3.f2893b);
            long j4 = min;
            this.f2929e -= j4;
            j3 -= j4;
            int i3 = a3.f2893b + min;
            a3.f2893b = i3;
            if (i3 == a3.f2894c) {
                this.f2928d = a3.a();
                B.a(a3);
            }
        }
    }

    public final C0153i z(int i3) {
        if (i3 == 0) {
            return C0153i.f2930g;
        }
        I2.d.q(this.f2929e, 0L, i3);
        A a3 = this.f2928d;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Z1.i.c(a3);
            int i7 = a3.f2894c;
            int i8 = a3.f2893b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            a3 = a3.f2897f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        A a4 = this.f2928d;
        int i9 = 0;
        while (i4 < i3) {
            Z1.i.c(a4);
            bArr[i9] = a4.f2892a;
            i4 += a4.f2894c - a4.f2893b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = a4.f2893b;
            a4.f2895d = true;
            i9++;
            a4 = a4.f2897f;
        }
        return new C(bArr, iArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, N2.D
    public final void close() {
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
    }
}
