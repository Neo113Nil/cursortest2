package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j7 implements i30 {
    public final /* synthetic */ int f = 1;
    public final m30 g;
    public final Object h;

    public j7(OutputStream outputStream, m30 m30Var) {
        this.h = outputStream;
        this.g = m30Var;
    }

    @Override // defpackage.i30
    public final d60 a() {
        int i = this.f;
        return this.g;
    }

    @Override // defpackage.i30, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                j7 j7Var = (j7) obj;
                m30 m30Var = this.g;
                m30Var.h();
                try {
                    j7Var.close();
                    if (m30Var.i()) {
                        throw m30Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!m30Var.i()) {
                        throw e;
                    }
                    throw m30Var.k(e);
                } finally {
                    m30Var.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.i30
    public final void e(long j, p8 p8Var) {
        long j2;
        int i = this.f;
        Object obj = this.h;
        m30 m30Var = this.g;
        switch (i) {
            case 0:
                op.g(p8Var.g, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    f20 f20Var = p8Var.f;
                    f20Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += f20Var.c - f20Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                f20Var = f20Var.f;
                                f20Var.getClass();
                            }
                        }
                    }
                    j7 j7Var = (j7) obj;
                    m30Var.h();
                    try {
                        j7Var.e(j2, p8Var);
                        if (m30Var.i()) {
                            throw m30Var.k(null);
                        }
                    } catch (IOException e) {
                        if (!m30Var.i()) {
                            throw e;
                        }
                        throw m30Var.k(e);
                    } finally {
                        m30Var.i();
                    }
                }
                return;
            default:
                op.g(p8Var.g, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    m30Var.f();
                    f20 f20Var2 = p8Var.f;
                    f20Var2.getClass();
                    int min = (int) Math.min(j4, f20Var2.c - f20Var2.b);
                    ((OutputStream) obj).write(f20Var2.a, f20Var2.b, min);
                    int i2 = f20Var2.b + min;
                    f20Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    p8Var.g -= j5;
                    if (i2 == f20Var2.c) {
                        p8Var.f = f20Var2.a();
                        g20.a(f20Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.i30, java.io.Flushable
    public final void flush() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                j7 j7Var = (j7) obj;
                m30 m30Var = this.g;
                m30Var.h();
                try {
                    j7Var.flush();
                    if (m30Var.i()) {
                        throw m30Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!m30Var.i()) {
                        throw e;
                    }
                    throw m30Var.k(e);
                } finally {
                    m30Var.i();
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
                return "AsyncTimeout.sink(" + ((j7) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public j7(m30 m30Var, j7 j7Var) {
        this.g = m30Var;
        this.h = j7Var;
    }
}
