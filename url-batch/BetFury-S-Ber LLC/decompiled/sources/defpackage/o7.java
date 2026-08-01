package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o7 implements ae0 {
    public final /* synthetic */ int f = 0;
    public final ge0 g;
    public final Object h;

    public o7(OutputStream outputStream, ge0 ge0Var) {
        this.h = outputStream;
        this.g = ge0Var;
    }

    @Override // defpackage.ae0
    public final gi0 a() {
        int i = this.f;
        return this.g;
    }

    @Override // defpackage.ae0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                o7 o7Var = (o7) obj;
                ge0 ge0Var = this.g;
                ge0Var.h();
                try {
                    o7Var.close();
                    if (ge0Var.i()) {
                        throw ge0Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!ge0Var.i()) {
                        throw e;
                    }
                    throw ge0Var.k(e);
                } finally {
                    ge0Var.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.ae0, java.io.Flushable
    public final void flush() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                o7 o7Var = (o7) obj;
                ge0 ge0Var = this.g;
                ge0Var.h();
                try {
                    o7Var.flush();
                    if (ge0Var.i()) {
                        throw ge0Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!ge0Var.i()) {
                        throw e;
                    }
                    throw ge0Var.k(e);
                } finally {
                    ge0Var.i();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return "AsyncTimeout.sink(" + ((o7) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    @Override // defpackage.ae0
    public final void v(long j, t9 t9Var) {
        long j2;
        int i = this.f;
        Object obj = this.h;
        ge0 ge0Var = this.g;
        switch (i) {
            case 0:
                n9.b(t9Var.g, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    kc0 kc0Var = t9Var.f;
                    kc0Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += kc0Var.c - kc0Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                kc0Var = kc0Var.f;
                                kc0Var.getClass();
                            }
                        }
                    }
                    o7 o7Var = (o7) obj;
                    ge0Var.h();
                    try {
                        o7Var.v(j2, t9Var);
                        if (ge0Var.i()) {
                            throw ge0Var.k(null);
                        }
                    } catch (IOException e) {
                        if (!ge0Var.i()) {
                            throw e;
                        }
                        throw ge0Var.k(e);
                    } finally {
                        ge0Var.i();
                    }
                }
                return;
            default:
                n9.b(t9Var.g, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ge0Var.f();
                    kc0 kc0Var2 = t9Var.f;
                    kc0Var2.getClass();
                    int min = (int) Math.min(j4, kc0Var2.c - kc0Var2.b);
                    ((OutputStream) obj).write(kc0Var2.a, kc0Var2.b, min);
                    int i2 = kc0Var2.b + min;
                    kc0Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    t9Var.g -= j5;
                    if (i2 == kc0Var2.c) {
                        t9Var.f = kc0Var2.a();
                        nc0.a(kc0Var2);
                    }
                }
                return;
        }
    }

    public o7(ge0 ge0Var, o7 o7Var) {
        this.g = ge0Var;
        this.h = o7Var;
    }
}
