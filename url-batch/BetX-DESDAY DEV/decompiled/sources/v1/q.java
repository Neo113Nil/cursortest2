package v1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: a, reason: collision with root package name */
    public final w f4509a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4510b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4511c;

    public q(w wVar) {
        X0.f.e(wVar, "source");
        this.f4509a = wVar;
        this.f4510b = new f();
    }

    @Override // v1.w
    public final y a() {
        return this.f4509a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // v1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(o oVar) {
        X0.f.e(oVar, "options");
        if (this.f4511c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f4510b;
            int b2 = w1.a.b(fVar, oVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.o(oVar.f4504a[b2].a());
                    return b2;
                }
            } else if (this.f4509a.c(fVar, 8192L) == -1) {
                break;
            }
        }
    }

    @Override // v1.w
    public final long c(f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f4511c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f4510b;
        if (fVar2.f4488b == 0 && this.f4509a.c(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.c(fVar, Math.min(j2, fVar2.f4488b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f4511c) {
            return;
        }
        this.f4511c = true;
        this.f4509a.close();
        f fVar = this.f4510b;
        fVar.o(fVar.f4488b);
    }

    @Override // v1.h
    public final String f(Charset charset) {
        f fVar = this.f4510b;
        fVar.t(this.f4509a);
        return fVar.n(fVar.f4488b, charset);
    }

    public final boolean g() {
        if (this.f4511c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4510b;
        return fVar.g() && this.f4509a.c(fVar, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f4488b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(byte b2, long j2, long j3) {
        long j4;
        r rVar;
        q qVar = this;
        long j5 = j3;
        if (qVar.f4511c) {
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
            f fVar = qVar.f4510b;
            fVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = fVar.f4488b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (rVar = fVar.f4487a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (rVar.f4514c - rVar.f4513b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        rVar = rVar.f4517f;
                        X0.f.b(rVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) Math.min(rVar.f4514c, (rVar.f4513b + j9) - j7);
                        for (int i = (int) ((rVar.f4513b + j12) - j7); i < min; i++) {
                            if (rVar.f4512a[i] == b2) {
                                j10 = (i - rVar.f4513b) + j7;
                                break;
                            }
                        }
                        j12 = (rVar.f4514c - rVar.f4513b) + j7;
                        rVar = rVar.f4517f;
                        X0.f.b(rVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        rVar = rVar.f4518g;
                        X0.f.b(rVar);
                        j8 -= rVar.f4514c - rVar.f4513b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) Math.min(rVar.f4514c, (rVar.f4513b + j9) - j8);
                        for (int i2 = (int) ((rVar.f4513b + j13) - j8); i2 < min2; i2++) {
                            if (rVar.f4512a[i2] == b2) {
                                j10 = (i2 - rVar.f4513b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (rVar.f4514c - rVar.f4513b);
                        rVar = rVar.f4517f;
                        X0.f.b(rVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = fVar.f4488b;
            if (j14 >= j3) {
                break;
            }
            qVar = this;
            if (qVar.f4509a.c(fVar, 8192L) == -1) {
                break;
            }
            j6 = Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    public final byte i() {
        q(1L);
        return this.f4510b.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4511c;
    }

    public final j j(long j2) {
        q(j2);
        return this.f4510b.k(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f4488b -= r12;
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
            fVar = this.f4510b;
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
            q1.d.i(16);
            q1.d.i(16);
            String num = Integer.toString(h, 16);
            X0.f.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (fVar.f4488b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            r rVar = fVar.f4487a;
            X0.f.b(rVar);
            int i6 = rVar.f4513b;
            int i7 = rVar.f4514c;
            int i8 = i5;
            while (i6 < i7) {
                byte b2 = rVar.f4512a[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    i = i8;
                    j2 = 0;
                    if (i == 0) {
                        char[] cArr = w1.b.f4592a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    z2 = true;
                    if (i6 != i7) {
                        fVar.f4487a = rVar.a();
                        s.a(rVar);
                    } else {
                        rVar.f4513b = i6;
                    }
                    if (!!z2 || fVar.f4487a == null) {
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
                    throw new NumberFormatException("Number too large: ".concat(fVar2.n(fVar2.f4488b, e1.a.f2375a)));
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
        return this.f4510b.l();
    }

    public final int m() {
        q(4L);
        int l2 = this.f4510b.l();
        return ((l2 & 255) << 24) | (((-16777216) & l2) >>> 24) | ((16711680 & l2) >>> 8) | ((65280 & l2) << 8);
    }

    public final short n() {
        q(2L);
        return this.f4510b.m();
    }

    public final String o(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long h = h((byte) 10, 0L, j3);
        f fVar = this.f4510b;
        if (h != -1) {
            return w1.a.a(fVar, h);
        }
        if (j3 < Long.MAX_VALUE && p(j3) && fVar.h(j3 - 1) == 13 && p(1 + j3) && fVar.h(j3) == 10) {
            return w1.a.a(fVar, j3);
        }
        f fVar2 = new f();
        long min = Math.min(32, fVar.f4488b);
        long j4 = 0;
        fVar.getClass();
        X0.f.e(fVar2, "out");
        i1.r.e(fVar.f4488b, 0L, min);
        if (min != 0) {
            fVar2.f4488b += min;
            r rVar = fVar.f4487a;
            while (true) {
                X0.f.b(rVar);
                long j5 = rVar.f4514c - rVar.f4513b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                rVar = rVar.f4517f;
            }
            while (min > 0) {
                X0.f.b(rVar);
                r c2 = rVar.c();
                int i = c2.f4513b + ((int) j4);
                c2.f4513b = i;
                c2.f4514c = Math.min(i + ((int) min), c2.f4514c);
                r rVar2 = fVar2.f4487a;
                if (rVar2 == null) {
                    c2.f4518g = c2;
                    c2.f4517f = c2;
                    fVar2.f4487a = c2;
                } else {
                    r rVar3 = rVar2.f4518g;
                    X0.f.b(rVar3);
                    rVar3.b(c2);
                }
                min -= c2.f4514c - c2.f4513b;
                rVar = rVar.f4517f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f4488b, j2) + " content=" + fVar2.k(fVar2.f4488b).b() + (char) 8230);
    }

    public final boolean p(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f4511c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f4510b;
            if (fVar.f4488b >= j2) {
                return true;
            }
        } while (this.f4509a.c(fVar, 8192L) != -1);
        return false;
    }

    public final void q(long j2) {
        if (!p(j2)) {
            throw new EOFException();
        }
    }

    public final void r(long j2) {
        if (this.f4511c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f4510b;
            if (fVar.f4488b == 0 && this.f4509a.c(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f4488b);
            fVar.o(min);
            j2 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X0.f.e(byteBuffer, "sink");
        f fVar = this.f4510b;
        if (fVar.f4488b == 0 && this.f4509a.c(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f4509a + ')';
    }
}
