package g4;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1926f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1927g;
    public final Object h;

    public /* synthetic */ d(Object obj, Object obj2, int i) {
        this.f1926f = i;
        this.f1927g = obj;
        this.h = obj2;
    }

    @Override // g4.v
    public final x a() {
        switch (this.f1926f) {
            case 0:
                return (u) this.f1927g;
            default:
                return (x) this.h;
        }
    }

    @Override // g4.v
    public final long c(long j2, f fVar) {
        switch (this.f1926f) {
            case 0:
                u uVar = (u) this.f1927g;
                d dVar = (d) this.h;
                uVar.h();
                try {
                    long c5 = dVar.c(8192L, fVar);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return c5;
                } catch (IOException e4) {
                    if (uVar.i()) {
                        throw uVar.k(e4);
                    }
                    throw e4;
                } finally {
                    uVar.i();
                }
            default:
                try {
                    ((x) this.h).f();
                    q t4 = fVar.t(1);
                    int read = ((InputStream) this.f1927g).read(t4.f1951a, t4.f1953c, (int) Math.min(8192L, 8192 - t4.f1953c));
                    if (read == -1) {
                        if (t4.f1952b == t4.f1953c) {
                            fVar.f1934f = t4.a();
                            r.a(t4);
                        }
                        return -1L;
                    }
                    t4.f1953c += read;
                    long j4 = read;
                    fVar.f1935g += j4;
                    return j4;
                } catch (AssertionError e5) {
                    if (b4.d.D(e5)) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1926f) {
            case 0:
                u uVar = (u) this.f1927g;
                d dVar = (d) this.h;
                uVar.h();
                try {
                    dVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!uVar.i()) {
                        throw e4;
                    }
                    throw uVar.k(e4);
                } finally {
                    uVar.i();
                }
            default:
                ((InputStream) this.f1927g).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f1926f) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.f1927g) + ')';
        }
    }
}
