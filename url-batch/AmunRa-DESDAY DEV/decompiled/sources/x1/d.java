package x1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4226a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4227b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4228c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f4226a = i;
        this.f4227b = obj;
        this.f4228c = obj2;
    }

    @Override // x1.v
    public final x a() {
        switch (this.f4226a) {
            case 0:
                return (u) this.f4227b;
            default:
                return (x) this.f4228c;
        }
    }

    @Override // x1.v
    public final long b(f fVar, long j2) {
        switch (this.f4226a) {
            case 0:
                Z0.d.e(fVar, "sink");
                d dVar = (d) this.f4228c;
                u uVar = (u) this.f4227b;
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
                Z0.d.e(fVar, "sink");
                try {
                    ((x) this.f4228c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f4227b).read(q2.f4257a, q2.f4259c, (int) Math.min(8192L, 8192 - q2.f4259c));
                    if (read == -1) {
                        if (q2.f4258b == q2.f4259c) {
                            fVar.f4235a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f4259c += read;
                    long j3 = read;
                    fVar.f4236b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (k1.c.o(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4226a) {
            case 0:
                d dVar = (d) this.f4228c;
                u uVar = (u) this.f4227b;
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
                ((InputStream) this.f4227b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4226a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4228c) + ')';
            default:
                return "source(" + ((InputStream) this.f4227b) + ')';
        }
    }
}
