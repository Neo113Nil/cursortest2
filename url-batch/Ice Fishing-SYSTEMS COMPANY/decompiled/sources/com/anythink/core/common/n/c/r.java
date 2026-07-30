package com.anythink.core.common.n.c;

import com.google.android.gms.internal.ads.CL;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class r implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f16066a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final w f16067b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16068c;

    public r(w wVar) {
        if (wVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f16067b = wVar;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void a(long j9) {
        if (!b(j9)) {
            throw new EOFException();
        }
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j9) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j9 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
        }
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f16066a;
        if (cVar2.f16005c == 0 && this.f16067b.a_(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f16066a.a_(cVar, Math.min(j9, this.f16066a.f16005c));
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean b(long j9) {
        c cVar;
        if (j9 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
        }
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f16066a;
            if (cVar.f16005c >= j9) {
                return true;
            }
        } while (this.f16067b.a_(cVar, 8192L) != -1);
        return false;
    }

    @Override // com.anythink.core.common.n.c.e
    public final c c() {
        return this.f16066a;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16068c) {
            return;
        }
        this.f16068c = true;
        this.f16067b.close();
        this.f16066a.z();
    }

    @Override // com.anythink.core.common.n.c.e
    public final c d() {
        return this.f16066a;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String e(long j9) {
        a(j9);
        return this.f16066a.e(j9);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String f(long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j9)));
        }
        long j10 = j9 == Long.MAX_VALUE ? Long.MAX_VALUE : j9 + 1;
        long a9 = a((byte) 10, 0L, j10);
        if (a9 != -1) {
            return this.f16066a.g(a9);
        }
        if (j10 < Long.MAX_VALUE && b(j10) && this.f16066a.c(j10 - 1) == 13 && b(j10 + 1) && this.f16066a.c(j10) == 10) {
            return this.f16066a.g(j10);
        }
        c cVar = new c();
        c cVar2 = this.f16066a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.f16005c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16066a.f16005c, j9) + " content=" + cVar.t().g() + (char) 8230);
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean g() {
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        return this.f16066a.g() && this.f16067b.a_(this.f16066a, 8192L) == -1;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] h(long j9) {
        a(j9);
        return this.f16066a.h(j9);
    }

    @Override // com.anythink.core.common.n.c.e
    public final void i(long j9) {
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        while (j9 > 0) {
            c cVar = this.f16066a;
            if (cVar.f16005c == 0 && this.f16067b.a_(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j9, this.f16066a.f16005c);
            this.f16066a.i(min);
            j9 -= min;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16068c;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte k() {
        a(1L);
        return this.f16066a.k();
    }

    @Override // com.anythink.core.common.n.c.e
    public final short l() {
        a(2L);
        return this.f16066a.l();
    }

    @Override // com.anythink.core.common.n.c.e
    public final int m() {
        a(4L);
        return this.f16066a.m();
    }

    @Override // com.anythink.core.common.n.c.e
    public final long n() {
        a(8L);
        return this.f16066a.n();
    }

    @Override // com.anythink.core.common.n.c.e
    public final short o() {
        a(2L);
        return y.a(this.f16066a.l());
    }

    @Override // com.anythink.core.common.n.c.e
    public final int p() {
        a(4L);
        return y.a(this.f16066a.m());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long q() {
        a(8L);
        return y.a(this.f16066a.n());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long r() {
        byte c4;
        a(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (!b(i4)) {
                break;
            }
            c4 = this.f16066a.c(i);
            if ((c4 < 48 || c4 > 57) && !(i == 0 && c4 == 45)) {
                break;
            }
            i = i4;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(c4)));
        }
        return this.f16066a.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        c cVar = this.f16066a;
        if (cVar.f16005c == 0 && this.f16067b.a_(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f16066a.read(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s() {
        a(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (!b(i4)) {
                break;
            }
            byte c4 = this.f16066a.c(i);
            if ((c4 < 48 || c4 > 57) && ((c4 < 97 || c4 > 102) && (c4 < 65 || c4 > 70))) {
                break;
            }
            i = i4;
        }
        return this.f16066a.s();
    }

    @Override // com.anythink.core.common.n.c.e
    public final f t() {
        this.f16066a.a(this.f16067b);
        return this.f16066a.t();
    }

    public final String toString() {
        return "buffer(" + this.f16067b + ")";
    }

    @Override // com.anythink.core.common.n.c.e
    public final String u() {
        this.f16066a.a(this.f16067b);
        return this.f16066a.u();
    }

    @Override // com.anythink.core.common.n.c.e
    public final String v() {
        long a9 = a((byte) 10);
        if (a9 != -1) {
            return this.f16066a.g(a9);
        }
        long j9 = this.f16066a.f16005c;
        if (j9 != 0) {
            return e(j9);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String w() {
        return f(Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final int x() {
        int i;
        int i4;
        int i9;
        a(1L);
        byte c4 = this.f16066a.c(0L);
        if ((c4 & 224) == 192) {
            a(2L);
        } else if ((c4 & 240) == 224) {
            a(3L);
        } else if ((c4 & 248) == 240) {
            a(4L);
        }
        c cVar = this.f16066a;
        if (cVar.f16005c == 0) {
            throw new EOFException();
        }
        byte c9 = cVar.c(0L);
        if ((c9 & com.anythink.core.common.s.a.c.f16474a) == 0) {
            i = c9 & Byte.MAX_VALUE;
            i9 = 0;
            i4 = 1;
        } else if ((c9 & 224) == 192) {
            i = c9 & 31;
            i4 = 2;
            i9 = 128;
        } else if ((c9 & 240) == 224) {
            i = c9 & 15;
            i4 = 3;
            i9 = 2048;
        } else {
            if ((c9 & 248) != 240) {
                cVar.i(1L);
                return 65533;
            }
            i = c9 & 7;
            i4 = 4;
            i9 = com.anythink.basead.exoplayer.b.aX;
        }
        long j9 = i4;
        if (cVar.f16005c < j9) {
            StringBuilder l9 = CL.l(i4, "size < ", ": ");
            l9.append(cVar.f16005c);
            l9.append(" (to read code point prefixed 0x");
            l9.append(Integer.toHexString(c9));
            l9.append(")");
            throw new EOFException(l9.toString());
        }
        for (int i10 = 1; i10 < i4; i10++) {
            long j10 = i10;
            byte c10 = cVar.c(j10);
            if ((c10 & 192) != 128) {
                cVar.i(j10);
                return 65533;
            }
            i = (i << 6) | (c10 & com.anythink.core.common.s.a.c.f16476c);
        }
        cVar.i(j9);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= i9) {
            return i;
        }
        return 65533;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] y() {
        this.f16066a.a(this.f16067b);
        return this.f16066a.y();
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(o oVar) {
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        do {
            int a9 = this.f16066a.a(oVar, true);
            if (a9 == -1) {
                return -1;
            }
            if (a9 != -2) {
                this.f16066a.i(oVar.f16054a[a9].j());
                return a9;
            }
        } while (this.f16067b.a_(this.f16066a, 8192L) != -1);
        return -1;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long c(f fVar) {
        return b(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final f d(long j9) {
        a(j9);
        return this.f16066a.d(j9);
    }

    @Override // com.anythink.core.common.n.c.e
    public final e h() {
        return n.a(new p(this));
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(byte[] bArr) {
        try {
            a(bArr.length);
            this.f16066a.b(bArr);
        } catch (EOFException e6) {
            int i = 0;
            while (true) {
                c cVar = this.f16066a;
                long j9 = cVar.f16005c;
                if (j9 > 0) {
                    int a9 = cVar.a(bArr, i, (int) j9);
                    if (a9 == -1) {
                        throw new AssertionError();
                    }
                    i += a9;
                } else {
                    throw e6;
                }
            }
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr, int i, int i4) {
        long j9 = i4;
        y.a(bArr.length, i, j9);
        c cVar = this.f16066a;
        if (cVar.f16005c == 0 && this.f16067b.a_(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f16066a.a(bArr, i, (int) Math.min(j9, this.f16066a.f16005c));
    }

    @Override // com.anythink.core.common.n.c.e
    public final InputStream i() {
        return new InputStream() { // from class: com.anythink.core.common.n.c.r.1
            @Override // java.io.InputStream
            public final int available() {
                r rVar = r.this;
                if (rVar.f16068c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(rVar.f16066a.f16005c, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                r.this.close();
            }

            @Override // java.io.InputStream
            public final int read() {
                r rVar = r.this;
                if (rVar.f16068c) {
                    throw new IOException("closed");
                }
                c cVar = rVar.f16066a;
                if (cVar.f16005c == 0 && rVar.f16067b.a_(cVar, 8192L) == -1) {
                    return -1;
                }
                return r.this.f16066a.k() & 255;
            }

            public final String toString() {
                return r.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i4) {
                if (!r.this.f16068c) {
                    y.a(bArr.length, i, i4);
                    r rVar = r.this;
                    c cVar = rVar.f16066a;
                    if (cVar.f16005c == 0 && rVar.f16067b.a_(cVar, 8192L) == -1) {
                        return -1;
                    }
                    return r.this.f16066a.a(bArr, i, i4);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(c cVar, long j9) {
        try {
            a(j9);
            this.f16066a.b(cVar, j9);
        } catch (EOFException e6) {
            cVar.a((w) this.f16066a);
            throw e6;
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(v vVar) {
        if (vVar != null) {
            long j9 = 0;
            while (this.f16067b.a_(this.f16066a, 8192L) != -1) {
                long j10 = this.f16066a.j();
                if (j10 > 0) {
                    j9 += j10;
                    vVar.a(this.f16066a, j10);
                }
            }
            c cVar = this.f16066a;
            long j11 = cVar.f16005c;
            if (j11 <= 0) {
                return j9;
            }
            long j12 = j9 + j11;
            vVar.a(cVar, j11);
            return j12;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar) {
        return a(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar, long j9) {
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long b9 = this.f16066a.b(fVar, j9);
            if (b9 != -1) {
                return b9;
            }
            c cVar = this.f16066a;
            long j10 = cVar.f16005c;
            if (this.f16067b.a_(cVar, 8192L) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, j10);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(Charset charset) {
        if (charset != null) {
            this.f16066a.a(this.f16067b);
            return this.f16066a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(long j9, Charset charset) {
        a(j9);
        if (charset != null) {
            return this.f16066a.a(j9, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9) {
        return a(b9, 0L, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9, long j9) {
        return a(b9, j9, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9, long j9, long j10) {
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        if (j9 < 0 || j10 < j9) {
            throw new IllegalArgumentException("fromIndex=" + j9 + " toIndex=" + j10);
        }
        long j11 = j9;
        while (j11 < j10) {
            byte b10 = b9;
            long j12 = j10;
            long a9 = this.f16066a.a(b10, j11, j12);
            if (a9 == -1) {
                c cVar = this.f16066a;
                long j13 = cVar.f16005c;
                if (j13 >= j12 || this.f16067b.a_(cVar, 8192L) == -1) {
                    break;
                }
                j11 = Math.max(j11, j13);
                b9 = b10;
                j10 = j12;
            } else {
                return a9;
            }
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(f fVar, long j9) {
        if (this.f16068c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long a9 = this.f16066a.a(fVar, j9);
            if (a9 != -1) {
                return a9;
            }
            c cVar = this.f16066a;
            long j10 = cVar.f16005c;
            if (this.f16067b.a_(cVar, 8192L) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, (j10 - fVar.j()) + 1);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j9, f fVar) {
        return a(j9, fVar, fVar.j());
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j9, f fVar, int i) {
        if (!this.f16068c) {
            if (j9 < 0 || i < 0 || fVar.j() < i) {
                return false;
            }
            for (int i4 = 0; i4 < i; i4++) {
                long j10 = i4 + j9;
                if (!b(1 + j10) || this.f16066a.c(j10) != fVar.b(i4)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16067b.a();
    }
}
