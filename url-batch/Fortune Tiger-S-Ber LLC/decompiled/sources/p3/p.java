package p3;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: f, reason: collision with root package name */
    public final v f3040f;
    public final f g;
    public boolean h;

    public p(v vVar) {
        u2.c.e(vVar, "source");
        this.f3040f = vVar;
        this.g = new f();
    }

    @Override // p3.v
    public final x a() {
        return this.f3040f.a();
    }

    @Override // p3.h
    public final i b(long j4) {
        i(j4);
        return this.g.b(j4);
    }

    @Override // p3.v
    public final long c(long j4, f fVar) {
        u2.c.e(fVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.g;
        if (fVar2.g == 0 && this.f3040f.c(8192L, fVar2) == -1) {
            return -1L;
        }
        return fVar2.c(Math.min(j4, fVar2.g), fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f3040f.close();
        f fVar = this.g;
        fVar.skip(fVar.g);
    }

    @Override // p3.h
    public final String d() {
        return h(Long.MAX_VALUE);
    }

    @Override // p3.h
    public final int g(n nVar) {
        u2.c.e(nVar, "options");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.g;
            int b2 = q3.a.b(fVar, nVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.skip(nVar.f3038f[b2].a());
                    return b2;
                }
            } else if (this.f3040f.c(8192L, fVar) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p3.h
    public final String h(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long n3 = n((byte) 10, 0L, j5);
        f fVar = this.g;
        if (n3 != -1) {
            return q3.a.a(n3, fVar);
        }
        if (j5 < Long.MAX_VALUE && p(j5) && fVar.o(j5 - 1) == 13 && p(j5 + 1) && fVar.o(j5) == 10) {
            return q3.a.a(j5, fVar);
        }
        f fVar2 = new f();
        fVar.m(fVar2, 0L, Math.min(32, fVar.g));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.g, j4) + " content=" + fVar2.b(fVar2.g).b() + (char) 8230);
    }

    @Override // p3.h
    public final void i(long j4) {
        if (!p(j4)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        k3.d.i(16);
        k3.d.i(16);
        r1 = java.lang.Integer.toString(r2, 16);
        u2.c.d(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // p3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        f fVar;
        i(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean p4 = p(i5);
            fVar = this.g;
            if (!p4) {
                break;
            }
            byte o4 = fVar.o(i4);
            if ((o4 < 48 || o4 > 57) && ((o4 < 97 || o4 > 102) && (o4 < 65 || o4 > 70))) {
                break;
            }
            i4 = i5;
        }
        return fVar.k();
    }

    @Override // p3.h
    public final String l(Charset charset) {
        v vVar = this.f3040f;
        f fVar = this.g;
        fVar.w(vVar);
        return fVar.r(fVar.g, charset);
    }

    public final boolean m() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.g;
        return fVar.n() && this.f3040f.c(8192L, fVar) == -1;
    }

    public final long n(byte b2, long j4, long j5) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        if (0 > j5) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        long j6 = 0;
        while (j6 < j5) {
            f fVar = this.g;
            byte b4 = b2;
            long j7 = j5;
            long p4 = fVar.p(b4, j6, j7);
            if (p4 == -1) {
                long j8 = fVar.g;
                if (j8 >= j7 || this.f3040f.c(8192L, fVar) == -1) {
                    break;
                }
                j6 = Math.max(j6, j8);
                b2 = b4;
                j5 = j7;
            } else {
                return p4;
            }
        }
        return -1L;
    }

    public final int o() {
        i(4L);
        int readInt = this.g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean p(long j4) {
        f fVar;
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.g;
            if (fVar.g >= j4) {
                return true;
            }
        } while (this.f3040f.c(8192L, fVar) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        u2.c.e(byteBuffer, "sink");
        f fVar = this.g;
        if (fVar.g == 0 && this.f3040f.c(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // p3.h
    public final byte readByte() {
        i(1L);
        return this.g.readByte();
    }

    @Override // p3.h
    public final int readInt() {
        i(4L);
        return this.g.readInt();
    }

    @Override // p3.h
    public final short readShort() {
        i(2L);
        return this.g.readShort();
    }

    @Override // p3.h
    public final void skip(long j4) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            f fVar = this.g;
            if (fVar.g == 0 && this.f3040f.c(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, fVar.g);
            fVar.skip(min);
            j4 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f3040f + ')';
    }
}
