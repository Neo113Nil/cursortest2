package v1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4044a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f4045b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4046c;

    public c(OutputStream outputStream, u uVar) {
        this.f4046c = outputStream;
        this.f4045b = uVar;
    }

    @Override // v1.t
    public final x a() {
        switch (this.f4044a) {
        }
        return this.f4045b;
    }

    @Override // v1.t
    public final void c(f fVar, long j2) {
        switch (this.f4044a) {
            case 0:
                i1.r.f(fVar.f4057b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f4056a;
                    X0.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f4079c - qVar.f4078b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f4081f;
                                X0.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4046c;
                    u uVar = this.f4045b;
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
                i1.r.f(fVar.f4057b, 0L, j2);
                while (j2 > 0) {
                    this.f4045b.f();
                    q qVar2 = fVar.f4056a;
                    X0.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f4079c - qVar2.f4078b);
                    ((OutputStream) this.f4046c).write(qVar2.f4077a, qVar2.f4078b, min);
                    int i = qVar2.f4078b + min;
                    qVar2.f4078b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4057b -= j4;
                    if (i == qVar2.f4079c) {
                        fVar.f4056a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4044a) {
            case 0:
                c cVar = (c) this.f4046c;
                u uVar = this.f4045b;
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
                ((OutputStream) this.f4046c).close();
                return;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        switch (this.f4044a) {
            case 0:
                c cVar = (c) this.f4046c;
                u uVar = this.f4045b;
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
                ((OutputStream) this.f4046c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4044a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4046c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4046c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f4045b = uVar;
        this.f4046c = cVar;
    }
}
