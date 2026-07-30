package c7;

import h7.C4570a;
import i7.C4585a;
import j7.C4611b;
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
import l7.C4707a;

/* loaded from: classes2.dex */
public final class u implements i6.s, Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final Logger f5750A = Logger.getLogger(u.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f5751n;

    /* renamed from: u, reason: collision with root package name */
    public final List f5752u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f5753v;

    /* renamed from: w, reason: collision with root package name */
    public final C4611b f5754w;

    /* renamed from: x, reason: collision with root package name */
    public final S0.i f5755x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f5756y = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    public final W6.h f5757z;

    public u(ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, C4707a c4707a, C4570a c4570a, W6.h hVar) {
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
        this.f5751n = arrayList;
        List list = (List) identityHashMap.entrySet().stream().map(new X6.m(1, arrayList)).collect(Collectors.toList());
        this.f5752u = list;
        this.f5753v = arrayList2;
        this.f5754w = new C4611b(c4707a, nanos + nano, c4570a);
        this.f5755x = new S0.i(new X6.m(2, this));
        this.f5757z = hVar;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            C4585a c4585a = (C4585a) it.next();
            new ArrayList(arrayList2).add(new L2.i(14));
            c4585a.getClass();
            throw null;
        }
    }

    @Override // i6.s
    public final i6.r a(String str) {
        if (this.f5752u.isEmpty()) {
            return i6.h.f38327n.a(str);
        }
        if (str == null || str.isEmpty()) {
            f5750A.fine("Meter requested without instrumentation scope name.");
            str = com.anythink.core.common.v.m.f16967e;
        }
        return new S0.s(9, this.f5755x, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final U6.c shutdown() {
        if (!this.f5756y.compareAndSet(false, true)) {
            f5750A.info("Multiple close calls");
            return U6.c.f3310e;
        }
        List list = this.f5752u;
        if (list.isEmpty()) {
            return U6.c.f3310e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return U6.c.d(arrayList);
        }
        ((C4585a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        C4611b c4611b = this.f5754w;
        c4611b.getClass();
        sb.append(U6.d.f3316a);
        sb.append(", resource=");
        sb.append(c4611b.f38580a);
        sb.append(", metricReaders=");
        sb.append(this.f5752u.stream().map(new G6.b(24)).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.f5753v);
        sb.append(", views=");
        sb.append(this.f5751n);
        sb.append(", meterConfigurator=");
        sb.append(this.f5757z);
        sb.append("}");
        return sb.toString();
    }
}
