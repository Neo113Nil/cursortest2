package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1818b3 extends AbstractC1978hj<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818b3(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull String url, @NotNull String query, @NotNull AbstractC2025jj requestListener, @NotNull AbstractC2025jj listener, @NotNull hx1 sessionStorage, @NotNull qc1 networkResponseParserCreator, @NotNull C2108n7 adRequestReporter) {
        super(context, adConfiguration, url, query, networkResponseParserCreator, requestListener, listener, adRequestReporter, sessionStorage, 1536);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(sessionStorage, "sessionStorage");
        Intrinsics.checkNotNullParameter(networkResponseParserCreator, "networkResponseParserCreator");
        Intrinsics.checkNotNullParameter(adRequestReporter, "adRequestReporter");
    }
}
