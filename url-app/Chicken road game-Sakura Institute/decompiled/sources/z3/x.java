package z3;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements InterfaceC1449g {

    /* renamed from: d, reason: collision with root package name */
    public final D f12040d;

    /* renamed from: e, reason: collision with root package name */
    public final C1448f f12041e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12042i;

    public x(D sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f12040d = sink;
        this.f12041e = new C1448f();
    }

    public final InterfaceC1449g a() {
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        C1448f c1448f = this.f12041e;
        long j4 = c1448f.f11999e;
        if (j4 == 0) {
            j4 = 0;
        } else {
            A a4 = c1448f.f11998d;
            Intrinsics.c(a4);
            A a5 = a4.f11968g;
            Intrinsics.c(a5);
            if (a5.f11964c < 8192 && a5.f11966e) {
                j4 -= r6 - a5.f11963b;
            }
        }
        if (j4 > 0) {
            this.f12040d.e(c1448f, j4);
        }
        return this;
    }

    public final InterfaceC1449g b(int i2) {
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        this.f12041e.y(i2);
        a();
        return this;
    }

    @Override // z3.D
    public final H c() {
        return this.f12040d.c();
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        D d4 = this.f12040d;
        if (this.f12042i) {
            return;
        }
        try {
            C1448f c1448f = this.f12041e;
            long j4 = c1448f.f11999e;
            if (j4 > 0) {
                d4.e(c1448f, j4);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            d4.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f12042i = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC1449g d(int i2) {
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        this.f12041e.A(i2);
        a();
        return this;
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        this.f12041e.e(source, j4);
        a();
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        C1448f c1448f = this.f12041e;
        long j4 = c1448f.f11999e;
        D d4 = this.f12040d;
        if (j4 > 0) {
            d4.e(c1448f, j4);
        }
        d4.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f12042i;
    }

    @Override // z3.InterfaceC1449g
    public final InterfaceC1449g m(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        this.f12041e.B(string);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f12040d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f12042i) {
            throw new IllegalStateException("closed");
        }
        int write = this.f12041e.write(source);
        a();
        return write;
    }
}
