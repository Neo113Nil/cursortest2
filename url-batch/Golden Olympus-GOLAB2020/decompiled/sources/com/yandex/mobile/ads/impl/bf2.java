package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f23735a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jc2 f23736b;

    public bf2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull mp1 metricaReporter, @NotNull jc2 reportParametersProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        this.f23735a = metricaReporter;
        this.f23736b = reportParametersProvider;
    }

    public final void a(@Nullable String str) {
        jp1 a4 = this.f23736b.a();
        a4.b(str, "error_message");
        ip1.b bVar = ip1.b.f27360s;
        Map<String, Object> b4 = a4.b();
        this.f23735a.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }
}
