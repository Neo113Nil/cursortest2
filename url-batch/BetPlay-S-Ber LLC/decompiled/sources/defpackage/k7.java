package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class k7 implements q30 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ k7(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.q30
    public final d60 a() {
        switch (this.f) {
            case 0:
                return (m30) this.g;
            default:
                return (d60) this.h;
        }
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                m30 m30Var = (m30) obj;
                k7 k7Var = (k7) obj2;
                m30Var.h();
                try {
                    long b = k7Var.b(8192L, p8Var);
                    if (m30Var.i()) {
                        throw m30Var.k(null);
                    }
                    return b;
                } catch (IOException e) {
                    if (m30Var.i()) {
                        throw m30Var.k(e);
                    }
                    throw e;
                } finally {
                    m30Var.i();
                }
            default:
                try {
                    ((d60) obj2).f();
                    f20 t = p8Var.t(1);
                    int read = ((InputStream) obj).read(t.a, t.c, (int) Math.min(8192L, 8192 - t.c));
                    if (read == -1) {
                        if (t.b == t.c) {
                            p8Var.f = t.a();
                            g20.a(t);
                        }
                        return -1L;
                    }
                    t.c += read;
                    long j2 = read;
                    p8Var.g += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (vw.N(e2)) {
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
                m30 m30Var = (m30) obj;
                k7 k7Var = (k7) this.h;
                m30Var.h();
                try {
                    k7Var.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.source(" + ((k7) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.g) + ')';
        }
    }
}
