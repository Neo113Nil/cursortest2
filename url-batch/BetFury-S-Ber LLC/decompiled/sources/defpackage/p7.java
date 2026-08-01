package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p7 implements ke0 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ p7(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        switch (this.f) {
            case 0:
                return (ge0) this.g;
            default:
                return (gi0) this.h;
        }
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ge0 ge0Var = (ge0) obj;
                p7 p7Var = (p7) obj2;
                ge0Var.h();
                try {
                    long c = p7Var.c(8192L, t9Var);
                    if (ge0Var.i()) {
                        throw ge0Var.k(null);
                    }
                    return c;
                } catch (IOException e) {
                    if (ge0Var.i()) {
                        throw ge0Var.k(e);
                    }
                    throw e;
                } finally {
                    ge0Var.i();
                }
            default:
                try {
                    ((gi0) obj2).f();
                    kc0 Q = t9Var.Q(1);
                    int read = ((InputStream) obj).read(Q.a, Q.c, (int) Math.min(8192L, 8192 - Q.c));
                    if (read == -1) {
                        if (Q.b == Q.c) {
                            t9Var.f = Q.a();
                            nc0.a(Q);
                        }
                        return -1L;
                    }
                    Q.c += read;
                    long j2 = read;
                    t9Var.g += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (mv.z(e2)) {
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
                ge0 ge0Var = (ge0) obj;
                p7 p7Var = (p7) this.h;
                ge0Var.h();
                try {
                    p7Var.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.source(" + ((p7) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.g) + ')';
        }
    }
}
