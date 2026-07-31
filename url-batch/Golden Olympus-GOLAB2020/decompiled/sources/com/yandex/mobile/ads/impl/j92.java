package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<bb2> f27599b;

    public j92(@NotNull String version, @NotNull List<bb2> videoAds) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        this.f27598a = version;
        this.f27599b = videoAds;
    }

    @NotNull
    public final String a() {
        return this.f27598a;
    }

    @NotNull
    public final List<bb2> b() {
        return this.f27599b;
    }
}
