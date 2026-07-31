package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l92 extends x52<w92, o92> {

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final r92 f28488C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull oi2 listener, @NotNull w92 configuration, @NotNull aa2 requestReporter, @NotNull r92 vastDataResponseParser) {
        super(context, adConfiguration, 0, url, listener, configuration, requestReporter, null, 1920);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requestReporter, "requestReporter");
        Intrinsics.checkNotNullParameter(vastDataResponseParser, "vastDataResponseParser");
        this.f28488C = vastDataResponseParser;
        ap0.e(url);
    }

    @Override // com.yandex.mobile.ads.impl.x52
    @NotNull
    public final qq1<o92> a(@NotNull lc1 networkResponse, int i4) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        o92 a4 = this.f28488C.a(networkResponse);
        if (a4 == null) {
            qq1<o92> a5 = qq1.a(new uf1("Can't parse VAST response."));
            Intrinsics.checkNotNullExpressionValue(a5, "error(...)");
            return a5;
        }
        if (a4.b().b().isEmpty()) {
            qq1<o92> a6 = qq1.a(new v40());
            Intrinsics.checkNotNull(a6);
            return a6;
        }
        qq1<o92> a7 = qq1.a(a4, null);
        Intrinsics.checkNotNull(a7);
        return a7;
    }
}
