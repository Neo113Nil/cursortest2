package z1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4256a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f4257b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4258c;

    public c(OutputStream outputStream, u uVar) {
        this.f4258c = outputStream;
        this.f4257b = uVar;
    }

    @Override // z1.t
    public final x a() {
        switch (this.f4256a) {
        }
        return this.f4257b;
    }

    @Override // z1.t
    public final void c(f fVar, long j2) {
        switch (this.f4256a) {
            case 0:
                k0.w.d(fVar.f4269b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f4268a;
                    b1.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f4292c - qVar.f4291b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f4294f;
                                b1.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4258c;
                    u uVar = this.f4257b;
                    uVar.h();
                    try {
                        cVar.c(fVar, j3);
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
                k0.w.d(fVar.f4269b, 0L, j2);
                while (j2 > 0) {
                    this.f4257b.f();
                    q qVar2 = fVar.f4268a;
                    b1.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f4292c - qVar2.f4291b);
                    ((OutputStream) this.f4258c).write(qVar2.f4290a, qVar2.f4291b, min);
                    int i = qVar2.f4291b + min;
                    qVar2.f4291b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4269b -= j4;
                    if (i == qVar2.f4292c) {
                        fVar.f4268a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4256a) {
            case 0:
                c cVar = (c) this.f4258c;
                u uVar = this.f4257b;
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
                ((OutputStream) this.f4258c).close();
                return;
        }
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        switch (this.f4256a) {
            case 0:
                c cVar = (c) this.f4258c;
                u uVar = this.f4257b;
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
                ((OutputStream) this.f4258c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4256a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4258c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4258c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f4257b = uVar;
        this.f4258c = cVar;
    }
}
