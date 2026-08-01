package F1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f262a;

    /* renamed from: b, reason: collision with root package name */
    public final f f263b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f264c;

    public o(t tVar) {
        h1.d.e(tVar, "sink");
        this.f262a = tVar;
        this.f263b = new f();
    }

    @Override // F1.t
    public final x a() {
        return this.f262a.a();
    }

    @Override // F1.t
    public final void b(f fVar, long j2) {
        h1.d.e(fVar, "source");
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        this.f263b.b(fVar, j2);
        g();
    }

    @Override // F1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f262a;
        if (this.f264c) {
            return;
        }
        try {
            f fVar = this.f263b;
            long j2 = fVar.f247b;
            if (j2 > 0) {
                tVar.b(fVar, j2);
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
        this.f264c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // F1.g
    public final g e(String str) {
        h1.d.e(str, "string");
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        this.f263b.x(str);
        g();
        return this;
    }

    @Override // F1.t, java.io.Flushable
    public final void flush() {
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f263b;
        long j2 = fVar.f247b;
        t tVar = this.f262a;
        if (j2 > 0) {
            tVar.b(fVar, j2);
        }
        tVar.flush();
    }

    public final g g() {
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f263b;
        long j2 = fVar.f247b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f246a;
            h1.d.b(qVar);
            q qVar2 = qVar.f273g;
            h1.d.b(qVar2);
            if (qVar2.f270c < 8192 && qVar2.f271e) {
                j2 -= r6 - qVar2.f269b;
            }
        }
        if (j2 > 0) {
            this.f262a.b(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        this.f263b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        this.f263b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f264c;
    }

    public final String toString() {
        return "buffer(" + this.f262a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        h1.d.e(byteBuffer, "source");
        if (this.f264c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f263b.write(byteBuffer);
        g();
        return write;
    }
}
