package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ur1 extends od0<ur1> {

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final om1 f33236t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final rt1 f33237u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    private final gs1 f33238v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(@NotNull Context context, @NotNull C2360y7<String> adResponse, @NotNull C2286v2 adConfiguration, @NotNull rc0<ur1> fullScreenController, @NotNull om1 proxyRewardedListener, @NotNull hs1 rewardedExecutorProvider, @NotNull yf0 htmlAdResponseReportManager, @NotNull kc0 fullScreenAdVisibilityValidator, @NotNull rt1 sdkAdapterReporter) {
        super(context, adResponse, adConfiguration, fullScreenAdVisibilityValidator, fullScreenController, new C1867d4());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Intrinsics.checkNotNullParameter(proxyRewardedListener, "proxyRewardedListener");
        Intrinsics.checkNotNullParameter(rewardedExecutorProvider, "rewardedExecutorProvider");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        Intrinsics.checkNotNullParameter(sdkAdapterReporter, "sdkAdapterReporter");
        this.f33236t = proxyRewardedListener;
        this.f33237u = sdkAdapterReporter;
        this.f33238v = rewardedExecutorProvider.a(context, adResponse, adConfiguration);
        htmlAdResponseReportManager.a(adResponse);
        htmlAdResponseReportManager.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.od0, com.yandex.mobile.ads.impl.w52, com.yandex.mobile.ads.impl.InterfaceC2332x2
    public final void a(int i4, @Nullable Bundle bundle) {
        if (i4 == 13) {
            r();
        } else {
            super.a(i4, bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.od0
    public final ur1 o() {
        return this;
    }

    public final void r() {
        this.f33237u.b(e(), d());
        gs1 gs1Var = this.f33238v;
        if (gs1Var != null) {
            gs1Var.a();
        }
    }

    public final void a(@NotNull nm1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a((cd0) listener);
        this.f33236t.a(listener);
    }
}
