package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.C1918f7;
import com.yandex.mobile.ads.impl.gq1;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.l61;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hq1 f35903a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l61 f35904b;

    public f(@NotNull hq1 requestedAdThemeFactory, @NotNull l61 adRequestReadyResponseProvider) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        Intrinsics.checkNotNullParameter(adRequestReadyResponseProvider, "adRequestReadyResponseProvider");
        this.f35903a = requestedAdThemeFactory;
        this.f35904b = adRequestReadyResponseProvider;
    }

    @NotNull
    public final C1918f7 a(@NotNull NativeAdRequestConfiguration adRequestConfiguration) {
        gq1 gq1Var;
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "nativeAdConfiguration");
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f35903a.getClass();
            gq1Var = hq1.a(preferredTheme);
        } else {
            gq1Var = null;
        }
        this.f35904b.getClass();
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        return new C1918f7.a(adRequestConfiguration.getAdUnitId()).a(adRequestConfiguration.getAge()).d(adRequestConfiguration.getBiddingData()).c(adRequestConfiguration.getGender()).b(adRequestConfiguration.getContextQuery()).a(adRequestConfiguration.getContextTags()).a(adRequestConfiguration.getLocation()).a(adRequestConfiguration.getParameters()).a(gq1Var).a(adRequestConfiguration.getShouldLoadImagesAutomatically()).b().a();
    }

    public /* synthetic */ f() {
        this(new hq1(), new l61());
    }
}
