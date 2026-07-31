package T2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x implements InterfaceC0232g {

    /* renamed from: d, reason: collision with root package name */
    public final D f4449d;

    /* renamed from: e, reason: collision with root package name */
    public final C0231f f4450e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4451f;

    public x(D d3) {
        f2.j.f(d3, "sink");
        this.f4449d = d3;
        this.f4450e = new C0231f();
    }

    public final InterfaceC0232g a() {
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        C0231f c0231f = this.f4450e;
        long j3 = c0231f.f4409e;
        if (j3 == 0) {
            j3 = 0;
        } else {
            A a3 = c0231f.f4408d;
            f2.j.c(a3);
            A a4 = a3.f4378g;
            f2.j.c(a4);
            if (a4.f4374c < 8192 && a4.f4376e) {
                j3 -= r6 - a4.f4373b;
            }
        }
        if (j3 > 0) {
            this.f4449d.p(c0231f, j3);
        }
        return this;
    }

    public final InterfaceC0232g b(int i3) {
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        this.f4450e.E(i3);
        a();
        return this;
    }

    @Override // T2.D
    public final H c() {
        return this.f4449d.c();
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        D d3 = this.f4449d;
        if (this.f4451f) {
            return;
        }
        try {
            C0231f c0231f = this.f4450e;
            long j3 = c0231f.f4409e;
            if (j3 > 0) {
                d3.p(c0231f, j3);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            d3.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4451f = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0232g d(int i3) {
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        this.f4450e.G(i3);
        a();
        return this;
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        C0231f c0231f = this.f4450e;
        long j3 = c0231f.f4409e;
        D d3 = this.f4449d;
        if (j3 > 0) {
            d3.p(c0231f, j3);
        }
        d3.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4451f;
    }

    @Override // T2.InterfaceC0232g
    public final InterfaceC0232g o(String str) {
        f2.j.f(str, "string");
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        this.f4450e.I(str);
        a();
        return this;
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        f2.j.f(c0231f, "source");
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        this.f4450e.p(c0231f, j3);
        a();
    }

    public final String toString() {
        return "buffer(" + this.f4449d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        f2.j.f(byteBuffer, "source");
        if (this.f4451f) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4450e.write(byteBuffer);
        a();
        return write;
    }
}
