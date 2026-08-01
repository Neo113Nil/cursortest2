package E1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f218a;

    /* renamed from: b, reason: collision with root package name */
    public final f f219b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f220c;

    public o(t tVar) {
        g1.d.e(tVar, "sink");
        this.f218a = tVar;
        this.f219b = new f();
    }

    @Override // E1.t
    public final x a() {
        return this.f218a.a();
    }

    @Override // E1.t
    public final void b(f fVar, long j2) {
        g1.d.e(fVar, "source");
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        this.f219b.b(fVar, j2);
        g();
    }

    @Override // E1.g
    public final g c(String str) {
        g1.d.e(str, "string");
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        this.f219b.x(str);
        g();
        return this;
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f218a;
        if (this.f220c) {
            return;
        }
        try {
            f fVar = this.f219b;
            long j2 = fVar.f203b;
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
        this.f220c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f219b;
        long j2 = fVar.f203b;
        t tVar = this.f218a;
        if (j2 > 0) {
            tVar.b(fVar, j2);
        }
        tVar.flush();
    }

    public final g g() {
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f219b;
        long j2 = fVar.f203b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f202a;
            g1.d.b(qVar);
            q qVar2 = qVar.f229g;
            g1.d.b(qVar2);
            if (qVar2.f226c < 8192 && qVar2.f227e) {
                j2 -= r6 - qVar2.f225b;
            }
        }
        if (j2 > 0) {
            this.f218a.b(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        this.f219b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        this.f219b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f220c;
    }

    public final String toString() {
        return "buffer(" + this.f218a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        g1.d.e(byteBuffer, "source");
        if (this.f220c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f219b.write(byteBuffer);
        g();
        return write;
    }
}
