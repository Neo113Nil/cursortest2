package B1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import m.C0260a;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f87a;

    /* renamed from: b, reason: collision with root package name */
    public final f f88b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f89c;

    public p(v vVar) {
        d1.d.e(vVar, "source");
        this.f87a = vVar;
        this.f88b = new f();
    }

    @Override // B1.v
    public final x a() {
        return this.f87a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // B1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(n nVar) {
        d1.d.e(nVar, "options");
        if (this.f89c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f88b;
            int b2 = C1.a.b(fVar, nVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.o(nVar.f82a[b2].a());
                    return b2;
                }
            } else if (this.f87a.c(fVar, 8192L) == -1) {
                break;
            }
        }
    }

    @Override // B1.v
    public final long c(f fVar, long j2) {
        d1.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f89c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f88b;
        if (fVar2.f69b == 0 && this.f87a.c(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.c(fVar, Math.min(j2, fVar2.f69b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f89c) {
            return;
        }
        this.f89c = true;
        this.f87a.close();
        f fVar = this.f88b;
        fVar.o(fVar.f69b);
    }

    @Override // B1.h
    public final String f(Charset charset) {
        f fVar = this.f88b;
        fVar.t(this.f87a);
        return fVar.n(fVar.f69b, charset);
    }

    public final boolean g() {
        if (this.f89c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f88b;
        return fVar.g() && this.f87a.c(fVar, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f69b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(byte b2, long j2, long j3) {
        long j4;
        q qVar;
        p pVar = this;
        long j5 = j3;
        if (pVar.f89c) {
            throw new IllegalStateException("closed");
        }
        long j6 = 0;
        if (0 > j5) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        while (true) {
            if (j6 >= j5) {
                j4 = -1;
                break;
            }
            f fVar = pVar.f88b;
            fVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = fVar.f69b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (qVar = fVar.f68a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (qVar.f92c - qVar.f91b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        qVar = qVar.f94f;
                        d1.d.b(qVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) Math.min(qVar.f92c, (qVar.f91b + j9) - j7);
                        for (int i = (int) ((qVar.f91b + j12) - j7); i < min; i++) {
                            if (qVar.f90a[i] == b2) {
                                j10 = (i - qVar.f91b) + j7;
                                break;
                            }
                        }
                        j12 = (qVar.f92c - qVar.f91b) + j7;
                        qVar = qVar.f94f;
                        d1.d.b(qVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        qVar = qVar.f95g;
                        d1.d.b(qVar);
                        j8 -= qVar.f92c - qVar.f91b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) Math.min(qVar.f92c, (qVar.f91b + j9) - j8);
                        for (int i2 = (int) ((qVar.f91b + j13) - j8); i2 < min2; i2++) {
                            if (qVar.f90a[i2] == b2) {
                                j10 = (i2 - qVar.f91b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (qVar.f92c - qVar.f91b);
                        qVar = qVar.f94f;
                        d1.d.b(qVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = fVar.f69b;
            if (j14 >= j3) {
                break;
            }
            pVar = this;
            if (pVar.f87a.c(fVar, 8192L) == -1) {
                break;
            }
            j6 = Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    public final byte i() {
        q(1L);
        return this.f88b.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f89c;
    }

    public final i j(long j2) {
        q(j2);
        return this.f88b.k(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f69b -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        f fVar;
        long j2;
        int i;
        int i2;
        byte h;
        q(1L);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            boolean p2 = p(i4);
            fVar = this.f88b;
            if (!p2) {
                break;
            }
            h = fVar.h(i3);
            if ((h < 48 || h > 57) && ((h < 97 || h > 102) && (h < 65 || h > 70))) {
                break;
            }
            i3 = i4;
        }
        if (i3 == 0) {
            C0260a.b(16);
            C0260a.b(16);
            String num = Integer.toString(h, 16);
            d1.d.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (fVar.f69b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            q qVar = fVar.f68a;
            d1.d.b(qVar);
            int i6 = qVar.f91b;
            int i7 = qVar.f92c;
            int i8 = i5;
            while (i6 < i7) {
                byte b2 = qVar.f90a[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    i = i8;
                    j2 = 0;
                    if (i == 0) {
                        char[] cArr = C1.b.f134a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    z2 = true;
                    if (i6 != i7) {
                        fVar.f68a = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f91b = i6;
                    }
                    if (!!z2 || fVar.f68a == null) {
                        break;
                    }
                    i5 = i;
                    j3 = j2;
                } else {
                    i2 = b2 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    f fVar2 = new f();
                    fVar2.v(j4);
                    fVar2.u(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar2.n(fVar2.f69b, k1.a.f2754a)));
                }
                j4 = (j4 << 4) | i2;
                i6++;
                i8++;
                j3 = 0;
            }
            j2 = j3;
            i = i8;
            if (i6 != i7) {
            }
            if (!z2) {
                break;
            }
            break;
        }
    }

    public final int l() {
        q(4L);
        return this.f88b.l();
    }

    public final int m() {
        q(4L);
        int l2 = this.f88b.l();
        return ((l2 & 255) << 24) | (((-16777216) & l2) >>> 24) | ((16711680 & l2) >>> 8) | ((65280 & l2) << 8);
    }

    public final short n() {
        q(2L);
        return this.f88b.m();
    }

    public final String o(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long h = h((byte) 10, 0L, j3);
        f fVar = this.f88b;
        if (h != -1) {
            return C1.a.a(fVar, h);
        }
        if (j3 < Long.MAX_VALUE && p(j3) && fVar.h(j3 - 1) == 13 && p(1 + j3) && fVar.h(j3) == 10) {
            return C1.a.a(fVar, j3);
        }
        f fVar2 = new f();
        long min = Math.min(32, fVar.f69b);
        long j4 = 0;
        fVar.getClass();
        d1.d.e(fVar2, "out");
        w1.d.m(fVar.f69b, 0L, min);
        if (min != 0) {
            fVar2.f69b += min;
            q qVar = fVar.f68a;
            while (true) {
                d1.d.b(qVar);
                long j5 = qVar.f92c - qVar.f91b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                qVar = qVar.f94f;
            }
            while (min > 0) {
                d1.d.b(qVar);
                q c2 = qVar.c();
                int i = c2.f91b + ((int) j4);
                c2.f91b = i;
                c2.f92c = Math.min(i + ((int) min), c2.f92c);
                q qVar2 = fVar2.f68a;
                if (qVar2 == null) {
                    c2.f95g = c2;
                    c2.f94f = c2;
                    fVar2.f68a = c2;
                } else {
                    q qVar3 = qVar2.f95g;
                    d1.d.b(qVar3);
                    qVar3.b(c2);
                }
                min -= c2.f92c - c2.f91b;
                qVar = qVar.f94f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f69b, j2) + " content=" + fVar2.k(fVar2.f69b).b() + (char) 8230);
    }

    public final boolean p(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f89c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f88b;
            if (fVar.f69b >= j2) {
                return true;
            }
        } while (this.f87a.c(fVar, 8192L) != -1);
        return false;
    }

    public final void q(long j2) {
        if (!p(j2)) {
            throw new EOFException();
        }
    }

    public final void r(long j2) {
        if (this.f89c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f88b;
            if (fVar.f69b == 0 && this.f87a.c(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f69b);
            fVar.o(min);
            j2 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        d1.d.e(byteBuffer, "sink");
        f fVar = this.f88b;
        if (fVar.f69b == 0 && this.f87a.c(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f87a + ')';
    }
}
