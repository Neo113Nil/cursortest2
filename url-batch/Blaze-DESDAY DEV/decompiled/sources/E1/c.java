package E1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f191b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f192c;

    public c(OutputStream outputStream, u uVar) {
        this.f192c = outputStream;
        this.f191b = uVar;
    }

    @Override // E1.t
    public final x a() {
        switch (this.f190a) {
        }
        return this.f191b;
    }

    @Override // E1.t
    public final void b(f fVar, long j2) {
        switch (this.f190a) {
            case 0:
                z1.l.d(fVar.f203b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f202a;
                    g1.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f226c - qVar.f225b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f228f;
                                g1.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f192c;
                    u uVar = this.f191b;
                    uVar.h();
                    try {
                        cVar.b(fVar, j3);
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
                z1.l.d(fVar.f203b, 0L, j2);
                while (j2 > 0) {
                    this.f191b.f();
                    q qVar2 = fVar.f202a;
                    g1.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f226c - qVar2.f225b);
                    ((OutputStream) this.f192c).write(qVar2.f224a, qVar2.f225b, min);
                    int i = qVar2.f225b + min;
                    qVar2.f225b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f203b -= j4;
                    if (i == qVar2.f226c) {
                        fVar.f202a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f190a) {
            case 0:
                c cVar = (c) this.f192c;
                u uVar = this.f191b;
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
                ((OutputStream) this.f192c).close();
                return;
        }
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        switch (this.f190a) {
            case 0:
                c cVar = (c) this.f192c;
                u uVar = this.f191b;
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
                ((OutputStream) this.f192c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f190a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f192c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f192c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f191b = uVar;
        this.f192c = cVar;
    }
}
