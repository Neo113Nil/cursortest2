package z1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4261c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f4259a = i;
        this.f4260b = obj;
        this.f4261c = obj2;
    }

    @Override // z1.v
    public final x a() {
        switch (this.f4259a) {
            case 0:
                return (u) this.f4260b;
            default:
                return (x) this.f4261c;
        }
    }

    @Override // z1.v
    public final long b(f fVar, long j2) {
        switch (this.f4259a) {
            case 0:
                b1.d.e(fVar, "sink");
                d dVar = (d) this.f4261c;
                u uVar = (u) this.f4260b;
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
                    ((x) this.f4261c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f4260b).read(q2.f4290a, q2.f4292c, (int) Math.min(8192L, 8192 - q2.f4292c));
                    if (read == -1) {
                        if (q2.f4291b == q2.f4292c) {
                            fVar.f4268a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f4292c += read;
                    long j3 = read;
                    fVar.f4269b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (k0.w.k(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4259a) {
            case 0:
                d dVar = (d) this.f4261c;
                u uVar = (u) this.f4260b;
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
                ((InputStream) this.f4260b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4259a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4261c) + ')';
            default:
                return "source(" + ((InputStream) this.f4260b) + ')';
        }
    }
}
