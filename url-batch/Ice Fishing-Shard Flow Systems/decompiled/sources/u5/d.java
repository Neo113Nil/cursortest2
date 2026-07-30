package u5;

import D5.x;
import J4.s;
import N5.h;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import v5.C0977c;
import y5.m;

/* loaded from: classes.dex */
public final class d implements B4.d, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f8074n = Logger.getLogger(d.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8075d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final c f8076e;

    /* renamed from: i, reason: collision with root package name */
    public final b f8077i;

    /* renamed from: l, reason: collision with root package name */
    public final C0948a f8078l;

    /* renamed from: m, reason: collision with root package name */
    public final O4.a f8079m;

    public d(h hVar, x xVar, m mVar, O4.a aVar) {
        this.f8076e = new c(hVar);
        this.f8077i = new b(xVar);
        this.f8078l = new C0948a(mVar);
        this.f8079m = aVar;
    }

    @Override // B4.d
    public final s a() {
        return this.f8077i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final C0977c shutdown() {
        if (!this.f8075d.compareAndSet(false, true)) {
            f8074n.info("Multiple shutdown calls");
            return C0977c.f8229e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f8076e.f8073d.shutdown());
        arrayList.add(this.f8077i.f8072d.shutdown());
        arrayList.add(this.f8078l.f8071d.shutdown());
        return C0977c.d(arrayList);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f8076e.f8073d + ", meterProvider=" + this.f8077i.f8072d + ", loggerProvider=" + this.f8078l.f8071d + ", propagators=" + this.f8079m + "}";
    }
}
