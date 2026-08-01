package B1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f84a;

    /* renamed from: b, reason: collision with root package name */
    public final f f85b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f86c;

    public o(t tVar) {
        d1.d.e(tVar, "sink");
        this.f84a = tVar;
        this.f85b = new f();
    }

    @Override // B1.t
    public final x a() {
        return this.f84a.a();
    }

    @Override // B1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f84a;
        if (this.f86c) {
            return;
        }
        try {
            f fVar = this.f85b;
            long j2 = fVar.f69b;
            if (j2 > 0) {
                tVar.e(fVar, j2);
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
        this.f86c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // B1.g
    public final g d(String str) {
        d1.d.e(str, "string");
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        this.f85b.x(str);
        g();
        return this;
    }

    @Override // B1.t
    public final void e(f fVar, long j2) {
        d1.d.e(fVar, "source");
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        this.f85b.e(fVar, j2);
        g();
    }

    @Override // B1.t, java.io.Flushable
    public final void flush() {
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f85b;
        long j2 = fVar.f69b;
        t tVar = this.f84a;
        if (j2 > 0) {
            tVar.e(fVar, j2);
        }
        tVar.flush();
    }

    public final g g() {
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f85b;
        long j2 = fVar.f69b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f68a;
            d1.d.b(qVar);
            q qVar2 = qVar.f95g;
            d1.d.b(qVar2);
            if (qVar2.f92c < 8192 && qVar2.f93e) {
                j2 -= r6 - qVar2.f91b;
            }
        }
        if (j2 > 0) {
            this.f84a.e(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        this.f85b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        this.f85b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f86c;
    }

    public final String toString() {
        return "buffer(" + this.f84a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        d1.d.e(byteBuffer, "source");
        if (this.f86c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f85b.write(byteBuffer);
        g();
        return write;
    }
}
