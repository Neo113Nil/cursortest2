package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30714a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f30715b;

    public q92(@NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f30714a = adConfiguration;
        this.f30715b = adLoadingPhasesManager;
    }

    @NotNull
    public final p92 a(@NotNull Context context, @NotNull w92 configuration, @NotNull x92 requestConfigurationParametersProvider, @NotNull xp1<o92> requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        m92 m92Var = new m92(configuration, new C2037k7(configuration.a()));
        C2286v2 c2286v2 = this.f30714a;
        return new p92(context, c2286v2, configuration, requestConfigurationParametersProvider, this.f30715b, m92Var, requestListener, new nd2(context, c2286v2, m92Var, requestConfigurationParametersProvider));
    }
}
