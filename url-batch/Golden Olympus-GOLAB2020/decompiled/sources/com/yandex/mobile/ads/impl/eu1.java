package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fu1 f25464a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ju1 f25465b;

    public eu1(@NotNull C2275ue appMetricaPolicyConfigurator, @NotNull fu1 sdkConfigurationChangeListener, @NotNull ju1 sdkConfigurationProvider) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        Intrinsics.checkNotNullParameter(sdkConfigurationChangeListener, "sdkConfigurationChangeListener");
        Intrinsics.checkNotNullParameter(sdkConfigurationProvider, "sdkConfigurationProvider");
        this.f25464a = sdkConfigurationChangeListener;
        this.f25465b = sdkConfigurationProvider;
    }

    public final void a() {
        this.f25465b.a(this.f25464a);
    }
}
