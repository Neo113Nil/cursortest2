package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o32 f26297a;

    public /* synthetic */ gu1() {
        this(new o32());
    }

    public final boolean a(@NotNull du1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f26297a.getClass();
        return System.currentTimeMillis() >= sdkConfiguration.v();
    }

    public gu1(@NotNull o32 systemCurrentTimeProvider) {
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        this.f26297a = systemCurrentTimeProvider;
    }
}
