package x1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f4251a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4253c;

    public o(t tVar) {
        Z0.d.e(tVar, "sink");
        this.f4251a = tVar;
        this.f4252b = new f();
    }

    @Override // x1.t
    public final x a() {
        return this.f4251a.a();
    }

    @Override // x1.g
    public final g c(String str) {
        Z0.d.e(str, "string");
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        this.f4252b.x(str);
        f();
        return this;
    }

    @Override // x1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f4251a;
        if (this.f4253c) {
            return;
        }
        try {
            f fVar = this.f4252b;
            long j2 = fVar.f4236b;
            if (j2 > 0) {
                tVar.g(fVar, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            tVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4253c = true;
        if (th != null) {
            throw th;
        }
    }

    public final g f() {
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4252b;
        long j2 = fVar.f4236b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f4235a;
            Z0.d.b(qVar);
            q qVar2 = qVar.f4262g;
            Z0.d.b(qVar2);
            if (qVar2.f4259c < 8192 && qVar2.f4260e) {
                j2 -= r6 - qVar2.f4258b;
            }
        }
        if (j2 > 0) {
            this.f4251a.g(fVar, j2);
        }
        return this;
    }

    @Override // x1.t, java.io.Flushable
    public final void flush() {
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4252b;
        long j2 = fVar.f4236b;
        t tVar = this.f4251a;
        if (j2 > 0) {
            tVar.g(fVar, j2);
        }
        tVar.flush();
    }

    @Override // x1.t
    public final void g(f fVar, long j2) {
        Z0.d.e(fVar, "source");
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        this.f4252b.g(fVar, j2);
        f();
    }

    public final g h(int i) {
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        this.f4252b.u(i);
        f();
        return this;
    }

    public final g i(int i) {
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        this.f4252b.w(i);
        f();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4253c;
    }

    public final String toString() {
        return "buffer(" + this.f4251a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        Z0.d.e(byteBuffer, "source");
        if (this.f4253c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4252b.write(byteBuffer);
        f();
        return write;
    }
}
