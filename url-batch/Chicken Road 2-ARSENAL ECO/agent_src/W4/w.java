package W4;

import H1.A;
import b5.C0266a;
import c4.C0289h;
import c5.C0290a;
import d5.C0332b;
import f5.C0387a;
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
import u0.C0673c;

/* loaded from: classes.dex */
public final class w implements c4.s, Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f2841m = Logger.getLogger(w.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final List f2842f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2843g;

    /* renamed from: h, reason: collision with root package name */
    public final List f2844h;

    /* renamed from: i, reason: collision with root package name */
    public final C0332b f2845i;

    /* renamed from: j, reason: collision with root package name */
    public final A f2846j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f2847k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final Q4.i f2848l;

    public w(List list, IdentityHashMap identityHashMap, List list2, C0387a c0387a, C0266a c0266a, Q4.i iVar) {
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
        this.f2842f = list;
        List list3 = (List) identityHashMap.entrySet().stream().map(new R4.m(1, list)).collect(Collectors.toList());
        this.f2843g = list3;
        this.f2844h = list2;
        this.f2845i = new C0332b(c0387a, nanos + nano, c0266a);
        this.f2846j = new A(new R4.m(2, this));
        this.f2848l = iVar;
        Iterator it = list3.iterator();
        if (it.hasNext()) {
            C0290a c0290a = (C0290a) it.next();
            new ArrayList(list2).add(new R0.g());
            c0290a.getClass();
            throw null;
        }
    }

    @Override // c4.s
    public final c4.r a(String str) {
        if (this.f2843g.isEmpty()) {
            return C0289h.f3817f.a(str);
        }
        if (str == null || str.isEmpty()) {
            f2841m.fine("Meter requested without instrumentation scope name.");
            str = "unknown";
        }
        return new C0673c(this.f2846j, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final O4.c shutdown() {
        if (!this.f2847k.compareAndSet(false, true)) {
            f2841m.info("Multiple close calls");
            return O4.c.f1787e;
        }
        List list = this.f2843g;
        if (list.isEmpty()) {
            return O4.c.f1787e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return O4.c.d(arrayList);
        }
        ((C0290a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        C0332b c0332b = this.f2845i;
        c0332b.getClass();
        sb.append(O4.d.f1793a);
        sb.append(", resource=");
        sb.append(c0332b.f3960a);
        sb.append(", metricReaders=");
        sb.append(this.f2843g.stream().map(new A4.b(24)).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.f2844h);
        sb.append(", views=");
        sb.append(this.f2842f);
        sb.append(", meterConfigurator=");
        sb.append(this.f2848l);
        sb.append("}");
        return sb.toString();
    }
}
