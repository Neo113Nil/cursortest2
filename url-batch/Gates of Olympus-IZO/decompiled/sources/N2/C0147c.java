package N2;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: N2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147c implements D {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2914d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final E f2915e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2916f;

    public C0147c(OutputStream outputStream, E e3) {
        this.f2916f = outputStream;
        this.f2915e = e3;
    }

    @Override // N2.D
    public final H c() {
        switch (this.f2914d) {
        }
        return this.f2915e;
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2914d) {
            case 0:
                C0147c c0147c = (C0147c) this.f2916f;
                E e3 = this.f2915e;
                e3.h();
                try {
                    c0147c.close();
                    if (e3.i()) {
                        throw e3.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!e3.i()) {
                        throw e4;
                    }
                    throw e3.k(e4);
                } finally {
                    e3.i();
                }
            default:
                ((OutputStream) this.f2916f).close();
                return;
        }
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
        switch (this.f2914d) {
            case 0:
                C0147c c0147c = (C0147c) this.f2916f;
                E e3 = this.f2915e;
                e3.h();
                try {
                    c0147c.flush();
                    if (e3.i()) {
                        throw e3.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!e3.i()) {
                        throw e4;
                    }
                    throw e3.k(e4);
                } finally {
                    e3.i();
                }
            default:
                ((OutputStream) this.f2916f).flush();
                return;
        }
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        switch (this.f2914d) {
            case 0:
                I2.d.q(c0150f.f2929e, 0L, j3);
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    A a3 = c0150f.f2928d;
                    Z1.i.c(a3);
                    while (true) {
                        if (j4 < 65536) {
                            j4 += a3.f2894c - a3.f2893b;
                            if (j4 >= j3) {
                                j4 = j3;
                            } else {
                                a3 = a3.f2897f;
                                Z1.i.c(a3);
                            }
                        }
                    }
                    C0147c c0147c = (C0147c) this.f2916f;
                    E e3 = this.f2915e;
                    e3.h();
                    try {
                        c0147c.g(c0150f, j4);
                        if (e3.i()) {
                            throw e3.k(null);
                        }
                        j3 -= j4;
                    } catch (IOException e4) {
                        if (!e3.i()) {
                            throw e4;
                        }
                        throw e3.k(e4);
                    } finally {
                        e3.i();
                    }
                }
            default:
                I2.d.q(c0150f.f2929e, 0L, j3);
                while (j3 > 0) {
                    this.f2915e.f();
                    A a4 = c0150f.f2928d;
                    Z1.i.c(a4);
                    int min = (int) Math.min(j3, a4.f2894c - a4.f2893b);
                    ((OutputStream) this.f2916f).write(a4.f2892a, a4.f2893b, min);
                    int i3 = a4.f2893b + min;
                    a4.f2893b = i3;
                    long j5 = min;
                    j3 -= j5;
                    c0150f.f2929e -= j5;
                    if (i3 == a4.f2894c) {
                        c0150f.f2928d = a4.a();
                        B.a(a4);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f2914d) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0147c) this.f2916f) + ')';
            default:
                return "sink(" + ((OutputStream) this.f2916f) + ')';
        }
    }

    public C0147c(E e3, C0147c c0147c) {
        this.f2915e = e3;
        this.f2916f = c0147c;
    }
}
