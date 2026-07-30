package T6;

import X6.n;
import c7.u;
import i6.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m7.C4793g;
import n6.C4814a;

/* loaded from: classes2.dex */
public final class d implements a6.d, Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f3120y = Logger.getLogger(d.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f3121n = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public final c f3122u;

    /* renamed from: v, reason: collision with root package name */
    public final b f3123v;

    /* renamed from: w, reason: collision with root package name */
    public final a f3124w;

    /* renamed from: x, reason: collision with root package name */
    public final C4814a f3125x;

    public d(C4793g c4793g, u uVar, n nVar, C4814a c4814a) {
        this.f3122u = new c(c4793g);
        this.f3123v = new b(uVar);
        this.f3124w = new a(nVar);
        this.f3125x = c4814a;
    }

    @Override // a6.d
    public final s b() {
        return this.f3123v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final U6.c shutdown() {
        if (!this.f3121n.compareAndSet(false, true)) {
            f3120y.info("Multiple shutdown calls");
            return U6.c.f3310e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f3122u.f3119n.shutdown());
        arrayList.add(this.f3123v.f3118n.shutdown());
        arrayList.add(this.f3124w.f3117n.shutdown());
        return U6.c.d(arrayList);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f3122u.f3119n + ", meterProvider=" + this.f3123v.f3118n + ", loggerProvider=" + this.f3124w.f3117n + ", propagators=" + this.f3125x + "}";
    }
}
