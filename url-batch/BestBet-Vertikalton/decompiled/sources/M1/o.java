package M1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f814a;

    /* renamed from: b, reason: collision with root package name */
    public final f f815b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f816c;

    public o(t tVar) {
        k1.e.e(tVar, "sink");
        this.f814a = tVar;
        this.f815b = new f();
    }

    public final g a() {
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f815b;
        long j2 = fVar.f799b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f798a;
            k1.e.b(qVar);
            q qVar2 = qVar.f825g;
            k1.e.b(qVar2);
            if (qVar2.f822c < 8192 && qVar2.f823e) {
                j2 -= r6 - qVar2.f821b;
            }
        }
        if (j2 > 0) {
            this.f814a.i(fVar, j2);
        }
        return this;
    }

    @Override // M1.t
    public final x b() {
        return this.f814a.b();
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f814a;
        if (this.f816c) {
            return;
        }
        try {
            f fVar = this.f815b;
            long j2 = fVar.f799b;
            if (j2 > 0) {
                tVar.i(fVar, j2);
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
        this.f816c = true;
        if (th != null) {
            throw th;
        }
    }

    public final g d(int i) {
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        this.f815b.A(i);
        a();
        return this;
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f815b;
        long j2 = fVar.f799b;
        t tVar = this.f814a;
        if (j2 > 0) {
            tVar.i(fVar, j2);
        }
        tVar.flush();
    }

    @Override // M1.t
    public final void i(f fVar, long j2) {
        k1.e.e(fVar, "source");
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        this.f815b.i(fVar, j2);
        a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f816c;
    }

    public final g j(int i) {
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        this.f815b.C(i);
        a();
        return this;
    }

    @Override // M1.g
    public final g l(String str) {
        k1.e.e(str, "string");
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        this.f815b.D(str);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f814a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        k1.e.e(byteBuffer, "source");
        if (this.f816c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f815b.write(byteBuffer);
        a();
        return write;
    }
}
