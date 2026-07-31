package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class li2 implements ki2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ji2 f28603a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nc1 f28604b;

    public li2(@NotNull ji2 volleyMapper, @NotNull nc1 networkResponseDecoder) {
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        Intrinsics.checkNotNullParameter(networkResponseDecoder, "networkResponseDecoder");
        this.f28603a = volleyMapper;
        this.f28604b = networkResponseDecoder;
    }

    @Override // com.yandex.mobile.ads.impl.ki2
    @Nullable
    public final String a(@NotNull lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.f28603a.getClass();
        return this.f28604b.a(ji2.a(networkResponse));
    }
}
