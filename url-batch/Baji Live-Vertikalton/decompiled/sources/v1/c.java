package v1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4038a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f4039b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4040c;

    public c(OutputStream outputStream, t tVar) {
        this.f4040c = outputStream;
        this.f4039b = tVar;
    }

    @Override // v1.s
    public final w a() {
        switch (this.f4038a) {
        }
        return this.f4039b;
    }

    @Override // v1.s
    public final void c(f fVar, long j2) {
        switch (this.f4038a) {
            case 0:
                i1.r.f(fVar.f4051b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    p pVar = fVar.f4050a;
                    X0.e.b(pVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += pVar.f4072c - pVar.f4071b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                pVar = pVar.f4074f;
                                X0.e.b(pVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4040c;
                    t tVar = this.f4039b;
                    tVar.h();
                    try {
                        cVar.c(fVar, j3);
                        if (tVar.i()) {
                            throw tVar.k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!tVar.i()) {
                            throw e2;
                        }
                        throw tVar.k(e2);
                    } finally {
                        tVar.i();
                    }
                }
            default:
                i1.r.f(fVar.f4051b, 0L, j2);
                while (j2 > 0) {
                    this.f4039b.f();
                    p pVar2 = fVar.f4050a;
                    X0.e.b(pVar2);
                    int min = (int) Math.min(j2, pVar2.f4072c - pVar2.f4071b);
                    ((OutputStream) this.f4040c).write(pVar2.f4070a, pVar2.f4071b, min);
                    int i = pVar2.f4071b + min;
                    pVar2.f4071b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4051b -= j4;
                    if (i == pVar2.f4072c) {
                        fVar.f4050a = pVar2.a();
                        q.a(pVar2);
                    }
                }
                return;
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4038a) {
            case 0:
                c cVar = (c) this.f4040c;
                t tVar = this.f4039b;
                tVar.h();
                try {
                    cVar.close();
                    if (tVar.i()) {
                        throw tVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!tVar.i()) {
                        throw e2;
                    }
                    throw tVar.k(e2);
                } finally {
                    tVar.i();
                }
            default:
                ((OutputStream) this.f4040c).close();
                return;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        switch (this.f4038a) {
            case 0:
                c cVar = (c) this.f4040c;
                t tVar = this.f4039b;
                tVar.h();
                try {
                    cVar.flush();
                    if (tVar.i()) {
                        throw tVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!tVar.i()) {
                        throw e2;
                    }
                    throw tVar.k(e2);
                } finally {
                    tVar.i();
                }
            default:
                ((OutputStream) this.f4040c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4038a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4040c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4040c) + ')';
        }
    }

    public c(t tVar, c cVar) {
        this.f4039b = tVar;
        this.f4040c = cVar;
    }
}
