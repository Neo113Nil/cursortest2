package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pj implements ol2 {
    public final /* synthetic */ int m = 1;
    public final Object n;
    public final Object o;

    public pj(OutputStream outputStream, rx2 rx2Var) {
        outputStream.getClass();
        this.n = outputStream;
        this.o = rx2Var;
    }

    @Override // defpackage.ol2, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                jn2 jn2Var = (jn2) obj;
                pj pjVar = (pj) this.o;
                jn2Var.h();
                try {
                    pjVar.close();
                    Unit unit = Unit.a;
                    if (jn2Var.i()) {
                        throw jn2Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!jn2Var.i()) {
                        throw e;
                    }
                    throw jn2Var.k(e);
                } finally {
                    jn2Var.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.ol2
    public final rx2 e() {
        switch (this.m) {
            case 0:
                return (jn2) this.n;
            default:
                return (rx2) this.o;
        }
    }

    @Override // defpackage.ol2, java.io.Flushable
    public final void flush() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                jn2 jn2Var = (jn2) obj;
                pj pjVar = (pj) this.o;
                jn2Var.h();
                try {
                    pjVar.flush();
                    Unit unit = Unit.a;
                    if (jn2Var.i()) {
                        throw jn2Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!jn2Var.i()) {
                        throw e;
                    }
                    throw jn2Var.k(e);
                } finally {
                    jn2Var.i();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.m) {
            case 0:
                return "AsyncTimeout.sink(" + ((pj) this.o) + ')';
            default:
                return "sink(" + ((OutputStream) this.n) + ')';
        }
    }

    @Override // defpackage.ol2
    public final void u(long j, fq fqVar) {
        long j2;
        int i = this.m;
        Object obj = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                o70.r(fqVar.n, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    ug2 ug2Var = fqVar.m;
                    ug2Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += ug2Var.c - ug2Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                ug2Var = ug2Var.f;
                                ug2Var.getClass();
                            }
                        }
                    }
                    jn2 jn2Var = (jn2) obj;
                    pj pjVar = (pj) obj2;
                    jn2Var.h();
                    try {
                        pjVar.u(j2, fqVar);
                        Unit unit = Unit.a;
                        if (jn2Var.i()) {
                            throw jn2Var.k(null);
                        }
                    } catch (IOException e) {
                        if (!jn2Var.i()) {
                            throw e;
                        }
                        throw jn2Var.k(e);
                    } finally {
                        jn2Var.i();
                    }
                }
                return;
            default:
                o70.r(fqVar.n, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((rx2) obj2).f();
                    ug2 ug2Var2 = fqVar.m;
                    ug2Var2.getClass();
                    int min = (int) Math.min(j4, ug2Var2.c - ug2Var2.b);
                    ((OutputStream) obj).write(ug2Var2.a, ug2Var2.b, min);
                    int i2 = ug2Var2.b + min;
                    ug2Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    fqVar.n -= j5;
                    if (i2 == ug2Var2.c) {
                        fqVar.m = ug2Var2.a();
                        xg2.a(ug2Var2);
                    }
                }
                return;
        }
    }

    public pj(jn2 jn2Var, pj pjVar) {
        this.n = jn2Var;
        this.o = pjVar;
    }
}
