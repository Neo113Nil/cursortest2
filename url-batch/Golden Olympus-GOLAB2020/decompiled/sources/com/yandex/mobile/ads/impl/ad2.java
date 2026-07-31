package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ad2 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2360y7<?> f23240a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e01 f23241b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zc2 f23242c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private a f23243d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private b f23244e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private Map<String, ? extends Object> f23245f;

    public interface a {
        @NotNull
        Map<String, Object> a();
    }

    public interface b {
        @NotNull
        jp1 a();
    }

    public ad2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @Nullable C2360y7<?> c2360y7, @NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f23240a = c2360y7;
        adConfiguration.p().f();
        this.f23241b = C1900ed.a(context, zm2.f35627a, adConfiguration.p().b());
        this.f23242c = new zc2(adLoadingPhasesManager);
    }

    public final void a(@NotNull String failureReason, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("failure_reason", failureReason), TuplesKt.to("error_message", errorMessage)));
    }

    public final void b(@Nullable Map<String, ? extends Object> map) {
        this.f23245f = map;
    }

    private final void a(Map<String, Object> reportData) {
        Map<String, ? extends Object> map = this.f23245f;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        reportData.putAll(map);
        a aVar = this.f23243d;
        Map<String, Object> a4 = aVar != null ? aVar.a() : null;
        if (a4 == null) {
            a4 = MapsKt.emptyMap();
        }
        reportData.putAll(a4);
        b bVar = this.f23244e;
        Map<String, Object> b4 = bVar != null ? bVar.a().b() : null;
        if (b4 == null) {
            b4 = MapsKt.emptyMap();
        }
        reportData.putAll(b4);
        ip1.b reportType = ip1.b.f27327O;
        C2360y7<?> c2360y7 = this.f23240a;
        C1814b a5 = c2360y7 != null ? c2360y7.a() : null;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.f23241b.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), a5));
    }

    public final void a() {
        a(MapsKt.mutableMapOf(TuplesKt.to("status", "success"), TuplesKt.to("durations", this.f23242c.a())));
    }

    public final void a(@Nullable b bVar) {
        this.f23244e = bVar;
    }

    public final void a(@Nullable a aVar) {
        this.f23243d = aVar;
    }
}
