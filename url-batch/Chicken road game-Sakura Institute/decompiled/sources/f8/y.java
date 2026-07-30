package f8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y implements g {

    /* renamed from: f, reason: collision with root package name */
    public final e0 f3648f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3649g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3650h;

    public y(e0 e0Var) {
        r6.k.f(e0Var, "sink");
        this.f3648f = e0Var;
        this.f3649g = new f();
    }

    @Override // f8.g
    public final g K(String str) {
        r6.k.f(str, "string");
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        this.f3649g.X(str);
        b();
        return this;
    }

    @Override // f8.g
    public final g P(i iVar) {
        r6.k.f(iVar, "byteString");
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        this.f3649g.I(iVar);
        b();
        return this;
    }

    @Override // f8.e0
    public final i0 a() {
        return this.f3648f.a();
    }

    public final g b() {
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f3649g;
        long j8 = fVar.f3598g;
        if (j8 == 0) {
            j8 = 0;
        } else {
            b0 b0Var = fVar.f3597f;
            r6.k.c(b0Var);
            b0 b0Var2 = b0Var.f3577g;
            r6.k.c(b0Var2);
            if (b0Var2.f3573c < 8192 && b0Var2.f3575e) {
                j8 -= r6 - b0Var2.f3572b;
            }
        }
        if (j8 > 0) {
            this.f3648f.f(j8, fVar);
        }
        return this;
    }

    @Override // f8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.f3648f;
        if (this.f3650h) {
            return;
        }
        try {
            f fVar = this.f3649g;
            long j8 = fVar.f3598g;
            if (j8 > 0) {
                e0Var.f(j8, fVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            e0Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f3650h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // f8.e0
    public final void f(long j8, f fVar) {
        r6.k.f(fVar, "source");
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        this.f3649g.f(j8, fVar);
        b();
    }

    @Override // f8.g, f8.e0, java.io.Flushable
    public final void flush() {
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f3649g;
        long j8 = fVar.f3598g;
        e0 e0Var = this.f3648f;
        if (j8 > 0) {
            e0Var.f(j8, fVar);
        }
        e0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3650h;
    }

    public final String toString() {
        return "buffer(" + this.f3648f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        r6.k.f(byteBuffer, "source");
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        int write = this.f3649g.write(byteBuffer);
        b();
        return write;
    }

    @Override // f8.g
    public final g writeByte(int i7) {
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        this.f3649g.Q(i7);
        b();
        return this;
    }

    @Override // f8.g
    public final g writeInt(int i7) {
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        this.f3649g.U(i7);
        b();
        return this;
    }

    @Override // f8.g
    public final g writeShort(int i7) {
        if (this.f3650h) {
            throw new IllegalStateException("closed");
        }
        this.f3649g.V(i7);
        b();
        return this;
    }

    @Override // f8.g
    public final g write(byte[] bArr) {
        if (!this.f3650h) {
            this.f3649g.write(bArr, 0, bArr.length);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
