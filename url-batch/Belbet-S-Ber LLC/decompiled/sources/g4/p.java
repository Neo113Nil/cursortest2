package g4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: f, reason: collision with root package name */
    public final v f1949f;

    /* renamed from: g, reason: collision with root package name */
    public final f f1950g;
    public boolean h;

    public p(v vVar) {
        i3.d.e(vVar, "source");
        this.f1949f = vVar;
        this.f1950g = new f();
    }

    @Override // g4.v
    public final x a() {
        return this.f1949f.a();
    }

    @Override // g4.h
    public final i b(long j2) {
        i(j2);
        return this.f1950g.b(j2);
    }

    @Override // g4.v
    public final long c(long j2, f fVar) {
        i3.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f1950g;
        if (fVar2.f1935g == 0 && this.f1949f.c(8192L, fVar2) == -1) {
            return -1L;
        }
        return fVar2.c(Math.min(j2, fVar2.f1935g), fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f1949f.close();
        f fVar = this.f1950g;
        fVar.skip(fVar.f1935g);
    }

    @Override // g4.h
    public final String e() {
        return g(Long.MAX_VALUE);
    }

    @Override // g4.h
    public final String g(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j4 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long n4 = n((byte) 10, 0L, j4);
        f fVar = this.f1950g;
        if (n4 != -1) {
            return h4.a.a(n4, fVar);
        }
        if (j4 < Long.MAX_VALUE && p(j4) && fVar.o(j4 - 1) == 13 && p(j4 + 1) && fVar.o(j4) == 10) {
            return h4.a.a(j4, fVar);
        }
        f fVar2 = new f();
        fVar.m(fVar2, 0L, Math.min(32, fVar.f1935g));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f1935g, j2) + " content=" + fVar2.b(fVar2.f1935g).b() + (char) 8230);
    }

    @Override // g4.h
    public final int h(n nVar) {
        i3.d.e(nVar, "options");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f1950g;
            int b2 = h4.a.b(fVar, nVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.skip(nVar.f1945f[b2].a());
                    return b2;
                }
            } else if (this.f1949f.c(8192L, fVar) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // g4.h
    public final void i(long j2) {
        if (!p(j2)) {
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
    
        b4.d.l(16);
        b4.d.l(16);
        r1 = java.lang.Integer.toString(r2, 16);
        i3.d.d(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // g4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        f fVar;
        i(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            boolean p4 = p(i4);
            fVar = this.f1950g;
            if (!p4) {
                break;
            }
            byte o4 = fVar.o(i);
            if ((o4 < 48 || o4 > 57) && ((o4 < 97 || o4 > 102) && (o4 < 65 || o4 > 70))) {
                break;
            }
            i = i4;
        }
        return fVar.k();
    }

    @Override // g4.h
    public final String l(Charset charset) {
        v vVar = this.f1949f;
        f fVar = this.f1950g;
        fVar.w(vVar);
        return fVar.r(fVar.f1935g, charset);
    }

    public final boolean m() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f1950g;
        return fVar.n() && this.f1949f.c(8192L, fVar) == -1;
    }

    public final long n(byte b2, long j2, long j4) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        if (0 > j4) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j4).toString());
        }
        long j5 = 0;
        while (j5 < j4) {
            f fVar = this.f1950g;
            byte b5 = b2;
            long j6 = j4;
            long p4 = fVar.p(b5, j5, j6);
            if (p4 == -1) {
                long j7 = fVar.f1935g;
                if (j7 >= j6 || this.f1949f.c(8192L, fVar) == -1) {
                    break;
                }
                j5 = Math.max(j5, j7);
                b2 = b5;
                j4 = j6;
            } else {
                return p4;
            }
        }
        return -1L;
    }

    public final int o() {
        i(4L);
        int readInt = this.f1950g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean p(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f1950g;
            if (fVar.f1935g >= j2) {
                return true;
            }
        } while (this.f1949f.c(8192L, fVar) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        i3.d.e(byteBuffer, "sink");
        f fVar = this.f1950g;
        if (fVar.f1935g == 0 && this.f1949f.c(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // g4.h
    public final byte readByte() {
        i(1L);
        return this.f1950g.readByte();
    }

    @Override // g4.h
    public final int readInt() {
        i(4L);
        return this.f1950g.readInt();
    }

    @Override // g4.h
    public final short readShort() {
        i(2L);
        return this.f1950g.readShort();
    }

    @Override // g4.h
    public final void skip(long j2) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f1950g;
            if (fVar.f1935g == 0 && this.f1949f.c(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f1935g);
            fVar.skip(min);
            j2 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f1949f + ')';
    }
}
