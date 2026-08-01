package M1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f846a;

    /* renamed from: b, reason: collision with root package name */
    public final f f847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f848c;

    public p(v vVar) {
        j1.h.e(vVar, "source");
        this.f846a = vVar;
        this.f847b = new f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f827b -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long B() {
        f fVar;
        long j;
        int i;
        int i2;
        byte d2;
        I(1L);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            boolean H = H(i4);
            fVar = this.f847b;
            if (!H) {
                break;
            }
            d2 = fVar.d(i3);
            if ((d2 < 48 || d2 > 57) && ((d2 < 97 || d2 > 102) && (d2 < 65 || d2 > 70))) {
                break;
            }
            i3 = i4;
        }
        if (i3 == 0) {
            H1.d.m(16);
            H1.d.m(16);
            String num = Integer.toString(d2, 16);
            j1.h.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j2 = 0;
        if (fVar.f827b == 0) {
            throw new EOFException();
        }
        long j3 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            q qVar = fVar.f826a;
            j1.h.b(qVar);
            int i6 = qVar.f850b;
            int i7 = qVar.f851c;
            int i8 = i5;
            while (i6 < i7) {
                byte b2 = qVar.f849a[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    i = i8;
                    j = 0;
                    if (i == 0) {
                        char[] cArr = N1.b.f971a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    z2 = true;
                    if (i6 != i7) {
                        fVar.f826a = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f850b = i6;
                    }
                    if (!!z2 || fVar.f826a == null) {
                        break;
                    }
                    i5 = i;
                    j2 = j;
                } else {
                    i2 = b2 - 55;
                }
                if ((j3 & (-1152921504606846976L)) != 0) {
                    f fVar2 = new f();
                    fVar2.N(j3);
                    fVar2.M(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar2.F(fVar2.f827b, q1.a.f3995a)));
                }
                j3 = (j3 << 4) | i2;
                i6++;
                i8++;
                j2 = 0;
            }
            j = j2;
            i = i8;
            if (i6 != i7) {
            }
            if (!z2) {
                break;
            }
            break;
        }
    }

    public final int D() {
        I(4L);
        return this.f847b.D();
    }

    public final int E() {
        I(4L);
        int D2 = this.f847b.D();
        return ((D2 & 255) << 24) | (((-16777216) & D2) >>> 24) | ((16711680 & D2) >>> 8) | ((65280 & D2) << 8);
    }

    public final short F() {
        I(2L);
        return this.f847b.E();
    }

    public final String G(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long d2 = d((byte) 10, 0L, j2);
        f fVar = this.f847b;
        if (d2 != -1) {
            return N1.a.a(fVar, d2);
        }
        if (j2 < Long.MAX_VALUE && H(j2) && fVar.d(j2 - 1) == 13 && H(1 + j2) && fVar.d(j2) == 10) {
            return N1.a.a(fVar, j2);
        }
        f fVar2 = new f();
        long min = Math.min(32, fVar.f827b);
        long j3 = 0;
        fVar.getClass();
        j1.h.e(fVar2, "out");
        H1.l.h(fVar.f827b, 0L, min);
        if (min != 0) {
            fVar2.f827b += min;
            q qVar = fVar.f826a;
            while (true) {
                j1.h.b(qVar);
                long j4 = qVar.f851c - qVar.f850b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                qVar = qVar.f853f;
            }
            while (min > 0) {
                j1.h.b(qVar);
                q c2 = qVar.c();
                int i = c2.f850b + ((int) j3);
                c2.f850b = i;
                c2.f851c = Math.min(i + ((int) min), c2.f851c);
                q qVar2 = fVar2.f826a;
                if (qVar2 == null) {
                    c2.f854g = c2;
                    c2.f853f = c2;
                    fVar2.f826a = c2;
                } else {
                    q qVar3 = qVar2.f854g;
                    j1.h.b(qVar3);
                    qVar3.b(c2);
                }
                min -= c2.f851c - c2.f850b;
                qVar = qVar.f853f;
                j3 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f827b, j) + " content=" + fVar2.B(fVar2.f827b).b() + (char) 8230);
    }

    public final boolean H(long j) {
        f fVar;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.f848c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f847b;
            if (fVar.f827b >= j) {
                return true;
            }
        } while (this.f846a.h(fVar, 8192L) != -1);
        return false;
    }

    public final void I(long j) {
        if (!H(j)) {
            throw new EOFException();
        }
    }

    public final void J(long j) {
        if (this.f848c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            f fVar = this.f847b;
            if (fVar.f827b == 0 && this.f846a.h(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, fVar.f827b);
            fVar.G(min);
            j -= min;
        }
    }

    public final boolean a() {
        if (this.f848c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f847b;
        return fVar.a() && this.f846a.h(fVar, 8192L) == -1;
    }

    @Override // M1.v
    public final x b() {
        return this.f846a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f848c) {
            return;
        }
        this.f848c = true;
        this.f846a.close();
        f fVar = this.f847b;
        fVar.G(fVar.f827b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f827b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(byte b2, long j, long j2) {
        long j3;
        q qVar;
        p pVar = this;
        long j4 = j2;
        if (pVar.f848c) {
            throw new IllegalStateException("closed");
        }
        long j5 = 0;
        if (0 > j4) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j4).toString());
        }
        while (true) {
            if (j5 >= j4) {
                j3 = -1;
                break;
            }
            f fVar = pVar.f847b;
            fVar.getClass();
            long j6 = 0;
            if (0 > j5 || j5 > j4) {
                break;
            }
            long j7 = fVar.f827b;
            long j8 = j4 > j7 ? j7 : j4;
            long j9 = -1;
            if (j5 != j8 && (qVar = fVar.f826a) != null) {
                if (j7 - j5 >= j5) {
                    while (true) {
                        long j10 = (qVar.f851c - qVar.f850b) + j6;
                        if (j10 > j5) {
                            break;
                        }
                        qVar = qVar.f853f;
                        j1.h.b(qVar);
                        j6 = j10;
                    }
                    long j11 = j5;
                    while (true) {
                        if (j6 >= j8) {
                            break;
                        }
                        int min = (int) Math.min(qVar.f851c, (qVar.f850b + j8) - j6);
                        for (int i = (int) ((qVar.f850b + j11) - j6); i < min; i++) {
                            if (qVar.f849a[i] == b2) {
                                j9 = (i - qVar.f850b) + j6;
                                break;
                            }
                        }
                        j11 = (qVar.f851c - qVar.f850b) + j6;
                        qVar = qVar.f853f;
                        j1.h.b(qVar);
                        j6 = j11;
                    }
                } else {
                    while (j7 > j5) {
                        qVar = qVar.f854g;
                        j1.h.b(qVar);
                        j7 -= qVar.f851c - qVar.f850b;
                    }
                    long j12 = j5;
                    while (true) {
                        if (j7 >= j8) {
                            break;
                        }
                        int min2 = (int) Math.min(qVar.f851c, (qVar.f850b + j8) - j7);
                        for (int i2 = (int) ((qVar.f850b + j12) - j7); i2 < min2; i2++) {
                            if (qVar.f849a[i2] == b2) {
                                j9 = (i2 - qVar.f850b) + j7;
                                break;
                            }
                        }
                        j12 = j7 + (qVar.f851c - qVar.f850b);
                        qVar = qVar.f853f;
                        j1.h.b(qVar);
                        j7 = j12;
                    }
                }
            }
            j3 = -1;
            if (j9 != -1) {
                return j9;
            }
            long j13 = fVar.f827b;
            if (j13 >= j2) {
                break;
            }
            pVar = this;
            if (pVar.f846a.h(fVar, 8192L) == -1) {
                break;
            }
            j5 = Math.max(j5, j13);
            j4 = j2;
        }
        return j3;
    }

    @Override // M1.v
    public final long h(f fVar, long j) {
        j1.h.e(fVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.f848c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f847b;
        if (fVar2.f827b == 0 && this.f846a.h(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.h(fVar, Math.min(j, fVar2.f827b));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f848c;
    }

    public final byte q() {
        I(1L);
        return this.f847b.q();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        j1.h.e(byteBuffer, "sink");
        f fVar = this.f847b;
        if (fVar.f827b == 0 && this.f846a.h(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f846a + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // M1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v(n nVar) {
        j1.h.e(nVar, "options");
        if (this.f848c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f847b;
            int b2 = N1.a.b(fVar, nVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.G(nVar.f841a[b2].a());
                    return b2;
                }
            } else if (this.f846a.h(fVar, 8192L) == -1) {
                break;
            }
        }
    }

    @Override // M1.h
    public final String y(Charset charset) {
        f fVar = this.f847b;
        fVar.L(this.f846a);
        return fVar.F(fVar.f827b, charset);
    }

    public final i z(long j) {
        I(j);
        return this.f847b.B(j);
    }
}
