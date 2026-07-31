package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.cn1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ok2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ea2 f30075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zm0 f30076b;

    public ok2(@NotNull ea2 vastUrlConfigurator, @NotNull zm0 instreamHostChecker) {
        Intrinsics.checkNotNullParameter(vastUrlConfigurator, "vastUrlConfigurator");
        Intrinsics.checkNotNullParameter(instreamHostChecker, "instreamHostChecker");
        this.f30075a = vastUrlConfigurator;
        this.f30076b = instreamHostChecker;
    }

    @NotNull
    public final ia2 a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull bb2 wrapperAd, @NotNull cd2 reportParametersProvider, @NotNull gk2 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String k4 = wrapperAd.k();
        if (k4 == null) {
            k4 = "";
        }
        Uri uri = Uri.parse(k4);
        this.f30076b.getClass();
        if (zm0.a(uri)) {
            ea2 ea2Var = this.f30075a;
            ea2Var.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
            k4 = cn1.a.a(uri, new da2(ea2Var, requestConfigurationParametersProvider, adConfiguration, context)).toString();
            Intrinsics.checkNotNullExpressionValue(k4, "toString(...)");
        }
        pk2 pk2Var = new pk2(reportParametersProvider);
        return new ia2(context, adConfiguration, k4, new oi2(requestListener), wrapperAd, pk2Var, new r92(context, adConfiguration.p().c()));
    }
}
