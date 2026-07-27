package j5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: a, reason: collision with root package name */
    public final u f10515a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10516b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10517c;

    public p(u sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f10515a = sink;
        this.f10516b = new f();
    }

    @Override // j5.u
    public final void B(f source, long j2) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.B(source, j2);
        a();
    }

    public final g a() {
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f10516b;
        long j2 = fVar.f10495b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            r rVar = fVar.f10494a;
            kotlin.jvm.internal.i.b(rVar);
            r rVar2 = rVar.f10527g;
            kotlin.jvm.internal.i.b(rVar2);
            if (rVar2.f10523c < 8192 && rVar2.f10525e) {
                j2 -= r6 - rVar2.f10522b;
            }
        }
        if (j2 > 0) {
            this.f10515a.B(fVar, j2);
        }
        return this;
    }

    public final g b(int i2) {
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.M(i2);
        a();
        return this;
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f10515a;
        if (this.f10517c) {
            return;
        }
        try {
            f fVar = this.f10516b;
            long j2 = fVar.f10495b;
            if (j2 > 0) {
                uVar.B(fVar, j2);
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
        this.f10517c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // j5.u
    public final y d() {
        return this.f10515a.d();
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f10516b;
        long j2 = fVar.f10495b;
        u uVar = this.f10515a;
        if (j2 > 0) {
            uVar.B(fVar, j2);
        }
        uVar.flush();
    }

    @Override // j5.g
    public final g i(long j2) {
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.N(j2);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f10517c;
    }

    @Override // j5.g
    public final g m(int i2) {
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.M(b.e(i2));
        a();
        return this;
    }

    @Override // j5.g
    public final g n(int i2) {
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.J(i2);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f10515a + ')';
    }

    @Override // j5.g
    public final g u(i byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.G(byteString);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f10516b.write(source);
        a();
        return write;
    }

    @Override // j5.g
    public final g x(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        if (this.f10517c) {
            throw new IllegalStateException("closed");
        }
        this.f10516b.O(string);
        a();
        return this;
    }
}
