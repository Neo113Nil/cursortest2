package z3;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445c implements D {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11984d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final E f11985e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11986i;

    public C1445c(OutputStream out, E timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f11986i = out;
        this.f11985e = timeout;
    }

    @Override // z3.D
    public final H c() {
        switch (this.f11984d) {
        }
        return this.f11985e;
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f11986i;
        switch (this.f11984d) {
            case 0:
                C1445c c1445c = (C1445c) obj;
                E e4 = this.f11985e;
                e4.h();
                try {
                    c1445c.close();
                    Unit unit = Unit.f7487a;
                    if (e4.i()) {
                        throw e4.k(null);
                    }
                    return;
                } catch (IOException e5) {
                    if (!e4.i()) {
                        throw e5;
                    }
                    throw e4.k(e5);
                } finally {
                    e4.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Object obj = this.f11986i;
        E e4 = this.f11985e;
        int i2 = this.f11984d;
        Intrinsics.checkNotNullParameter(source, "source");
        switch (i2) {
            case 0:
                m3.s.g(source.f11999e, 0L, j4);
                while (j4 > 0) {
                    A a4 = source.f11998d;
                    Intrinsics.c(a4);
                    long j5 = 0;
                    while (true) {
                        if (j5 < 65536) {
                            j5 += a4.f11964c - a4.f11963b;
                            if (j5 >= j4) {
                                j5 = j4;
                            } else {
                                a4 = a4.f11967f;
                                Intrinsics.c(a4);
                            }
                        }
                    }
                    C1445c c1445c = (C1445c) obj;
                    e4.h();
                    try {
                        c1445c.e(source, j5);
                        Unit unit = Unit.f7487a;
                        if (e4.i()) {
                            throw e4.k(null);
                        }
                        j4 -= j5;
                    } catch (IOException e5) {
                        if (!e4.i()) {
                            throw e5;
                        }
                        throw e4.k(e5);
                    } finally {
                        e4.i();
                    }
                }
                return;
            default:
                m3.s.g(source.f11999e, 0L, j4);
                while (j4 > 0) {
                    e4.f();
                    A a5 = source.f11998d;
                    Intrinsics.c(a5);
                    int min = (int) Math.min(j4, a5.f11964c - a5.f11963b);
                    ((OutputStream) obj).write(a5.f11962a, a5.f11963b, min);
                    int i4 = a5.f11963b + min;
                    a5.f11963b = i4;
                    long j6 = min;
                    j4 -= j6;
                    source.f11999e -= j6;
                    if (i4 == a5.f11964c) {
                        source.f11998d = a5.a();
                        B.a(a5);
                    }
                }
                return;
        }
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
        Object obj = this.f11986i;
        switch (this.f11984d) {
            case 0:
                C1445c c1445c = (C1445c) obj;
                E e4 = this.f11985e;
                e4.h();
                try {
                    c1445c.flush();
                    Unit unit = Unit.f7487a;
                    if (e4.i()) {
                        throw e4.k(null);
                    }
                    return;
                } catch (IOException e5) {
                    if (!e4.i()) {
                        throw e5;
                    }
                    throw e4.k(e5);
                } finally {
                    e4.i();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f11984d) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1445c) this.f11986i) + ')';
            default:
                return "sink(" + ((OutputStream) this.f11986i) + ')';
        }
    }

    public C1445c(E e4, C1445c c1445c) {
        this.f11985e = e4;
        this.f11986i = c1445c;
    }
}
