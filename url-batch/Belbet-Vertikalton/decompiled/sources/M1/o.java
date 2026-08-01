package M1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f843a;

    /* renamed from: b, reason: collision with root package name */
    public final f f844b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f845c;

    public o(t tVar) {
        j1.h.e(tVar, "sink");
        this.f843a = tVar;
        this.f844b = new f();
    }

    public final g a() {
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f844b;
        long j = fVar.f827b;
        if (j == 0) {
            j = 0;
        } else {
            q qVar = fVar.f826a;
            j1.h.b(qVar);
            q qVar2 = qVar.f854g;
            j1.h.b(qVar2);
            if (qVar2.f851c < 8192 && qVar2.e) {
                j -= r6 - qVar2.f850b;
            }
        }
        if (j > 0) {
            this.f843a.n(fVar, j);
        }
        return this;
    }

    @Override // M1.t
    public final x b() {
        return this.f843a.b();
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f843a;
        if (this.f845c) {
            return;
        }
        try {
            f fVar = this.f844b;
            long j = fVar.f827b;
            if (j > 0) {
                tVar.n(fVar, j);
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
        this.f845c = true;
        if (th != null) {
            throw th;
        }
    }

    public final g d(int i) {
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        this.f844b.M(i);
        a();
        return this;
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f844b;
        long j = fVar.f827b;
        t tVar = this.f843a;
        if (j > 0) {
            tVar.n(fVar, j);
        }
        tVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f845c;
    }

    @Override // M1.t
    public final void n(f fVar, long j) {
        j1.h.e(fVar, "source");
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        this.f844b.n(fVar, j);
        a();
    }

    @Override // M1.g
    public final g p(String str) {
        j1.h.e(str, "string");
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        this.f844b.P(str);
        a();
        return this;
    }

    public final g q(int i) {
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        this.f844b.O(i);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f843a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        j1.h.e(byteBuffer, "source");
        if (this.f845c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f844b.write(byteBuffer);
        a();
        return write;
    }
}
