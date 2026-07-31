package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o61 implements pi2<n61> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bq1<n61> f29916a;

    public o61(@NotNull bq1<n61> requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f29916a = requestPolicy;
    }

    @Override // com.yandex.mobile.ads.impl.pi2
    public final n61 a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f29916a.a(networkResponse);
    }
}
