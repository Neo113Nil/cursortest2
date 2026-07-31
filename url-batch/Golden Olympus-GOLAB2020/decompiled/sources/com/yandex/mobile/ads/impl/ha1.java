package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ha1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f26682a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ka1 f26683b;

    public /* synthetic */ ha1(ga1 ga1Var) {
        this(ga1Var, new ka1(ga1Var));
    }

    public final void a(@NotNull me2 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f26683b.a(options.a());
        this.f26682a.a(options.c());
    }

    public ha1(@NotNull ga1 nativeVideoAdPlayer, @NotNull ka1 playerVolumeManager) {
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(playerVolumeManager, "playerVolumeManager");
        this.f26682a = nativeVideoAdPlayer;
        this.f26683b = playerVolumeManager;
    }
}
