package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vq1<T> implements uq1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pi2<T> f33725a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ji2 f33726b;

    public /* synthetic */ vq1(pi2 pi2Var) {
        this(pi2Var, new ji2());
    }

    @Override // com.yandex.mobile.ads.impl.uq1
    @Nullable
    public final T a(@NotNull pq1 response) {
        Intrinsics.checkNotNullParameter(response, "networkResponse");
        this.f33726b.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        return this.f33725a.a(new lc1(response.c(), response.a().a(), response.b(), true));
    }

    public vq1(@NotNull pi2<T> responseBodyParser, @NotNull ji2 volleyMapper) {
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        this.f33725a = responseBodyParser;
        this.f33726b = volleyMapper;
    }
}
