package v1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4064a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4065b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4066c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f4064a = i;
        this.f4065b = obj;
        this.f4066c = obj2;
    }

    @Override // v1.v
    public final x a() {
        switch (this.f4064a) {
            case 0:
                return (u) this.f4065b;
            default:
                return (x) this.f4066c;
        }
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        switch (this.f4064a) {
            case 0:
                X0.d.e(fVar, "sink");
                d dVar = (d) this.f4066c;
                u uVar = (u) this.f4065b;
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
                X0.d.e(fVar, "sink");
                try {
                    ((x) this.f4066c).f();
                    q o2 = fVar.o(1);
                    int read = ((InputStream) this.f4065b).read(o2.f4094a, o2.f4096c, (int) Math.min(8192L, 8192 - o2.f4096c));
                    if (read == -1) {
                        if (o2.f4095b == o2.f4096c) {
                            fVar.f4073a = o2.a();
                            r.a(o2);
                        }
                        return -1L;
                    }
                    o2.f4096c += read;
                    long j3 = read;
                    fVar.f4074b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (i1.s.k(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4064a) {
            case 0:
                d dVar = (d) this.f4066c;
                u uVar = (u) this.f4065b;
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
                ((InputStream) this.f4065b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4064a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4066c) + ')';
            default:
                return "source(" + ((InputStream) this.f4065b) + ')';
        }
    }
}
