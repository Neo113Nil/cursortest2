package p3;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3021f;
    public final Object g;
    public final Object h;

    public /* synthetic */ d(Object obj, Object obj2, int i4) {
        this.f3021f = i4;
        this.g = obj;
        this.h = obj2;
    }

    @Override // p3.v
    public final x a() {
        switch (this.f3021f) {
            case 0:
                return (u) this.g;
            default:
                return (x) this.h;
        }
    }

    @Override // p3.v
    public final long c(long j4, f fVar) {
        switch (this.f3021f) {
            case 0:
                u uVar = (u) this.g;
                d dVar = (d) this.h;
                uVar.h();
                try {
                    long c = dVar.c(8192L, fVar);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return c;
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
                    q t3 = fVar.t(1);
                    int read = ((InputStream) this.g).read(t3.f3041a, t3.c, (int) Math.min(8192L, 8192 - t3.c));
                    if (read == -1) {
                        if (t3.f3042b == t3.c) {
                            fVar.f3028f = t3.a();
                            r.a(t3);
                        }
                        return -1L;
                    }
                    t3.c += read;
                    long j5 = read;
                    fVar.g += j5;
                    return j5;
                } catch (AssertionError e5) {
                    if (m0.a.p(e5)) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3021f) {
            case 0:
                u uVar = (u) this.g;
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
                ((InputStream) this.g).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f3021f) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.g) + ')';
        }
    }
}
