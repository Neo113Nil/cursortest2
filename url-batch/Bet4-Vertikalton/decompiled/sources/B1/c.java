package B1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f57b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f58c;

    public c(OutputStream outputStream, u uVar) {
        this.f58c = outputStream;
        this.f57b = uVar;
    }

    @Override // B1.t
    public final x a() {
        switch (this.f56a) {
        }
        return this.f57b;
    }

    @Override // B1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f56a) {
            case 0:
                c cVar = (c) this.f58c;
                u uVar = this.f57b;
                uVar.h();
                try {
                    cVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!uVar.i()) {
                        throw e2;
                    }
                    throw uVar.k(e2);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f58c).close();
                return;
        }
    }

    @Override // B1.t
    public final void e(f fVar, long j2) {
        switch (this.f56a) {
            case 0:
                w1.d.m(fVar.f69b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f68a;
                    d1.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f92c - qVar.f91b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f94f;
                                d1.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f58c;
                    u uVar = this.f57b;
                    uVar.h();
                    try {
                        cVar.e(fVar, j3);
                        if (uVar.i()) {
                            throw uVar.k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!uVar.i()) {
                            throw e2;
                        }
                        throw uVar.k(e2);
                    } finally {
                        uVar.i();
                    }
                }
            default:
                w1.d.m(fVar.f69b, 0L, j2);
                while (j2 > 0) {
                    this.f57b.f();
                    q qVar2 = fVar.f68a;
                    d1.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f92c - qVar2.f91b);
                    ((OutputStream) this.f58c).write(qVar2.f90a, qVar2.f91b, min);
                    int i = qVar2.f91b + min;
                    qVar2.f91b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f69b -= j4;
                    if (i == qVar2.f92c) {
                        fVar.f68a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // B1.t, java.io.Flushable
    public final void flush() {
        switch (this.f56a) {
            case 0:
                c cVar = (c) this.f58c;
                u uVar = this.f57b;
                uVar.h();
                try {
                    cVar.flush();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!uVar.i()) {
                        throw e2;
                    }
                    throw uVar.k(e2);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f58c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f56a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f58c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f58c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f57b = uVar;
        this.f58c = cVar;
    }
}
