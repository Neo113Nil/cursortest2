package D5;

import java.io.Closeable;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import v5.C0977c;
import v5.C0978d;
import x5.C1020j;

/* loaded from: classes.dex */
public final class x implements J4.s, Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final Logger f399p = Logger.getLogger(x.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final List f400d;

    /* renamed from: e, reason: collision with root package name */
    public final List f401e;

    /* renamed from: i, reason: collision with root package name */
    public final List f402i;

    /* renamed from: l, reason: collision with root package name */
    public final K5.b f403l;

    /* renamed from: m, reason: collision with root package name */
    public final P0.n f404m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f405n = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public final C1020j f406o;

    public x(List list, IdentityHashMap identityHashMap, List list2, M5.a aVar, I5.a aVar2, C1020j c1020j) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f400d = list;
        List list3 = (List) identityHashMap.entrySet().stream().map(new w(0, list)).collect(Collectors.toList());
        this.f401e = list3;
        this.f402i = list2;
        this.f403l = new K5.b(aVar, nanos + nano, aVar2);
        this.f404m = new P0.n(new w(1, this));
        this.f406o = c1020j;
        Iterator it = list3.iterator();
        if (it.hasNext()) {
            J5.a aVar3 = (J5.a) it.next();
            new ArrayList(list2).add(new q1.h(1));
            aVar3.getClass();
            throw null;
        }
    }

    @Override // J4.s
    public final J4.r a(String str) {
        if (this.f401e.isEmpty()) {
            return J4.h.f1386d.a(str);
        }
        if (str == null || str.isEmpty()) {
            f399p.fine("Meter requested without instrumentation scope name.");
            str = "unknown";
        }
        return new v(this.f404m, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final C0977c shutdown() {
        if (!this.f405n.compareAndSet(false, true)) {
            f399p.info("Multiple close calls");
            return C0977c.f8229e;
        }
        List list = this.f401e;
        if (list.isEmpty()) {
            return C0977c.f8229e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return C0977c.d(arrayList);
        }
        ((J5.a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        K5.b bVar = this.f403l;
        bVar.getClass();
        sb.append(C0978d.f8235a);
        sb.append(", resource=");
        sb.append(bVar.f1464a);
        sb.append(", metricReaders=");
        sb.append(this.f401e.stream().map(new C4.a(6)).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.f402i);
        sb.append(", views=");
        sb.append(this.f400d);
        sb.append(", meterConfigurator=");
        sb.append(this.f406o);
        sb.append("}");
        return sb.toString();
    }
}
