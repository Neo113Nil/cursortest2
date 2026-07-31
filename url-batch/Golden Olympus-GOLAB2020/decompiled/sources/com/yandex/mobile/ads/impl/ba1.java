package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ba1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2134oa f23645a;

    public ba1(@NotNull C2134oa adaptiveValidationRulesProvider) {
        Intrinsics.checkNotNullParameter(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        this.f23645a = adaptiveValidationRulesProvider;
    }

    @NotNull
    public final aa1 a(@NotNull Context context, @NotNull gs adType, @NotNull o71 assetsValidator, @NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(assetsValidator, "assetsValidator");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Set<? extends String> a4 = this.f23645a.a(context, adType);
        return a4 != null ? new C2040ka(context, assetsValidator, a4) : new u61(context, assetsValidator, adResponse);
    }

    @NotNull
    public final aa1 a(@NotNull Context context, @NotNull gs adType, @NotNull x71 nativeCompositeAd, @NotNull o71 assetsValidator, @NotNull ew1 sdkSettings, @NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(nativeCompositeAd, "nativeCompositeAd");
        Intrinsics.checkNotNullParameter(assetsValidator, "assetsValidator");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Set<? extends String> a4 = this.f23645a.a(context, adType);
        if (a4 != null) {
            return new C2064la(context, nativeCompositeAd, assetsValidator, a4, sdkSettings, 0);
        }
        return new qz1(context, nativeCompositeAd, assetsValidator, sdkSettings, adResponse);
    }
}
