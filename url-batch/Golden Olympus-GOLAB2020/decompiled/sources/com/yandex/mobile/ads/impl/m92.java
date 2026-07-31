package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m92 implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2037k7 f28961a;

    public m92(@NotNull w92 configuration, @NotNull C2037k7 adRequestParametersProvider) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(adRequestParametersProvider, "adRequestParametersProvider");
        this.f28961a = adRequestParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    @NotNull
    public final Map<String, String> a() {
        String d4 = this.f28961a.d();
        String str = StringUtils.UNDEFINED;
        if (d4 == null || d4.length() == 0) {
            d4 = StringUtils.UNDEFINED;
        }
        Pair pair = TuplesKt.to("page_id", d4);
        String c4 = this.f28961a.c();
        if (c4 != null && c4.length() != 0) {
            str = c4;
        }
        return MapsKt.mapOf(pair, TuplesKt.to("imp_id", str), TuplesKt.to(AdRevenueScheme.AD_TYPE, gs.f26284h.b()));
    }
}
