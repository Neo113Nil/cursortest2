package f8;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements h {

    /* renamed from: f, reason: collision with root package name */
    public final g0 f3568f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3569g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3570h;

    public a0(g0 g0Var) {
        r6.k.f(g0Var, "source");
        this.f3568f = g0Var;
        this.f3569g = new f();
    }

    @Override // f8.h
    public final void J(long j8) {
        if (!w(j8)) {
            throw new EOFException();
        }
    }

    @Override // f8.h
    public final int M(v vVar) {
        r6.k.f(vVar, "options");
        if (this.f3570h) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f3569g;
            int b9 = g8.a.b(fVar, vVar, true);
            if (b9 != -2) {
                if (b9 != -1) {
                    fVar.skip(vVar.f3643f[b9].e());
                    return b9;
                }
            } else if (this.f3568f.v(8192L, fVar) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        v1.g.b(16);
        v1.g.b(16);
        r1 = java.lang.Integer.toString(r2, 16);
        r6.k.e(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // f8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long R() {
        f fVar;
        J(1L);
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            boolean w4 = w(i8);
            fVar = this.f3569g;
            if (!w4) {
                break;
            }
            byte k8 = fVar.k(i7);
            if ((k8 < 48 || k8 > 57) && ((k8 < 97 || k8 > 102) && (k8 < 65 || k8 > 70))) {
                break;
            }
            i7 = i8;
        }
        return fVar.R();
    }

    @Override // f8.h
    public final String S(Charset charset) {
        g0 g0Var = this.f3568f;
        f fVar = this.f3569g;
        fVar.N(g0Var);
        return fVar.D(fVar.f3598g, charset);
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f3568f.a();
    }

    public final boolean b() {
        if (this.f3570h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f3569g;
        return fVar.c() && this.f3568f.v(8192L, fVar) == -1;
    }

    public final long c(byte b9, long j8, long j9) {
        if (this.f3570h) {
            throw new IllegalStateException("closed");
        }
        if (0 > j9) {
            throw new IllegalArgumentException(a0.m.h(j9, "fromIndex=0 toIndex=").toString());
        }
        long j10 = 0;
        while (j10 < j9) {
            f fVar = this.f3569g;
            byte b10 = b9;
            long j11 = j9;
            long n8 = fVar.n(b10, j10, j11);
            if (n8 == -1) {
                long j12 = fVar.f3598g;
                if (j12 >= j11 || this.f3568f.v(8192L, fVar) == -1) {
                    break;
                }
                j10 = Math.max(j10, j12);
                b9 = b10;
                j9 = j11;
            } else {
                return n8;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f3570h) {
            return;
        }
        this.f3570h = true;
        this.f3568f.close();
        f fVar = this.f3569g;
        fVar.skip(fVar.f3598g);
    }

    @Override // f8.h
    public final i h(long j8) {
        J(j8);
        return this.f3569g.h(j8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3570h;
    }

    public final int k() {
        J(4L);
        int readInt = this.f3569g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long n() {
        char c4;
        char c6;
        char c9;
        char c10;
        long j8;
        J(8L);
        f fVar = this.f3569g;
        if (fVar.f3598g < 8) {
            throw new EOFException();
        }
        b0 b0Var = fVar.f3597f;
        r6.k.c(b0Var);
        int i7 = b0Var.f3572b;
        int i8 = b0Var.f3573c;
        if (i8 - i7 < 8) {
            j8 = ((fVar.readInt() & 4294967295L) << 32) | (4294967295L & fVar.readInt());
            c9 = '8';
            c10 = '\b';
            c4 = 24;
            c6 = '(';
        } else {
            byte[] bArr = b0Var.f3571a;
            c4 = 24;
            c6 = '(';
            c9 = '8';
            c10 = '\b';
            int i9 = i7 + 7;
            long j9 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
            int i10 = i7 + 8;
            long j10 = j9 | (bArr[i9] & 255);
            fVar.f3598g -= 8;
            if (i10 == i8) {
                fVar.f3597f = b0Var.a();
                c0.a(b0Var);
            } else {
                b0Var.f3572b = i10;
            }
            j8 = j10;
        }
        return ((j8 & 255) << c9) | (((-72057594037927936L) & j8) >>> c9) | ((71776119061217280L & j8) >>> c6) | ((280375465082880L & j8) >>> c4) | ((1095216660480L & j8) >>> c10) | ((4278190080L & j8) << c10) | ((16711680 & j8) << c4) | ((65280 & j8) << c6);
    }

    @Override // f8.h
    public final String q() {
        return y(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        r6.k.f(byteBuffer, "sink");
        f fVar = this.f3569g;
        if (fVar.f3598g == 0 && this.f3568f.v(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // f8.h
    public final byte readByte() {
        J(1L);
        return this.f3569g.readByte();
    }

    @Override // f8.h
    public final int readInt() {
        J(4L);
        return this.f3569g.readInt();
    }

    @Override // f8.h
    public final short readShort() {
        J(2L);
        return this.f3569g.readShort();
    }

    @Override // f8.h
    public final void skip(long j8) {
        if (this.f3570h) {
            throw new IllegalStateException("closed");
        }
        while (j8 > 0) {
            f fVar = this.f3569g;
            if (fVar.f3598g == 0 && this.f3568f.v(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j8, fVar.f3598g);
            fVar.skip(min);
            j8 -= min;
        }
    }

    public final short t() {
        J(2L);
        return this.f3569g.z();
    }

    public final String toString() {
        return "buffer(" + this.f3568f + ')';
    }

    public final String u(long j8) {
        J(j8);
        f fVar = this.f3569g;
        fVar.getClass();
        return fVar.D(j8, z6.a.f10114a);
    }

    @Override // f8.g0
    public final long v(long j8, f fVar) {
        r6.k.f(fVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
        }
        if (this.f3570h) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f3569g;
        if (fVar2.f3598g == 0 && this.f3568f.v(8192L, fVar2) == -1) {
            return -1L;
        }
        return fVar2.v(Math.min(j8, fVar2.f3598g), fVar);
    }

    public final boolean w(long j8) {
        f fVar;
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
        }
        if (this.f3570h) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f3569g;
            if (fVar.f3598g >= j8) {
                return true;
            }
        } while (this.f3568f.v(8192L, fVar) != -1);
        return false;
    }

    @Override // f8.h
    public final String y(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "limit < 0: ").toString());
        }
        long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long c4 = c((byte) 10, 0L, j9);
        f fVar = this.f3569g;
        if (c4 != -1) {
            return g8.a.a(c4, fVar);
        }
        if (j9 < Long.MAX_VALUE && w(j9) && fVar.k(j9 - 1) == 13 && w(j9 + 1) && fVar.k(j9) == 10) {
            return g8.a.a(j9, fVar);
        }
        f fVar2 = new f();
        fVar.b(fVar2, 0L, Math.min(32, fVar.f3598g));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f3598g, j8) + " content=" + fVar2.h(fVar2.f3598g).g() + (char) 8230);
    }
}
