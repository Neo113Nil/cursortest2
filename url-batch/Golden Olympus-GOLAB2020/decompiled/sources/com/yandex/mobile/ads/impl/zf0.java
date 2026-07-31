package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zf0 implements pi2<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ki2 f35581a;

    public /* synthetic */ zf0() {
        this(kc1.a());
    }

    @Override // com.yandex.mobile.ads.impl.pi2
    public final String a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f35581a.a(networkResponse);
    }

    public zf0(@NotNull ki2 volleyNetworkResponseDecoder) {
        Intrinsics.checkNotNullParameter(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        this.f35581a = volleyNetworkResponseDecoder;
    }
}
