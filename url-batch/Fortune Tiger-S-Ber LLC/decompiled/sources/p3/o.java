package p3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: f, reason: collision with root package name */
    public final t f3039f;
    public final f g;
    public boolean h;

    public o(t tVar) {
        u2.c.e(tVar, "sink");
        this.f3039f = tVar;
        this.g = new f();
    }

    @Override // p3.t
    public final x a() {
        return this.f3039f.a();
    }

    @Override // p3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f3039f;
        if (this.h) {
            return;
        }
        try {
            f fVar = this.g;
            long j4 = fVar.g;
            if (j4 > 0) {
                tVar.e(j4, fVar);
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
        this.h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p3.t
    public final void e(long j4, f fVar) {
        u2.c.e(fVar, "source");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.g.e(j4, fVar);
        m();
    }

    @Override // p3.g
    public final g f(i iVar) {
        u2.c.e(iVar, "byteString");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.g.u(iVar);
        m();
        return this;
    }

    @Override // p3.g, p3.t, java.io.Flushable
    public final void flush() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.g;
        long j4 = fVar.g;
        t tVar = this.f3039f;
        if (j4 > 0) {
            tVar.e(j4, fVar);
        }
        tVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // p3.g
    public final g j(String str) {
        u2.c.e(str, "string");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.g.B(str);
        m();
        return this;
    }

    public final g m() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.g;
        long j4 = fVar.g;
        if (j4 == 0) {
            j4 = 0;
        } else {
            q qVar = fVar.f3028f;
            u2.c.b(qVar);
            q qVar2 = qVar.g;
            u2.c.b(qVar2);
            if (qVar2.c < 8192 && qVar2.f3044e) {
                j4 -= r6 - qVar2.f3042b;
            }
        }
        if (j4 > 0) {
            this.f3039f.e(j4, fVar);
        }
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f3039f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        u2.c.e(byteBuffer, "source");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        int write = this.g.write(byteBuffer);
        m();
        return write;
    }

    @Override // p3.g
    public final g writeByte(int i4) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.g.x(i4);
        m();
        return this;
    }

    @Override // p3.g
    public final g writeInt(int i4) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.g.z(i4);
        m();
        return this;
    }

    @Override // p3.g
    public final g writeShort(int i4) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.g.A(i4);
        m();
        return this;
    }

    @Override // p3.g
    public final g write(byte[] bArr) {
        if (!this.h) {
            this.g.v(bArr, bArr.length);
            m();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
