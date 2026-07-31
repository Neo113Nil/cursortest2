package T2;

import h2.AbstractC0508a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: T2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229d implements F {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4397d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4398e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4399f;

    public /* synthetic */ C0229d(Object obj, int i3, Object obj2) {
        this.f4397d = i3;
        this.f4398e = obj;
        this.f4399f = obj2;
    }

    @Override // T2.F
    public final H c() {
        switch (this.f4397d) {
            case 0:
                return (E) this.f4398e;
            default:
                return (H) this.f4399f;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4397d) {
            case 0:
                C0229d c0229d = (C0229d) this.f4399f;
                E e3 = (E) this.f4398e;
                e3.h();
                try {
                    c0229d.close();
                    if (e3.i()) {
                        throw e3.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!e3.i()) {
                        throw e4;
                    }
                    throw e3.k(e4);
                } finally {
                    e3.i();
                }
            default:
                ((InputStream) this.f4398e).close();
                return;
        }
    }

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        switch (this.f4397d) {
            case 0:
                f2.j.f(c0231f, "sink");
                C0229d c0229d = (C0229d) this.f4399f;
                E e3 = (E) this.f4398e;
                e3.h();
                try {
                    long f3 = c0229d.f(c0231f, j3);
                    if (e3.i()) {
                        throw e3.k(null);
                    }
                    return f3;
                } catch (IOException e4) {
                    if (e3.i()) {
                        throw e3.k(e4);
                    }
                    throw e4;
                } finally {
                    e3.i();
                }
            default:
                f2.j.f(c0231f, "sink");
                if (j3 == 0) {
                    return 0L;
                }
                if (j3 < 0) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
                }
                try {
                    ((H) this.f4399f).f();
                    A x3 = c0231f.x(1);
                    int read = ((InputStream) this.f4398e).read(x3.f4372a, x3.f4374c, (int) Math.min(j3, 8192 - x3.f4374c));
                    if (read == -1) {
                        if (x3.f4373b == x3.f4374c) {
                            c0231f.f4408d = x3.a();
                            B.a(x3);
                        }
                        return -1L;
                    }
                    x3.f4374c += read;
                    long j4 = read;
                    c0231f.f4409e += j4;
                    return j4;
                } catch (AssertionError e5) {
                    if (AbstractC0508a.J(e5)) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
        }
    }

    public final String toString() {
        switch (this.f4397d) {
            case 0:
                return "AsyncTimeout.source(" + ((C0229d) this.f4399f) + ')';
            default:
                return "source(" + ((InputStream) this.f4398e) + ')';
        }
    }
}
