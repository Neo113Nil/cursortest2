package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class q implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f16062a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final v f16063b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16064c;

    public q(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f16063b = vVar;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d A() {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f16062a.j();
        if (j9 > 0) {
            this.f16063b.a(this.f16062a, j9);
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j9) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.a(cVar, j9);
        A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.b(str);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.e
    public final c c() {
        return this.f16062a;
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16064c) {
            return;
        }
        try {
            c cVar = this.f16062a;
            long j9 = cVar.f16005c;
            if (j9 > 0) {
                this.f16063b.a(cVar, j9);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f16063b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16064c = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d d(f fVar) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.d(fVar);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final OutputStream e() {
        return new OutputStream() { // from class: com.anythink.core.common.n.c.q.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                q.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                q qVar = q.this;
                if (qVar.f16064c) {
                    return;
                }
                qVar.flush();
            }

            public final String toString() {
                return q.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                q qVar = q.this;
                if (qVar.f16064c) {
                    throw new IOException("closed");
                }
                qVar.f16062a.l((int) ((byte) i));
                q.this.A();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i4) {
                q qVar = q.this;
                if (!qVar.f16064c) {
                    qVar.f16062a.c(bArr, i, i4);
                    q.this.A();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.anythink.core.common.n.c.d
    public final d f() {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f16062a;
        long j9 = cVar.f16005c;
        if (j9 > 0) {
            this.f16063b.a(cVar, j9);
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f16062a;
        long j9 = cVar.f16005c;
        if (j9 > 0) {
            this.f16063b.a(cVar, j9);
        }
        this.f16063b.flush();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d h(int i) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.h(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d i(int i) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.i(i);
        return A();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16064c;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d j(int i) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.j(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d k(int i) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.k(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d l(int i) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.l(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d m(int i) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.m(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d n(long j9) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.n(j9);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d o(long j9) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.o(j9);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d p(long j9) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.p(j9);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d q(long j9) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.q(j9);
        return A();
    }

    public final String toString() {
        return "buffer(" + this.f16063b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f16062a.write(byteBuffer);
        A();
        return write;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d c(byte[] bArr, int i, int i4) {
        if (this.f16064c) {
            throw new IllegalStateException("closed");
        }
        this.f16062a.c(bArr, i, i4);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final long a(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j9 = 0;
        while (true) {
            long a_ = wVar.a_(this.f16062a, 8192L);
            if (a_ == -1) {
                return j9;
            }
            j9 += a_;
            A();
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, int i, int i4) {
        if (!this.f16064c) {
            this.f16062a.b(str, i, i4);
            return A();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.d
    public final d d(byte[] bArr) {
        if (!this.f16064c) {
            this.f16062a.d(bArr);
            return A();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.d
    public final d a(w wVar, long j9) {
        while (j9 > 0) {
            long a_ = wVar.a_(this.f16062a, j9);
            if (a_ != -1) {
                j9 -= a_;
                A();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, Charset charset) {
        if (!this.f16064c) {
            this.f16062a.b(str, charset);
            return A();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16063b.a();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, int i, int i4, Charset charset) {
        if (!this.f16064c) {
            this.f16062a.b(str, i, i4, charset);
            return A();
        }
        throw new IllegalStateException("closed");
    }
}
