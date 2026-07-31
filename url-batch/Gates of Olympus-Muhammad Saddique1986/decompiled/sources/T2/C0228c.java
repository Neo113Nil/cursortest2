package T2;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: T2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228c implements D {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4394d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final E f4395e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4396f;

    public C0228c(OutputStream outputStream, E e3) {
        this.f4396f = outputStream;
        this.f4395e = e3;
    }

    @Override // T2.D
    public final H c() {
        switch (this.f4394d) {
        }
        return this.f4395e;
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4394d) {
            case 0:
                C0228c c0228c = (C0228c) this.f4396f;
                E e3 = this.f4395e;
                e3.h();
                try {
                    c0228c.close();
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
                ((OutputStream) this.f4396f).close();
                return;
        }
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
        switch (this.f4394d) {
            case 0:
                C0228c c0228c = (C0228c) this.f4396f;
                E e3 = this.f4395e;
                e3.h();
                try {
                    c0228c.flush();
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
                ((OutputStream) this.f4396f).flush();
                return;
        }
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        switch (this.f4394d) {
            case 0:
                O2.l.R(c0231f.f4409e, 0L, j3);
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    A a3 = c0231f.f4408d;
                    f2.j.c(a3);
                    while (true) {
                        if (j4 < 65536) {
                            j4 += a3.f4374c - a3.f4373b;
                            if (j4 >= j3) {
                                j4 = j3;
                            } else {
                                a3 = a3.f4377f;
                                f2.j.c(a3);
                            }
                        }
                    }
                    C0228c c0228c = (C0228c) this.f4396f;
                    E e3 = this.f4395e;
                    e3.h();
                    try {
                        c0228c.p(c0231f, j4);
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
                O2.l.R(c0231f.f4409e, 0L, j3);
                while (j3 > 0) {
                    this.f4395e.f();
                    A a4 = c0231f.f4408d;
                    f2.j.c(a4);
                    int min = (int) Math.min(j3, a4.f4374c - a4.f4373b);
                    ((OutputStream) this.f4396f).write(a4.f4372a, a4.f4373b, min);
                    int i3 = a4.f4373b + min;
                    a4.f4373b = i3;
                    long j5 = min;
                    j3 -= j5;
                    c0231f.f4409e -= j5;
                    if (i3 == a4.f4374c) {
                        c0231f.f4408d = a4.a();
                        B.a(a4);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f4394d) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0228c) this.f4396f) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4396f) + ')';
        }
    }

    public C0228c(E e3, C0228c c0228c) {
        this.f4395e = e3;
        this.f4396f = c0228c;
    }
}
