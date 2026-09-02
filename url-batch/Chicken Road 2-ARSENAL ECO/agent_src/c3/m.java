package c3;

import a1.AbstractC0223a;
import f5.C0387a;
import h4.C0409a;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k5.C0481k;
import m1.AbstractC0521b;
import u0.C0682l;

/* loaded from: classes.dex */
public final class m extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public final f f3797e;

    /* renamed from: f, reason: collision with root package name */
    public final C0481k f3798f;

    /* renamed from: g, reason: collision with root package name */
    public final C0481k f3799g;

    public m(f fVar, a6.d dVar, V5.g gVar) {
        super(dVar, gVar);
        this.f3797e = fVar;
        this.f3798f = AbstractC0521b.x(new l(this, 0));
        this.f3799g = AbstractC0521b.x(new l(this, 1));
    }

    @Override // c3.j
    public final N4.d d(Map attributes) {
        Duration ofSeconds;
        long nanos;
        Duration ofSeconds2;
        long nanos2;
        kotlin.jvm.internal.i.e(attributes, "attributes");
        Logger logger = N4.d.f1756k;
        C0682l c0682l = new C0682l();
        c0682l.f5989f = C0409a.f4336b;
        C0387a l7 = i6.g.l(attributes);
        Map extraHttpHeaders = (Map) this.f3798f.getValue();
        f fVar = this.f3797e;
        String appId = fVar.getAppIdForHeaders();
        String apiBaseUrl = fVar.getApiBaseUrl();
        boolean isOtelExporterLoggingEnabled = fVar.isOtelExporterLoggingEnabled();
        kotlin.jvm.internal.i.e(extraHttpHeaders, "extraHttpHeaders");
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(apiBaseUrl, "apiBaseUrl");
        Logger logger2 = R4.n.f2127j;
        ArrayList arrayList = new ArrayList();
        C0387a c0387a = C0387a.f4248c;
        ArrayList arrayList2 = new ArrayList();
        Q4.f.getDefault();
        U4.e q6 = AbstractC0223a.q(extraHttpHeaders, appId, apiBaseUrl, isOtelExporterLoggingEnabled);
        String str = U4.c.f2617h;
        U4.d dVar = new U4.d(q6);
        dVar.f2626c = 100;
        dVar.f2627d = 100;
        ofSeconds = Duration.ofSeconds(30L);
        Objects.requireNonNull(ofSeconds, "timeout");
        nanos = ofSeconds.toNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        a4.d.a("timeout must be non-negative", nanos >= 0);
        dVar.f2628e = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
        ofSeconds2 = Duration.ofSeconds(1L);
        Objects.requireNonNull(ofSeconds2, "delay");
        nanos2 = ofSeconds2.toNanos();
        a4.d.a("delay must be non-negative", nanos2 >= 0);
        dVar.f2625b = timeUnit.toNanos(nanos2);
        arrayList.add(dVar.a());
        c0682l.f5990g = new R4.n(l7, new C4.d(11), arrayList, new Q4.i(arrayList2));
        return c0682l.h();
    }
}
