package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class w6 implements f30 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ w6(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.f30
    public final v50 a() {
        switch (this.f) {
            case 0:
                return (b30) this.g;
            default:
                return (v50) this.h;
        }
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                b30 b30Var = (b30) obj;
                w6 w6Var = (w6) obj2;
                b30Var.h();
                try {
                    long b = w6Var.b(8192L, u8Var);
                    if (b30Var.i()) {
                        throw b30Var.k(null);
                    }
                    return b;
                } catch (IOException e) {
                    if (b30Var.i()) {
                        throw b30Var.k(e);
                    }
                    throw e;
                } finally {
                    b30Var.i();
                }
            default:
                try {
                    ((v50) obj2).f();
                    v10 t = u8Var.t(1);
                    int read = ((InputStream) obj).read(t.a, t.c, (int) Math.min(8192L, 8192 - t.c));
                    if (read == -1) {
                        if (t.b == t.c) {
                            u8Var.f = t.a();
                            w10.a(t);
                        }
                        return -1L;
                    }
                    t.c += read;
                    long j2 = read;
                    u8Var.g += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (zo.x(e2)) {
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
                b30 b30Var = (b30) obj;
                w6 w6Var = (w6) this.h;
                b30Var.h();
                try {
                    w6Var.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.source(" + ((w6) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.g) + ')';
        }
    }
}
