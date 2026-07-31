package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lv1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f28785a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28786b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o32 f28787c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wy0 f28788d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ug1 f28789e;

    public /* synthetic */ lv1(mp1 mp1Var, boolean z4, C2105n4 c2105n4) {
        this(mp1Var, z4, c2105n4, new o32(), new wy0(), new kv1(c2105n4));
    }

    public final void a(@NotNull C1866d3 adRequestError, @NotNull ok0 initializationCallSource, @Nullable xq xqVar) {
        Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
        Intrinsics.checkNotNullParameter(initializationCallSource, "initializationCallSource");
        mp1 mp1Var = this.f28785a;
        ip1.b reportType = ip1.b.f27337Y;
        Map reportData = MapsKt.mapOf(TuplesKt.to("failure_reason", adRequestError.c()), TuplesKt.to("call_source", initializationCallSource.a()), TuplesKt.to("configuration_source", xqVar != null ? xqVar.a() : null), TuplesKt.to("durations", this.f28789e.a()));
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        mp1Var.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null));
    }

    public lv1(@NotNull mp1 reporter, boolean z4, @NotNull C2105n4 adLoadingPhasesManager, @NotNull o32 systemCurrentTimeProvider, @NotNull wy0 integratedNetworksProvider, @NotNull ug1 phasesParametersProvider) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        Intrinsics.checkNotNullParameter(integratedNetworksProvider, "integratedNetworksProvider");
        Intrinsics.checkNotNullParameter(phasesParametersProvider, "phasesParametersProvider");
        this.f28785a = reporter;
        this.f28786b = z4;
        this.f28787c = systemCurrentTimeProvider;
        this.f28788d = integratedNetworksProvider;
        this.f28789e = phasesParametersProvider;
    }

    public final void a(@NotNull du1 sdkConfiguration, @NotNull ok0 initializationCallSource, @Nullable xq xqVar) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(initializationCallSource, "initializationCallSource");
        mp1 mp1Var = this.f28785a;
        ip1.b reportType = ip1.b.f27336X;
        this.f28787c.getClass();
        Map reportData = MapsKt.mapOf(TuplesKt.to("creation_date", Long.valueOf(System.currentTimeMillis())), TuplesKt.to("startup_version", sdkConfiguration.R()), TuplesKt.to("user_consent", sdkConfiguration.B0()), TuplesKt.to("integrated_mediation", this.f28788d.a(this.f28786b)), TuplesKt.to("call_source", initializationCallSource.a()), TuplesKt.to("configuration_source", xqVar != null ? xqVar.a() : null), TuplesKt.to("durations", this.f28789e.a()));
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        mp1Var.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null));
    }
}
