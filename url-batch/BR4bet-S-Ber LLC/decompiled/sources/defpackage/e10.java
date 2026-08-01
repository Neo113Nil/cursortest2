package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e10 implements j9 {
    public final h60 f;
    public final h9 g;
    public boolean h;

    public e10(h60 h60Var) {
        h60Var.getClass();
        this.f = h60Var;
        this.g = new h9();
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.f.a();
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        h9Var.getClass();
        if (j < 0) {
            g9.m("byteCount < 0: ", j);
            return 0L;
        }
        if (this.h) {
            g9.s("closed");
            return 0L;
        }
        h9 h9Var2 = this.g;
        if (h9Var2.g == 0 && this.f.b(8192L, h9Var2) == -1) {
            return -1L;
        }
        return h9Var2.b(Math.min(j, h9Var2.g), h9Var);
    }

    @Override // defpackage.j9
    public final l9 c(long j) {
        l(j);
        return this.g.c(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.close();
        h9 h9Var = this.g;
        h9Var.skip(h9Var.g);
    }

    @Override // defpackage.j9
    public final String d() {
        return i(Long.MAX_VALUE);
    }

    public final boolean f() {
        if (this.h) {
            g9.s("closed");
            return false;
        }
        h9 h9Var = this.g;
        return h9Var.g() && this.f.b(8192L, h9Var) == -1;
    }

    public final long g(byte b, long j, long j2) {
        if (this.h) {
            g9.s("closed");
            return 0L;
        }
        if (0 > j2) {
            g9.m("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            h9 h9Var = this.g;
            byte b2 = b;
            long j4 = j2;
            long k = h9Var.k(b2, j3, j4);
            if (k == -1) {
                long j5 = h9Var.g;
                if (j5 >= j4 || this.f.b(8192L, h9Var) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return k;
            }
        }
        return -1L;
    }

    public final int h() {
        l(4L);
        int readInt = this.g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.j9
    public final String i(long j) {
        if (j < 0) {
            g9.m("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long g = g((byte) 10, 0L, j2);
        h9 h9Var = this.g;
        if (g != -1) {
            return b.a(g, h9Var);
        }
        if (j2 < Long.MAX_VALUE && k(j2) && h9Var.h(j2 - 1) == 13 && k(j2 + 1) && h9Var.h(j2) == 10) {
            return b.a(j2, h9Var);
        }
        h9 h9Var2 = new h9();
        h9Var.f(h9Var2, 0L, Math.min(32L, h9Var.g));
        throw new EOFException("\\n not found: limit=" + Math.min(h9Var.g, j) + " content=" + h9Var2.c(h9Var2.g).b() + (char) 8230);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.j9
    public final int j(oz ozVar) {
        ozVar.getClass();
        if (this.h) {
            g9.s("closed");
            return 0;
        }
        while (true) {
            h9 h9Var = this.g;
            int b = b.b(h9Var, ozVar, true);
            if (b != -2) {
                if (b != -1) {
                    h9Var.skip(ozVar.f[b].a());
                    return b;
                }
            } else if (this.f.b(8192L, h9Var) == -1) {
                break;
            }
        }
        return -1;
    }

    public final boolean k(long j) {
        h9 h9Var;
        if (j < 0) {
            g9.m("byteCount < 0: ", j);
            return false;
        }
        if (this.h) {
            g9.s("closed");
            return false;
        }
        do {
            h9Var = this.g;
            if (h9Var.g >= j) {
                return true;
            }
        } while (this.f.b(8192L, h9Var) != -1);
        return false;
    }

    @Override // defpackage.j9
    public final void l(long j) {
        if (!k(j)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.la0.k(16);
        defpackage.la0.k(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o() {
        h9 h9Var;
        l(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean k = k(i2);
            h9Var = this.g;
            if (!k) {
                break;
            }
            byte h = h9Var.h(i);
            if ((h < 48 || h > 57) && ((h < 97 || h > 102) && (h < 65 || h > 70))) {
                break;
            }
            i = i2;
        }
        return h9Var.o();
    }

    @Override // defpackage.j9
    public final String p(Charset charset) {
        h60 h60Var = this.f;
        h9 h9Var = this.g;
        h9Var.v(h60Var);
        return h9Var.r(h9Var.g, charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        h9 h9Var = this.g;
        if (h9Var.g == 0 && this.f.b(8192L, h9Var) == -1) {
            return -1;
        }
        return h9Var.read(byteBuffer);
    }

    @Override // defpackage.j9
    public final byte readByte() {
        l(1L);
        return this.g.readByte();
    }

    @Override // defpackage.j9
    public final int readInt() {
        l(4L);
        return this.g.readInt();
    }

    @Override // defpackage.j9
    public final short readShort() {
        l(2L);
        return this.g.readShort();
    }

    @Override // defpackage.j9
    public final void skip(long j) {
        if (this.h) {
            g9.s("closed");
            return;
        }
        while (j > 0) {
            h9 h9Var = this.g;
            if (h9Var.g == 0 && this.f.b(8192L, h9Var) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, h9Var.g);
            h9Var.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }
}
