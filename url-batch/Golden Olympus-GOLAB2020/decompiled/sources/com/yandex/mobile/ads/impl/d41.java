package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2134oa f24415a;

    public d41(@NotNull C2134oa adaptiveValidationRulesProvider) {
        Intrinsics.checkNotNullParameter(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        this.f24415a = adaptiveValidationRulesProvider;
    }

    @NotNull
    public final o71 a(@NotNull Context context, @NotNull gs adType, @NotNull List<? extends C2276uf<?>> assets, @NotNull l71 nativeAdsConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        Set<? extends String> a4 = this.f24415a.a(context, adType);
        return a4 != null ? new C2016ja(assets, nativeAdsConfiguration, a4, 0) : new c41(assets, nativeAdsConfiguration);
    }
}
