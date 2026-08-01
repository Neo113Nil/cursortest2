package B1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f60b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f61c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f59a = i;
        this.f60b = obj;
        this.f61c = obj2;
    }

    @Override // B1.v
    public final x a() {
        switch (this.f59a) {
            case 0:
                return (u) this.f60b;
            default:
                return (x) this.f61c;
        }
    }

    @Override // B1.v
    public final long c(f fVar, long j2) {
        switch (this.f59a) {
            case 0:
                d1.d.e(fVar, "sink");
                d dVar = (d) this.f61c;
                u uVar = (u) this.f60b;
                uVar.h();
                try {
                    long c2 = dVar.c(fVar, 8192L);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return c2;
                } catch (IOException e2) {
                    if (uVar.i()) {
                        throw uVar.k(e2);
                    }
                    throw e2;
                } finally {
                    uVar.i();
                }
            default:
                d1.d.e(fVar, "sink");
                try {
                    ((x) this.f61c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f60b).read(q2.f90a, q2.f92c, (int) Math.min(8192L, 8192 - q2.f92c));
                    if (read == -1) {
                        if (q2.f91b == q2.f92c) {
                            fVar.f68a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f92c += read;
                    long j3 = read;
                    fVar.f69b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (w1.d.Q(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f59a) {
            case 0:
                d dVar = (d) this.f61c;
                u uVar = (u) this.f60b;
                uVar.h();
                try {
                    dVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!uVar.i()) {
                        throw e2;
                    }
                    throw uVar.k(e2);
                } finally {
                    uVar.i();
                }
            default:
                ((InputStream) this.f60b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f59a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f61c) + ')';
            default:
                return "source(" + ((InputStream) this.f60b) + ')';
        }
    }
}
