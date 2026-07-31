package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cp0 extends od0<cp0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull kc0 fullScreenAdVisibilityValidator, @NotNull yf0 htmlAdResponseReportManager, @NotNull rc0 fullScreenController) {
        super(context, adResponse, adConfiguration, fullScreenAdVisibilityValidator, fullScreenController, new C1867d4());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        htmlAdResponseReportManager.a((C2360y7<String>) adResponse);
        htmlAdResponseReportManager.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.od0
    public final cp0 o() {
        return this;
    }
}
