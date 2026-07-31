package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fn0 implements gc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ts f25868a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25869b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25870c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25871d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f25872e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Integer f25873f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f25874g;

    public fn0(@NotNull ts adBreakPosition, @NotNull String url, int i4, int i5, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f25868a = adBreakPosition;
        this.f25869b = url;
        this.f25870c = i4;
        this.f25871d = i5;
        this.f25872e = str;
        this.f25873f = num;
        this.f25874g = str2;
    }

    @NotNull
    public final ts a() {
        return this.f25868a;
    }

    public final int getAdHeight() {
        return this.f25871d;
    }

    public final int getAdWidth() {
        return this.f25870c;
    }

    @Nullable
    public final String getApiFramework() {
        return this.f25874g;
    }

    @Nullable
    public final Integer getBitrate() {
        return this.f25873f;
    }

    @Nullable
    public final String getMediaType() {
        return this.f25872e;
    }

    @Override // com.yandex.mobile.ads.impl.gc2
    @NotNull
    public final String getUrl() {
        return this.f25869b;
    }
}
