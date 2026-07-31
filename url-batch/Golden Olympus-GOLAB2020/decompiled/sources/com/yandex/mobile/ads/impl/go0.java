package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class go0 implements eq1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final di2 f26247a;

    public go0(@NotNull di2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f26247a = requestConfig;
    }

    @Override // com.yandex.mobile.ads.impl.eq1
    @NotNull
    public final Map<String, Object> a() {
        return MapsKt.mapOf(TuplesKt.to(AdRevenueScheme.AD_TYPE, gs.f26284h.b()), TuplesKt.to("page_id", this.f26247a.a()), TuplesKt.to("category_id", this.f26247a.b()));
    }
}
