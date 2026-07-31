package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lo0 implements bq1<gx> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pi2<gx> f28689a;

    public lo0(@NotNull pi2<gx> responseParser) {
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f28689a = responseParser;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final gx a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f28689a.a(networkResponse);
    }
}
