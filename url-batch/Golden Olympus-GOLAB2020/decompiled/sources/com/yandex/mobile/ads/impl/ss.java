package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ss {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f31928a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<ob2<on0>> f31929b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<on0> f31930c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f31931d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2308w1 f31932e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ts f31933f;

    /* renamed from: g, reason: collision with root package name */
    private final long f31934g;

    public ss(@NotNull vu1 sdkEnvironmentModule, @NotNull ArrayList videoAdInfoList, @NotNull ArrayList videoAds, @NotNull String type, @NotNull C2308w1 adBreak, @NotNull ts adBreakPosition, long j4) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdInfoList, "videoAdInfoList");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        this.f31928a = sdkEnvironmentModule;
        this.f31929b = videoAdInfoList;
        this.f31930c = videoAds;
        this.f31931d = type;
        this.f31932e = adBreak;
        this.f31933f = adBreakPosition;
        this.f31934g = j4;
    }

    public final void a(@Nullable pz pzVar) {
    }

    @NotNull
    public final ts b() {
        return this.f31933f;
    }

    @Nullable
    public final pz c() {
        return null;
    }

    @NotNull
    public final vu1 d() {
        return this.f31928a;
    }

    @NotNull
    public final String e() {
        return this.f31931d;
    }

    @NotNull
    public final List<ob2<on0>> f() {
        return this.f31929b;
    }

    @NotNull
    public final List<on0> g() {
        return this.f31930c;
    }

    @NotNull
    public final String toString() {
        return "ad_break_#" + this.f31934g;
    }

    @NotNull
    public final C2308w1 a() {
        return this.f31932e;
    }
}
