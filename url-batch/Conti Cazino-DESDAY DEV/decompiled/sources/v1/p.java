package v1;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f4090a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4091b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4092c;

    public p(v vVar) {
        X0.d.e(vVar, "source");
        this.f4090a = vVar;
        this.f4091b = new f();
    }

    @Override // v1.v
    public final x a() {
        return this.f4090a.a();
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f4091b;
        if (fVar2.f4073b == 0 && this.f4090a.b(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.b(fVar, Math.min(j2, fVar2.f4073b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f4092c) {
            return;
        }
        this.f4092c = true;
        this.f4090a.close();
        f fVar = this.f4091b;
        fVar.m(fVar.f4073b);
    }

    public final boolean e() {
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4091b;
        return fVar.e() && this.f4090a.b(fVar, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f4073b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(byte b2, long j2, long j3) {
        long j4;
        q qVar;
        p pVar = this;
        long j5 = j3;
        if (pVar.f4092c) {
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
            f fVar = pVar.f4091b;
            fVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = fVar.f4073b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (qVar = fVar.f4072a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (qVar.f4095c - qVar.f4094b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        qVar = qVar.f4097f;
                        X0.d.b(qVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) Math.min(qVar.f4095c, (qVar.f4094b + j9) - j7);
                        for (int i = (int) ((qVar.f4094b + j12) - j7); i < min; i++) {
                            if (qVar.f4093a[i] == b2) {
                                j10 = (i - qVar.f4094b) + j7;
                                break;
                            }
                        }
                        j12 = (qVar.f4095c - qVar.f4094b) + j7;
                        qVar = qVar.f4097f;
                        X0.d.b(qVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        qVar = qVar.f4098g;
                        X0.d.b(qVar);
                        j8 -= qVar.f4095c - qVar.f4094b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) Math.min(qVar.f4095c, (qVar.f4094b + j9) - j8);
                        for (int i2 = (int) ((qVar.f4094b + j13) - j8); i2 < min2; i2++) {
                            if (qVar.f4093a[i2] == b2) {
                                j10 = (i2 - qVar.f4094b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (qVar.f4095c - qVar.f4094b);
                        qVar = qVar.f4097f;
                        X0.d.b(qVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = fVar.f4073b;
            if (j14 >= j3) {
                break;
            }
            pVar = this;
            if (pVar.f4090a.b(fVar, 8192L) == -1) {
                break;
            }
            j6 = Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    public final byte g() {
        o(1L);
        return this.f4091b.g();
    }

    public final i h(long j2) {
        o(j2);
        return this.f4091b.i(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f4073b -= r12;
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
        f fVar;
        long j2;
        int i;
        int i2;
        byte f2;
        o(1L);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            boolean n2 = n(i4);
            fVar = this.f4091b;
            if (!n2) {
                break;
            }
            f2 = fVar.f(i3);
            if ((f2 < 48 || f2 > 57) && ((f2 < 97 || f2 > 102) && (f2 < 65 || f2 > 70))) {
                break;
            }
            i3 = i4;
        }
        if (i3 == 0) {
            q1.d.j(16);
            q1.d.j(16);
            String num = Integer.toString(f2, 16);
            X0.d.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (fVar.f4073b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            q qVar = fVar.f4072a;
            X0.d.b(qVar);
            int i6 = qVar.f4094b;
            int i7 = qVar.f4095c;
            int i8 = i5;
            while (i6 < i7) {
                byte b2 = qVar.f4093a[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    i = i8;
                    j2 = 0;
                    if (i == 0) {
                        char[] cArr = w1.b.f4172a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    z2 = true;
                    if (i6 != i7) {
                        fVar.f4072a = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f4094b = i6;
                    }
                    if (!!z2 || fVar.f4072a == null) {
                        break;
                    }
                    i5 = i;
                    j3 = j2;
                } else {
                    i2 = b2 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    f fVar2 = new f();
                    fVar2.t(j4);
                    fVar2.s(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar2.l(fVar2.f4073b, e1.a.f1912a)));
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

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4092c;
    }

    public final int j() {
        o(4L);
        return this.f4091b.j();
    }

    public final int k() {
        o(4L);
        int j2 = this.f4091b.j();
        return ((j2 & 255) << 24) | (((-16777216) & j2) >>> 24) | ((16711680 & j2) >>> 8) | ((65280 & j2) << 8);
    }

    public final short l() {
        o(2L);
        return this.f4091b.k();
    }

    public final String m(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long f2 = f((byte) 10, 0L, j3);
        f fVar = this.f4091b;
        if (f2 != -1) {
            return w1.a.a(fVar, f2);
        }
        if (j3 < Long.MAX_VALUE && n(j3) && fVar.f(j3 - 1) == 13 && n(1 + j3) && fVar.f(j3) == 10) {
            return w1.a.a(fVar, j3);
        }
        f fVar2 = new f();
        long min = Math.min(32, fVar.f4073b);
        long j4 = 0;
        fVar.getClass();
        X0.d.e(fVar2, "out");
        i1.s.f(fVar.f4073b, 0L, min);
        if (min != 0) {
            fVar2.f4073b += min;
            q qVar = fVar.f4072a;
            while (true) {
                X0.d.b(qVar);
                long j5 = qVar.f4095c - qVar.f4094b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                qVar = qVar.f4097f;
            }
            while (min > 0) {
                X0.d.b(qVar);
                q c2 = qVar.c();
                int i = c2.f4094b + ((int) j4);
                c2.f4094b = i;
                c2.f4095c = Math.min(i + ((int) min), c2.f4095c);
                q qVar2 = fVar2.f4072a;
                if (qVar2 == null) {
                    c2.f4098g = c2;
                    c2.f4097f = c2;
                    fVar2.f4072a = c2;
                } else {
                    q qVar3 = qVar2.f4098g;
                    X0.d.b(qVar3);
                    qVar3.b(c2);
                }
                min -= c2.f4095c - c2.f4094b;
                qVar = qVar.f4097f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f4073b, j2) + " content=" + fVar2.i(fVar2.f4073b).b() + (char) 8230);
    }

    public final boolean n(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f4091b;
            if (fVar.f4073b >= j2) {
                return true;
            }
        } while (this.f4090a.b(fVar, 8192L) != -1);
        return false;
    }

    public final void o(long j2) {
        if (!n(j2)) {
            throw new EOFException();
        }
    }

    public final void p(long j2) {
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f4091b;
            if (fVar.f4073b == 0 && this.f4090a.b(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f4073b);
            fVar.m(min);
            j2 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X0.d.e(byteBuffer, "sink");
        f fVar = this.f4091b;
        if (fVar.f4073b == 0 && this.f4090a.b(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f4090a + ')';
    }
}
