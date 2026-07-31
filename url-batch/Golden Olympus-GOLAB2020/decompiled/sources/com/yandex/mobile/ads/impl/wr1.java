package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wr1 extends yc0<ur1> {

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final mm1 f34171E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final qr1 f34172F;

    public static final class a implements InterfaceC2034k4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC1987i4<wr1> f34173a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final wr1 f34174b;

        public a(@NotNull InterfaceC1987i4<wr1> itemsFinishListener, @NotNull wr1 loadController) {
            Intrinsics.checkNotNullParameter(itemsFinishListener, "itemsFinishListener");
            Intrinsics.checkNotNullParameter(loadController, "loadController");
            this.f34173a = itemsFinishListener;
            this.f34174b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2034k4
        public final void a() {
            this.f34173a.a(this.f34174b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull InterfaceC1987i4 itemsLoadFinishListener, @NotNull C1918f7 adRequestData, @NotNull C2105n4 adLoadingPhasesManager, @NotNull yf0 htmlAdResponseReportManager, @NotNull vr1 contentControllerFactory, @NotNull bs1 adApiControllerFactory, @NotNull C2286v2 adConfiguration, @NotNull mm1 proxyRewardedAdLoadListener, @NotNull qr1 rewardDataValidator) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyRewardedAdLoadListener, adLoadingPhasesManager, contentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(contentControllerFactory, "contentControllerFactory");
        Intrinsics.checkNotNullParameter(adApiControllerFactory, "adApiControllerFactory");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(proxyRewardedAdLoadListener, "proxyRewardedAdLoadListener");
        Intrinsics.checkNotNullParameter(rewardDataValidator, "rewardDataValidator");
        this.f34171E = proxyRewardedAdLoadListener;
        this.f34172F = rewardDataValidator;
        adConfiguration.a(adRequestData);
        proxyRewardedAdLoadListener.a(new a(itemsLoadFinishListener, this));
        proxyRewardedAdLoadListener.a(adConfiguration);
        proxyRewardedAdLoadListener.a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    @NotNull
    protected final rc0<ur1> a(@NotNull sc0 controllerFactory) {
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        return controllerFactory.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.yc0, com.yandex.mobile.ads.impl.AbstractC2025jj, com.yandex.mobile.ads.impl.qq1.b
    public final void a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        nr1 J3 = adResponse.J();
        this.f34172F.getClass();
        if (J3 != null && (!J3.e() ? J3.c() != null : J3.d() != null)) {
            super.a(adResponse);
        } else {
            b(C1942g7.k());
        }
    }

    public final void a(@Nullable ut utVar) {
        this.f34171E.a(utVar);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void a(@Nullable String str) {
        super.a(str);
        this.f34171E.a(str);
    }
}
