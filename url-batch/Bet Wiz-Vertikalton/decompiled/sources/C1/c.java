package C1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f170b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f171c;

    public c(OutputStream outputStream, u uVar) {
        this.f171c = outputStream;
        this.f170b = uVar;
    }

    @Override // C1.t
    public final x a() {
        switch (this.f169a) {
        }
        return this.f170b;
    }

    @Override // C1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f169a) {
            case 0:
                c cVar = (c) this.f171c;
                u uVar = this.f170b;
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
                ((OutputStream) this.f171c).close();
                return;
        }
    }

    @Override // C1.t
    public final void f(f fVar, long j2) {
        switch (this.f169a) {
            case 0:
                x1.l.j(fVar.f182b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    q qVar = fVar.f181a;
                    e1.d.b(qVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += qVar.f205c - qVar.f204b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                qVar = qVar.f207f;
                                e1.d.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f171c;
                    u uVar = this.f170b;
                    uVar.h();
                    try {
                        cVar.f(fVar, j3);
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
                x1.l.j(fVar.f182b, 0L, j2);
                while (j2 > 0) {
                    this.f170b.f();
                    q qVar2 = fVar.f181a;
                    e1.d.b(qVar2);
                    int min = (int) Math.min(j2, qVar2.f205c - qVar2.f204b);
                    ((OutputStream) this.f171c).write(qVar2.f203a, qVar2.f204b, min);
                    int i = qVar2.f204b + min;
                    qVar2.f204b = i;
                    long j4 = min;
                    j2 -= j4;
                    fVar.f182b -= j4;
                    if (i == qVar2.f205c) {
                        fVar.f181a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // C1.t, java.io.Flushable
    public final void flush() {
        switch (this.f169a) {
            case 0:
                c cVar = (c) this.f171c;
                u uVar = this.f170b;
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
                ((OutputStream) this.f171c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f169a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f171c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f171c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f170b = uVar;
        this.f171c = cVar;
    }
}
