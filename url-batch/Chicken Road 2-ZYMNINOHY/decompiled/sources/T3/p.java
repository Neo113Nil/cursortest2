package T3;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: a, reason: collision with root package name */
    public final v f2994a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2995b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2996c;

    public p(v source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f2994a = source;
        this.f2995b = new g();
    }

    public final boolean a() {
        if (this.f2996c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f2995b;
        return gVar.b() && this.f2994a.j(gVar, 8192L) == -1;
    }

    public final long b(byte b4, long j4, long j5) {
        if (this.f2996c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j5) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        long j6 = 0;
        while (j6 < j5) {
            g gVar = this.f2995b;
            byte b5 = b4;
            long j7 = j5;
            long f4 = gVar.f(b5, j6, j7);
            if (f4 == -1) {
                long j8 = gVar.f2975b;
                if (j8 >= j7 || this.f2994a.j(gVar, 8192L) == -1) {
                    break;
                }
                j6 = Math.max(j6, j8);
                b4 = b5;
                j5 = j7;
            } else {
                return f4;
            }
        }
        return -1L;
    }

    @Override // T3.i
    public final j c(long j4) {
        p(j4);
        return this.f2995b.c(j4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f2996c) {
            return;
        }
        this.f2996c = true;
        this.f2994a.close();
        g gVar = this.f2995b;
        gVar.skip(gVar.f2975b);
    }

    @Override // T3.v
    public final x d() {
        return this.f2994a.d();
    }

    public final int e() {
        p(4L);
        int readInt = this.f2995b.readInt();
        return ((readInt & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean f(long j4) {
        g gVar;
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f2996c) {
            throw new IllegalStateException("closed");
        }
        do {
            gVar = this.f2995b;
            if (gVar.f2975b >= j4) {
                return true;
            }
        } while (this.f2994a.j(gVar, 8192L) != -1);
        return false;
    }

    @Override // T3.i
    public final String g(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long b4 = b((byte) 10, 0L, j5);
        g gVar = this.f2995b;
        if (b4 != -1) {
            return U3.a.a(gVar, b4);
        }
        if (j5 < Long.MAX_VALUE && f(j5) && gVar.e(j5 - 1) == 13 && f(j5 + 1) && gVar.e(j5) == 10) {
            return U3.a.a(gVar, j5);
        }
        g gVar2 = new g();
        gVar.a(gVar2, 0L, Math.min(32, gVar.f2975b));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f2975b, j4) + " content=" + gVar2.c(gVar2.f2975b).b() + (char) 8230);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2996c;
    }

    @Override // T3.v
    public final long j(g sink, long j4) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f2996c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f2995b;
        if (gVar.f2975b == 0 && this.f2994a.j(gVar, 8192L) == -1) {
            return -1L;
        }
        return gVar.j(sink, Math.min(j4, gVar.f2975b));
    }

    @Override // T3.i
    public final String m() {
        return g(Long.MAX_VALUE);
    }

    @Override // T3.i
    public final void p(long j4) {
        if (!f(j4)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        i2.AbstractC0457a.d(16);
        i2.AbstractC0457a.d(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.jvm.internal.i.d(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // T3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q() {
        g gVar;
        p(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean f4 = f(i5);
            gVar = this.f2995b;
            if (!f4) {
                break;
            }
            byte e4 = gVar.e(i4);
            if ((e4 < 48 || e4 > 57) && ((e4 < 97 || e4 > 102) && (e4 < 65 || e4 > 70))) {
                break;
            }
            i4 = i5;
        }
        return gVar.q();
    }

    @Override // T3.i
    public final InputStream r() {
        return new f(this, 1);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        g gVar = this.f2995b;
        if (gVar.f2975b == 0 && this.f2994a.j(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(sink);
    }

    @Override // T3.i
    public final byte readByte() {
        p(1L);
        return this.f2995b.readByte();
    }

    @Override // T3.i
    public final int readInt() {
        p(4L);
        return this.f2995b.readInt();
    }

    @Override // T3.i
    public final short readShort() {
        p(2L);
        return this.f2995b.readShort();
    }

    @Override // T3.i
    public final void skip(long j4) {
        if (this.f2996c) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            g gVar = this.f2995b;
            if (gVar.f2975b == 0 && this.f2994a.j(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, gVar.f2975b);
            gVar.skip(min);
            j4 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f2994a + ')';
    }
}
