package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class f7 implements x50 {
    public final /* synthetic */ int f = 0;
    public final d60 g;
    public final Object h;

    public f7(OutputStream outputStream, d60 d60Var) {
        this.h = outputStream;
        this.g = d60Var;
    }

    @Override // defpackage.x50
    public final f90 a() {
        int i = this.f;
        return this.g;
    }

    @Override // defpackage.x50, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                f7 f7Var = (f7) obj;
                d60 d60Var = this.g;
                d60Var.h();
                try {
                    f7Var.close();
                    if (d60Var.i()) {
                        throw d60Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!d60Var.i()) {
                        throw e;
                    }
                    throw d60Var.k(e);
                } finally {
                    d60Var.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.x50
    public final void e(long j, h9 h9Var) {
        long j2;
        int i = this.f;
        Object obj = this.h;
        d60 d60Var = this.g;
        switch (i) {
            case 0:
                b9.g(h9Var.g, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    u40 u40Var = h9Var.f;
                    u40Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += u40Var.c - u40Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                u40Var = u40Var.f;
                                u40Var.getClass();
                            }
                        }
                    }
                    f7 f7Var = (f7) obj;
                    d60Var.h();
                    try {
                        f7Var.e(j2, h9Var);
                        if (d60Var.i()) {
                            throw d60Var.k(null);
                        }
                    } catch (IOException e) {
                        if (!d60Var.i()) {
                            throw e;
                        }
                        throw d60Var.k(e);
                    } finally {
                        d60Var.i();
                    }
                }
                return;
            default:
                b9.g(h9Var.g, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    d60Var.f();
                    u40 u40Var2 = h9Var.f;
                    u40Var2.getClass();
                    int min = (int) Math.min(j4, u40Var2.c - u40Var2.b);
                    ((OutputStream) obj).write(u40Var2.a, u40Var2.b, min);
                    int i2 = u40Var2.b + min;
                    u40Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    h9Var.g -= j5;
                    if (i2 == u40Var2.c) {
                        h9Var.f = u40Var2.a();
                        v40.a(u40Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.x50, java.io.Flushable
    public final void flush() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                f7 f7Var = (f7) obj;
                d60 d60Var = this.g;
                d60Var.h();
                try {
                    f7Var.flush();
                    if (d60Var.i()) {
                        throw d60Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!d60Var.i()) {
                        throw e;
                    }
                    throw d60Var.k(e);
                } finally {
                    d60Var.i();
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
                return "AsyncTimeout.sink(" + ((f7) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public f7(d60 d60Var, f7 f7Var) {
        this.g = d60Var;
        this.h = f7Var;
    }
}
