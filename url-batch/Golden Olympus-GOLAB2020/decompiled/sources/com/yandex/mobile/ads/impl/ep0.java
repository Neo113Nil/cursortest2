package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ep0 extends yc0<cp0> {

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final km1 f25379E;

    public static final class a implements InterfaceC2034k4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC1987i4<ep0> f25380a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ep0 f25381b;

        public a(@NotNull InterfaceC1987i4<ep0> itemsFinishListener, @NotNull ep0 loadController) {
            Intrinsics.checkNotNullParameter(itemsFinishListener, "itemsFinishListener");
            Intrinsics.checkNotNullParameter(loadController, "loadController");
            this.f25380a = itemsFinishListener;
            this.f25381b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2034k4
        public final void a() {
            this.f25380a.a(this.f25381b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull InterfaceC1987i4 itemsLoadFinishListener, @NotNull C1918f7 adRequestData, @NotNull C2105n4 adLoadingPhasesManager, @NotNull yf0 htmlAdResponseReportManager, @NotNull dp0 contentControllerFactory, @NotNull jp0 adApiControllerFactory, @NotNull C2286v2 adConfiguration, @NotNull km1 proxyInterstitialAdLoadListener) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyInterstitialAdLoadListener, adLoadingPhasesManager, contentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(contentControllerFactory, "contentControllerFactory");
        Intrinsics.checkNotNullParameter(adApiControllerFactory, "adApiControllerFactory");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(proxyInterstitialAdLoadListener, "proxyInterstitialAdLoadListener");
        this.f25379E = proxyInterstitialAdLoadListener;
        adConfiguration.a(adRequestData);
        proxyInterstitialAdLoadListener.a(new a(itemsLoadFinishListener, this));
        proxyInterstitialAdLoadListener.a(adConfiguration);
        proxyInterstitialAdLoadListener.a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    @NotNull
    protected final rc0<cp0> a(@NotNull sc0 controllerFactory) {
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        return controllerFactory.a(this);
    }

    public final void a(@Nullable at atVar) {
        this.f25379E.a(atVar);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void a(@Nullable String str) {
        super.a(str);
        this.f25379E.a(str);
    }
}
