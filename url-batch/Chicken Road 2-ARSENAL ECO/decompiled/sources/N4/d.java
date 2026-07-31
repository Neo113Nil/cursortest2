package N4;

import R4.n;
import W4.w;
import c4.s;
import g5.h;
import h4.C0409a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d implements U3.d, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f1756k = Logger.getLogger(d.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1757f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final c f1758g;

    /* renamed from: h, reason: collision with root package name */
    public final b f1759h;

    /* renamed from: i, reason: collision with root package name */
    public final a f1760i;

    /* renamed from: j, reason: collision with root package name */
    public final C0409a f1761j;

    public d(h hVar, w wVar, n nVar, C0409a c0409a) {
        this.f1758g = new c(hVar);
        this.f1759h = new b(wVar);
        this.f1760i = new a(nVar);
        this.f1761j = c0409a;
    }

    @Override // U3.d
    public final s a() {
        return this.f1759h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final O4.c shutdown() {
        if (!this.f1757f.compareAndSet(false, true)) {
            f1756k.info("Multiple shutdown calls");
            return O4.c.f1787e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f1758g.f1755f.shutdown());
        arrayList.add(this.f1759h.f1754f.shutdown());
        arrayList.add(this.f1760i.f1753f.shutdown());
        return O4.c.d(arrayList);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f1758g.f1755f + ", meterProvider=" + this.f1759h.f1754f + ", loggerProvider=" + this.f1760i.f1753f + ", propagators=" + this.f1761j + "}";
    }
}
