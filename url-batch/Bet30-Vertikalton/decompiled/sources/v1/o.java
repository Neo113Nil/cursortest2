package v1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f4087a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4088b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4089c;

    public o(t tVar) {
        X0.d.e(tVar, "sink");
        this.f4087a = tVar;
        this.f4088b = new f();
    }

    @Override // v1.t
    public final x a() {
        return this.f4087a.a();
    }

    @Override // v1.t
    public final void c(f fVar, long j2) {
        X0.d.e(fVar, "source");
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        this.f4088b.c(fVar, j2);
        e();
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f4087a;
        if (this.f4089c) {
            return;
        }
        try {
            f fVar = this.f4088b;
            long j2 = fVar.f4073b;
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
        this.f4089c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // v1.g
    public final g d(String str) {
        X0.d.e(str, "string");
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        this.f4088b.v(str);
        e();
        return this;
    }

    public final g e() {
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4088b;
        long j2 = fVar.f4073b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f4072a;
            X0.d.b(qVar);
            q qVar2 = qVar.f4098g;
            X0.d.b(qVar2);
            if (qVar2.f4095c < 8192 && qVar2.f4096e) {
                j2 -= r6 - qVar2.f4094b;
            }
        }
        if (j2 > 0) {
            this.f4087a.c(fVar, j2);
        }
        return this;
    }

    public final g f(int i) {
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        this.f4088b.s(i);
        e();
        return this;
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4088b;
        long j2 = fVar.f4073b;
        t tVar = this.f4087a;
        if (j2 > 0) {
            tVar.c(fVar, j2);
        }
        tVar.flush();
    }

    public final g g(int i) {
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        this.f4088b.u(i);
        e();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4089c;
    }

    public final String toString() {
        return "buffer(" + this.f4087a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.d.e(byteBuffer, "source");
        if (this.f4089c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4088b.write(byteBuffer);
        e();
        return write;
    }
}
