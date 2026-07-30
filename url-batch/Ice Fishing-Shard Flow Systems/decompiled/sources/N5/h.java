package N5;

import D5.w;
import K4.l;
import P0.n;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import v5.C0977c;
import v5.C0978d;
import x5.C1020j;

/* loaded from: classes.dex */
public final class h implements l, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f1851l = Logger.getLogger(h.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final k f1852d;

    /* renamed from: e, reason: collision with root package name */
    public final n f1853e = new n(new w(2, this));

    /* renamed from: i, reason: collision with root package name */
    public final C1020j f1854i;

    public h(C0978d c0978d, c cVar, M5.a aVar, Supplier supplier, O5.d dVar, List list, C1020j c1020j) {
        this.f1852d = new k(c0978d, cVar, aVar, supplier, dVar, list);
        this.f1854i = c1020j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // K4.l
    public final K4.k get() {
        return (K4.k) this.f1853e.g(C4.b.f297l, "noop");
    }

    public final C0977c shutdown() {
        if (this.f1852d.f1870h != null) {
            f1851l.log(Level.INFO, "Calling shutdown() multiple times.");
            return C0977c.f8229e;
        }
        k kVar = this.f1852d;
        synchronized (kVar.f1863a) {
            try {
                if (kVar.f1870h != null) {
                    return kVar.f1870h;
                }
                kVar.f1870h = kVar.f1869g.shutdown();
                return kVar.f1870h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        k kVar = this.f1852d;
        sb.append(kVar.f1864b);
        sb.append(", idGenerator=");
        sb.append(kVar.f1865c);
        sb.append(", resource=");
        sb.append(kVar.f1866d);
        sb.append(", spanLimitsSupplier=");
        sb.append((a) kVar.f1867e.get());
        sb.append(", sampler=");
        sb.append(kVar.f1868f);
        sb.append(", spanProcessor=");
        sb.append(kVar.f1869g);
        sb.append(", tracerConfigurator=");
        sb.append(this.f1854i);
        sb.append('}');
        return sb.toString();
    }
}
