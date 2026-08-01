package M1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f817a;

    /* renamed from: b, reason: collision with root package name */
    public final f f818b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f819c;

    public p(v vVar) {
        k1.e.e(vVar, "source");
        this.f817a = vVar;
        this.f818b = new f();
    }

    public final boolean a() {
        if (this.f819c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f818b;
        return fVar.a() && this.f817a.c(fVar, 8192L) == -1;
    }

    @Override // M1.v
    public final x b() {
        return this.f817a.b();
    }

    @Override // M1.v
    public final long c(f fVar, long j2) {
        k1.e.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f819c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f818b;
        if (fVar2.f799b == 0 && this.f817a.c(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.c(fVar, Math.min(j2, fVar2.f799b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f819c) {
            return;
        }
        this.f819c = true;
        this.f817a.close();
        f fVar = this.f818b;
        fVar.u(fVar.f799b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f799b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(byte b2, long j2, long j3) {
        long j4;
        q qVar;
        p pVar = this;
        long j5 = j3;
        if (pVar.f819c) {
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
            f fVar = pVar.f818b;
            fVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = fVar.f799b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (qVar = fVar.f798a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (qVar.f822c - qVar.f821b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        qVar = qVar.f824f;
                        k1.e.b(qVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) Math.min(qVar.f822c, (qVar.f821b + j9) - j7);
                        for (int i = (int) ((qVar.f821b + j12) - j7); i < min; i++) {
                            if (qVar.f820a[i] == b2) {
                                j10 = (i - qVar.f821b) + j7;
                                break;
                            }
                        }
                        j12 = (qVar.f822c - qVar.f821b) + j7;
                        qVar = qVar.f824f;
                        k1.e.b(qVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        qVar = qVar.f825g;
                        k1.e.b(qVar);
                        j8 -= qVar.f822c - qVar.f821b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) Math.min(qVar.f822c, (qVar.f821b + j9) - j8);
                        for (int i2 = (int) ((qVar.f821b + j13) - j8); i2 < min2; i2++) {
                            if (qVar.f820a[i2] == b2) {
                                j10 = (i2 - qVar.f821b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (qVar.f822c - qVar.f821b);
                        qVar = qVar.f824f;
                        k1.e.b(qVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = fVar.f799b;
            if (j14 >= j3) {
                break;
            }
            pVar = this;
            if (pVar.f817a.c(fVar, 8192L) == -1) {
                break;
            }
            j6 = Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f819c;
    }

    public final byte j() {
        w(1L);
        return this.f818b.j();
    }

    public final i k(long j2) {
        w(j2);
        return this.f818b.p(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // M1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(n nVar) {
        k1.e.e(nVar, "options");
        if (this.f819c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f818b;
            int b2 = N1.a.b(fVar, nVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.u(nVar.f812a[b2].a());
                    return b2;
                }
            } else if (this.f817a.c(fVar, 8192L) == -1) {
                break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f799b -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p() {
        f fVar;
        long j2;
        int i;
        int i2;
        byte d;
        w(1L);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            boolean v2 = v(i4);
            fVar = this.f818b;
            if (!v2) {
                break;
            }
            d = fVar.d(i3);
            if ((d < 48 || d > 57) && ((d < 97 || d > 102) && (d < 65 || d > 70))) {
                break;
            }
            i3 = i4;
        }
        if (i3 == 0) {
            b1.g.b(16);
            b1.g.b(16);
            String num = Integer.toString(d, 16);
            k1.e.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (fVar.f799b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            q qVar = fVar.f798a;
            k1.e.b(qVar);
            int i6 = qVar.f821b;
            int i7 = qVar.f822c;
            int i8 = i5;
            while (i6 < i7) {
                byte b2 = qVar.f820a[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    i = i8;
                    j2 = 0;
                    if (i == 0) {
                        char[] cArr = N1.b.f839a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    z2 = true;
                    if (i6 != i7) {
                        fVar.f798a = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f821b = i6;
                    }
                    if (!!z2 || fVar.f798a == null) {
                        break;
                    }
                    i5 = i;
                    j3 = j2;
                } else {
                    i2 = b2 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    f fVar2 = new f();
                    fVar2.B(j4);
                    fVar2.A(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar2.t(fVar2.f799b, r1.a.f3833a)));
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

    @Override // M1.h
    public final String q(Charset charset) {
        f fVar = this.f818b;
        fVar.z(this.f817a);
        return fVar.t(fVar.f799b, charset);
    }

    public final int r() {
        w(4L);
        return this.f818b.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k1.e.e(byteBuffer, "sink");
        f fVar = this.f818b;
        if (fVar.f799b == 0 && this.f817a.c(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final int s() {
        w(4L);
        int r2 = this.f818b.r();
        return ((r2 & 255) << 24) | (((-16777216) & r2) >>> 24) | ((16711680 & r2) >>> 8) | ((65280 & r2) << 8);
    }

    public final short t() {
        w(2L);
        return this.f818b.s();
    }

    public final String toString() {
        return "buffer(" + this.f817a + ')';
    }

    public final String u(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long d = d((byte) 10, 0L, j3);
        f fVar = this.f818b;
        if (d != -1) {
            return N1.a.a(fVar, d);
        }
        if (j3 < Long.MAX_VALUE && v(j3) && fVar.d(j3 - 1) == 13 && v(1 + j3) && fVar.d(j3) == 10) {
            return N1.a.a(fVar, j3);
        }
        f fVar2 = new f();
        long min = Math.min(32, fVar.f799b);
        long j4 = 0;
        fVar.getClass();
        k1.e.e(fVar2, "out");
        H1.d.k(fVar.f799b, 0L, min);
        if (min != 0) {
            fVar2.f799b += min;
            q qVar = fVar.f798a;
            while (true) {
                k1.e.b(qVar);
                long j5 = qVar.f822c - qVar.f821b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                qVar = qVar.f824f;
            }
            while (min > 0) {
                k1.e.b(qVar);
                q c2 = qVar.c();
                int i = c2.f821b + ((int) j4);
                c2.f821b = i;
                c2.f822c = Math.min(i + ((int) min), c2.f822c);
                q qVar2 = fVar2.f798a;
                if (qVar2 == null) {
                    c2.f825g = c2;
                    c2.f824f = c2;
                    fVar2.f798a = c2;
                } else {
                    q qVar3 = qVar2.f825g;
                    k1.e.b(qVar3);
                    qVar3.b(c2);
                }
                min -= c2.f822c - c2.f821b;
                qVar = qVar.f824f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f799b, j2) + " content=" + fVar2.p(fVar2.f799b).b() + (char) 8230);
    }

    public final boolean v(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f819c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f818b;
            if (fVar.f799b >= j2) {
                return true;
            }
        } while (this.f817a.c(fVar, 8192L) != -1);
        return false;
    }

    public final void w(long j2) {
        if (!v(j2)) {
            throw new EOFException();
        }
    }

    public final void x(long j2) {
        if (this.f819c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f818b;
            if (fVar.f799b == 0 && this.f817a.c(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f799b);
            fVar.u(min);
            j2 -= min;
        }
    }
}
