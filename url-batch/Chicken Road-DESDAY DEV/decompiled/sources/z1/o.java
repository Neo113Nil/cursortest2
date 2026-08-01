package z1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f4283a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4284b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4285c;

    public o(t tVar) {
        b1.d.e(tVar, "sink");
        this.f4283a = tVar;
        this.f4284b = new f();
    }

    @Override // z1.t
    public final x a() {
        return this.f4283a.a();
    }

    @Override // z1.t
    public final void c(f fVar, long j2) {
        b1.d.e(fVar, "source");
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        this.f4284b.c(fVar, j2);
        g();
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f4283a;
        if (this.f4285c) {
            return;
        }
        try {
            f fVar = this.f4284b;
            long j2 = fVar.f4268b;
            if (j2 > 0) {
                tVar.c(fVar, j2);
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
        this.f4285c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // z1.g
    public final g d(String str) {
        b1.d.e(str, "string");
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        this.f4284b.x(str);
        g();
        return this;
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4284b;
        long j2 = fVar.f4268b;
        t tVar = this.f4283a;
        if (j2 > 0) {
            tVar.c(fVar, j2);
        }
        tVar.flush();
    }

    public final g g() {
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4284b;
        long j2 = fVar.f4268b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f4267a;
            b1.d.b(qVar);
            q qVar2 = qVar.f4294g;
            b1.d.b(qVar2);
            if (qVar2.f4291c < 8192 && qVar2.f4292e) {
                j2 -= r6 - qVar2.f4290b;
            }
        }
        if (j2 > 0) {
            this.f4283a.c(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        this.f4284b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        this.f4284b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4285c;
    }

    public final String toString() {
        return "buffer(" + this.f4283a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        b1.d.e(byteBuffer, "source");
        if (this.f4285c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4284b.write(byteBuffer);
        g();
        return write;
    }
}
