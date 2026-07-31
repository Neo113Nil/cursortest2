package N2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x implements InterfaceC0151g {

    /* renamed from: d, reason: collision with root package name */
    public final D f2969d;

    /* renamed from: e, reason: collision with root package name */
    public final C0150f f2970e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2971f;

    public x(D d3) {
        Z1.i.f(d3, "sink");
        this.f2969d = d3;
        this.f2970e = new C0150f();
    }

    @Override // N2.InterfaceC0151g
    public final InterfaceC0151g F(String str) {
        Z1.i.f(str, "string");
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        this.f2970e.U(str);
        a();
        return this;
    }

    public final InterfaceC0151g a() {
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        C0150f c0150f = this.f2970e;
        long j3 = c0150f.f2929e;
        if (j3 == 0) {
            j3 = 0;
        } else {
            A a3 = c0150f.f2928d;
            Z1.i.c(a3);
            A a4 = a3.f2898g;
            Z1.i.c(a4);
            if (a4.f2894c < 8192 && a4.f2896e) {
                j3 -= r6 - a4.f2893b;
            }
        }
        if (j3 > 0) {
            this.f2969d.g(c0150f, j3);
        }
        return this;
    }

    public final InterfaceC0151g b(int i3) {
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        this.f2970e.Q(i3);
        a();
        return this;
    }

    @Override // N2.D
    public final H c() {
        return this.f2969d.c();
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        D d3 = this.f2969d;
        if (this.f2971f) {
            return;
        }
        try {
            C0150f c0150f = this.f2970e;
            long j3 = c0150f.f2929e;
            if (j3 > 0) {
                d3.g(c0150f, j3);
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
        this.f2971f = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0151g e(int i3) {
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        this.f2970e.S(i3);
        a();
        return this;
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        C0150f c0150f = this.f2970e;
        long j3 = c0150f.f2929e;
        D d3 = this.f2969d;
        if (j3 > 0) {
            d3.g(c0150f, j3);
        }
        d3.flush();
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        Z1.i.f(c0150f, "source");
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        this.f2970e.g(c0150f, j3);
        a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2971f;
    }

    public final String toString() {
        return "buffer(" + this.f2969d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        Z1.i.f(byteBuffer, "source");
        if (this.f2971f) {
            throw new IllegalStateException("closed");
        }
        int write = this.f2970e.write(byteBuffer);
        a();
        return write;
    }
}
