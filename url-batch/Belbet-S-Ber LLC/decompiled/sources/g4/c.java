package g4;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1924f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final u f1925g;
    public final Object h;

    public c(OutputStream outputStream, u uVar) {
        this.h = outputStream;
        this.f1925g = uVar;
    }

    @Override // g4.t
    public final x a() {
        switch (this.f1924f) {
        }
        return this.f1925g;
    }

    @Override // g4.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1924f) {
            case 0:
                c cVar = (c) this.h;
                u uVar = this.f1925g;
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

    @Override // g4.t
    public final void f(long j2, f fVar) {
        switch (this.f1924f) {
            case 0:
                b4.d.k(fVar.f1935g, 0L, j2);
                long j4 = j2;
                while (true) {
                    long j5 = 0;
                    if (j4 <= 0) {
                        return;
                    }
                    q qVar = fVar.f1934f;
                    i3.d.b(qVar);
                    while (true) {
                        if (j5 < 65536) {
                            j5 += qVar.f1953c - qVar.f1952b;
                            if (j5 >= j4) {
                                j5 = j4;
                            } else {
                                qVar = qVar.f1955f;
                                i3.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.h;
                    u uVar = this.f1925g;
                    uVar.h();
                    try {
                        try {
                            cVar.f(j5, fVar);
                            if (uVar.i()) {
                                throw uVar.k(null);
                            }
                            j4 -= j5;
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
                b4.d.k(fVar.f1935g, 0L, j2);
                while (j2 > 0) {
                    this.f1925g.f();
                    q qVar2 = fVar.f1934f;
                    i3.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f1953c - qVar2.f1952b);
                    ((OutputStream) this.h).write(qVar2.f1951a, qVar2.f1952b, min);
                    int i = qVar2.f1952b + min;
                    qVar2.f1952b = i;
                    long j6 = min;
                    j2 -= j6;
                    fVar.f1935g -= j6;
                    if (i == qVar2.f1953c) {
                        fVar.f1934f = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // g4.t, java.io.Flushable
    public final void flush() {
        switch (this.f1924f) {
            case 0:
                c cVar = (c) this.h;
                u uVar = this.f1925g;
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
        switch (this.f1924f) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.h) + ')';
            default:
                return "sink(" + ((OutputStream) this.h) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f1925g = uVar;
        this.h = cVar;
    }
}
