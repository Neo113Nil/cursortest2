package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ry implements r8 {
    public final q30 f;
    public final p8 g;
    public boolean h;

    public ry(q30 q30Var) {
        q30Var.getClass();
        this.f = q30Var;
        this.g = new p8();
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.f.a();
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        p8Var.getClass();
        if (j < 0) {
            o8.m("byteCount < 0: ", j);
            return 0L;
        }
        if (this.h) {
            o8.t("closed");
            return 0L;
        }
        p8 p8Var2 = this.g;
        if (p8Var2.g == 0 && this.f.b(8192L, p8Var2) == -1) {
            return -1L;
        }
        return p8Var2.b(Math.min(j, p8Var2.g), p8Var);
    }

    @Override // defpackage.r8
    public final t8 c(long j) {
        h(j);
        return this.g.c(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.close();
        p8 p8Var = this.g;
        p8Var.skip(p8Var.g);
    }

    @Override // defpackage.r8
    public final String d() {
        return f(Long.MAX_VALUE);
    }

    @Override // defpackage.r8
    public final String f(long j) {
        if (j < 0) {
            o8.m("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long n = n((byte) 10, 0L, j2);
        p8 p8Var = this.g;
        if (n != -1) {
            return b.a(n, p8Var);
        }
        if (j2 < Long.MAX_VALUE && p(j2) && p8Var.o(j2 - 1) == 13 && p(j2 + 1) && p8Var.o(j2) == 10) {
            return b.a(j2, p8Var);
        }
        p8 p8Var2 = new p8();
        p8Var.m(p8Var2, 0L, Math.min(32L, p8Var.g));
        throw new EOFException("\\n not found: limit=" + Math.min(p8Var.g, j) + " content=" + p8Var2.c(p8Var2.g).b() + (char) 8230);
    }

    @Override // defpackage.r8
    public final int g(xw xwVar) {
        xwVar.getClass();
        if (this.h) {
            o8.t("closed");
            return 0;
        }
        while (true) {
            p8 p8Var = this.g;
            int b = b.b(p8Var, xwVar, true);
            if (b != -2) {
                if (b != -1) {
                    p8Var.skip(xwVar.f[b].a());
                    return b;
                }
            } else if (this.f.b(8192L, p8Var) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.r8
    public final void h(long j) {
        if (!p(j)) {
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
    
        defpackage.vw.p(16);
        defpackage.vw.p(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.r8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        p8 p8Var;
        h(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean p = p(i2);
            p8Var = this.g;
            if (!p) {
                break;
            }
            byte o = p8Var.o(i);
            if ((o < 48 || o > 57) && ((o < 97 || o > 102) && (o < 65 || o > 70))) {
                break;
            }
            i = i2;
        }
        return p8Var.k();
    }

    @Override // defpackage.r8
    public final String l(Charset charset) {
        q30 q30Var = this.f;
        p8 p8Var = this.g;
        p8Var.v(q30Var);
        return p8Var.r(p8Var.g, charset);
    }

    public final boolean m() {
        if (this.h) {
            o8.t("closed");
            return false;
        }
        p8 p8Var = this.g;
        return p8Var.n() && this.f.b(8192L, p8Var) == -1;
    }

    public final long n(byte b, long j, long j2) {
        if (this.h) {
            o8.t("closed");
            return 0L;
        }
        if (0 > j2) {
            o8.m("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            p8 p8Var = this.g;
            byte b2 = b;
            long j4 = j2;
            long p = p8Var.p(b2, j3, j4);
            if (p == -1) {
                long j5 = p8Var.g;
                if (j5 >= j4 || this.f.b(8192L, p8Var) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return p;
            }
        }
        return -1L;
    }

    public final int o() {
        h(4L);
        int readInt = this.g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean p(long j) {
        p8 p8Var;
        if (j < 0) {
            o8.m("byteCount < 0: ", j);
            return false;
        }
        if (this.h) {
            o8.t("closed");
            return false;
        }
        do {
            p8Var = this.g;
            if (p8Var.g >= j) {
                return true;
            }
        } while (this.f.b(8192L, p8Var) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        p8 p8Var = this.g;
        if (p8Var.g == 0 && this.f.b(8192L, p8Var) == -1) {
            return -1;
        }
        return p8Var.read(byteBuffer);
    }

    @Override // defpackage.r8
    public final byte readByte() {
        h(1L);
        return this.g.readByte();
    }

    @Override // defpackage.r8
    public final int readInt() {
        h(4L);
        return this.g.readInt();
    }

    @Override // defpackage.r8
    public final short readShort() {
        h(2L);
        return this.g.readShort();
    }

    @Override // defpackage.r8
    public final void skip(long j) {
        if (this.h) {
            o8.t("closed");
            return;
        }
        while (j > 0) {
            p8 p8Var = this.g;
            if (p8Var.g == 0 && this.f.b(8192L, p8Var) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, p8Var.g);
            p8Var.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }
}
