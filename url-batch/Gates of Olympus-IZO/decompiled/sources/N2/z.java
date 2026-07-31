package N2;

import e2.AbstractC0381e;
import h2.AbstractC0439a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class z implements InterfaceC0152h {

    /* renamed from: d, reason: collision with root package name */
    public final F f2973d;

    /* renamed from: e, reason: collision with root package name */
    public final C0150f f2974e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2975f;

    public z(F f3) {
        Z1.i.f(f3, "source");
        this.f2973d = f3;
        this.f2974e = new C0150f();
    }

    public final void D(long j3) {
        if (this.f2975f) {
            throw new IllegalStateException("closed");
        }
        while (j3 > 0) {
            C0150f c0150f = this.f2974e;
            if (c0150f.f2929e == 0 && this.f2973d.l(c0150f, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j3, c0150f.f2929e);
            c0150f.x(min);
            j3 -= min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // N2.InterfaceC0152h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(u uVar) {
        Z1.i.f(uVar, "options");
        if (this.f2975f) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C0150f c0150f = this.f2974e;
            int b2 = O2.a.b(c0150f, uVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    c0150f.x(uVar.f2964d[b2].b());
                    return b2;
                }
            } else if (this.f2973d.l(c0150f, 8192L) == -1) {
                break;
            }
        }
    }

    @Override // N2.InterfaceC0152h
    public final String N(Charset charset) {
        C0150f c0150f = this.f2974e;
        c0150f.P(this.f2973d);
        return c0150f.u(c0150f.f2929e, charset);
    }

    public final boolean a() {
        if (this.f2975f) {
            throw new IllegalStateException("closed");
        }
        C0150f c0150f = this.f2974e;
        return c0150f.a() && this.f2973d.l(c0150f, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f2929e + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(byte b2, long j3, long j4) {
        long j5;
        A a3;
        z zVar = this;
        long j6 = j4;
        if (zVar.f2975f) {
            throw new IllegalStateException("closed");
        }
        long j7 = 0;
        if (0 > j6) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j6).toString());
        }
        while (true) {
            if (j7 >= j6) {
                j5 = -1;
                break;
            }
            C0150f c0150f = zVar.f2974e;
            c0150f.getClass();
            long j8 = 0;
            if (0 > j7 || j7 > j6) {
                break;
            }
            long j9 = c0150f.f2929e;
            long j10 = j6 > j9 ? j9 : j6;
            long j11 = -1;
            if (j7 != j10 && (a3 = c0150f.f2928d) != null) {
                if (j9 - j7 >= j7) {
                    while (true) {
                        long j12 = (a3.f2894c - a3.f2893b) + j8;
                        if (j12 > j7) {
                            break;
                        }
                        a3 = a3.f2897f;
                        Z1.i.c(a3);
                        j8 = j12;
                    }
                    long j13 = j7;
                    while (true) {
                        if (j8 >= j10) {
                            break;
                        }
                        int min = (int) Math.min(a3.f2894c, (a3.f2893b + j10) - j8);
                        for (int i3 = (int) ((a3.f2893b + j13) - j8); i3 < min; i3++) {
                            if (a3.f2892a[i3] == b2) {
                                j11 = (i3 - a3.f2893b) + j8;
                                break;
                            }
                        }
                        j13 = (a3.f2894c - a3.f2893b) + j8;
                        a3 = a3.f2897f;
                        Z1.i.c(a3);
                        j8 = j13;
                    }
                } else {
                    while (j9 > j7) {
                        a3 = a3.f2898g;
                        Z1.i.c(a3);
                        j9 -= a3.f2894c - a3.f2893b;
                    }
                    long j14 = j7;
                    while (true) {
                        if (j9 >= j10) {
                            break;
                        }
                        int min2 = (int) Math.min(a3.f2894c, (a3.f2893b + j10) - j9);
                        for (int i4 = (int) ((a3.f2893b + j14) - j9); i4 < min2; i4++) {
                            if (a3.f2892a[i4] == b2) {
                                j11 = (i4 - a3.f2893b) + j9;
                                break;
                            }
                        }
                        j14 = j9 + (a3.f2894c - a3.f2893b);
                        a3 = a3.f2897f;
                        Z1.i.c(a3);
                        j9 = j14;
                    }
                }
            }
            j5 = -1;
            if (j11 != -1) {
                return j11;
            }
            long j15 = c0150f.f2929e;
            if (j15 >= j4) {
                break;
            }
            zVar = this;
            if (zVar.f2973d.l(c0150f, 8192L) == -1) {
                break;
            }
            j7 = Math.max(j7, j15);
            j6 = j4;
        }
        return j5;
    }

    @Override // N2.F
    public final H c() {
        return this.f2973d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f2975f) {
            return;
        }
        this.f2975f = true;
        this.f2973d.close();
        C0150f c0150f = this.f2974e;
        c0150f.x(c0150f.f2929e);
    }

    public final byte e() {
        z(1L);
        return this.f2974e.j();
    }

    public final C0153i h(long j3) {
        z(j3);
        return this.f2974e.m(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f2929e -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        C0150f c0150f;
        long j3;
        int i3;
        int i4;
        byte b2;
        z(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            boolean x3 = x(i6);
            c0150f = this.f2974e;
            if (!x3) {
                break;
            }
            b2 = c0150f.b(i5);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            AbstractC0381e.m(16);
            AbstractC0381e.m(16);
            String num = Integer.toString(b2, 16);
            Z1.i.e(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j4 = 0;
        if (c0150f.f2929e == 0) {
            throw new EOFException();
        }
        long j5 = 0;
        int i7 = 0;
        boolean z3 = false;
        while (true) {
            A a3 = c0150f.f2928d;
            Z1.i.c(a3);
            int i8 = a3.f2893b;
            int i9 = a3.f2894c;
            int i10 = i7;
            while (i8 < i9) {
                byte b3 = a3.f2892a[i8];
                if (b3 >= 48 && b3 <= 57) {
                    i4 = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i4 = b3 - 87;
                } else if (b3 < 65 || b3 > 70) {
                    i3 = i10;
                    j3 = 0;
                    if (i3 == 0) {
                        char[] cArr = O2.b.f2991a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]})));
                    }
                    z3 = true;
                    if (i8 != i9) {
                        c0150f.f2928d = a3.a();
                        B.a(a3);
                    } else {
                        a3.f2893b = i8;
                    }
                    if (!!z3 || c0150f.f2928d == null) {
                        break;
                    }
                    i7 = i3;
                    j4 = j3;
                } else {
                    i4 = b3 - 55;
                }
                if ((j5 & (-1152921504606846976L)) != 0) {
                    C0150f c0150f2 = new C0150f();
                    c0150f2.R(j5);
                    c0150f2.Q(b3);
                    throw new NumberFormatException("Number too large: ".concat(c0150f2.u(c0150f2.f2929e, AbstractC0439a.f5056a)));
                }
                j5 = (j5 << 4) | i4;
                i8++;
                i10++;
                j4 = 0;
            }
            j3 = j4;
            i3 = i10;
            if (i8 != i9) {
            }
            if (!z3) {
                break;
            }
            break;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2975f;
    }

    public final int j() {
        z(4L);
        return this.f2974e.o();
    }

    public final int k() {
        z(4L);
        int o3 = this.f2974e.o();
        return ((o3 & 255) << 24) | (((-16777216) & o3) >>> 24) | ((16711680 & o3) >>> 8) | ((65280 & o3) << 8);
    }

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        Z1.i.f(c0150f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f2975f) {
            throw new IllegalStateException("closed");
        }
        C0150f c0150f2 = this.f2974e;
        if (c0150f2.f2929e == 0 && this.f2973d.l(c0150f2, 8192L) == -1) {
            return -1L;
        }
        return c0150f2.l(c0150f, Math.min(j3, c0150f2.f2929e));
    }

    public final long m() {
        long j3;
        z(8L);
        C0150f c0150f = this.f2974e;
        if (c0150f.f2929e < 8) {
            throw new EOFException();
        }
        A a3 = c0150f.f2928d;
        Z1.i.c(a3);
        int i3 = a3.f2893b;
        int i4 = a3.f2894c;
        if (i4 - i3 < 8) {
            j3 = ((c0150f.o() & 4294967295L) << 32) | (4294967295L & c0150f.o());
        } else {
            byte[] bArr = a3.f2892a;
            int i5 = i3 + 7;
            long j4 = ((bArr[i3] & 255) << 56) | ((bArr[i3 + 1] & 255) << 48) | ((bArr[i3 + 2] & 255) << 40) | ((bArr[i3 + 3] & 255) << 32) | ((bArr[i3 + 4] & 255) << 24) | ((bArr[i3 + 5] & 255) << 16) | ((bArr[i3 + 6] & 255) << 8);
            int i6 = i3 + 8;
            long j5 = j4 | (bArr[i5] & 255);
            c0150f.f2929e -= 8;
            if (i6 == i4) {
                c0150f.f2928d = a3.a();
                B.a(a3);
            } else {
                a3.f2893b = i6;
            }
            j3 = j5;
        }
        return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
    }

    public final short o() {
        z(2L);
        return this.f2974e.p();
    }

    public final short p() {
        z(2L);
        return this.f2974e.r();
    }

    public final String r(long j3) {
        z(j3);
        C0150f c0150f = this.f2974e;
        c0150f.getClass();
        return c0150f.u(j3, AbstractC0439a.f5056a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        Z1.i.f(byteBuffer, "sink");
        C0150f c0150f = this.f2974e;
        if (c0150f.f2929e == 0 && this.f2973d.l(c0150f, 8192L) == -1) {
            return -1;
        }
        return c0150f.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f2973d + ')';
    }

    public final String u(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j3).toString());
        }
        long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long b2 = b((byte) 10, 0L, j4);
        C0150f c0150f = this.f2974e;
        if (b2 != -1) {
            return O2.a.a(c0150f, b2);
        }
        if (j4 < Long.MAX_VALUE && x(j4) && c0150f.b(j4 - 1) == 13 && x(1 + j4) && c0150f.b(j4) == 10) {
            return O2.a.a(c0150f, j4);
        }
        C0150f c0150f2 = new C0150f();
        long min = Math.min(32, c0150f.f2929e);
        long j5 = 0;
        c0150f.getClass();
        Z1.i.f(c0150f2, "out");
        I2.d.q(c0150f.f2929e, 0L, min);
        if (min != 0) {
            c0150f2.f2929e += min;
            A a3 = c0150f.f2928d;
            while (true) {
                Z1.i.c(a3);
                long j6 = a3.f2894c - a3.f2893b;
                if (j5 < j6) {
                    break;
                }
                j5 -= j6;
                a3 = a3.f2897f;
            }
            while (min > 0) {
                Z1.i.c(a3);
                A c3 = a3.c();
                int i3 = c3.f2893b + ((int) j5);
                c3.f2893b = i3;
                c3.f2894c = Math.min(i3 + ((int) min), c3.f2894c);
                A a4 = c0150f2.f2928d;
                if (a4 == null) {
                    c3.f2898g = c3;
                    c3.f2897f = c3;
                    c0150f2.f2928d = c3;
                } else {
                    A a5 = a4.f2898g;
                    Z1.i.c(a5);
                    a5.b(c3);
                }
                min -= c3.f2894c - c3.f2893b;
                a3 = a3.f2897f;
                j5 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0150f.f2929e, j3) + " content=" + c0150f2.m(c0150f2.f2929e).c() + (char) 8230);
    }

    public final boolean x(long j3) {
        C0150f c0150f;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f2975f) {
            throw new IllegalStateException("closed");
        }
        do {
            c0150f = this.f2974e;
            if (c0150f.f2929e >= j3) {
                return true;
            }
        } while (this.f2973d.l(c0150f, 8192L) != -1);
        return false;
    }

    public final void z(long j3) {
        if (!x(j3)) {
            throw new EOFException();
        }
    }
}
