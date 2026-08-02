package T3;

import i2.AbstractC0457a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2963c;

    public /* synthetic */ d(Object obj, int i4, Object obj2) {
        this.f2961a = i4;
        this.f2962b = obj;
        this.f2963c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2961a) {
            case 0:
                u uVar = (u) this.f2962b;
                d dVar = (d) this.f2963c;
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
                ((InputStream) this.f2962b).close();
                return;
        }
    }

    @Override // T3.v
    public final x d() {
        switch (this.f2961a) {
            case 0:
                return (u) this.f2962b;
            default:
                return (x) this.f2963c;
        }
    }

    @Override // T3.v
    public final long j(g sink, long j4) {
        switch (this.f2961a) {
            case 0:
                kotlin.jvm.internal.i.e(sink, "sink");
                u uVar = (u) this.f2962b;
                d dVar = (d) this.f2963c;
                uVar.h();
                try {
                    long j5 = dVar.j(sink, 8192L);
                    if (uVar.i()) {
                        throw uVar.k(null);
                    }
                    return j5;
                } catch (IOException e4) {
                    if (uVar.i()) {
                        throw uVar.k(e4);
                    }
                    throw e4;
                } finally {
                    uVar.i();
                }
            default:
                kotlin.jvm.internal.i.e(sink, "sink");
                try {
                    ((x) this.f2963c).f();
                    q t4 = sink.t(1);
                    int read = ((InputStream) this.f2962b).read(t4.f2997a, t4.f2999c, (int) Math.min(8192L, 8192 - t4.f2999c));
                    if (read == -1) {
                        if (t4.f2998b == t4.f2999c) {
                            sink.f2974a = t4.a();
                            r.a(t4);
                        }
                        return -1L;
                    }
                    t4.f2999c += read;
                    long j6 = read;
                    sink.f2975b += j6;
                    return j6;
                } catch (AssertionError e5) {
                    if (AbstractC0457a.t(e5)) {
                        throw new IOException(e5);
                    }
                    throw e5;
                }
        }
    }

    public final String toString() {
        switch (this.f2961a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f2963c) + ')';
            default:
                return "source(" + ((InputStream) this.f2962b) + ')';
        }
    }
}
