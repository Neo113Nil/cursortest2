package x1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4223a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f4224b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4225c;

    public c(OutputStream outputStream, u uVar) {
        this.f4225c = outputStream;
        this.f4224b = uVar;
    }

    @Override // x1.t
    public final x a() {
        switch (this.f4223a) {
        }
        return this.f4224b;
    }

    @Override // x1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4223a) {
            case 0:
                c cVar = (c) this.f4225c;
                u uVar = this.f4224b;
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
                ((OutputStream) this.f4225c).close();
                return;
        }
    }

    @Override // x1.t, java.io.Flushable
    public final void flush() {
        switch (this.f4223a) {
            case 0:
                c cVar = (c) this.f4225c;
                u uVar = this.f4224b;
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
                ((OutputStream) this.f4225c).flush();
                return;
        }
    }

    @Override // x1.t
    public final void g(f fVar, long j2) {
        switch (this.f4223a) {
            case 0:
                k1.c.f(fVar.f4236b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f4235a;
                    Z0.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f4259c - qVar.f4258b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f4261f;
                                Z0.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4225c;
                    u uVar = this.f4224b;
                    uVar.h();
                    try {
                        cVar.g(fVar, j3);
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
                k1.c.f(fVar.f4236b, 0L, j2);
                while (j2 > 0) {
                    this.f4224b.f();
                    q qVar2 = fVar.f4235a;
                    Z0.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f4259c - qVar2.f4258b);
                    ((OutputStream) this.f4225c).write(qVar2.f4257a, qVar2.f4258b, min);
                    int i = qVar2.f4258b + min;
                    qVar2.f4258b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4236b -= j4;
                    if (i == qVar2.f4259c) {
                        fVar.f4235a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f4223a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4225c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4225c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f4224b = uVar;
        this.f4225c = cVar;
    }
}
