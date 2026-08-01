package C1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f197a;

    /* renamed from: b, reason: collision with root package name */
    public final f f198b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f199c;

    public o(t tVar) {
        e1.d.e(tVar, "sink");
        this.f197a = tVar;
        this.f198b = new f();
    }

    @Override // C1.t
    public final x a() {
        return this.f197a.a();
    }

    @Override // C1.g
    public final g c(String str) {
        e1.d.e(str, "string");
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        this.f198b.x(str);
        g();
        return this;
    }

    @Override // C1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f197a;
        if (this.f199c) {
            return;
        }
        try {
            f fVar = this.f198b;
            long j2 = fVar.f182b;
            if (j2 > 0) {
                tVar.f(fVar, j2);
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
        this.f199c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // C1.t
    public final void f(f fVar, long j2) {
        e1.d.e(fVar, "source");
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        this.f198b.f(fVar, j2);
        g();
    }

    @Override // C1.t, java.io.Flushable
    public final void flush() {
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f198b;
        long j2 = fVar.f182b;
        t tVar = this.f197a;
        if (j2 > 0) {
            tVar.f(fVar, j2);
        }
        tVar.flush();
    }

    public final g g() {
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f198b;
        long j2 = fVar.f182b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f181a;
            e1.d.b(qVar);
            q qVar2 = qVar.f208g;
            e1.d.b(qVar2);
            if (qVar2.f205c < 8192 && qVar2.f206e) {
                j2 -= r6 - qVar2.f204b;
            }
        }
        if (j2 > 0) {
            this.f197a.f(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        this.f198b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        this.f198b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f199c;
    }

    public final String toString() {
        return "buffer(" + this.f197a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        e1.d.e(byteBuffer, "source");
        if (this.f199c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f198b.write(byteBuffer);
        g();
        return write;
    }
}
