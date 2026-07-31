package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1974hf extends yc0<C1926ff> {

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final im1 f26724E;

    /* renamed from: com.yandex.mobile.ads.impl.hf$a */
    public static final class a implements InterfaceC2034k4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC1987i4<C1974hf> f26725a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C1974hf f26726b;

        public a(@NotNull InterfaceC1987i4<C1974hf> itemsFinishListener, @NotNull C1974hf loadController) {
            Intrinsics.checkNotNullParameter(itemsFinishListener, "itemsFinishListener");
            Intrinsics.checkNotNullParameter(loadController, "loadController");
            this.f26725a = itemsFinishListener;
            this.f26726b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2034k4
        public final void a() {
            this.f26725a.a(this.f26726b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1974hf(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull InterfaceC1987i4 itemsLoadFinishListener, @NotNull C1918f7 adRequestData, @NotNull C2105n4 adLoadingPhasesManager, @NotNull yf0 htmlAdResponseReportManager, @NotNull C1950gf adContentControllerFactory, @NotNull C2286v2 adConfiguration, @NotNull im1 proxyAppOpenAdLoadListener) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyAppOpenAdLoadListener, adLoadingPhasesManager, adContentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(adContentControllerFactory, "adContentControllerFactory");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(proxyAppOpenAdLoadListener, "proxyAppOpenAdLoadListener");
        this.f26724E = proxyAppOpenAdLoadListener;
        adConfiguration.a(adRequestData);
        proxyAppOpenAdLoadListener.a(new a(itemsLoadFinishListener, this));
        proxyAppOpenAdLoadListener.a(htmlAdResponseReportManager);
        proxyAppOpenAdLoadListener.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    @NotNull
    protected final rc0<C1926ff> a(@NotNull sc0 controllerFactory) {
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        return controllerFactory.c(this);
    }

    public final void a(@Nullable js jsVar) {
        this.f26724E.a(jsVar);
    }
}
