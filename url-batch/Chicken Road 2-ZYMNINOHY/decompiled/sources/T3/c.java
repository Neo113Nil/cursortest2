package T3;

import a.AbstractC0124a;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2958a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final u f2959b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2960c;

    public c(OutputStream outputStream, u uVar) {
        this.f2960c = outputStream;
        this.f2959b = uVar;
    }

    @Override // T3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2958a) {
            case 0:
                c cVar = (c) this.f2960c;
                u uVar = this.f2959b;
                uVar.h();
                try {
                    cVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!uVar.i()) {
                        throw e4;
                    }
                    throw uVar.k(e4);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f2960c).close();
                return;
        }
    }

    @Override // T3.t
    public final x d() {
        switch (this.f2958a) {
        }
        return this.f2959b;
    }

    @Override // T3.t, java.io.Flushable
    public final void flush() {
        switch (this.f2958a) {
            case 0:
                c cVar = (c) this.f2960c;
                u uVar = this.f2959b;
                uVar.h();
                try {
                    cVar.flush();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!uVar.i()) {
                        throw e4;
                    }
                    throw uVar.k(e4);
                } finally {
                    uVar.i();
                }
            default:
                ((OutputStream) this.f2960c).flush();
                return;
        }
    }

    @Override // T3.t
    public final void o(g gVar, long j4) {
        switch (this.f2958a) {
            case 0:
                AbstractC0124a.p(gVar.f2975b, 0L, j4);
                long j5 = j4;
                while (true) {
                    long j6 = 0;
                    if (j5 <= 0) {
                        return;
                    }
                    q qVar = gVar.f2974a;
                    kotlin.jvm.internal.i.b(qVar);
                    while (true) {
                        if (j6 < 65536) {
                            j6 += qVar.f2999c - qVar.f2998b;
                            if (j6 >= j5) {
                                j6 = j5;
                            } else {
                                qVar = qVar.f3002f;
                                kotlin.jvm.internal.i.b(qVar);
                            }
                        }
                    }
                    c cVar = (c) this.f2960c;
                    u uVar = this.f2959b;
                    uVar.h();
                    try {
                        try {
                            cVar.o(gVar, j6);
                            if (uVar.i()) {
                                throw uVar.k(null);
                            }
                            j5 -= j6;
                        } catch (IOException e4) {
                            if (!uVar.i()) {
                                throw e4;
                            }
                            throw uVar.k(e4);
                        }
                    } catch (Throwable th) {
                        uVar.i();
                        throw th;
                    }
                }
            default:
                AbstractC0124a.p(gVar.f2975b, 0L, j4);
                while (j4 > 0) {
                    this.f2959b.f();
                    q qVar2 = gVar.f2974a;
                    kotlin.jvm.internal.i.b(qVar2);
                    int min = (int) Math.min(j4, qVar2.f2999c - qVar2.f2998b);
                    ((OutputStream) this.f2960c).write(qVar2.f2997a, qVar2.f2998b, min);
                    int i4 = qVar2.f2998b + min;
                    qVar2.f2998b = i4;
                    long j7 = min;
                    j4 -= j7;
                    gVar.f2975b -= j7;
                    if (i4 == qVar2.f2999c) {
                        gVar.f2974a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f2958a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f2960c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f2960c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f2959b = uVar;
        this.f2960c = cVar;
    }
}
