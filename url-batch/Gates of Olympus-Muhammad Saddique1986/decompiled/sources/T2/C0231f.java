package T2;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: T2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231f implements InterfaceC0233h, InterfaceC0232g, Cloneable, ByteChannel {

    /* renamed from: d, reason: collision with root package name */
    public A f4408d;

    /* renamed from: e, reason: collision with root package name */
    public long f4409e;

    @Override // T2.InterfaceC0233h
    public final String B(Charset charset) {
        return u(this.f4409e, charset);
    }

    @Override // T2.InterfaceC0233h
    public final int C(u uVar) {
        f2.j.f(uVar, "options");
        int b3 = U2.a.b(this, uVar, false);
        if (b3 == -1) {
            return -1;
        }
        v(uVar.f4444d[b3].b());
        return b3;
    }

    public final void D(F f3) {
        f2.j.f(f3, "source");
        while (f3.f(this, 8192L) != -1) {
        }
    }

    public final void E(int i3) {
        A x3 = x(1);
        int i4 = x3.f4374c;
        x3.f4374c = i4 + 1;
        x3.f4372a[i4] = (byte) i3;
        this.f4409e++;
    }

    public final void F(long j3) {
        if (j3 == 0) {
            E(48);
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
        A x3 = x(i3);
        int i4 = x3.f4374c;
        for (int i5 = (i4 + i3) - 1; i5 >= i4; i5--) {
            x3.f4372a[i5] = U2.a.f4515a[(int) (15 & j3)];
            j3 >>>= 4;
        }
        x3.f4374c += i3;
        this.f4409e += i3;
    }

    public final void G(int i3) {
        A x3 = x(4);
        int i4 = x3.f4374c;
        byte[] bArr = x3.f4372a;
        bArr[i4] = (byte) ((i3 >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i3 & 255);
        x3.f4374c = i4 + 4;
        this.f4409e += 4;
    }

    public final void H(int i3, int i4, String str) {
        char charAt;
        f2.j.f(str, "string");
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("beginIndex < 0: ", i3).toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(A.k.f(i4, i3, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > str.length()) {
            StringBuilder k3 = A.k.k(i4, "endIndex > string.length: ", " > ");
            k3.append(str.length());
            throw new IllegalArgumentException(k3.toString().toString());
        }
        while (i3 < i4) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < 128) {
                A x3 = x(1);
                int i5 = x3.f4374c - i3;
                int min = Math.min(i4, 8192 - i5);
                int i6 = i3 + 1;
                byte[] bArr = x3.f4372a;
                bArr[i3 + i5] = (byte) charAt2;
                while (true) {
                    i3 = i6;
                    if (i3 >= min || (charAt = str.charAt(i3)) >= 128) {
                        break;
                    }
                    i6 = i3 + 1;
                    bArr[i3 + i5] = (byte) charAt;
                }
                int i7 = x3.f4374c;
                int i8 = (i5 + i3) - i7;
                x3.f4374c = i7 + i8;
                this.f4409e += i8;
            } else {
                if (charAt2 < 2048) {
                    A x4 = x(2);
                    int i9 = x4.f4374c;
                    byte[] bArr2 = x4.f4372a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    x4.f4374c = i9 + 2;
                    this.f4409e += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    A x5 = x(3);
                    int i10 = x5.f4374c;
                    byte[] bArr3 = x5.f4372a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    x5.f4374c = i10 + 3;
                    this.f4409e += 3;
                } else {
                    int i11 = i3 + 1;
                    char charAt3 = i11 < i4 ? str.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        E(63);
                        i3 = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        A x6 = x(4);
                        int i13 = x6.f4374c;
                        byte[] bArr4 = x6.f4372a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        x6.f4374c = i13 + 4;
                        this.f4409e += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    public final void I(String str) {
        f2.j.f(str, "string");
        H(0, str.length(), str);
    }

    public final void J(int i3) {
        String str;
        int i4 = 0;
        if (i3 < 128) {
            E(i3);
            return;
        }
        if (i3 < 2048) {
            A x3 = x(2);
            int i5 = x3.f4374c;
            byte[] bArr = x3.f4372a;
            bArr[i5] = (byte) ((i3 >> 6) | 192);
            bArr[1 + i5] = (byte) ((i3 & 63) | 128);
            x3.f4374c = i5 + 2;
            this.f4409e += 2;
            return;
        }
        if (55296 <= i3 && i3 < 57344) {
            E(63);
            return;
        }
        if (i3 < 65536) {
            A x4 = x(3);
            int i6 = x4.f4374c;
            byte[] bArr2 = x4.f4372a;
            bArr2[i6] = (byte) ((i3 >> 12) | 224);
            bArr2[1 + i6] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[2 + i6] = (byte) ((i3 & 63) | 128);
            x4.f4374c = i6 + 3;
            this.f4409e += 3;
            return;
        }
        if (i3 <= 1114111) {
            A x5 = x(4);
            int i7 = x5.f4374c;
            byte[] bArr3 = x5.f4372a;
            bArr3[i7] = (byte) ((i3 >> 18) | 240);
            bArr3[1 + i7] = (byte) (((i3 >> 12) & 63) | 128);
            bArr3[2 + i7] = (byte) (((i3 >> 6) & 63) | 128);
            bArr3[3 + i7] = (byte) ((i3 & 63) | 128);
            x5.f4374c = i7 + 4;
            this.f4409e += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i3 != 0) {
            char[] cArr = U2.b.f4516a;
            char[] cArr2 = {cArr[(i3 >> 28) & 15], cArr[(i3 >> 24) & 15], cArr[(i3 >> 20) & 15], cArr[(i3 >> 16) & 15], cArr[(i3 >> 12) & 15], cArr[(i3 >> 8) & 15], cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
            while (i4 < 8 && cArr2[i4] == '0') {
                i4++;
            }
            l0.c.k(i4, 8, 8);
            str = new String(cArr2, i4, 8 - i4);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean a() {
        return this.f4409e == 0;
    }

    public final byte b(long j3) {
        O2.l.R(this.f4409e, j3, 1L);
        A a3 = this.f4408d;
        if (a3 == null) {
            f2.j.c(null);
            throw null;
        }
        long j4 = this.f4409e;
        if (j4 - j3 < j3) {
            while (j4 > j3) {
                a3 = a3.f4378g;
                f2.j.c(a3);
                j4 -= a3.f4374c - a3.f4373b;
            }
            return a3.f4372a[(int) ((a3.f4373b + j3) - j4)];
        }
        long j5 = 0;
        while (true) {
            int i3 = a3.f4374c;
            int i4 = a3.f4373b;
            long j6 = (i3 - i4) + j5;
            if (j6 > j3) {
                return a3.f4372a[(int) ((i4 + j3) - j5)];
            }
            a3 = a3.f4377f;
            f2.j.c(a3);
            j5 = j6;
        }
    }

    @Override // T2.F
    public final H c() {
        return H.f4385d;
    }

    public final Object clone() {
        C0231f c0231f = new C0231f();
        if (this.f4409e != 0) {
            A a3 = this.f4408d;
            f2.j.c(a3);
            A c2 = a3.c();
            c0231f.f4408d = c2;
            c2.f4378g = c2;
            c2.f4377f = c2;
            for (A a4 = a3.f4377f; a4 != a3; a4 = a4.f4377f) {
                A a5 = c2.f4378g;
                f2.j.c(a5);
                f2.j.c(a4);
                a5.b(a4.c());
            }
            c0231f.f4409e = this.f4409e;
        }
        return c0231f;
    }

    public final long d(C0234i c0234i) {
        int i3;
        int i4;
        f2.j.f(c0234i, "targetBytes");
        A a3 = this.f4408d;
        if (a3 == null) {
            return -1L;
        }
        long j3 = this.f4409e;
        long j4 = 0;
        byte[] bArr = c0234i.f4411d;
        if (j3 < 0) {
            while (j3 > 0) {
                a3 = a3.f4378g;
                f2.j.c(a3);
                j3 -= a3.f4374c - a3.f4373b;
            }
            if (bArr.length == 2) {
                byte b3 = bArr[0];
                byte b4 = bArr[1];
                while (j3 < this.f4409e) {
                    i3 = (int) ((a3.f4373b + j4) - j3);
                    int i5 = a3.f4374c;
                    while (i3 < i5) {
                        byte b5 = a3.f4372a[i3];
                        if (b5 != b3 && b5 != b4) {
                            i3++;
                        }
                        i4 = a3.f4373b;
                    }
                    j4 = (a3.f4374c - a3.f4373b) + j3;
                    a3 = a3.f4377f;
                    f2.j.c(a3);
                    j3 = j4;
                }
                return -1L;
            }
            while (j3 < this.f4409e) {
                i3 = (int) ((a3.f4373b + j4) - j3);
                int i6 = a3.f4374c;
                while (i3 < i6) {
                    byte b6 = a3.f4372a[i3];
                    for (byte b7 : bArr) {
                        if (b6 == b7) {
                            i4 = a3.f4373b;
                        }
                    }
                    i3++;
                }
                j4 = (a3.f4374c - a3.f4373b) + j3;
                a3 = a3.f4377f;
                f2.j.c(a3);
                j3 = j4;
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j5 = (a3.f4374c - a3.f4373b) + j3;
            if (j5 > 0) {
                break;
            }
            a3 = a3.f4377f;
            f2.j.c(a3);
            j3 = j5;
        }
        if (bArr.length == 2) {
            byte b8 = bArr[0];
            byte b9 = bArr[1];
            while (j3 < this.f4409e) {
                i3 = (int) ((a3.f4373b + j4) - j3);
                int i7 = a3.f4374c;
                while (i3 < i7) {
                    byte b10 = a3.f4372a[i3];
                    if (b10 != b8 && b10 != b9) {
                        i3++;
                    }
                    i4 = a3.f4373b;
                }
                j4 = (a3.f4374c - a3.f4373b) + j3;
                a3 = a3.f4377f;
                f2.j.c(a3);
                j3 = j4;
            }
            return -1L;
        }
        while (j3 < this.f4409e) {
            i3 = (int) ((a3.f4373b + j4) - j3);
            int i8 = a3.f4374c;
            while (i3 < i8) {
                byte b11 = a3.f4372a[i3];
                for (byte b12 : bArr) {
                    if (b11 == b12) {
                        i4 = a3.f4373b;
                    }
                }
                i3++;
            }
            j4 = (a3.f4374c - a3.f4373b) + j3;
            a3 = a3.f4377f;
            f2.j.c(a3);
            j3 = j4;
        }
        return -1L;
        return (i3 - i4) + j3;
    }

    public final boolean e(C0234i c0234i) {
        f2.j.f(c0234i, "bytes");
        byte[] bArr = c0234i.f4411d;
        int length = bArr.length;
        if (length < 0 || this.f4409e < length || bArr.length < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (b(i3) != bArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0231f) {
                long j3 = this.f4409e;
                C0231f c0231f = (C0231f) obj;
                if (j3 == c0231f.f4409e) {
                    if (j3 != 0) {
                        A a3 = this.f4408d;
                        f2.j.c(a3);
                        A a4 = c0231f.f4408d;
                        f2.j.c(a4);
                        int i3 = a3.f4373b;
                        int i4 = a4.f4373b;
                        long j4 = 0;
                        while (j4 < this.f4409e) {
                            long min = Math.min(a3.f4374c - i3, a4.f4374c - i4);
                            long j5 = 0;
                            while (j5 < min) {
                                int i5 = i3 + 1;
                                byte b3 = a3.f4372a[i3];
                                int i6 = i4 + 1;
                                if (b3 == a4.f4372a[i4]) {
                                    j5++;
                                    i4 = i6;
                                    i3 = i5;
                                }
                            }
                            if (i3 == a3.f4374c) {
                                A a5 = a3.f4377f;
                                f2.j.c(a5);
                                i3 = a5.f4373b;
                                a3 = a5;
                            }
                            if (i4 == a4.f4374c) {
                                a4 = a4.f4377f;
                                f2.j.c(a4);
                                i4 = a4.f4373b;
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

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        f2.j.f(c0231f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j4 = this.f4409e;
        if (j4 == 0) {
            return -1L;
        }
        if (j3 > j4) {
            j3 = j4;
        }
        c0231f.p(this, j3);
        return j3;
    }

    public final int g(byte[] bArr, int i3, int i4) {
        f2.j.f(bArr, "sink");
        O2.l.R(bArr.length, i3, i4);
        A a3 = this.f4408d;
        if (a3 == null) {
            return -1;
        }
        int min = Math.min(i4, a3.f4374c - a3.f4373b);
        int i5 = a3.f4373b;
        S1.k.j0(i3, i5, i5 + min, a3.f4372a, bArr);
        int i6 = a3.f4373b + min;
        a3.f4373b = i6;
        this.f4409e -= min;
        if (i6 == a3.f4374c) {
            this.f4408d = a3.a();
            B.a(a3);
        }
        return min;
    }

    public final byte h() {
        if (this.f4409e == 0) {
            throw new EOFException();
        }
        A a3 = this.f4408d;
        f2.j.c(a3);
        int i3 = a3.f4373b;
        int i4 = a3.f4374c;
        int i5 = i3 + 1;
        byte b3 = a3.f4372a[i3];
        this.f4409e--;
        if (i5 == i4) {
            this.f4408d = a3.a();
            B.a(a3);
        } else {
            a3.f4373b = i5;
        }
        return b3;
    }

    public final int hashCode() {
        A a3 = this.f4408d;
        if (a3 == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = a3.f4374c;
            for (int i5 = a3.f4373b; i5 < i4; i5++) {
                i3 = (i3 * 31) + a3.f4372a[i5];
            }
            a3 = a3.f4377f;
            f2.j.c(a3);
        } while (a3 != this.f4408d);
        return i3;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] l(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f4409e < j3) {
            throw new EOFException();
        }
        int i3 = (int) j3;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int g3 = g(bArr, i4, i3 - i4);
            if (g3 == -1) {
                throw new EOFException();
            }
            i4 += g3;
        }
        return bArr;
    }

    public final C0234i n(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f4409e < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new C0234i(l(j3));
        }
        C0234i w2 = w((int) j3);
        v(j3);
        return w2;
    }

    @Override // T2.InterfaceC0232g
    public final /* bridge */ /* synthetic */ InterfaceC0232g o(String str) {
        I(str);
        return this;
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        A b3;
        f2.j.f(c0231f, "source");
        if (c0231f == this) {
            throw new IllegalArgumentException("source == this");
        }
        O2.l.R(c0231f.f4409e, 0L, j3);
        while (j3 > 0) {
            A a3 = c0231f.f4408d;
            f2.j.c(a3);
            int i3 = a3.f4374c;
            A a4 = c0231f.f4408d;
            f2.j.c(a4);
            long j4 = i3 - a4.f4373b;
            int i4 = 0;
            if (j3 < j4) {
                A a5 = this.f4408d;
                A a6 = a5 != null ? a5.f4378g : null;
                if (a6 != null && a6.f4376e) {
                    if ((a6.f4374c + j3) - (a6.f4375d ? 0 : a6.f4373b) <= 8192) {
                        A a7 = c0231f.f4408d;
                        f2.j.c(a7);
                        a7.d(a6, (int) j3);
                        c0231f.f4409e -= j3;
                        this.f4409e += j3;
                        return;
                    }
                }
                A a8 = c0231f.f4408d;
                f2.j.c(a8);
                int i5 = (int) j3;
                if (i5 <= 0 || i5 > a8.f4374c - a8.f4373b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i5 >= 1024) {
                    b3 = a8.c();
                } else {
                    b3 = B.b();
                    int i6 = a8.f4373b;
                    S1.k.j0(0, i6, i6 + i5, a8.f4372a, b3.f4372a);
                }
                b3.f4374c = b3.f4373b + i5;
                a8.f4373b += i5;
                A a9 = a8.f4378g;
                f2.j.c(a9);
                a9.b(b3);
                c0231f.f4408d = b3;
            }
            A a10 = c0231f.f4408d;
            f2.j.c(a10);
            long j5 = a10.f4374c - a10.f4373b;
            c0231f.f4408d = a10.a();
            A a11 = this.f4408d;
            if (a11 == null) {
                this.f4408d = a10;
                a10.f4378g = a10;
                a10.f4377f = a10;
            } else {
                A a12 = a11.f4378g;
                f2.j.c(a12);
                a12.b(a10);
                A a13 = a10.f4378g;
                if (a13 == a10) {
                    throw new IllegalStateException("cannot compact");
                }
                f2.j.c(a13);
                if (a13.f4376e) {
                    int i7 = a10.f4374c - a10.f4373b;
                    A a14 = a10.f4378g;
                    f2.j.c(a14);
                    int i8 = 8192 - a14.f4374c;
                    A a15 = a10.f4378g;
                    f2.j.c(a15);
                    if (!a15.f4375d) {
                        A a16 = a10.f4378g;
                        f2.j.c(a16);
                        i4 = a16.f4373b;
                    }
                    if (i7 <= i8 + i4) {
                        A a17 = a10.f4378g;
                        f2.j.c(a17);
                        a10.d(a17, i7);
                        a10.a();
                        B.a(a10);
                    }
                }
            }
            c0231f.f4409e -= j5;
            this.f4409e += j5;
            j3 -= j5;
        }
    }

    public final int q() {
        if (this.f4409e < 4) {
            throw new EOFException();
        }
        A a3 = this.f4408d;
        f2.j.c(a3);
        int i3 = a3.f4373b;
        int i4 = a3.f4374c;
        if (i4 - i3 < 4) {
            return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
        }
        byte[] bArr = a3.f4372a;
        int i5 = i3 + 3;
        int i6 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i7 = i3 + 4;
        int i8 = i6 | (bArr[i5] & 255);
        this.f4409e -= 4;
        if (i7 == i4) {
            this.f4408d = a3.a();
            B.a(a3);
        } else {
            a3.f4373b = i7;
        }
        return i8;
    }

    public final short r() {
        if (this.f4409e < 2) {
            throw new EOFException();
        }
        A a3 = this.f4408d;
        f2.j.c(a3);
        int i3 = a3.f4373b;
        int i4 = a3.f4374c;
        if (i4 - i3 < 2) {
            return (short) (((h() & 255) << 8) | (h() & 255));
        }
        int i5 = i3 + 1;
        byte[] bArr = a3.f4372a;
        int i6 = (bArr[i3] & 255) << 8;
        int i7 = i3 + 2;
        int i8 = (bArr[i5] & 255) | i6;
        this.f4409e -= 2;
        if (i7 == i4) {
            this.f4408d = a3.a();
            B.a(a3);
        } else {
            a3.f4373b = i7;
        }
        return (short) i8;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        f2.j.f(byteBuffer, "sink");
        A a3 = this.f4408d;
        if (a3 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), a3.f4374c - a3.f4373b);
        byteBuffer.put(a3.f4372a, a3.f4373b, min);
        int i3 = a3.f4373b + min;
        a3.f4373b = i3;
        this.f4409e -= min;
        if (i3 == a3.f4374c) {
            this.f4408d = a3.a();
            B.a(a3);
        }
        return min;
    }

    public final short s() {
        short r3 = r();
        return (short) (((r3 & 255) << 8) | ((65280 & r3) >>> 8));
    }

    public final String toString() {
        long j3 = this.f4409e;
        if (j3 <= 2147483647L) {
            return w((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4409e).toString());
    }

    public final String u(long j3, Charset charset) {
        f2.j.f(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f4409e < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        A a3 = this.f4408d;
        f2.j.c(a3);
        int i3 = a3.f4373b;
        if (i3 + j3 > a3.f4374c) {
            return new String(l(j3), charset);
        }
        int i4 = (int) j3;
        String str = new String(a3.f4372a, i3, i4, charset);
        int i5 = a3.f4373b + i4;
        a3.f4373b = i5;
        this.f4409e -= j3;
        if (i5 == a3.f4374c) {
            this.f4408d = a3.a();
            B.a(a3);
        }
        return str;
    }

    public final void v(long j3) {
        while (j3 > 0) {
            A a3 = this.f4408d;
            if (a3 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j3, a3.f4374c - a3.f4373b);
            long j4 = min;
            this.f4409e -= j4;
            j3 -= j4;
            int i3 = a3.f4373b + min;
            a3.f4373b = i3;
            if (i3 == a3.f4374c) {
                this.f4408d = a3.a();
                B.a(a3);
            }
        }
    }

    public final C0234i w(int i3) {
        if (i3 == 0) {
            return C0234i.f4410g;
        }
        O2.l.R(this.f4409e, 0L, i3);
        A a3 = this.f4408d;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            f2.j.c(a3);
            int i7 = a3.f4374c;
            int i8 = a3.f4373b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            a3 = a3.f4377f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        A a4 = this.f4408d;
        int i9 = 0;
        while (i4 < i3) {
            f2.j.c(a4);
            bArr[i9] = a4.f4372a;
            i4 += a4.f4374c - a4.f4373b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = a4.f4373b;
            a4.f4375d = true;
            i9++;
            a4 = a4.f4377f;
        }
        return new C(bArr, iArr);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        f2.j.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            A x3 = x(1);
            int min = Math.min(i3, 8192 - x3.f4374c);
            byteBuffer.get(x3.f4372a, x3.f4374c, min);
            i3 -= min;
            x3.f4374c += min;
        }
        this.f4409e += remaining;
        return remaining;
    }

    public final A x(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        A a3 = this.f4408d;
        if (a3 == null) {
            A b3 = B.b();
            this.f4408d = b3;
            b3.f4378g = b3;
            b3.f4377f = b3;
            return b3;
        }
        A a4 = a3.f4378g;
        f2.j.c(a4);
        if (a4.f4374c + i3 <= 8192 && a4.f4376e) {
            return a4;
        }
        A b4 = B.b();
        a4.b(b4);
        return b4;
    }

    public final void y(C0234i c0234i) {
        f2.j.f(c0234i, "byteString");
        c0234i.p(this, c0234i.b());
    }

    public final void z(byte[] bArr, int i3, int i4) {
        f2.j.f(bArr, "source");
        long j3 = i4;
        O2.l.R(bArr.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            A x3 = x(1);
            int min = Math.min(i5 - i3, 8192 - x3.f4374c);
            int i6 = i3 + min;
            S1.k.j0(x3.f4374c, i3, i6, bArr, x3.f4372a);
            x3.f4374c += min;
            i3 = i6;
        }
        this.f4409e += j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, T2.D
    public final void close() {
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
    }
}
