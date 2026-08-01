package p3;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3020f = 1;
    public final u g;
    public final Object h;

    public c(OutputStream outputStream, u uVar) {
        this.h = outputStream;
        this.g = uVar;
    }

    @Override // p3.t
    public final x a() {
        switch (this.f3020f) {
        }
        return this.g;
    }

    @Override // p3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3020f) {
            case 0:
                c cVar = (c) this.h;
                u uVar = this.g;
                uVar.h();
                try {
                    cVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!uVar.i()) {
                        throw e4;
                    }
                    throw uVar.k(e4);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.h).close();
                return;
        }
    }

    @Override // p3.t
    public final void e(long j4, f fVar) {
        switch (this.f3020f) {
            case 0:
                m0.a.g(fVar.g, 0L, j4);
                long j5 = j4;
                while (true) {
                    long j6 = 0;
                    if (j5 <= 0) {
                        return;
                    }
                    q qVar = fVar.f3028f;
                    u2.c.b(qVar);
                    while (true) {
                        if (j6 < 65536) {
                            j6 += qVar.c - qVar.f3042b;
                            if (j6 >= j5) {
                                j6 = j5;
                            } else {
                                qVar = qVar.f3045f;
                                u2.c.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.h;
                    u uVar = this.g;
                    uVar.h();
                    try {
                        try {
                            cVar.e(j6, fVar);
                            if (uVar.i()) {
                                throw uVar.k(null);
                            }
                            j5 -= j6;
                        } catch (IOException e4) {
                            if (!uVar.i()) {
                                throw e4;
                            }
                            throw uVar.k(e4);
                        }
                    } catch (Throwable th) {
                        uVar.i();
                        throw th;
                    }
                }
            default:
                m0.a.g(fVar.g, 0L, j4);
                while (j4 > 0) {
                    this.g.f();
                    q qVar2 = fVar.f3028f;
                    u2.c.b(qVar2);
                    int min = (int) Math.min(j4, qVar2.c - qVar2.f3042b);
                    ((OutputStream) this.h).write(qVar2.f3041a, qVar2.f3042b, min);
                    int i4 = qVar2.f3042b + min;
                    qVar2.f3042b = i4;
                    long j7 = min;
                    j4 -= j7;
                    fVar.g -= j7;
                    if (i4 == qVar2.c) {
                        fVar.f3028f = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // p3.t, java.io.Flushable
    public final void flush() {
        switch (this.f3020f) {
            case 0:
                c cVar = (c) this.h;
                u uVar = this.g;
                uVar.h();
                try {
                    cVar.flush();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!uVar.i()) {
                        throw e4;
                    }
                    throw uVar.k(e4);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.h).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f3020f) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.h) + ')';
            default:
                return "sink(" + ((OutputStream) this.h) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.g = uVar;
        this.h = cVar;
    }
}
