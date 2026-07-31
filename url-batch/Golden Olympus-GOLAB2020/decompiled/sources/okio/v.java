package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements g {

    /* renamed from: b, reason: collision with root package name */
    public final B f43299b;

    /* renamed from: c, reason: collision with root package name */
    public final C3372e f43300c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43301d;

    public v(B source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f43299b = source;
        this.f43300c = new C3372e();
    }

    @Override // okio.g
    public String A(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long b4 = b((byte) 10, 0L, j5);
        if (b4 != -1) {
            return H2.a.d(this.f43300c, b4);
        }
        if (j5 < Long.MAX_VALUE && o(j5) && this.f43300c.U(j5 - 1) == 13 && o(j5 + 1) && this.f43300c.U(j5) == 10) {
            return H2.a.d(this.f43300c, j5);
        }
        C3372e c3372e = new C3372e();
        C3372e c3372e2 = this.f43300c;
        c3372e2.J(c3372e, 0L, Math.min(32, c3372e2.l0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f43300c.l0(), j4) + " content=" + c3372e.e0().l() + (char) 8230);
    }

    @Override // okio.g
    public boolean D(long j4, h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return c(j4, bytes, 0, bytes.v());
    }

    @Override // okio.g
    public String E(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f43300c.F(this.f43299b);
        return this.f43300c.E(charset);
    }

    @Override // okio.g
    public void H(long j4) {
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            if (this.f43300c.l0() == 0 && this.f43299b.read(this.f43300c, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, this.f43300c.l0());
            this.f43300c.H(min);
            j4 -= min;
        }
    }

    @Override // okio.g
    public String I() {
        return A(Long.MAX_VALUE);
    }

    @Override // okio.g
    public byte[] K(long j4) {
        O(j4);
        return this.f43300c.K(j4);
    }

    @Override // okio.g
    public void O(long j4) {
        if (!o(j4)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long R() {
        O(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (!o(i5)) {
                break;
            }
            byte U3 = this.f43300c.U(i4);
            if ((U3 < 48 || U3 > 57) && ((U3 < 97 || U3 > 102) && (U3 < 65 || U3 > 70))) {
                break;
            }
            i4 = i5;
        }
        return this.f43300c.R();
    }

    @Override // okio.g
    public InputStream S() {
        return new a();
    }

    @Override // okio.g
    public int T(s options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        do {
            int e4 = H2.a.e(this.f43300c, options, true);
            if (e4 != -2) {
                if (e4 == -1) {
                    return -1;
                }
                this.f43300c.H(options.e()[e4].v());
                return e4;
            }
        } while (this.f43299b.read(this.f43300c, 8192L) != -1);
        return -1;
    }

    public long a(byte b4) {
        return b(b4, 0L, Long.MAX_VALUE);
    }

    public long b(byte b4, long j4, long j5) {
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        long j6 = j4;
        while (j6 < j5) {
            byte b5 = b4;
            long j7 = j5;
            long V3 = this.f43300c.V(b5, j6, j7);
            if (V3 == -1) {
                long l02 = this.f43300c.l0();
                if (l02 >= j7 || this.f43299b.read(this.f43300c, 8192L) == -1) {
                    break;
                }
                j6 = Math.max(j6, l02);
                b4 = b5;
                j5 = j7;
            } else {
                return V3;
            }
        }
        return -1L;
    }

    public boolean c(long j4, h bytes, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        if (j4 < 0 || i4 < 0 || i5 < 0 || bytes.v() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            long j5 = i6 + j4;
            if (!o(1 + j5) || this.f43300c.U(j5) != bytes.g(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f43301d) {
            return;
        }
        this.f43301d = true;
        this.f43299b.close();
        this.f43300c.m();
    }

    @Override // okio.g
    public h d(long j4) {
        O(j4);
        return this.f43300c.d(j4);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f43301d;
    }

    public int m() {
        O(4L);
        return this.f43300c.f0();
    }

    public short n() {
        O(2L);
        return this.f43300c.g0();
    }

    public boolean o(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        while (this.f43300c.l0() < j4) {
            if (this.f43299b.read(this.f43300c, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.g, okio.f
    public C3372e q() {
        return this.f43300c;
    }

    @Override // okio.B
    public long read(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        if (this.f43300c.l0() == 0 && this.f43299b.read(this.f43300c, 8192L) == -1) {
            return -1L;
        }
        return this.f43300c.read(sink, Math.min(j4, this.f43300c.l0()));
    }

    @Override // okio.g
    public byte readByte() {
        O(1L);
        return this.f43300c.readByte();
    }

    @Override // okio.g
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            O(sink.length);
            this.f43300c.readFully(sink);
        } catch (EOFException e4) {
            int i4 = 0;
            while (this.f43300c.l0() > 0) {
                C3372e c3372e = this.f43300c;
                int b02 = c3372e.b0(sink, i4, (int) c3372e.l0());
                if (b02 == -1) {
                    throw new AssertionError();
                }
                i4 += b02;
            }
            throw e4;
        }
    }

    @Override // okio.g
    public int readInt() {
        O(4L);
        return this.f43300c.readInt();
    }

    @Override // okio.g
    public long readLong() {
        O(8L);
        return this.f43300c.readLong();
    }

    @Override // okio.g
    public short readShort() {
        O(2L);
        return this.f43300c.readShort();
    }

    @Override // okio.B
    public C timeout() {
        return this.f43299b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f43299b + ')';
    }

    @Override // okio.g
    public byte[] u() {
        this.f43300c.F(this.f43299b);
        return this.f43300c.u();
    }

    @Override // okio.g
    public boolean v() {
        if (this.f43301d) {
            throw new IllegalStateException("closed");
        }
        return this.f43300c.v() && this.f43299b.read(this.f43300c, 8192L) == -1;
    }

    @Override // okio.g
    public void x(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            O(j4);
            this.f43300c.x(sink, j4);
        } catch (EOFException e4) {
            sink.F(this.f43300c);
            throw e4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long z() {
        O(1L);
        long j4 = 0;
        while (true) {
            long j5 = j4 + 1;
            if (!o(j5)) {
                break;
            }
            byte U3 = this.f43300c.U(j4);
            if ((U3 < 48 || U3 > 57) && !(j4 == 0 && U3 == 45)) {
                break;
            }
            j4 = j5;
        }
        return this.f43300c.z();
    }

    public static final class a extends InputStream implements AutoCloseable {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            v vVar = v.this;
            if (vVar.f43301d) {
                throw new IOException("closed");
            }
            return (int) Math.min(vVar.f43300c.l0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            v.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            v vVar = v.this;
            if (vVar.f43301d) {
                throw new IOException("closed");
            }
            if (vVar.f43300c.l0() == 0) {
                v vVar2 = v.this;
                if (vVar2.f43299b.read(vVar2.f43300c, 8192L) == -1) {
                    return -1;
                }
            }
            return v.this.f43300c.readByte() & 255;
        }

        public String toString() {
            return v.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i4, int i5) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!v.this.f43301d) {
                AbstractC3369b.b(data.length, i4, i5);
                if (v.this.f43300c.l0() == 0) {
                    v vVar = v.this;
                    if (vVar.f43299b.read(vVar.f43300c, 8192L) == -1) {
                        return -1;
                    }
                }
                return v.this.f43300c.b0(data, i4, i5);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f43300c.l0() == 0 && this.f43299b.read(this.f43300c, 8192L) == -1) {
            return -1;
        }
        return this.f43300c.read(sink);
    }
}
