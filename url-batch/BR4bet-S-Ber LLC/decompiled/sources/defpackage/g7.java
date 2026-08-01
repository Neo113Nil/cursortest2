package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g7 implements h60 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ g7(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.h60
    public final f90 a() {
        switch (this.f) {
            case 0:
                return (d60) this.g;
            default:
                return (f90) this.h;
        }
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                d60 d60Var = (d60) obj;
                g7 g7Var = (g7) obj2;
                d60Var.h();
                try {
                    long b = g7Var.b(8192L, h9Var);
                    if (d60Var.i()) {
                        throw d60Var.k(null);
                    }
                    return b;
                } catch (IOException e) {
                    if (d60Var.i()) {
                        throw d60Var.k(e);
                    }
                    throw e;
                } finally {
                    d60Var.i();
                }
            default:
                try {
                    ((f90) obj2).f();
                    u40 t = h9Var.t(1);
                    int read = ((InputStream) obj).read(t.a, t.c, (int) Math.min(8192L, 8192 - t.c));
                    if (read == -1) {
                        if (t.b == t.c) {
                            h9Var.f = t.a();
                            v40.a(t);
                        }
                        return -1L;
                    }
                    t.c += read;
                    long j2 = read;
                    h9Var.g += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (xf.w(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                d60 d60Var = (d60) obj;
                g7 g7Var = (g7) this.h;
                d60Var.h();
                try {
                    g7Var.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.source(" + ((g7) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.g) + ')';
        }
    }
}
