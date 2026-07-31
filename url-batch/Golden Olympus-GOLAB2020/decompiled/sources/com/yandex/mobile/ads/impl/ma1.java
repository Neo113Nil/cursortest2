package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ma1 implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f28966a;

    public ma1(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f28966a = adConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    @NotNull
    public final Map<String, String> a() {
        String c4 = this.f28966a.c();
        if (c4 == null || StringsKt.z(c4)) {
            c4 = StringUtils.UNDEFINED;
        }
        return MapsKt.mapOf(TuplesKt.to("block_id", c4), TuplesKt.to(AdRevenueScheme.AD_TYPE, this.f28966a.b().b()));
    }
}
