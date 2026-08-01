package E1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f217a;

    /* renamed from: b, reason: collision with root package name */
    public final f f218b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f219c;

    public o(t tVar) {
        g1.d.e(tVar, "sink");
        this.f217a = tVar;
        this.f218b = new f();
    }

    @Override // E1.t
    public final x a() {
        return this.f217a.a();
    }

    @Override // E1.t
    public final void b(f fVar, long j2) {
        g1.d.e(fVar, "source");
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        this.f218b.b(fVar, j2);
        g();
    }

    @Override // E1.g
    public final g c(String str) {
        g1.d.e(str, "string");
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        this.f218b.x(str);
        g();
        return this;
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f217a;
        if (this.f219c) {
            return;
        }
        try {
            f fVar = this.f218b;
            long j2 = fVar.f202b;
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
        this.f219c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f218b;
        long j2 = fVar.f202b;
        t tVar = this.f217a;
        if (j2 > 0) {
            tVar.b(fVar, j2);
        }
        tVar.flush();
    }

    public final g g() {
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f218b;
        long j2 = fVar.f202b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f201a;
            g1.d.b(qVar);
            q qVar2 = qVar.f228g;
            g1.d.b(qVar2);
            if (qVar2.f225c < 8192 && qVar2.f226e) {
                j2 -= r6 - qVar2.f224b;
            }
        }
        if (j2 > 0) {
            this.f217a.b(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        this.f218b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        this.f218b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f219c;
    }

    public final String toString() {
        return "buffer(" + this.f217a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        g1.d.e(byteBuffer, "source");
        if (this.f219c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f218b.write(byteBuffer);
        g();
        return write;
    }
}
