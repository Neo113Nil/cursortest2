package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j70 implements w9 {
    public final ke0 f;
    public final t9 g;
    public boolean h;

    public j70(ke0 ke0Var) {
        ke0Var.getClass();
        this.f = ke0Var;
        this.g = new t9();
    }

    @Override // defpackage.w9
    public final int B(f50 f50Var) {
        f50Var.getClass();
        if (this.h) {
            s9.u("closed");
            return 0;
        }
        while (true) {
            t9 t9Var = this.g;
            int b = b.b(t9Var, f50Var, true);
            if (b != -2) {
                if (b != -1) {
                    t9Var.skip(f50Var.f[b].a());
                    return b;
                }
            } else if (this.f.c(8192L, t9Var) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.w9
    public final void H(long j) {
        if (!w(j)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.d50.f(16);
        defpackage.d50.f(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long L() {
        t9 t9Var;
        H(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean w = w(i2);
            t9Var = this.g;
            if (!w) {
                break;
            }
            byte r = t9Var.r(i);
            if ((r < 48 || r > 57) && ((r < 97 || r > 102) && (r < 65 || r > 70))) {
                break;
            }
            i = i2;
        }
        return t9Var.L();
    }

    @Override // defpackage.w9
    public final String M(Charset charset) {
        ke0 ke0Var = this.f;
        t9 t9Var = this.g;
        t9Var.S(ke0Var);
        return t9Var.O(t9Var.g, charset);
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.f.a();
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        t9Var.getClass();
        if (j < 0) {
            s9.n("byteCount < 0: ", j);
            return 0L;
        }
        if (this.h) {
            s9.u("closed");
            return 0L;
        }
        t9 t9Var2 = this.g;
        if (t9Var2.g == 0 && this.f.c(8192L, t9Var2) == -1) {
            return -1L;
        }
        return t9Var2.c(Math.min(j, t9Var2.g), t9Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.close();
        t9 t9Var = this.g;
        t9Var.skip(t9Var.g);
    }

    public final boolean i() {
        if (this.h) {
            s9.u("closed");
            return false;
        }
        t9 t9Var = this.g;
        return t9Var.n() && this.f.c(8192L, t9Var) == -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.w9
    public final y9 j(long j) {
        H(j);
        return this.g.j(j);
    }

    @Override // defpackage.w9
    public final String m() {
        return y(Long.MAX_VALUE);
    }

    public final long n(byte b, long j, long j2) {
        if (this.h) {
            s9.u("closed");
            return 0L;
        }
        if (0 > j2) {
            s9.n("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            t9 t9Var = this.g;
            byte b2 = b;
            long j4 = j2;
            long w = t9Var.w(b2, j3, j4);
            if (w == -1) {
                long j5 = t9Var.g;
                if (j5 >= j4 || this.f.c(8192L, t9Var) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return w;
            }
        }
        return -1L;
    }

    public final int r() {
        H(4L);
        int readInt = this.g.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        t9 t9Var = this.g;
        if (t9Var.g == 0 && this.f.c(8192L, t9Var) == -1) {
            return -1;
        }
        return t9Var.read(byteBuffer);
    }

    @Override // defpackage.w9
    public final byte readByte() {
        H(1L);
        return this.g.readByte();
    }

    @Override // defpackage.w9
    public final int readInt() {
        H(4L);
        return this.g.readInt();
    }

    @Override // defpackage.w9
    public final short readShort() {
        H(2L);
        return this.g.readShort();
    }

    @Override // defpackage.w9
    public final void skip(long j) {
        if (this.h) {
            s9.u("closed");
            return;
        }
        while (j > 0) {
            t9 t9Var = this.g;
            if (t9Var.g == 0 && this.f.c(8192L, t9Var) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, t9Var.g);
            t9Var.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    public final boolean w(long j) {
        t9 t9Var;
        if (j < 0) {
            s9.n("byteCount < 0: ", j);
            return false;
        }
        if (this.h) {
            s9.u("closed");
            return false;
        }
        do {
            t9Var = this.g;
            if (t9Var.g >= j) {
                return true;
            }
        } while (this.f.c(8192L, t9Var) != -1);
        return false;
    }

    @Override // defpackage.w9
    public final String y(long j) {
        if (j < 0) {
            s9.n("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long n = n((byte) 10, 0L, j2);
        t9 t9Var = this.g;
        if (n != -1) {
            return b.a(n, t9Var);
        }
        if (j2 < Long.MAX_VALUE && w(j2) && t9Var.r(j2 - 1) == 13 && w(j2 + 1) && t9Var.r(j2) == 10) {
            return b.a(j2, t9Var);
        }
        t9 t9Var2 = new t9();
        t9Var.i(t9Var2, 0L, Math.min(32L, t9Var.g));
        throw new EOFException("\\n not found: limit=" + Math.min(t9Var.g, j) + " content=" + t9Var2.j(t9Var2.g).b() + (char) 8230);
    }
}
