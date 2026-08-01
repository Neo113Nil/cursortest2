package z1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4258a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4259b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4260c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f4258a = i;
        this.f4259b = obj;
        this.f4260c = obj2;
    }

    @Override // z1.v
    public final x a() {
        switch (this.f4258a) {
            case 0:
                return (u) this.f4259b;
            default:
                return (x) this.f4260c;
        }
    }

    @Override // z1.v
    public final long b(f fVar, long j2) {
        switch (this.f4258a) {
            case 0:
                b1.d.e(fVar, "sink");
                d dVar = (d) this.f4260c;
                u uVar = (u) this.f4259b;
                uVar.h();
                try {
                    long b2 = dVar.b(fVar, 8192L);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return b2;
                } catch (IOException e2) {
                    if (uVar.i()) {
                        throw uVar.k(e2);
                    }
                    throw e2;
                } finally {
                    uVar.i();
                }
            default:
                b1.d.e(fVar, "sink");
                try {
                    ((x) this.f4260c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f4259b).read(q2.f4289a, q2.f4291c, (int) Math.min(8192L, 8192 - q2.f4291c));
                    if (read == -1) {
                        if (q2.f4290b == q2.f4291c) {
                            fVar.f4267a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f4291c += read;
                    long j3 = read;
                    fVar.f4268b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (k0.k.l(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4258a) {
            case 0:
                d dVar = (d) this.f4260c;
                u uVar = (u) this.f4259b;
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
                ((InputStream) this.f4259b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4258a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4260c) + ')';
            default:
                return "source(" + ((InputStream) this.f4259b) + ')';
        }
    }
}
