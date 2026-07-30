package E3;

import R5.q;
import a.AbstractC0169a;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import x5.C1020j;
import x5.InterfaceC1017g;

/* loaded from: classes.dex */
public final class m extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public final f f690e;

    /* renamed from: f, reason: collision with root package name */
    public final q f691f;

    /* renamed from: g, reason: collision with root package name */
    public final q f692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f platformProvider, B.f osTopLevelFields, l2.c osPerEventFields) {
        super(osTopLevelFields, osPerEventFields);
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(osTopLevelFields, "osTopLevelFields");
        Intrinsics.checkNotNullParameter(osPerEventFields, "osPerEventFields");
        this.f690e = platformProvider;
        this.f691f = R5.i.b(new l(this, 0));
        this.f692g = R5.i.b(new l(this, 1));
    }

    @Override // E3.j
    public final u5.d d(Map attributes) {
        Duration ofSeconds;
        long nanos;
        Duration ofSeconds2;
        long nanos2;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Logger logger = u5.d.f8074n;
        P0.e eVar = new P0.e(13, false);
        eVar.f2194e = O4.a.f1921b;
        M5.a resource = AbstractC0169a.g(attributes);
        Map extraHttpHeaders = (Map) this.f691f.getValue();
        f fVar = this.f690e;
        String appId = fVar.getAppIdForHeaders();
        String apiBaseUrl = fVar.getApiBaseUrl();
        boolean isOtelExporterLoggingEnabled = fVar.isOtelExporterLoggingEnabled();
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(extraHttpHeaders, "extraHttpHeaders");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Logger logger2 = y5.m.f8696m;
        ArrayList arrayList = new ArrayList();
        M5.a aVar = M5.a.f1769c;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC1017g.getDefault();
        B5.f logRecordExporter = V6.b.l(extraHttpHeaders, appId, apiBaseUrl, isOtelExporterLoggingEnabled);
        Intrinsics.checkNotNullParameter(logRecordExporter, "logRecordExporter");
        String str = B5.d.f200i;
        B5.e eVar2 = new B5.e(logRecordExporter);
        eVar2.f209c = 100;
        eVar2.f210d = 100;
        ofSeconds = Duration.ofSeconds(30L);
        Objects.requireNonNull(ofSeconds, "timeout");
        nanos = ofSeconds.toNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        H4.d.a("timeout must be non-negative", nanos >= 0);
        eVar2.f211e = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
        ofSeconds2 = Duration.ofSeconds(1L);
        Objects.requireNonNull(ofSeconds2, "delay");
        nanos2 = ofSeconds2.toNanos();
        H4.d.a("delay must be non-negative", nanos2 >= 0);
        eVar2.f208b = timeUnit.toNanos(nanos2);
        B5.d a7 = eVar2.a();
        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
        arrayList.add(a7);
        y5.m mVar = new y5.m(resource, new G3.a(0), arrayList, new C1020j(arrayList2));
        Intrinsics.checkNotNullExpressionValue(mVar, "build(...)");
        eVar.f2195i = mVar;
        u5.d m2 = eVar.m();
        Intrinsics.checkNotNullExpressionValue(m2, "build(...)");
        return m2;
    }
}
