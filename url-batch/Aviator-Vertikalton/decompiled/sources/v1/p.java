package v1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: a, reason: collision with root package name */
    public final u f4502a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4504c;

    public p(u uVar) {
        X0.f.e(uVar, "sink");
        this.f4502a = uVar;
        this.f4503b = new f();
    }

    @Override // v1.u
    public final y a() {
        return this.f4502a.a();
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f4502a;
        if (this.f4504c) {
            return;
        }
        try {
            f fVar = this.f4503b;
            long j2 = fVar.f4484b;
            if (j2 > 0) {
                uVar.d(fVar, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4504c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // v1.u
    public final void d(f fVar, long j2) {
        X0.f.e(fVar, "source");
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        this.f4503b.d(fVar, j2);
        g();
    }

    @Override // v1.g
    public final g e(String str) {
        X0.f.e(str, "string");
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        this.f4503b.x(str);
        g();
        return this;
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4503b;
        long j2 = fVar.f4484b;
        u uVar = this.f4502a;
        if (j2 > 0) {
            uVar.d(fVar, j2);
        }
        uVar.flush();
    }

    public final g g() {
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4503b;
        long j2 = fVar.f4484b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            r rVar = fVar.f4483a;
            X0.f.b(rVar);
            r rVar2 = rVar.f4514g;
            X0.f.b(rVar2);
            if (rVar2.f4510c < 8192 && rVar2.f4512e) {
                j2 -= r6 - rVar2.f4509b;
            }
        }
        if (j2 > 0) {
            this.f4502a.d(fVar, j2);
        }
        return this;
    }

    public final g h(int i) {
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        this.f4503b.u(i);
        g();
        return this;
    }

    public final g i(int i) {
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        this.f4503b.w(i);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4504c;
    }

    public final String toString() {
        return "buffer(" + this.f4502a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.f.e(byteBuffer, "source");
        if (this.f4504c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4503b.write(byteBuffer);
        g();
        return write;
    }
}
