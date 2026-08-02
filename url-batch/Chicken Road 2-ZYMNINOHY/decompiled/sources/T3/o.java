package T3;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    public final t f2991a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2992b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2993c;

    public o(t sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f2991a = sink;
        this.f2992b = new g();
    }

    public final h a() {
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f2992b;
        long j4 = gVar.f2975b;
        if (j4 == 0) {
            j4 = 0;
        } else {
            q qVar = gVar.f2974a;
            kotlin.jvm.internal.i.b(qVar);
            q qVar2 = qVar.f3003g;
            kotlin.jvm.internal.i.b(qVar2);
            if (qVar2.f2999c < 8192 && qVar2.f3001e) {
                j4 -= r6 - qVar2.f2998b;
            }
        }
        if (j4 > 0) {
            this.f2991a.o(gVar, j4);
        }
        return this;
    }

    @Override // T3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f2991a;
        if (this.f2993c) {
            return;
        }
        try {
            g gVar = this.f2992b;
            long j4 = gVar.f2975b;
            if (j4 > 0) {
                tVar.o(gVar, j4);
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
        this.f2993c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // T3.t
    public final x d() {
        return this.f2991a.d();
    }

    @Override // T3.h, T3.t, java.io.Flushable
    public final void flush() {
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f2992b;
        long j4 = gVar.f2975b;
        t tVar = this.f2991a;
        if (j4 > 0) {
            tVar.o(gVar, j4);
        }
        tVar.flush();
    }

    @Override // T3.h
    public final h h(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.C(string);
        a();
        return this;
    }

    @Override // T3.h
    public final h i(long j4) {
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.y(j4);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2993c;
    }

    @Override // T3.h
    public final h l(j byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.v(byteString);
        a();
        return this;
    }

    @Override // T3.t
    public final void o(g source, long j4) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.o(source, j4);
        a();
    }

    public final String toString() {
        return "buffer(" + this.f2991a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f2992b.write(source);
        a();
        return write;
    }

    @Override // T3.h
    public final h writeByte(int i4) {
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.x(i4);
        a();
        return this;
    }

    @Override // T3.h
    public final h writeInt(int i4) {
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.z(i4);
        a();
        return this;
    }

    @Override // T3.h
    public final h writeShort(int i4) {
        if (this.f2993c) {
            throw new IllegalStateException("closed");
        }
        this.f2992b.A(i4);
        a();
        return this;
    }

    @Override // T3.h
    public final h write(byte[] bArr) {
        if (!this.f2993c) {
            this.f2992b.u(bArr.length, bArr);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
