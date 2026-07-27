package z3;

import A.AbstractC0017m;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;
import z2.C1436t;

/* renamed from: z3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448f implements InterfaceC1450h, InterfaceC1449g, Cloneable, ByteChannel {

    /* renamed from: d, reason: collision with root package name */
    public A f11998d;

    /* renamed from: e, reason: collision with root package name */
    public long f11999e;

    public final void A(int i2) {
        A u4 = u(4);
        int i4 = u4.f11964c;
        byte[] bArr = u4.f11962a;
        bArr[i4] = (byte) ((i2 >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i2 & 255);
        u4.f11964c = i4 + 4;
        this.f11999e += 4;
    }

    public final void B(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        C(string, 0, string.length());
    }

    public final void C(String string, int i2, int i4) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "beginIndex < 0: ").toString());
        }
        if (i4 < i2) {
            throw new IllegalArgumentException(r0.B.b(i4, i2, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > string.length()) {
            StringBuilder o4 = AbstractC0017m.o(i4, "endIndex > string.length: ", " > ");
            o4.append(string.length());
            throw new IllegalArgumentException(o4.toString().toString());
        }
        while (i2 < i4) {
            char charAt2 = string.charAt(i2);
            if (charAt2 < 128) {
                A u4 = u(1);
                int i5 = u4.f11964c - i2;
                int min = Math.min(i4, 8192 - i5);
                int i6 = i2 + 1;
                byte[] bArr = u4.f11962a;
                bArr[i2 + i5] = (byte) charAt2;
                while (true) {
                    i2 = i6;
                    if (i2 >= min || (charAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i6 = i2 + 1;
                    bArr[i2 + i5] = (byte) charAt;
                }
                int i7 = u4.f11964c;
                int i8 = (i5 + i2) - i7;
                u4.f11964c = i7 + i8;
                this.f11999e += i8;
            } else {
                if (charAt2 < 2048) {
                    A u5 = u(2);
                    int i9 = u5.f11964c;
                    byte[] bArr2 = u5.f11962a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    u5.f11964c = i9 + 2;
                    this.f11999e += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    A u6 = u(3);
                    int i10 = u6.f11964c;
                    byte[] bArr3 = u6.f11962a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    u6.f11964c = i10 + 3;
                    this.f11999e += 3;
                } else {
                    int i11 = i2 + 1;
                    char charAt3 = i11 < i4 ? string.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        y(63);
                        i2 = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        A u7 = u(4);
                        int i13 = u7.f11964c;
                        byte[] bArr4 = u7.f11962a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        u7.f11964c = i13 + 4;
                        this.f11999e += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void D(int i2) {
        String str;
        int i4 = 0;
        if (i2 < 128) {
            y(i2);
            return;
        }
        if (i2 < 2048) {
            A u4 = u(2);
            int i5 = u4.f11964c;
            byte[] bArr = u4.f11962a;
            bArr[i5] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i5] = (byte) ((i2 & 63) | 128);
            u4.f11964c = i5 + 2;
            this.f11999e += 2;
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            y(63);
            return;
        }
        if (i2 < 65536) {
            A u5 = u(3);
            int i6 = u5.f11964c;
            byte[] bArr2 = u5.f11962a;
            bArr2[i6] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i6] = (byte) ((i2 & 63) | 128);
            u5.f11964c = i6 + 3;
            this.f11999e += 3;
            return;
        }
        if (i2 <= 1114111) {
            A u6 = u(4);
            int i7 = u6.f11964c;
            byte[] bArr3 = u6.f11962a;
            bArr3[i7] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i7] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i7] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i7] = (byte) ((i2 & 63) | 128);
            u6.f11964c = i7 + 4;
            this.f11999e += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i2 != 0) {
            char[] cArr = A3.b.f843a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i4 < 8 && cArr2[i4] == '0') {
                i4++;
            }
            Intrinsics.checkNotNullParameter(cArr2, "<this>");
            AbstractC1420d.f11939d.getClass();
            AbstractC1420d.a.a(i4, 8, 8);
            str = new String(cArr2, i4, 8 - i4);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean a() {
        return this.f11999e == 0;
    }

    public final byte b(long j4) {
        m3.s.g(this.f11999e, j4, 1L);
        A a4 = this.f11998d;
        if (a4 == null) {
            Intrinsics.c(null);
            throw null;
        }
        long j5 = this.f11999e;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                a4 = a4.f11968g;
                Intrinsics.c(a4);
                j5 -= a4.f11964c - a4.f11963b;
            }
            return a4.f11962a[(int) ((a4.f11963b + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            int i2 = a4.f11964c;
            int i4 = a4.f11963b;
            long j7 = (i2 - i4) + j6;
            if (j7 > j4) {
                return a4.f11962a[(int) ((i4 + j4) - j6)];
            }
            a4 = a4.f11967f;
            Intrinsics.c(a4);
            j6 = j7;
        }
    }

    @Override // z3.F
    public final H c() {
        return H.f11975d;
    }

    public final Object clone() {
        C1448f c1448f = new C1448f();
        if (this.f11999e != 0) {
            A a4 = this.f11998d;
            Intrinsics.c(a4);
            A c4 = a4.c();
            c1448f.f11998d = c4;
            c4.f11968g = c4;
            c4.f11967f = c4;
            for (A a5 = a4.f11967f; a5 != a4; a5 = a5.f11967f) {
                A a6 = c4.f11968g;
                Intrinsics.c(a6);
                Intrinsics.c(a5);
                a6.b(a5.c());
            }
            c1448f.f11999e = this.f11999e;
        }
        return c1448f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, z3.D
    public final void close() {
    }

    public final long d(C1451i targetBytes) {
        int i2;
        int i4;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        A a4 = this.f11998d;
        if (a4 == null) {
            return -1L;
        }
        long j4 = this.f11999e;
        long j5 = 0;
        if (j4 < 0) {
            while (j4 > 0) {
                a4 = a4.f11968g;
                Intrinsics.c(a4);
                j4 -= a4.f11964c - a4.f11963b;
            }
            byte[] bArr = targetBytes.f12001d;
            if (bArr.length == 2) {
                byte b4 = bArr[0];
                byte b5 = bArr[1];
                while (j4 < this.f11999e) {
                    i2 = (int) ((a4.f11963b + j5) - j4);
                    int i5 = a4.f11964c;
                    while (i2 < i5) {
                        byte b6 = a4.f11962a[i2];
                        if (b6 != b4 && b6 != b5) {
                            i2++;
                        }
                        i4 = a4.f11963b;
                    }
                    j5 = (a4.f11964c - a4.f11963b) + j4;
                    a4 = a4.f11967f;
                    Intrinsics.c(a4);
                    j4 = j5;
                }
                return -1L;
            }
            while (j4 < this.f11999e) {
                i2 = (int) ((a4.f11963b + j5) - j4);
                int i6 = a4.f11964c;
                while (i2 < i6) {
                    byte b7 = a4.f11962a[i2];
                    for (byte b8 : bArr) {
                        if (b7 == b8) {
                            i4 = a4.f11963b;
                        }
                    }
                    i2++;
                }
                j5 = (a4.f11964c - a4.f11963b) + j4;
                a4 = a4.f11967f;
                Intrinsics.c(a4);
                j4 = j5;
            }
            return -1L;
        }
        j4 = 0;
        while (true) {
            long j6 = (a4.f11964c - a4.f11963b) + j4;
            if (j6 > 0) {
                break;
            }
            a4 = a4.f11967f;
            Intrinsics.c(a4);
            j4 = j6;
        }
        byte[] bArr2 = targetBytes.f12001d;
        if (bArr2.length == 2) {
            byte b9 = bArr2[0];
            byte b10 = bArr2[1];
            while (j4 < this.f11999e) {
                i2 = (int) ((a4.f11963b + j5) - j4);
                int i7 = a4.f11964c;
                while (i2 < i7) {
                    byte b11 = a4.f11962a[i2];
                    if (b11 != b9 && b11 != b10) {
                        i2++;
                    }
                    i4 = a4.f11963b;
                }
                j5 = (a4.f11964c - a4.f11963b) + j4;
                a4 = a4.f11967f;
                Intrinsics.c(a4);
                j4 = j5;
            }
            return -1L;
        }
        while (j4 < this.f11999e) {
            i2 = (int) ((a4.f11963b + j5) - j4);
            int i8 = a4.f11964c;
            while (i2 < i8) {
                byte b12 = a4.f11962a[i2];
                for (byte b13 : bArr2) {
                    if (b12 == b13) {
                        i4 = a4.f11963b;
                    }
                }
                i2++;
            }
            j5 = (a4.f11964c - a4.f11963b) + j4;
            a4 = a4.f11967f;
            Intrinsics.c(a4);
            j4 = j5;
        }
        return -1L;
        return (i2 - i4) + j4;
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        A b4;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        m3.s.g(source.f11999e, 0L, j4);
        while (j4 > 0) {
            A a4 = source.f11998d;
            Intrinsics.c(a4);
            int i2 = a4.f11964c;
            A a5 = source.f11998d;
            Intrinsics.c(a5);
            long j5 = i2 - a5.f11963b;
            int i4 = 0;
            if (j4 < j5) {
                A a6 = this.f11998d;
                A a7 = a6 != null ? a6.f11968g : null;
                if (a7 != null && a7.f11966e) {
                    if ((a7.f11964c + j4) - (a7.f11965d ? 0 : a7.f11963b) <= 8192) {
                        A a8 = source.f11998d;
                        Intrinsics.c(a8);
                        a8.d(a7, (int) j4);
                        source.f11999e -= j4;
                        this.f11999e += j4;
                        return;
                    }
                }
                A a9 = source.f11998d;
                Intrinsics.c(a9);
                int i5 = (int) j4;
                if (i5 <= 0 || i5 > a9.f11964c - a9.f11963b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i5 >= 1024) {
                    b4 = a9.c();
                } else {
                    b4 = B.b();
                    int i6 = a9.f11963b;
                    C1436t.c(0, i6, i6 + i5, a9.f11962a, b4.f11962a);
                }
                b4.f11964c = b4.f11963b + i5;
                a9.f11963b += i5;
                A a10 = a9.f11968g;
                Intrinsics.c(a10);
                a10.b(b4);
                source.f11998d = b4;
            }
            A a11 = source.f11998d;
            Intrinsics.c(a11);
            long j6 = a11.f11964c - a11.f11963b;
            source.f11998d = a11.a();
            A a12 = this.f11998d;
            if (a12 == null) {
                this.f11998d = a11;
                a11.f11968g = a11;
                a11.f11967f = a11;
            } else {
                A a13 = a12.f11968g;
                Intrinsics.c(a13);
                a13.b(a11);
                A a14 = a11.f11968g;
                if (a14 == a11) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.c(a14);
                if (a14.f11966e) {
                    int i7 = a11.f11964c - a11.f11963b;
                    A a15 = a11.f11968g;
                    Intrinsics.c(a15);
                    int i8 = 8192 - a15.f11964c;
                    A a16 = a11.f11968g;
                    Intrinsics.c(a16);
                    if (!a16.f11965d) {
                        A a17 = a11.f11968g;
                        Intrinsics.c(a17);
                        i4 = a17.f11963b;
                    }
                    if (i7 <= i8 + i4) {
                        A a18 = a11.f11968g;
                        Intrinsics.c(a18);
                        a11.d(a18, i7);
                        a11.a();
                        B.a(a11);
                    }
                }
            }
            source.f11999e -= j6;
            this.f11999e += j6;
            j4 -= j6;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1448f) {
                long j4 = this.f11999e;
                C1448f c1448f = (C1448f) obj;
                if (j4 == c1448f.f11999e) {
                    if (j4 != 0) {
                        A a4 = this.f11998d;
                        Intrinsics.c(a4);
                        A a5 = c1448f.f11998d;
                        Intrinsics.c(a5);
                        int i2 = a4.f11963b;
                        int i4 = a5.f11963b;
                        long j5 = 0;
                        while (j5 < this.f11999e) {
                            long min = Math.min(a4.f11964c - i2, a5.f11964c - i4);
                            long j6 = 0;
                            while (j6 < min) {
                                int i5 = i2 + 1;
                                byte b4 = a4.f11962a[i2];
                                int i6 = i4 + 1;
                                if (b4 == a5.f11962a[i4]) {
                                    j6++;
                                    i4 = i6;
                                    i2 = i5;
                                }
                            }
                            if (i2 == a4.f11964c) {
                                A a6 = a4.f11967f;
                                Intrinsics.c(a6);
                                i2 = a6.f11963b;
                                a4 = a6;
                            }
                            if (i4 == a5.f11964c) {
                                a5 = a5.f11967f;
                                Intrinsics.c(a5);
                                i4 = a5.f11963b;
                            }
                            j5 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(C1451i bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.f12001d.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (length < 0 || this.f11999e < length) {
            return false;
        }
        byte[] bArr = bytes.f12001d;
        if (bArr.length < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (b(i2) != bArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
    }

    public final int g(byte[] sink, int i2, int i4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m3.s.g(sink.length, i2, i4);
        A a4 = this.f11998d;
        if (a4 == null) {
            return -1;
        }
        int min = Math.min(i4, a4.f11964c - a4.f11963b);
        int i5 = a4.f11963b;
        C1436t.c(i2, i5, i5 + min, a4.f11962a, sink);
        int i6 = a4.f11963b + min;
        a4.f11963b = i6;
        this.f11999e -= min;
        if (i6 == a4.f11964c) {
            this.f11998d = a4.a();
            B.a(a4);
        }
        return min;
    }

    public final byte h() {
        if (this.f11999e == 0) {
            throw new EOFException();
        }
        A a4 = this.f11998d;
        Intrinsics.c(a4);
        int i2 = a4.f11963b;
        int i4 = a4.f11964c;
        int i5 = i2 + 1;
        byte b4 = a4.f11962a[i2];
        this.f11999e--;
        if (i5 == i4) {
            this.f11998d = a4.a();
            B.a(a4);
        } else {
            a4.f11963b = i5;
        }
        return b4;
    }

    public final int hashCode() {
        A a4 = this.f11998d;
        if (a4 == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i4 = a4.f11964c;
            for (int i5 = a4.f11963b; i5 < i4; i5++) {
                i2 = (i2 * 31) + a4.f11962a[i5];
            }
            a4 = a4.f11967f;
            Intrinsics.c(a4);
        } while (a4 != this.f11998d);
        return i2;
    }

    public final byte[] i(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount: ", j4).toString());
        }
        if (this.f11999e < j4) {
            throw new EOFException();
        }
        int i2 = (int) j4;
        byte[] sink = new byte[i2];
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i4 = 0;
        while (i4 < i2) {
            int g4 = g(sink, i4, i2 - i4);
            if (g4 == -1) {
                throw new EOFException();
            }
            i4 += g4;
        }
        return sink;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final C1451i j(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount: ", j4).toString());
        }
        if (this.f11999e < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new C1451i(i(j4));
        }
        C1451i t4 = t((int) j4);
        s(j4);
        return t4;
    }

    public final int k() {
        if (this.f11999e < 4) {
            throw new EOFException();
        }
        A a4 = this.f11998d;
        Intrinsics.c(a4);
        int i2 = a4.f11963b;
        int i4 = a4.f11964c;
        if (i4 - i2 < 4) {
            return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
        }
        byte[] bArr = a4.f11962a;
        int i5 = i2 + 3;
        int i6 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i7 = i2 + 4;
        int i8 = i6 | (bArr[i5] & 255);
        this.f11999e -= 4;
        if (i7 == i4) {
            this.f11998d = a4.a();
            B.a(a4);
        } else {
            a4.f11963b = i7;
        }
        return i8;
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        long j5 = this.f11999e;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        sink.e(this, j4);
        return j4;
    }

    @Override // z3.InterfaceC1449g
    public final /* bridge */ /* synthetic */ InterfaceC1449g m(String str) {
        B(str);
        return this;
    }

    public final short n() {
        if (this.f11999e < 2) {
            throw new EOFException();
        }
        A a4 = this.f11998d;
        Intrinsics.c(a4);
        int i2 = a4.f11963b;
        int i4 = a4.f11964c;
        if (i4 - i2 < 2) {
            return (short) (((h() & 255) << 8) | (h() & 255));
        }
        int i5 = i2 + 1;
        byte[] bArr = a4.f11962a;
        int i6 = (bArr[i2] & 255) << 8;
        int i7 = i2 + 2;
        int i8 = (bArr[i5] & 255) | i6;
        this.f11999e -= 2;
        if (i7 == i4) {
            this.f11998d = a4.a();
            B.a(a4);
        } else {
            a4.f11963b = i7;
        }
        return (short) i8;
    }

    @Override // z3.InterfaceC1450h
    public final String o(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return r(this.f11999e, charset);
    }

    public final short p() {
        short n2 = n();
        return (short) (((n2 & 255) << 8) | ((65280 & n2) >>> 8));
    }

    @Override // z3.InterfaceC1450h
    public final int q(u options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int b4 = A3.a.b(this, options, false);
        if (b4 == -1) {
            return -1;
        }
        s(options.f12035e[b4].c());
        return b4;
    }

    public final String r(long j4, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount: ", j4).toString());
        }
        if (this.f11999e < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        A a4 = this.f11998d;
        Intrinsics.c(a4);
        int i2 = a4.f11963b;
        if (i2 + j4 > a4.f11964c) {
            return new String(i(j4), charset);
        }
        int i4 = (int) j4;
        String str = new String(a4.f11962a, i2, i4, charset);
        int i5 = a4.f11963b + i4;
        a4.f11963b = i5;
        this.f11999e -= j4;
        if (i5 == a4.f11964c) {
            this.f11998d = a4.a();
            B.a(a4);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        A a4 = this.f11998d;
        if (a4 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), a4.f11964c - a4.f11963b);
        sink.put(a4.f11962a, a4.f11963b, min);
        int i2 = a4.f11963b + min;
        a4.f11963b = i2;
        this.f11999e -= min;
        if (i2 == a4.f11964c) {
            this.f11998d = a4.a();
            B.a(a4);
        }
        return min;
    }

    public final void s(long j4) {
        while (j4 > 0) {
            A a4 = this.f11998d;
            if (a4 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, a4.f11964c - a4.f11963b);
            long j5 = min;
            this.f11999e -= j5;
            j4 -= j5;
            int i2 = a4.f11963b + min;
            a4.f11963b = i2;
            if (i2 == a4.f11964c) {
                this.f11998d = a4.a();
                B.a(a4);
            }
        }
    }

    public final C1451i t(int i2) {
        if (i2 == 0) {
            return C1451i.f12000j;
        }
        m3.s.g(this.f11999e, 0L, i2);
        A a4 = this.f11998d;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            Intrinsics.c(a4);
            int i7 = a4.f11964c;
            int i8 = a4.f11963b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            a4 = a4.f11967f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        A a5 = this.f11998d;
        int i9 = 0;
        while (i4 < i2) {
            Intrinsics.c(a5);
            bArr[i9] = a5.f11962a;
            i4 += a5.f11964c - a5.f11963b;
            iArr[i9] = Math.min(i4, i2);
            iArr[i9 + i6] = a5.f11963b;
            a5.f11965d = true;
            i9++;
            a5 = a5.f11967f;
        }
        return new C(bArr, iArr);
    }

    public final String toString() {
        long j4 = this.f11999e;
        if (j4 <= 2147483647L) {
            return t((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f11999e).toString());
    }

    public final A u(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        A a4 = this.f11998d;
        if (a4 == null) {
            A b4 = B.b();
            this.f11998d = b4;
            b4.f11968g = b4;
            b4.f11967f = b4;
            return b4;
        }
        A a5 = a4.f11968g;
        Intrinsics.c(a5);
        if (a5.f11964c + i2 <= 8192 && a5.f11966e) {
            return a5;
        }
        A b5 = B.b();
        a5.b(b5);
        return b5;
    }

    public final void v(C1451i byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.D(this, byteString.c());
    }

    public final void w(byte[] source, int i2, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = i4;
        m3.s.g(source.length, i2, j4);
        int i5 = i4 + i2;
        while (i2 < i5) {
            A u4 = u(1);
            int min = Math.min(i5 - i2, 8192 - u4.f11964c);
            int i6 = i2 + min;
            C1436t.c(u4.f11964c, i2, i6, source, u4.f11962a);
            u4.f11964c += min;
            i2 = i6;
        }
        this.f11999e += j4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            A u4 = u(1);
            int min = Math.min(i2, 8192 - u4.f11964c);
            source.get(u4.f11962a, u4.f11964c, min);
            i2 -= min;
            u4.f11964c += min;
        }
        this.f11999e += remaining;
        return remaining;
    }

    public final void x(F source) {
        Intrinsics.checkNotNullParameter(source, "source");
        while (source.l(this, 8192L) != -1) {
        }
    }

    public final void y(int i2) {
        A u4 = u(1);
        int i4 = u4.f11964c;
        u4.f11964c = i4 + 1;
        u4.f11962a[i4] = (byte) i2;
        this.f11999e++;
    }

    public final void z(long j4) {
        if (j4 == 0) {
            y(48);
            return;
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i2 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + 3) / 4);
        A u4 = u(i2);
        int i4 = u4.f11964c;
        for (int i5 = (i4 + i2) - 1; i5 >= i4; i5--) {
            u4.f11962a[i5] = A3.a.f842a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        u4.f11964c += i2;
        this.f11999e += i2;
    }
}
