package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o01 f29322a;

    public n01(@NotNull o01 mobileAdsExecutorProvider) {
        Intrinsics.checkNotNullParameter(mobileAdsExecutorProvider, "mobileAdsExecutorProvider");
        this.f29322a = mobileAdsExecutorProvider;
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29322a.a().execute(runnable);
    }

    public final void b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29322a.b().execute(runnable);
    }
}
