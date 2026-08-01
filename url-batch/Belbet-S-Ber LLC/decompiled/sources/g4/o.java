package g4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: f, reason: collision with root package name */
    public final t f1947f;

    /* renamed from: g, reason: collision with root package name */
    public final f f1948g;
    public boolean h;

    public o(t tVar) {
        i3.d.e(tVar, "sink");
        this.f1947f = tVar;
        this.f1948g = new f();
    }

    @Override // g4.t
    public final x a() {
        return this.f1947f.a();
    }

    @Override // g4.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f1947f;
        if (this.h) {
            return;
        }
        try {
            f fVar = this.f1948g;
            long j2 = fVar.f1935g;
            if (j2 > 0) {
                tVar.f(j2, fVar);
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

    @Override // g4.g
    public final g d(i iVar) {
        i3.d.e(iVar, "byteString");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.f1948g.u(iVar);
        m();
        return this;
    }

    @Override // g4.t
    public final void f(long j2, f fVar) {
        i3.d.e(fVar, "source");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.f1948g.f(j2, fVar);
        m();
    }

    @Override // g4.g, g4.t, java.io.Flushable
    public final void flush() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f1948g;
        long j2 = fVar.f1935g;
        t tVar = this.f1947f;
        if (j2 > 0) {
            tVar.f(j2, fVar);
        }
        tVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // g4.g
    public final g j(String str) {
        i3.d.e(str, "string");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.f1948g.B(str);
        m();
        return this;
    }

    public final g m() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f1948g;
        long j2 = fVar.f1935g;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f1934f;
            i3.d.b(qVar);
            q qVar2 = qVar.f1956g;
            i3.d.b(qVar2);
            if (qVar2.f1953c < 8192 && qVar2.f1954e) {
                j2 -= r6 - qVar2.f1952b;
            }
        }
        if (j2 > 0) {
            this.f1947f.f(j2, fVar);
        }
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f1947f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        i3.d.e(byteBuffer, "source");
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        int write = this.f1948g.write(byteBuffer);
        m();
        return write;
    }

    @Override // g4.g
    public final g writeByte(int i) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.f1948g.x(i);
        m();
        return this;
    }

    @Override // g4.g
    public final g writeInt(int i) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.f1948g.z(i);
        m();
        return this;
    }

    @Override // g4.g
    public final g writeShort(int i) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        this.f1948g.A(i);
        m();
        return this;
    }

    @Override // g4.g
    public final g write(byte[] bArr) {
        if (!this.h) {
            this.f1948g.v(bArr, bArr.length);
            m();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
