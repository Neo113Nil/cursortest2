package z3;

import A.AbstractC0017m;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446d implements F {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11987d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11988e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11989i;

    public C1446d(InputStream input, H timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f11988e = input;
        this.f11989i = timeout;
    }

    @Override // z3.F
    public final H c() {
        switch (this.f11987d) {
            case 0:
                return (E) this.f11988e;
            default:
                return (H) this.f11989i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f11988e;
        switch (this.f11987d) {
            case 0:
                C1446d c1446d = (C1446d) this.f11989i;
                E e4 = (E) obj;
                e4.h();
                try {
                    c1446d.close();
                    Unit unit = Unit.f7487a;
                    if (e4.i()) {
                        throw e4.k(null);
                    }
                    return;
                } catch (IOException e5) {
                    if (!e4.i()) {
                        throw e5;
                    }
                    throw e4.k(e5);
                } finally {
                    e4.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        switch (this.f11987d) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                C1446d c1446d = (C1446d) this.f11989i;
                E e4 = (E) this.f11988e;
                e4.h();
                try {
                    long l4 = c1446d.l(sink, j4);
                    if (e4.i()) {
                        throw e4.k(null);
                    }
                    return l4;
                } catch (IOException e5) {
                    if (e4.i()) {
                        throw e4.k(e5);
                    }
                    throw e5;
                } finally {
                    e4.i();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j4 == 0) {
                    return 0L;
                }
                if (j4 < 0) {
                    throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
                }
                try {
                    ((H) this.f11989i).f();
                    A u4 = sink.u(1);
                    int read = ((InputStream) this.f11988e).read(u4.f11962a, u4.f11964c, (int) Math.min(j4, 8192 - u4.f11964c));
                    if (read == -1) {
                        if (u4.f11963b == u4.f11964c) {
                            sink.f11998d = u4.a();
                            B.a(u4);
                        }
                        return -1L;
                    }
                    u4.f11964c += read;
                    long j5 = read;
                    sink.f11999e += j5;
                    return j5;
                } catch (AssertionError e6) {
                    if (m3.z.o(e6)) {
                        throw new IOException(e6);
                    }
                    throw e6;
                }
        }
    }

    public final String toString() {
        switch (this.f11987d) {
            case 0:
                return "AsyncTimeout.source(" + ((C1446d) this.f11989i) + ')';
            default:
                return "source(" + ((InputStream) this.f11988e) + ')';
        }
    }

    public C1446d(E e4, C1446d c1446d) {
        this.f11988e = e4;
        this.f11989i = c1446d;
    }
}
