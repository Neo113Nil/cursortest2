package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mi2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ji2 f29120a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pc1<T> f29121b;

    public mi2(@NotNull C2286v2 adConfiguration, @NotNull pi2<T> volleyResponseBodyParser, @NotNull uq1<T> responseBodyParser, @NotNull ji2 volleyMapper, @NotNull pc1<T> responseParser) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(volleyResponseBodyParser, "volleyResponseBodyParser");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f29120a = volleyMapper;
        this.f29121b = responseParser;
    }

    @NotNull
    public final C2360y7<T> a(@NotNull lc1 networkResponse, @NotNull Map<String, String> headers, @NotNull gs responseAdType) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(responseAdType, "responseAdType");
        this.f29120a.getClass();
        return this.f29121b.a(ji2.a(networkResponse), headers, responseAdType);
    }
}
