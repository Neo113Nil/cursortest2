package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.cn1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ea2 f34940a;

    public y92(@NotNull ea2 vastUrlConfigurator) {
        Intrinsics.checkNotNullParameter(vastUrlConfigurator, "vastUrlConfigurator");
        this.f34940a = vastUrlConfigurator;
    }

    @NotNull
    public final l92 a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull w92 requestConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull Object requestTag, @NotNull p92 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        C2037k7 c2037k7 = new C2037k7(requestConfiguration.a());
        aa2 aa2Var = new aa2(c2037k7);
        Uri uri = Uri.parse(c2037k7.a().a());
        ea2 ea2Var = this.f34940a;
        ea2Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        String uri2 = cn1.a.a(uri, new da2(ea2Var, requestConfigurationParametersProvider, adConfiguration, context)).toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        l92 l92Var = new l92(context, adConfiguration, uri2, new oi2(requestListener), requestConfiguration, aa2Var, new r92(context, adConfiguration.p().c()));
        l92Var.b(requestTag);
        return l92Var;
    }
}
