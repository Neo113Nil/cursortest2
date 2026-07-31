package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ve2 f33163a;

    public uk1(@NotNull ve2 videoPlayerController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        this.f33163a = videoPlayerController;
    }

    public final boolean a() {
        return this.f33163a.c() <= 0;
    }
}
