package N2;

import a.AbstractC0157a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: N2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148d implements F {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2917d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2918e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2919f;

    public /* synthetic */ C0148d(Object obj, int i3, Object obj2) {
        this.f2917d = i3;
        this.f2918e = obj;
        this.f2919f = obj2;
    }

    @Override // N2.F
    public final H c() {
        switch (this.f2917d) {
            case 0:
                return (E) this.f2918e;
            default:
                return (H) this.f2919f;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2917d) {
            case 0:
                C0148d c0148d = (C0148d) this.f2919f;
                E e3 = (E) this.f2918e;
                e3.h();
                try {
                    c0148d.close();
                    if (e3.i()) {
                        throw e3.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!e3.i()) {
                        throw e4;
                    }
                    throw e3.k(e4);
                } finally {
                    e3.i();
                }
            default:
                ((InputStream) this.f2918e).close();
                return;
        }
    }

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        switch (this.f2917d) {
            case 0:
                Z1.i.f(c0150f, "sink");
                C0148d c0148d = (C0148d) this.f2919f;
                E e3 = (E) this.f2918e;
                e3.h();
                try {
                    long l3 = c0148d.l(c0150f, j3);
                    if (e3.i()) {
                        throw e3.k(null);
                    }
                    return l3;
                } catch (IOException e4) {
                    if (e3.i()) {
                        throw e3.k(e4);
                    }
                    throw e4;
                } finally {
                    e3.i();
                }
            default:
                Z1.i.f(c0150f, "sink");
                if (j3 == 0) {
                    return 0L;
                }
                if (j3 < 0) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
                }
                try {
                    ((H) this.f2919f).f();
                    A D = c0150f.D(1);
                    int read = ((InputStream) this.f2918e).read(D.f2892a, D.f2894c, (int) Math.min(j3, 8192 - D.f2894c));
                    if (read == -1) {
                        if (D.f2893b == D.f2894c) {
                            c0150f.f2928d = D.a();
                            B.a(D);
                        }
                        return -1L;
                    }
                    D.f2894c += read;
                    long j4 = read;
                    c0150f.f2929e += j4;
                    return j4;
                } catch (AssertionError e5) {
                    if (AbstractC0157a.K(e5)) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
        }
    }

    public final String toString() {
        switch (this.f2917d) {
            case 0:
                return "AsyncTimeout.source(" + ((C0148d) this.f2919f) + ')';
            default:
                return "source(" + ((InputStream) this.f2918e) + ')';
        }
    }
}
