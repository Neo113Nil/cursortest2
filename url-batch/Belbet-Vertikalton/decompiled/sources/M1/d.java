package M1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f818a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f819b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f820c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f818a = i;
        this.f819b = obj;
        this.f820c = obj2;
    }

    @Override // M1.v
    public final x b() {
        switch (this.f818a) {
            case 0:
                return (u) this.f819b;
            default:
                return (x) this.f820c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f818a) {
            case 0:
                d dVar = (d) this.f820c;
                u uVar = (u) this.f819b;
                uVar.h();
                try {
                    dVar.close();
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!uVar.i()) {
                        throw e;
                    }
                    throw uVar.k(e);
                } finally {
                    uVar.i();
                }
            default:
                ((InputStream) this.f819b).close();
                return;
        }
    }

    @Override // M1.v
    public final long h(f fVar, long j) {
        switch (this.f818a) {
            case 0:
                j1.h.e(fVar, "sink");
                d dVar = (d) this.f820c;
                u uVar = (u) this.f819b;
                uVar.h();
                try {
                    long h2 = dVar.h(fVar, 8192L);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return h2;
                } catch (IOException e) {
                    if (uVar.i()) {
                        throw uVar.k(e);
                    }
                    throw e;
                } finally {
                    uVar.i();
                }
            default:
                j1.h.e(fVar, "sink");
                try {
                    ((x) this.f820c).f();
                    q I2 = fVar.I(1);
                    int read = ((InputStream) this.f819b).read(I2.f849a, I2.f851c, (int) Math.min(8192L, 8192 - I2.f851c));
                    if (read == -1) {
                        if (I2.f850b == I2.f851c) {
                            fVar.f826a = I2.a();
                            r.a(I2);
                        }
                        return -1L;
                    }
                    I2.f851c += read;
                    long j2 = read;
                    fVar.f827b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (H1.d.M(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.f818a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f820c) + ')';
            default:
                return "source(" + ((InputStream) this.f819b) + ')';
        }
    }
}
