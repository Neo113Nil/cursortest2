package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v6 implements v20 {
    public final /* synthetic */ int f = 0;
    public final b30 g;
    public final Object h;

    public v6(OutputStream outputStream, b30 b30Var) {
        this.h = outputStream;
        this.g = b30Var;
    }

    @Override // defpackage.v20
    public final v50 a() {
        int i = this.f;
        return this.g;
    }

    @Override // defpackage.v20, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                v6 v6Var = (v6) obj;
                b30 b30Var = this.g;
                b30Var.h();
                try {
                    v6Var.close();
                    if (b30Var.i()) {
                        throw b30Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!b30Var.i()) {
                        throw e;
                    }
                    throw b30Var.k(e);
                } finally {
                    b30Var.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.v20
    public final void e(long j, u8 u8Var) {
        long j2;
        int i = this.f;
        Object obj = this.h;
        b30 b30Var = this.g;
        switch (i) {
            case 0:
                o8.i(u8Var.g, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    v10 v10Var = u8Var.f;
                    v10Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += v10Var.c - v10Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                v10Var = v10Var.f;
                                v10Var.getClass();
                            }
                        }
                    }
                    v6 v6Var = (v6) obj;
                    b30Var.h();
                    try {
                        v6Var.e(j2, u8Var);
                        if (b30Var.i()) {
                            throw b30Var.k(null);
                        }
                    } catch (IOException e) {
                        if (!b30Var.i()) {
                            throw e;
                        }
                        throw b30Var.k(e);
                    } finally {
                        b30Var.i();
                    }
                }
                return;
            default:
                o8.i(u8Var.g, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    b30Var.f();
                    v10 v10Var2 = u8Var.f;
                    v10Var2.getClass();
                    int min = (int) Math.min(j4, v10Var2.c - v10Var2.b);
                    ((OutputStream) obj).write(v10Var2.a, v10Var2.b, min);
                    int i2 = v10Var2.b + min;
                    v10Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    u8Var.g -= j5;
                    if (i2 == v10Var2.c) {
                        u8Var.f = v10Var2.a();
                        w10.a(v10Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.v20, java.io.Flushable
    public final void flush() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                v6 v6Var = (v6) obj;
                b30 b30Var = this.g;
                b30Var.h();
                try {
                    v6Var.flush();
                    if (b30Var.i()) {
                        throw b30Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!b30Var.i()) {
                        throw e;
                    }
                    throw b30Var.k(e);
                } finally {
                    b30Var.i();
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
                return "AsyncTimeout.sink(" + ((v6) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public v6(b30 b30Var, v6 v6Var) {
        this.g = b30Var;
        this.h = v6Var;
    }
}
