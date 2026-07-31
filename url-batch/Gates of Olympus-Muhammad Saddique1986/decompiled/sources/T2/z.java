package T2;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import n2.AbstractC0721a;

/* loaded from: classes.dex */
public final class z implements InterfaceC0233h {

    /* renamed from: d, reason: collision with root package name */
    public final F f4453d;

    /* renamed from: e, reason: collision with root package name */
    public final C0231f f4454e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4455f;

    public z(F f3) {
        f2.j.f(f3, "source");
        this.f4453d = f3;
        this.f4454e = new C0231f();
    }

    @Override // T2.InterfaceC0233h
    public final String B(Charset charset) {
        C0231f c0231f = this.f4454e;
        c0231f.D(this.f4453d);
        return c0231f.u(c0231f.f4409e, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // T2.InterfaceC0233h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(u uVar) {
        f2.j.f(uVar, "options");
        if (this.f4455f) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C0231f c0231f = this.f4454e;
            int b3 = U2.a.b(c0231f, uVar, true);
            if (b3 != -2) {
                if (b3 != -1) {
                    c0231f.v(uVar.f4444d[b3].b());
                    return b3;
                }
            } else if (this.f4453d.f(c0231f, 8192L) == -1) {
                break;
            }
        }
    }

    public final boolean a() {
        if (this.f4455f) {
            throw new IllegalStateException("closed");
        }
        C0231f c0231f = this.f4454e;
        return c0231f.a() && this.f4453d.f(c0231f, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f4409e + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(byte b3, long j3, long j4) {
        long j5;
        A a3;
        z zVar = this;
        long j6 = j4;
        if (zVar.f4455f) {
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
            C0231f c0231f = zVar.f4454e;
            c0231f.getClass();
            long j8 = 0;
            if (0 > j7 || j7 > j6) {
                break;
            }
            long j9 = c0231f.f4409e;
            long j10 = j6 > j9 ? j9 : j6;
            long j11 = -1;
            if (j7 != j10 && (a3 = c0231f.f4408d) != null) {
                if (j9 - j7 >= j7) {
                    while (true) {
                        long j12 = (a3.f4374c - a3.f4373b) + j8;
                        if (j12 > j7) {
                            break;
                        }
                        a3 = a3.f4377f;
                        f2.j.c(a3);
                        j8 = j12;
                    }
                    long j13 = j7;
                    while (true) {
                        if (j8 >= j10) {
                            break;
                        }
                        int min = (int) Math.min(a3.f4374c, (a3.f4373b + j10) - j8);
                        for (int i3 = (int) ((a3.f4373b + j13) - j8); i3 < min; i3++) {
                            if (a3.f4372a[i3] == b3) {
                                j11 = (i3 - a3.f4373b) + j8;
                                break;
                            }
                        }
                        j13 = (a3.f4374c - a3.f4373b) + j8;
                        a3 = a3.f4377f;
                        f2.j.c(a3);
                        j8 = j13;
                    }
                } else {
                    while (j9 > j7) {
                        a3 = a3.f4378g;
                        f2.j.c(a3);
                        j9 -= a3.f4374c - a3.f4373b;
                    }
                    long j14 = j7;
                    while (true) {
                        if (j9 >= j10) {
                            break;
                        }
                        int min2 = (int) Math.min(a3.f4374c, (a3.f4373b + j10) - j9);
                        for (int i4 = (int) ((a3.f4373b + j14) - j9); i4 < min2; i4++) {
                            if (a3.f4372a[i4] == b3) {
                                j11 = (i4 - a3.f4373b) + j9;
                                break;
                            }
                        }
                        j14 = j9 + (a3.f4374c - a3.f4373b);
                        a3 = a3.f4377f;
                        f2.j.c(a3);
                        j9 = j14;
                    }
                }
            }
            j5 = -1;
            if (j11 != -1) {
                return j11;
            }
            long j15 = c0231f.f4409e;
            if (j15 >= j4) {
                break;
            }
            zVar = this;
            if (zVar.f4453d.f(c0231f, 8192L) == -1) {
                break;
            }
            j7 = Math.max(j7, j15);
            j6 = j4;
        }
        return j5;
    }

    @Override // T2.F
    public final H c() {
        return this.f4453d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f4455f) {
            return;
        }
        this.f4455f = true;
        this.f4453d.close();
        C0231f c0231f = this.f4454e;
        c0231f.v(c0231f.f4409e);
    }

    public final byte d() {
        w(1L);
        return this.f4454e.h();
    }

    public final C0234i e(long j3) {
        w(j3);
        return this.f4454e.n(j3);
    }

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        f2.j.f(c0231f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f4455f) {
            throw new IllegalStateException("closed");
        }
        C0231f c0231f2 = this.f4454e;
        if (c0231f2.f4409e == 0 && this.f4453d.f(c0231f2, 8192L) == -1) {
            return -1L;
        }
        return c0231f2.f(c0231f, Math.min(j3, c0231f2.f4409e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f4409e -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g() {
        C0231f c0231f;
        long j3;
        int i3;
        int i4;
        byte b3;
        w(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            boolean v3 = v(i6);
            c0231f = this.f4454e;
            if (!v3) {
                break;
            }
            b3 = c0231f.b(i5);
            if ((b3 < 48 || b3 > 57) && ((b3 < 97 || b3 > 102) && (b3 < 65 || b3 > 70))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            n.r.i(16);
            n.r.i(16);
            String num = Integer.toString(b3, 16);
            f2.j.e(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j4 = 0;
        if (c0231f.f4409e == 0) {
            throw new EOFException();
        }
        long j5 = 0;
        int i7 = 0;
        boolean z3 = false;
        while (true) {
            A a3 = c0231f.f4408d;
            f2.j.c(a3);
            int i8 = a3.f4373b;
            int i9 = a3.f4374c;
            int i10 = i7;
            while (i8 < i9) {
                byte b4 = a3.f4372a[i8];
                if (b4 >= 48 && b4 <= 57) {
                    i4 = b4 - 48;
                } else if (b4 >= 97 && b4 <= 102) {
                    i4 = b4 - 87;
                } else if (b4 < 65 || b4 > 70) {
                    i3 = i10;
                    j3 = 0;
                    if (i3 == 0) {
                        char[] cArr = U2.b.f4516a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b4 >> 4) & 15], cArr[b4 & 15]})));
                    }
                    z3 = true;
                    if (i8 != i9) {
                        c0231f.f4408d = a3.a();
                        B.a(a3);
                    } else {
                        a3.f4373b = i8;
                    }
                    if (!!z3 || c0231f.f4408d == null) {
                        break;
                    }
                    i7 = i3;
                    j4 = j3;
                } else {
                    i4 = b4 - 55;
                }
                if ((j5 & (-1152921504606846976L)) != 0) {
                    C0231f c0231f2 = new C0231f();
                    c0231f2.F(j5);
                    c0231f2.E(b4);
                    throw new NumberFormatException("Number too large: ".concat(c0231f2.u(c0231f2.f4409e, AbstractC0721a.f7347a)));
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

    public final int h() {
        w(4L);
        return this.f4454e.q();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4455f;
    }

    public final int l() {
        w(4L);
        int q3 = this.f4454e.q();
        return ((q3 & 255) << 24) | (((-16777216) & q3) >>> 24) | ((16711680 & q3) >>> 8) | ((65280 & q3) << 8);
    }

    public final long n() {
        long j3;
        w(8L);
        C0231f c0231f = this.f4454e;
        if (c0231f.f4409e < 8) {
            throw new EOFException();
        }
        A a3 = c0231f.f4408d;
        f2.j.c(a3);
        int i3 = a3.f4373b;
        int i4 = a3.f4374c;
        if (i4 - i3 < 8) {
            j3 = ((c0231f.q() & 4294967295L) << 32) | (4294967295L & c0231f.q());
        } else {
            byte[] bArr = a3.f4372a;
            int i5 = i3 + 7;
            long j4 = ((bArr[i3] & 255) << 56) | ((bArr[i3 + 1] & 255) << 48) | ((bArr[i3 + 2] & 255) << 40) | ((bArr[i3 + 3] & 255) << 32) | ((bArr[i3 + 4] & 255) << 24) | ((bArr[i3 + 5] & 255) << 16) | ((bArr[i3 + 6] & 255) << 8);
            int i6 = i3 + 8;
            long j5 = j4 | (bArr[i5] & 255);
            c0231f.f4409e -= 8;
            if (i6 == i4) {
                c0231f.f4408d = a3.a();
                B.a(a3);
            } else {
                a3.f4373b = i6;
            }
            j3 = j5;
        }
        return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
    }

    public final short q() {
        w(2L);
        return this.f4454e.r();
    }

    public final short r() {
        w(2L);
        return this.f4454e.s();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        f2.j.f(byteBuffer, "sink");
        C0231f c0231f = this.f4454e;
        if (c0231f.f4409e == 0 && this.f4453d.f(c0231f, 8192L) == -1) {
            return -1;
        }
        return c0231f.read(byteBuffer);
    }

    public final String s(long j3) {
        w(j3);
        C0231f c0231f = this.f4454e;
        c0231f.getClass();
        return c0231f.u(j3, AbstractC0721a.f7347a);
    }

    public final String toString() {
        return "buffer(" + this.f4453d + ')';
    }

    public final String u(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j3).toString());
        }
        long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long b3 = b((byte) 10, 0L, j4);
        C0231f c0231f = this.f4454e;
        if (b3 != -1) {
            return U2.a.a(c0231f, b3);
        }
        if (j4 < Long.MAX_VALUE && v(j4) && c0231f.b(j4 - 1) == 13 && v(1 + j4) && c0231f.b(j4) == 10) {
            return U2.a.a(c0231f, j4);
        }
        C0231f c0231f2 = new C0231f();
        long min = Math.min(32, c0231f.f4409e);
        long j5 = 0;
        c0231f.getClass();
        f2.j.f(c0231f2, "out");
        O2.l.R(c0231f.f4409e, 0L, min);
        if (min != 0) {
            c0231f2.f4409e += min;
            A a3 = c0231f.f4408d;
            while (true) {
                f2.j.c(a3);
                long j6 = a3.f4374c - a3.f4373b;
                if (j5 < j6) {
                    break;
                }
                j5 -= j6;
                a3 = a3.f4377f;
            }
            while (min > 0) {
                f2.j.c(a3);
                A c2 = a3.c();
                int i3 = c2.f4373b + ((int) j5);
                c2.f4373b = i3;
                c2.f4374c = Math.min(i3 + ((int) min), c2.f4374c);
                A a4 = c0231f2.f4408d;
                if (a4 == null) {
                    c2.f4378g = c2;
                    c2.f4377f = c2;
                    c0231f2.f4408d = c2;
                } else {
                    A a5 = a4.f4378g;
                    f2.j.c(a5);
                    a5.b(c2);
                }
                min -= c2.f4374c - c2.f4373b;
                a3 = a3.f4377f;
                j5 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0231f.f4409e, j3) + " content=" + c0231f2.n(c0231f2.f4409e).c() + (char) 8230);
    }

    public final boolean v(long j3) {
        C0231f c0231f;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f4455f) {
            throw new IllegalStateException("closed");
        }
        do {
            c0231f = this.f4454e;
            if (c0231f.f4409e >= j3) {
                return true;
            }
        } while (this.f4453d.f(c0231f, 8192L) != -1);
        return false;
    }

    public final void w(long j3) {
        if (!v(j3)) {
            throw new EOFException();
        }
    }

    public final void x(long j3) {
        if (this.f4455f) {
            throw new IllegalStateException("closed");
        }
        while (j3 > 0) {
            C0231f c0231f = this.f4454e;
            if (c0231f.f4409e == 0 && this.f4453d.f(c0231f, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j3, c0231f.f4409e);
            c0231f.v(min);
            j3 -= min;
        }
    }
}
