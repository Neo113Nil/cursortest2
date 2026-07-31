package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hf2 implements ul1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f26733a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lj1 f26734b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final de2 f26735c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mi1 f26736d;

    public hf2(@NotNull C1800a9 adStateHolder, @NotNull ki1 playerStateController, @NotNull lj1 positionProviderHolder, @NotNull de2 videoDurationHolder, @NotNull mi1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f26733a = adStateHolder;
        this.f26734b = positionProviderHolder;
        this.f26735c = videoDurationHolder;
        this.f26736d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    @NotNull
    public final vh1 a() {
        jj1 a4 = this.f26734b.a();
        gi1 b4 = this.f26734b.b();
        return new vh1(a4 != null ? a4.a() : (b4 == null || this.f26733a.b() || this.f26736d.c()) ? -1L : b4.a(), this.f26735c.a() != -9223372036854775807L ? this.f26735c.a() : -1L);
    }
}
