package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class if2 implements vl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f27194a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mj1 f27195b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ee2 f27196c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ni1 f27197d;

    public if2(@NotNull C1824b9 adStateHolder, @NotNull li1 playerStateController, @NotNull mj1 positionProviderHolder, @NotNull ee2 videoDurationHolder, @NotNull ni1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f27194a = adStateHolder;
        this.f27195b = positionProviderHolder;
        this.f27196c = videoDurationHolder;
        this.f27197d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    @NotNull
    public final uh1 a() {
        kj1 a4 = this.f27195b.a();
        hi1 b4 = this.f27195b.b();
        return new uh1(a4 != null ? a4.a() : (b4 == null || this.f27194a.b() || this.f27197d.c()) ? -1L : b4.a(), this.f27196c.a() != -9223372036854775807L ? this.f27196c.a() : -1L);
    }
}
