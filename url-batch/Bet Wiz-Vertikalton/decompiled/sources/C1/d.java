package C1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f173b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f174c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f172a = i;
        this.f173b = obj;
        this.f174c = obj2;
    }

    @Override // C1.v
    public final x a() {
        switch (this.f172a) {
            case 0:
                return (u) this.f173b;
            default:
                return (x) this.f174c;
        }
    }

    @Override // C1.v
    public final long b(f fVar, long j2) {
        switch (this.f172a) {
            case 0:
                e1.d.e(fVar, "sink");
                d dVar = (d) this.f174c;
                u uVar = (u) this.f173b;
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
                e1.d.e(fVar, "sink");
                try {
                    ((x) this.f174c).f();
                    q q2 = fVar.q(1);
                    int read = ((InputStream) this.f173b).read(q2.f203a, q2.f205c, (int) Math.min(8192L, 8192 - q2.f205c));
                    if (read == -1) {
                        if (q2.f204b == q2.f205c) {
                            fVar.f181a = q2.a();
                            r.a(q2);
                        }
                        return -1L;
                    }
                    q2.f205c += read;
                    long j3 = read;
                    fVar.f182b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (x1.l.M(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f172a) {
            case 0:
                d dVar = (d) this.f174c;
                u uVar = (u) this.f173b;
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
                ((InputStream) this.f173b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f172a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f174c) + ')';
            default:
                return "source(" + ((InputStream) this.f173b) + ')';
        }
    }
}
