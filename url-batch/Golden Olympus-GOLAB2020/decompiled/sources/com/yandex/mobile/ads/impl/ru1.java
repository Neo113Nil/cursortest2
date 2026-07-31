package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ru1 implements br1<du1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ar1<du1> f31369a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ji2 f31370b;

    public /* synthetic */ ru1(mp1 mp1Var) {
        this(mp1Var, jc1.a(mp1Var), new ji2());
    }

    @Override // com.yandex.mobile.ads.impl.br1
    public final du1 a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.f31370b.getClass();
        return this.f31369a.a(ji2.a(networkResponse));
    }

    public ru1(@NotNull mp1 reporter, @NotNull ar1<du1> sdkConfigurationResponseParser, @NotNull ji2 volleyMapper) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        this.f31369a = sdkConfigurationResponseParser;
        this.f31370b = volleyMapper;
    }
}
