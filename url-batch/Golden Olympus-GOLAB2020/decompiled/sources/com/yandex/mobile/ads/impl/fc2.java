package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jc2 f25751a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f25752b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc2(Context context, C2286v2 c2286v2, jc2 jc2Var) {
        this(context, c2286v2, jc2Var, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()));
        c2286v2.p().f();
    }

    public final void a() {
        ip1.b bVar = ip1.b.f27359r;
        jp1 a4 = this.f25751a.a();
        Map<String, Object> b4 = a4.b();
        this.f25752b.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    public final void b() {
        ip1.b bVar = ip1.b.f27358q;
        jp1 a4 = this.f25751a.a();
        Map<String, Object> b4 = a4.b();
        this.f25752b.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    public fc2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull jc2 reportParametersProvider, @NotNull mp1 metricaReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        this.f25751a = reportParametersProvider;
        this.f25752b = metricaReporter;
    }
}
