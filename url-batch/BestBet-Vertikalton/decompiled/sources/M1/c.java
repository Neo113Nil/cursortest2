package M1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f786a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f787b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f788c;

    public c(OutputStream outputStream, u uVar) {
        this.f788c = outputStream;
        this.f787b = uVar;
    }

    @Override // M1.t
    public final x b() {
        switch (this.f786a) {
        }
        return this.f787b;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f786a) {
            case 0:
                c cVar = (c) this.f788c;
                u uVar = this.f787b;
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
                ((OutputStream) this.f788c).close();
                return;
        }
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        switch (this.f786a) {
            case 0:
                c cVar = (c) this.f788c;
                u uVar = this.f787b;
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
                ((OutputStream) this.f788c).flush();
                return;
        }
    }

    @Override // M1.t
    public final void i(f fVar, long j2) {
        switch (this.f786a) {
            case 0:
                H1.d.k(fVar.f799b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f798a;
                    k1.e.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f822c - qVar.f821b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f824f;
                                k1.e.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f788c;
                    u uVar = this.f787b;
                    uVar.h();
                    try {
                        cVar.i(fVar, j3);
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
                H1.d.k(fVar.f799b, 0L, j2);
                while (j2 > 0) {
                    this.f787b.f();
                    q qVar2 = fVar.f798a;
                    k1.e.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f822c - qVar2.f821b);
                    ((OutputStream) this.f788c).write(qVar2.f820a, qVar2.f821b, min);
                    int i = qVar2.f821b + min;
                    qVar2.f821b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f799b -= j4;
                    if (i == qVar2.f822c) {
                        fVar.f798a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f786a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f788c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f788c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f787b = uVar;
        this.f788c = cVar;
    }
}
