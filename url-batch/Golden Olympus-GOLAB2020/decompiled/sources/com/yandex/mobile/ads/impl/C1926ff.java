package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1926ff extends od0<C1926ff> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1926ff(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull kc0 adVisibilityValidator, @NotNull yf0 htmlAdResponseReportManager, @NotNull rc0 fullScreenController) {
        super(context, adResponse, adConfiguration, adVisibilityValidator, fullScreenController, new C1867d4());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Intrinsics.checkNotNullParameter(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        htmlAdResponseReportManager.a((C2360y7<String>) adResponse);
        htmlAdResponseReportManager.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.od0
    public final C1926ff o() {
        return this;
    }
}
