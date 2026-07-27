package z3;

import A.AbstractC0017m;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class z implements InterfaceC1450h {

    /* renamed from: d, reason: collision with root package name */
    public final F f12044d;

    /* renamed from: e, reason: collision with root package name */
    public final C1448f f12045e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12046i;

    public z(F source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f12044d = source;
        this.f12045e = new C1448f();
    }

    public final boolean a() {
        if (this.f12046i) {
            throw new IllegalStateException("closed");
        }
        C1448f c1448f = this.f12045e;
        return c1448f.a() && this.f12044d.l(c1448f, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f11999e + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(byte b4, long j4, long j5) {
        long j6;
        A a4;
        z zVar = this;
        long j7 = j5;
        if (zVar.f12046i) {
            throw new IllegalStateException("closed");
        }
        long j8 = 0;
        if (0 > j7) {
            throw new IllegalArgumentException(AbstractC0017m.i("fromIndex=0 toIndex=", j7).toString());
        }
        while (true) {
            if (j8 >= j7) {
                j6 = -1;
                break;
            }
            C1448f c1448f = zVar.f12045e;
            c1448f.getClass();
            long j9 = 0;
            if (0 > j8 || j8 > j7) {
                break;
            }
            long j10 = c1448f.f11999e;
            long j11 = j7 > j10 ? j10 : j7;
            long j12 = -1;
            if (j8 != j11 && (a4 = c1448f.f11998d) != null) {
                if (j10 - j8 >= j8) {
                    while (true) {
                        long j13 = (a4.f11964c - a4.f11963b) + j9;
                        if (j13 > j8) {
                            break;
                        }
                        a4 = a4.f11967f;
                        Intrinsics.c(a4);
                        j9 = j13;
                    }
                    long j14 = j8;
                    while (true) {
                        if (j9 >= j11) {
                            break;
                        }
                        int min = (int) Math.min(a4.f11964c, (a4.f11963b + j11) - j9);
                        for (int i2 = (int) ((a4.f11963b + j14) - j9); i2 < min; i2++) {
                            if (a4.f11962a[i2] == b4) {
                                j12 = (i2 - a4.f11963b) + j9;
                                break;
                            }
                        }
                        j14 = (a4.f11964c - a4.f11963b) + j9;
                        a4 = a4.f11967f;
                        Intrinsics.c(a4);
                        j9 = j14;
                    }
                } else {
                    while (j10 > j8) {
                        a4 = a4.f11968g;
                        Intrinsics.c(a4);
                        j10 -= a4.f11964c - a4.f11963b;
                    }
                    long j15 = j8;
                    while (true) {
                        if (j10 >= j11) {
                            break;
                        }
                        int min2 = (int) Math.min(a4.f11964c, (a4.f11963b + j11) - j10);
                        for (int i4 = (int) ((a4.f11963b + j15) - j10); i4 < min2; i4++) {
                            if (a4.f11962a[i4] == b4) {
                                j12 = (i4 - a4.f11963b) + j10;
                                break;
                            }
                        }
                        j15 = j10 + (a4.f11964c - a4.f11963b);
                        a4 = a4.f11967f;
                        Intrinsics.c(a4);
                        j10 = j15;
                    }
                }
            }
            j6 = -1;
            if (j12 != -1) {
                return j12;
            }
            long j16 = c1448f.f11999e;
            if (j16 >= j5) {
                break;
            }
            zVar = this;
            if (zVar.f12044d.l(c1448f, 8192L) == -1) {
                break;
            }
            j8 = Math.max(j8, j16);
            j7 = j5;
        }
        return j6;
    }

    @Override // z3.F
    public final H c() {
        return this.f12044d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f12046i) {
            return;
        }
        this.f12046i = true;
        this.f12044d.close();
        C1448f c1448f = this.f12045e;
        c1448f.s(c1448f.f11999e);
    }

    public final byte d() {
        t(1L);
        return this.f12045e.h();
    }

    public final C1451i f(long j4) {
        t(j4);
        return this.f12045e.j(j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g() {
        C1448f c1448f;
        long j4;
        int i2;
        int i4;
        byte b4;
        t(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            boolean s4 = s(i6);
            c1448f = this.f12045e;
            if (!s4) {
                break;
            }
            b4 = c1448f.b(i5);
            if ((b4 < 48 || b4 > 57) && ((b4 < 97 || b4 > 102) && (b4 < 65 || b4 > 70))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(b4, CharsKt.checkRadix(CharsKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        long j5 = 0;
        if (c1448f.f11999e == 0) {
            throw new EOFException();
        }
        long j6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (true) {
            A a4 = c1448f.f11998d;
            Intrinsics.c(a4);
            int i8 = a4.f11963b;
            int i9 = a4.f11964c;
            int i10 = i7;
            while (i8 < i9) {
                byte b5 = a4.f11962a[i8];
                if (b5 >= 48 && b5 <= 57) {
                    i4 = b5 - 48;
                } else if (b5 >= 97 && b5 <= 102) {
                    i4 = b5 - 87;
                } else if (b5 < 65 || b5 > 70) {
                    i2 = i10;
                    j4 = 0;
                    if (i2 == 0) {
                        char[] cArr = A3.b.f843a;
                        char[] cArr2 = {cArr[(b5 >> 4) & 15], cArr[b5 & 15]};
                        Intrinsics.checkNotNullParameter(cArr2, "<this>");
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(cArr2)));
                    }
                    z4 = true;
                    if (i8 != i9) {
                        c1448f.f11998d = a4.a();
                        B.a(a4);
                    } else {
                        a4.f11963b = i8;
                    }
                    if (!!z4 || c1448f.f11998d == null) {
                        break;
                    }
                    i7 = i2;
                    j5 = j4;
                } else {
                    i4 = b5 - 55;
                }
                if ((j6 & (-1152921504606846976L)) != 0) {
                    C1448f c1448f2 = new C1448f();
                    c1448f2.z(j6);
                    c1448f2.y(b5);
                    throw new NumberFormatException("Number too large: ".concat(c1448f2.r(c1448f2.f11999e, Charsets.UTF_8)));
                }
                j6 = (j6 << 4) | i4;
                i8++;
                i10++;
                j5 = 0;
            }
            j4 = j5;
            i2 = i10;
            if (i8 != i9) {
            }
            if (!z4) {
                break;
            }
            break;
        }
        c1448f.f11999e -= i2;
        return j6;
    }

    public final int h() {
        t(4L);
        return this.f12045e.k();
    }

    public final int i() {
        t(4L);
        int k4 = this.f12045e.k();
        return ((k4 & 255) << 24) | (((-16777216) & k4) >>> 24) | ((16711680 & k4) >>> 8) | ((65280 & k4) << 8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f12046i;
    }

    public final long j() {
        long j4;
        t(8L);
        C1448f c1448f = this.f12045e;
        if (c1448f.f11999e < 8) {
            throw new EOFException();
        }
        A a4 = c1448f.f11998d;
        Intrinsics.c(a4);
        int i2 = a4.f11963b;
        int i4 = a4.f11964c;
        if (i4 - i2 < 8) {
            j4 = ((c1448f.k() & 4294967295L) << 32) | (4294967295L & c1448f.k());
        } else {
            byte[] bArr = a4.f11962a;
            int i5 = i2 + 7;
            long j5 = ((bArr[i2] & 255) << 56) | ((bArr[i2 + 1] & 255) << 48) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 24) | ((bArr[i2 + 5] & 255) << 16) | ((bArr[i2 + 6] & 255) << 8);
            int i6 = i2 + 8;
            long j6 = j5 | (bArr[i5] & 255);
            c1448f.f11999e -= 8;
            if (i6 == i4) {
                c1448f.f11998d = a4.a();
                B.a(a4);
            } else {
                a4.f11963b = i6;
            }
            j4 = j6;
        }
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    public final short k() {
        t(2L);
        return this.f12045e.n();
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        if (this.f12046i) {
            throw new IllegalStateException("closed");
        }
        C1448f c1448f = this.f12045e;
        if (c1448f.f11999e == 0 && this.f12044d.l(c1448f, 8192L) == -1) {
            return -1L;
        }
        return c1448f.l(sink, Math.min(j4, c1448f.f11999e));
    }

    public final short n() {
        t(2L);
        return this.f12045e.p();
    }

    @Override // z3.InterfaceC1450h
    public final String o(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        C1448f c1448f = this.f12045e;
        c1448f.x(this.f12044d);
        return c1448f.o(charset);
    }

    public final String p(long j4) {
        t(j4);
        C1448f c1448f = this.f12045e;
        c1448f.getClass();
        return c1448f.r(j4, Charsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // z3.InterfaceC1450h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q(u options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f12046i) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C1448f c1448f = this.f12045e;
            int b4 = A3.a.b(c1448f, options, true);
            if (b4 != -2) {
                if (b4 != -1) {
                    c1448f.s(options.f12035e[b4].c());
                    return b4;
                }
            } else if (this.f12044d.l(c1448f, 8192L) == -1) {
                break;
            }
        }
    }

    public final String r(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("limit < 0: ", j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long b4 = b((byte) 10, 0L, j5);
        C1448f c1448f = this.f12045e;
        if (b4 != -1) {
            return A3.a.a(c1448f, b4);
        }
        if (j5 < Long.MAX_VALUE && s(j5) && c1448f.b(j5 - 1) == 13 && s(1 + j5) && c1448f.b(j5) == 10) {
            return A3.a.a(c1448f, j5);
        }
        C1448f out = new C1448f();
        long min = Math.min(32, c1448f.f11999e);
        long j6 = 0;
        c1448f.getClass();
        Intrinsics.checkNotNullParameter(out, "out");
        m3.s.g(c1448f.f11999e, 0L, min);
        if (min != 0) {
            out.f11999e += min;
            A a4 = c1448f.f11998d;
            while (true) {
                Intrinsics.c(a4);
                long j7 = a4.f11964c - a4.f11963b;
                if (j6 < j7) {
                    break;
                }
                j6 -= j7;
                a4 = a4.f11967f;
            }
            while (min > 0) {
                Intrinsics.c(a4);
                A c4 = a4.c();
                int i2 = c4.f11963b + ((int) j6);
                c4.f11963b = i2;
                c4.f11964c = Math.min(i2 + ((int) min), c4.f11964c);
                A a5 = out.f11998d;
                if (a5 == null) {
                    c4.f11968g = c4;
                    c4.f11967f = c4;
                    out.f11998d = c4;
                } else {
                    A a6 = a5.f11968g;
                    Intrinsics.c(a6);
                    a6.b(c4);
                }
                min -= c4.f11964c - c4.f11963b;
                a4 = a4.f11967f;
                j6 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c1448f.f11999e, j4) + " content=" + out.j(out.f11999e).e() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C1448f c1448f = this.f12045e;
        if (c1448f.f11999e == 0 && this.f12044d.l(c1448f, 8192L) == -1) {
            return -1;
        }
        return c1448f.read(sink);
    }

    public final boolean s(long j4) {
        C1448f c1448f;
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        if (this.f12046i) {
            throw new IllegalStateException("closed");
        }
        do {
            c1448f = this.f12045e;
            if (c1448f.f11999e >= j4) {
                return true;
            }
        } while (this.f12044d.l(c1448f, 8192L) != -1);
        return false;
    }

    public final void t(long j4) {
        if (!s(j4)) {
            throw new EOFException();
        }
    }

    public final String toString() {
        return "buffer(" + this.f12044d + ')';
    }

    public final void u(long j4) {
        if (this.f12046i) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            C1448f c1448f = this.f12045e;
            if (c1448f.f11999e == 0 && this.f12044d.l(c1448f, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, c1448f.f11999e);
            c1448f.s(min);
            j4 -= min;
        }
    }
}
