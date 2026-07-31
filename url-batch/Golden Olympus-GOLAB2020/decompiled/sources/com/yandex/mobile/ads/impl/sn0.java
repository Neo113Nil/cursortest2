package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f31880a = new LinkedHashMap();

    @Nullable
    public final tm0 a(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return (tm0) this.f31880a.get(videoAdInfo);
    }

    public final void a(@NotNull ob2<on0> videoAdInfo, @NotNull tm0 controlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        this.f31880a.put(videoAdInfo, controlsState);
    }
}
