package F1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f234b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f235c;

    public c(OutputStream outputStream, u uVar) {
        this.f235c = outputStream;
        this.f234b = uVar;
    }

    @Override // F1.t
    public final x a() {
        switch (this.f233a) {
        }
        return this.f234b;
    }

    @Override // F1.t
    public final void b(f fVar, long j2) {
        switch (this.f233a) {
            case 0:
                A1.d.k(fVar.f247b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f246a;
                    h1.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f270c - qVar.f269b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f272f;
                                h1.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f235c;
                    u uVar = this.f234b;
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
                A1.d.k(fVar.f247b, 0L, j2);
                while (j2 > 0) {
                    this.f234b.f();
                    q qVar2 = fVar.f246a;
                    h1.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f270c - qVar2.f269b);
                    ((OutputStream) this.f235c).write(qVar2.f268a, qVar2.f269b, min);
                    int i = qVar2.f269b + min;
                    qVar2.f269b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f247b -= j4;
                    if (i == qVar2.f270c) {
                        fVar.f246a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // F1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f233a) {
            case 0:
                c cVar = (c) this.f235c;
                u uVar = this.f234b;
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
                ((OutputStream) this.f235c).close();
                return;
        }
    }

    @Override // F1.t, java.io.Flushable
    public final void flush() {
        switch (this.f233a) {
            case 0:
                c cVar = (c) this.f235c;
                u uVar = this.f234b;
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
                ((OutputStream) this.f235c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f233a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f235c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f235c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f234b = uVar;
        this.f235c = cVar;
    }
}
