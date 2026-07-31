package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1963h4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26544a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26545b = new LinkedHashMap();

    @Nullable
    public final C1843c4 a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return (C1843c4) this.f26544a.get(videoAd);
    }

    @Nullable
    public final on0 a(@NotNull C1843c4 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        return (on0) this.f26545b.get(adInfo);
    }

    public final void a(@NotNull C1843c4 adInfo, @NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f26544a.put(videoAd, adInfo);
        this.f26545b.put(adInfo, videoAd);
    }
}
