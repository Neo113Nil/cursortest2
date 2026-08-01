package M1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f789a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f790b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f791c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f789a = i;
        this.f790b = obj;
        this.f791c = obj2;
    }

    @Override // M1.v
    public final x b() {
        switch (this.f789a) {
            case 0:
                return (u) this.f790b;
            default:
                return (x) this.f791c;
        }
    }

    @Override // M1.v
    public final long c(f fVar, long j2) {
        switch (this.f789a) {
            case 0:
                k1.e.e(fVar, "sink");
                d dVar = (d) this.f791c;
                u uVar = (u) this.f790b;
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
                k1.e.e(fVar, "sink");
                try {
                    ((x) this.f791c).f();
                    q w2 = fVar.w(1);
                    int read = ((InputStream) this.f790b).read(w2.f820a, w2.f822c, (int) Math.min(8192L, 8192 - w2.f822c));
                    if (read == -1) {
                        if (w2.f821b == w2.f822c) {
                            fVar.f798a = w2.a();
                            r.a(w2);
                        }
                        return -1L;
                    }
                    w2.f822c += read;
                    long j3 = read;
                    fVar.f799b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (H1.d.M(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f789a) {
            case 0:
                d dVar = (d) this.f791c;
                u uVar = (u) this.f790b;
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
                ((InputStream) this.f790b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f789a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f791c) + ')';
            default:
                return "source(" + ((InputStream) this.f790b) + ')';
        }
    }
}
