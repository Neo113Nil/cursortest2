package com.yandex.mobile.ads.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface f61 {
    @Nullable
    n61 a();

    void a(@Nullable dt dtVar);

    void a(@NotNull ft ftVar);

    void a(@Nullable com.yandex.mobile.ads.nativeads.c cVar);

    @NotNull
    a91 b();

    void b(@NotNull ft ftVar);

    void b(@NotNull z61 z61Var);

    void b(@NotNull z61 z61Var, @NotNull Cdo cdo);

    @Nullable
    List<q20> c();

    void destroy();

    @NotNull
    ct getAdAssets();

    @NotNull
    zq1 getAdType();

    @Nullable
    String getInfo();

    @Nullable
    kt getNativeAdVideoController();

    void loadImages();
}
