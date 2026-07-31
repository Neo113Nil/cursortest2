package com.yandex.mobile.ads.impl;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mo0 implements pi2<gx> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ar1<String> f29194a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC0348a f29195b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ji2 f29196c;

    public mo0(@NotNull u22 stringResponseParser, @NotNull AbstractC0348a jsonParser, @NotNull ji2 responseMapper) {
        Intrinsics.checkNotNullParameter(stringResponseParser, "stringResponseParser");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(responseMapper, "responseMapper");
        this.f29194a = stringResponseParser;
        this.f29195b = jsonParser;
        this.f29196c = responseMapper;
    }

    @Override // com.yandex.mobile.ads.impl.pi2
    public final gx a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.f29196c.getClass();
        String a4 = this.f29194a.a(ji2.a(networkResponse));
        if (a4 == null || StringsKt.z(a4)) {
            return null;
        }
        AbstractC0348a abstractC0348a = this.f29195b;
        abstractC0348a.a();
        return (gx) abstractC0348a.c(gx.Companion.serializer(), a4);
    }
}
