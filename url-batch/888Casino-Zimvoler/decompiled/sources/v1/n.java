package v1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final s f4065a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4066b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4067c;

    public n(s sVar) {
        X0.e.e(sVar, "sink");
        this.f4065a = sVar;
        this.f4066b = new f();
    }

    @Override // v1.s
    public final w a() {
        return this.f4065a.a();
    }

    @Override // v1.s
    public final void c(f fVar, long j2) {
        X0.e.e(fVar, "source");
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        this.f4066b.c(fVar, j2);
        e();
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.f4065a;
        if (this.f4067c) {
            return;
        }
        try {
            f fVar = this.f4066b;
            long j2 = fVar.f4052b;
            if (j2 > 0) {
                sVar.c(fVar, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            sVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4067c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // v1.g
    public final g d(String str) {
        X0.e.e(str, "string");
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        this.f4066b.v(str);
        e();
        return this;
    }

    public final g e() {
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4066b;
        long j2 = fVar.f4052b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            p pVar = fVar.f4051a;
            X0.e.b(pVar);
            p pVar2 = pVar.f4076g;
            X0.e.b(pVar2);
            if (pVar2.f4073c < 8192 && pVar2.f4074e) {
                j2 -= r6 - pVar2.f4072b;
            }
        }
        if (j2 > 0) {
            this.f4065a.c(fVar, j2);
        }
        return this;
    }

    public final g f(int i) {
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        this.f4066b.s(i);
        e();
        return this;
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4066b;
        long j2 = fVar.f4052b;
        s sVar = this.f4065a;
        if (j2 > 0) {
            sVar.c(fVar, j2);
        }
        sVar.flush();
    }

    public final g g(int i) {
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        this.f4066b.u(i);
        e();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4067c;
    }

    public final String toString() {
        return "buffer(" + this.f4065a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.e.e(byteBuffer, "source");
        if (this.f4067c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4066b.write(byteBuffer);
        e();
        return write;
    }
}
