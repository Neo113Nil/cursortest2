package I3;

import M3.o;
import R3.v;
import X2.s;
import b4.C0292g;
import c3.C0310a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d implements P2.d, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1274f = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1275a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final c f1276b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1277c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1278d;

    /* renamed from: e, reason: collision with root package name */
    public final C0310a f1279e;

    public d(C0292g c0292g, v vVar, o oVar, C0310a c0310a) {
        this.f1276b = new c(c0292g);
        this.f1277c = new b(vVar);
        this.f1278d = new a(oVar);
        this.f1279e = c0310a;
    }

    @Override // P2.d
    public final s a() {
        return this.f1277c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final J3.c shutdown() {
        if (!this.f1275a.compareAndSet(false, true)) {
            f1274f.info("Multiple shutdown calls");
            return J3.c.f1361e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f1276b.f1273a.shutdown());
        arrayList.add(this.f1277c.f1272a.shutdown());
        arrayList.add(this.f1278d.f1271a.shutdown());
        return J3.c.d(arrayList);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f1276b.f1273a + ", meterProvider=" + this.f1277c.f1272a + ", loggerProvider=" + this.f1278d.f1271a + ", propagators=" + this.f1279e + "}";
    }
}
