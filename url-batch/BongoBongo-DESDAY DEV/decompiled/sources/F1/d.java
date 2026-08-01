package F1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f237b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f238c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f236a = i;
        this.f237b = obj;
        this.f238c = obj2;
    }

    @Override // F1.v
    public final x a() {
        switch (this.f236a) {
            case 0:
                return (u) this.f237b;
            default:
                return (x) this.f238c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f236a) {
            case 0:
                d dVar = (d) this.f238c;
                u uVar = (u) this.f237b;
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
                ((InputStream) this.f237b).close();
                return;
        }
    }

    @Override // F1.v
    public final long d(f fVar, long j2) {
        switch (this.f236a) {
            case 0:
                h1.d.e(fVar, "sink");
                d dVar = (d) this.f238c;
                u uVar = (u) this.f237b;
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
                h1.d.e(fVar, "sink");
                try {
                    ((x) this.f238c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f237b).read(q2.f268a, q2.f270c, (int) Math.min(8192L, 8192 - q2.f270c));
                    if (read == -1) {
                        if (q2.f269b == q2.f270c) {
                            fVar.f246a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f270c += read;
                    long j3 = read;
                    fVar.f247b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (A1.d.M(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    public final String toString() {
        switch (this.f236a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f238c) + ')';
            default:
                return "source(" + ((InputStream) this.f237b) + ')';
        }
    }
}
