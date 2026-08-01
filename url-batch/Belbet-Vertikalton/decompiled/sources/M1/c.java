package M1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f815a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f816b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f817c;

    public c(OutputStream outputStream, u uVar) {
        this.f817c = outputStream;
        this.f816b = uVar;
    }

    @Override // M1.t
    public final x b() {
        switch (this.f815a) {
        }
        return this.f816b;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f815a) {
            case 0:
                c cVar = (c) this.f817c;
                u uVar = this.f816b;
                uVar.h();
                try {
                    cVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!uVar.i()) {
                        throw e;
                    }
                    throw uVar.k(e);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f817c).close();
                return;
        }
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        switch (this.f815a) {
            case 0:
                c cVar = (c) this.f817c;
                u uVar = this.f816b;
                uVar.h();
                try {
                    cVar.flush();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!uVar.i()) {
                        throw e;
                    }
                    throw uVar.k(e);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f817c).flush();
                return;
        }
    }

    @Override // M1.t
    public final void n(f fVar, long j) {
        switch (this.f815a) {
            case 0:
                H1.l.h(fVar.f827b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    q qVar = fVar.f826a;
                    j1.h.b(qVar);
                    while (true) {
                        if (j2 < 65536) {
                            j2 += qVar.f851c - qVar.f850b;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                qVar = qVar.f853f;
                                j1.h.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f817c;
                    u uVar = this.f816b;
                    uVar.h();
                    try {
                        cVar.n(fVar, j2);
                        if (uVar.i()) {
                            throw uVar.k(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!uVar.i()) {
                            throw e;
                        }
                        throw uVar.k(e);
                    } finally {
                        uVar.i();
                    }
                }
            default:
                H1.l.h(fVar.f827b, 0L, j);
                while (j > 0) {
                    this.f816b.f();
                    q qVar2 = fVar.f826a;
                    j1.h.b(qVar2);
                    int min = (int) Math.min(j, qVar2.f851c - qVar2.f850b);
                    ((OutputStream) this.f817c).write(qVar2.f849a, qVar2.f850b, min);
                    int i = qVar2.f850b + min;
                    qVar2.f850b = i;
                    long j3 = min;
                    j -= j3;
                    fVar.f827b -= j3;
                    if (i == qVar2.f851c) {
                        fVar.f826a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f815a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f817c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f817c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f816b = uVar;
        this.f817c = cVar;
    }
}
