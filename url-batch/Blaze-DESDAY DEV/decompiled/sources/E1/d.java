package E1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f194b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f195c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f193a = i;
        this.f194b = obj;
        this.f195c = obj2;
    }

    @Override // E1.v
    public final x a() {
        switch (this.f193a) {
            case 0:
                return (u) this.f194b;
            default:
                return (x) this.f195c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f193a) {
            case 0:
                d dVar = (d) this.f195c;
                u uVar = (u) this.f194b;
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
                ((InputStream) this.f194b).close();
                return;
        }
    }

    @Override // E1.v
    public final long d(f fVar, long j2) {
        switch (this.f193a) {
            case 0:
                g1.d.e(fVar, "sink");
                d dVar = (d) this.f195c;
                u uVar = (u) this.f194b;
                uVar.h();
                try {
                    long d = dVar.d(fVar, 8192L);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return d;
                } catch (IOException e2) {
                    if (uVar.i()) {
                        throw uVar.k(e2);
                    }
                    throw e2;
                } finally {
                    uVar.i();
                }
            default:
                g1.d.e(fVar, "sink");
                try {
                    ((x) this.f195c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f194b).read(q2.f224a, q2.f226c, (int) Math.min(8192L, 8192 - q2.f226c));
                    if (read == -1) {
                        if (q2.f225b == q2.f226c) {
                            fVar.f202a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f226c += read;
                    long j3 = read;
                    fVar.f203b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (z1.l.E(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    public final String toString() {
        switch (this.f193a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f195c) + ')';
            default:
                return "source(" + ((InputStream) this.f194b) + ')';
        }
    }
}
