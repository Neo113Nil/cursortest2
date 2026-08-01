package v1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4474a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4475b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4476c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f4474a = i;
        this.f4475b = obj;
        this.f4476c = obj2;
    }

    @Override // v1.w
    public final y a() {
        switch (this.f4474a) {
            case 0:
                return (v) this.f4475b;
            default:
                return (y) this.f4476c;
        }
    }

    @Override // v1.w
    public final long c(f fVar, long j2) {
        switch (this.f4474a) {
            case 0:
                X0.f.e(fVar, "sink");
                d dVar = (d) this.f4476c;
                v vVar = (v) this.f4475b;
                vVar.h();
                try {
                    long c2 = dVar.c(fVar, 8192L);
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return c2;
                } catch (IOException e2) {
                    if (vVar.i()) {
                        throw vVar.k(e2);
                    }
                    throw e2;
                } finally {
                    vVar.i();
                }
            default:
                X0.f.e(fVar, "sink");
                try {
                    ((y) this.f4476c).f();
                    r q2 = fVar.q(1);
                    int read = ((InputStream) this.f4475b).read(q2.f4508a, q2.f4510c, (int) Math.min(8192L, 8192 - q2.f4510c));
                    if (read == -1) {
                        if (q2.f4509b == q2.f4510c) {
                            fVar.f4483a = q2.a();
                            s.a(q2);
                        }
                        return -1L;
                    }
                    q2.f4510c += read;
                    long j3 = read;
                    fVar.f4484b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (i1.r.j(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4474a) {
            case 0:
                d dVar = (d) this.f4476c;
                v vVar = (v) this.f4475b;
                vVar.h();
                try {
                    dVar.close();
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!vVar.i()) {
                        throw e2;
                    }
                    throw vVar.k(e2);
                } finally {
                    vVar.i();
                }
            default:
                ((InputStream) this.f4475b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4474a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4476c) + ')';
            default:
                return "source(" + ((InputStream) this.f4475b) + ')';
        }
    }
}
