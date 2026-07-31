package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class po implements np1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30505a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30506b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final o41 f30507c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f30508d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final jq f30509e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2388zc f30510f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po(Context context, C2360y7 c2360y7, C2286v2 c2286v2, o41 o41Var) {
        this(context, c2360y7, c2286v2, o41Var, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()), new jq(), new C2388zc(context));
        c2286v2.p().f();
    }

    private final ip1 a(ip1.b bVar, HashMap hashMap) {
        jp1 jp1Var = new jp1(hashMap, 2);
        jp1Var.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        jp1 a4 = kp1.a(jp1Var, this.f30509e.a(this.f30505a, this.f30506b));
        vy1 q4 = this.f30506b.q();
        if (q4 != null) {
            a4.b(q4.a().a(), "size_type");
            a4.b(Integer.valueOf(q4.getWidth()), "width");
            a4.b(Integer.valueOf(q4.getHeight()), "height");
        }
        o41 o41Var = this.f30507c;
        if (o41Var != null) {
            a4.a((Map<String, ? extends Object>) o41Var.a());
        }
        Map<String, Object> b4 = a4.b();
        return new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData"));
    }

    public po(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @Nullable o41 o41Var, @NotNull mp1 metricaReporter, @NotNull jq commonReportDataProvider, @NotNull C2388zc metricaLibraryEventReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        Intrinsics.checkNotNullParameter(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        this.f30505a = adResponse;
        this.f30506b = adConfiguration;
        this.f30507c = o41Var;
        this.f30508d = metricaReporter;
        this.f30509e = commonReportDataProvider;
        this.f30510f = metricaLibraryEventReporter;
    }

    @Override // com.yandex.mobile.ads.impl.np1
    public final void a(@NotNull ip1.b reportType) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        this.f30508d.a(a(reportType, new HashMap()));
    }

    @Override // com.yandex.mobile.ads.impl.np1
    public final void a(@NotNull HashMap reportData) {
        ip1.b reportType = ip1.b.f27315C;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        ip1 a4 = a(reportType, reportData);
        this.f30508d.a(a4);
        this.f30510f.a(reportType, a4.b(), ip1.a.f27312a, null);
    }
}
