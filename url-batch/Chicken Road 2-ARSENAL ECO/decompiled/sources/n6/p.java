package n6;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: f, reason: collision with root package name */
    public final u f5544f;

    /* renamed from: g, reason: collision with root package name */
    public final f f5545g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5546h;

    public p(u sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f5544f = sink;
        this.f5545g = new f();
    }

    @Override // n6.g
    public final g D(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.O(string);
        a();
        return this;
    }

    public final g a() {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f5545g;
        long j4 = fVar.f5524g;
        if (j4 == 0) {
            j4 = 0;
        } else {
            r rVar = fVar.f5523f;
            kotlin.jvm.internal.i.b(rVar);
            r rVar2 = rVar.f5556g;
            kotlin.jvm.internal.i.b(rVar2);
            if (rVar2.f5552c < 8192 && rVar2.f5554e) {
                j4 -= r6 - rVar2.f5551b;
            }
        }
        if (j4 > 0) {
            this.f5544f.l(j4, fVar);
        }
        return this;
    }

    @Override // n6.u
    public final y b() {
        return this.f5544f.b();
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f5544f;
        if (this.f5546h) {
            return;
        }
        try {
            f fVar = this.f5545g;
            long j4 = fVar.f5524g;
            if (j4 > 0) {
                uVar.l(j4, fVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f5546h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // n6.g, n6.u, java.io.Flushable
    public final void flush() {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f5545g;
        long j4 = fVar.f5524g;
        u uVar = this.f5544f;
        if (j4 > 0) {
            uVar.l(j4, fVar);
        }
        uVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5546h;
    }

    @Override // n6.g
    public final g k(long j4) {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.M(j4);
        a();
        return this;
    }

    @Override // n6.u
    public final void l(long j4, f source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.l(j4, source);
        a();
    }

    @Override // n6.g
    public final g s(int i7) {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.L(b.e(i7));
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f5544f + ')';
    }

    @Override // n6.g
    public final g u(i byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.G(byteString);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        int write = this.f5545g.write(source);
        a();
        return write;
    }

    @Override // n6.g
    public final g writeByte(int i7) {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.I(i7);
        a();
        return this;
    }

    @Override // n6.g
    public final g writeInt(int i7) {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.L(i7);
        a();
        return this;
    }

    @Override // n6.g
    public final g writeShort(int i7) {
        if (this.f5546h) {
            throw new IllegalStateException("closed");
        }
        this.f5545g.N(i7);
        a();
        return this;
    }

    @Override // n6.g
    public final g write(byte[] bArr) {
        if (!this.f5546h) {
            this.f5545g.write(bArr, 0, bArr.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
