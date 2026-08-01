package v1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4471a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final v f4472b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4473c;

    public c(OutputStream outputStream, v vVar) {
        this.f4473c = outputStream;
        this.f4472b = vVar;
    }

    @Override // v1.u
    public final y a() {
        switch (this.f4471a) {
        }
        return this.f4472b;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4471a) {
            case 0:
                c cVar = (c) this.f4473c;
                v vVar = this.f4472b;
                vVar.h();
                try {
                    cVar.close();
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!vVar.i()) {
                        throw e2;
                    }
                    throw vVar.k(e2);
                } finally {
                    vVar.i();
                }
            default:
                ((OutputStream) this.f4473c).close();
                return;
        }
    }

    @Override // v1.u
    public final void d(f fVar, long j2) {
        switch (this.f4471a) {
            case 0:
                i1.r.e(fVar.f4484b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    r rVar = fVar.f4483a;
                    X0.f.b(rVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += rVar.f4510c - rVar.f4509b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                rVar = rVar.f4513f;
                                X0.f.b(rVar);
                            }
                        }
                    }
                    c cVar = (c) this.f4473c;
                    v vVar = this.f4472b;
                    vVar.h();
                    try {
                        cVar.d(fVar, j3);
                        if (vVar.i()) {
                            throw vVar.k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!vVar.i()) {
                            throw e2;
                        }
                        throw vVar.k(e2);
                    } finally {
                        vVar.i();
                    }
                }
            default:
                i1.r.e(fVar.f4484b, 0L, j2);
                while (j2 > 0) {
                    this.f4472b.f();
                    r rVar2 = fVar.f4483a;
                    X0.f.b(rVar2);
                    int min = (int) Math.min(j2, rVar2.f4510c - rVar2.f4509b);
                    ((OutputStream) this.f4473c).write(rVar2.f4508a, rVar2.f4509b, min);
                    int i = rVar2.f4509b + min;
                    rVar2.f4509b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f4484b -= j4;
                    if (i == rVar2.f4510c) {
                        fVar.f4483a = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        switch (this.f4471a) {
            case 0:
                c cVar = (c) this.f4473c;
                v vVar = this.f4472b;
                vVar.h();
                try {
                    cVar.flush();
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!vVar.i()) {
                        throw e2;
                    }
                    throw vVar.k(e2);
                } finally {
                    vVar.i();
                }
            default:
                ((OutputStream) this.f4473c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4471a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4473c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4473c) + ')';
        }
    }

    public c(v vVar, c cVar) {
        this.f4472b = vVar;
        this.f4473c = cVar;
    }
}
