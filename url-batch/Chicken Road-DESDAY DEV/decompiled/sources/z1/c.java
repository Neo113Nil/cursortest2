package z1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4255a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f4256b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4257c;

    public c(OutputStream outputStream, u uVar) {
        this.f4257c = outputStream;
        this.f4256b = uVar;
    }

    @Override // z1.t
    public final x a() {
        switch (this.f4255a) {
        }
        return this.f4256b;
    }

    @Override // z1.t
    public final void c(f fVar, long j2) {
        switch (this.f4255a) {
            case 0:
                k0.k.e(fVar.f4268b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f4267a;
                    b1.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f4291c - qVar.f4290b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f4293f;
                                b1.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4257c;
                    u uVar = this.f4256b;
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
                k0.k.e(fVar.f4268b, 0L, j2);
                while (j2 > 0) {
                    this.f4256b.f();
                    q qVar2 = fVar.f4267a;
                    b1.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f4291c - qVar2.f4290b);
                    ((OutputStream) this.f4257c).write(qVar2.f4289a, qVar2.f4290b, min);
                    int i = qVar2.f4290b + min;
                    qVar2.f4290b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4268b -= j4;
                    if (i == qVar2.f4291c) {
                        fVar.f4267a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4255a) {
            case 0:
                c cVar = (c) this.f4257c;
                u uVar = this.f4256b;
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
                ((OutputStream) this.f4257c).close();
                return;
        }
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        switch (this.f4255a) {
            case 0:
                c cVar = (c) this.f4257c;
                u uVar = this.f4256b;
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
                ((OutputStream) this.f4257c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4255a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4257c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4257c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f4256b = uVar;
        this.f4257c = cVar;
    }
}
