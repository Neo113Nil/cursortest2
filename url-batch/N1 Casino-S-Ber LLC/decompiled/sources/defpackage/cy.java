package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class cy implements w8 {
    public final f30 f;
    public final u8 g;
    public boolean h;

    public cy(f30 f30Var) {
        f30Var.getClass();
        this.f = f30Var;
        this.g = new u8();
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.f.a();
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        u8Var.getClass();
        if (j < 0) {
            t8.o("byteCount < 0: ", j);
            return 0L;
        }
        if (this.h) {
            t8.t("closed");
            return 0L;
        }
        u8 u8Var2 = this.g;
        if (u8Var2.g == 0 && this.f.b(8192L, u8Var2) == -1) {
            return -1L;
        }
        return u8Var2.b(Math.min(j, u8Var2.g), u8Var);
    }

    @Override // defpackage.w8
    public final y8 c(long j) {
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
        u8 u8Var = this.g;
        u8Var.skip(u8Var.g);
    }

    @Override // defpackage.w8
    public final String d() {
        return f(Long.MAX_VALUE);
    }

    @Override // defpackage.w8
    public final String f(long j) {
        if (j < 0) {
            t8.o("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long n = n((byte) 10, 0L, j2);
        u8 u8Var = this.g;
        if (n != -1) {
            return b.a(n, u8Var);
        }
        if (j2 < Long.MAX_VALUE && p(j2) && u8Var.o(j2 - 1) == 13 && p(j2 + 1) && u8Var.o(j2) == 10) {
            return b.a(j2, u8Var);
        }
        u8 u8Var2 = new u8();
        u8Var.m(u8Var2, 0L, Math.min(32L, u8Var.g));
        throw new EOFException("\\n not found: limit=" + Math.min(u8Var.g, j) + " content=" + u8Var2.c(u8Var2.g).b() + (char) 8230);
    }

    @Override // defpackage.w8
    public final int g(lw lwVar) {
        lwVar.getClass();
        if (this.h) {
            t8.t("closed");
            return 0;
        }
        while (true) {
            u8 u8Var = this.g;
            int b = b.b(u8Var, lwVar, true);
            if (b != -2) {
                if (b != -1) {
                    u8Var.skip(lwVar.f[b].a());
                    return b;
                }
            } else if (this.f.b(8192L, u8Var) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.w8
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
    
        defpackage.e70.e(16);
        defpackage.e70.e(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        u8 u8Var;
        h(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean p = p(i2);
            u8Var = this.g;
            if (!p) {
                break;
            }
            byte o = u8Var.o(i);
            if ((o < 48 || o > 57) && ((o < 97 || o > 102) && (o < 65 || o > 70))) {
                break;
            }
            i = i2;
        }
        return u8Var.k();
    }

    @Override // defpackage.w8
    public final String l(Charset charset) {
        f30 f30Var = this.f;
        u8 u8Var = this.g;
        u8Var.v(f30Var);
        return u8Var.r(u8Var.g, charset);
    }

    public final boolean m() {
        if (this.h) {
            t8.t("closed");
            return false;
        }
        u8 u8Var = this.g;
        return u8Var.n() && this.f.b(8192L, u8Var) == -1;
    }

    public final long n(byte b, long j, long j2) {
        if (this.h) {
            t8.t("closed");
            return 0L;
        }
        if (0 > j2) {
            t8.o("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            u8 u8Var = this.g;
            byte b2 = b;
            long j4 = j2;
            long p = u8Var.p(b2, j3, j4);
            if (p == -1) {
                long j5 = u8Var.g;
                if (j5 >= j4 || this.f.b(8192L, u8Var) == -1) {
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
        u8 u8Var;
        if (j < 0) {
            t8.o("byteCount < 0: ", j);
            return false;
        }
        if (this.h) {
            t8.t("closed");
            return false;
        }
        do {
            u8Var = this.g;
            if (u8Var.g >= j) {
                return true;
            }
        } while (this.f.b(8192L, u8Var) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        u8 u8Var = this.g;
        if (u8Var.g == 0 && this.f.b(8192L, u8Var) == -1) {
            return -1;
        }
        return u8Var.read(byteBuffer);
    }

    @Override // defpackage.w8
    public final byte readByte() {
        h(1L);
        return this.g.readByte();
    }

    @Override // defpackage.w8
    public final int readInt() {
        h(4L);
        return this.g.readInt();
    }

    @Override // defpackage.w8
    public final short readShort() {
        h(2L);
        return this.g.readShort();
    }

    @Override // defpackage.w8
    public final void skip(long j) {
        if (this.h) {
            t8.t("closed");
            return;
        }
        while (j > 0) {
            u8 u8Var = this.g;
            if (u8Var.g == 0 && this.f.b(8192L, u8Var) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, u8Var.g);
            u8Var.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }
}
