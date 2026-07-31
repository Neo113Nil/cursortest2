package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1939g4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25997a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25998b = new LinkedHashMap();

    @Nullable
    public final C1819b4 a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return (C1819b4) this.f25997a.get(videoAd);
    }

    @Nullable
    public final on0 a(@NotNull C1819b4 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        return (on0) this.f25998b.get(adInfo);
    }

    public final void a(@NotNull C1819b4 adInfo, @NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f25997a.put(videoAd, adInfo);
        this.f25998b.put(adInfo, videoAd);
    }
}
