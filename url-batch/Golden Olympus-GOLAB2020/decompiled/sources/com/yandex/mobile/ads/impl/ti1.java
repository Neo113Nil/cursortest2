package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ti1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1819b4 f32447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final on0 f32448b;

    public ti1(@NotNull C1819b4 playingAdInfo, @NotNull on0 playingVideoAd) {
        Intrinsics.checkNotNullParameter(playingAdInfo, "playingAdInfo");
        Intrinsics.checkNotNullParameter(playingVideoAd, "playingVideoAd");
        this.f32447a = playingAdInfo;
        this.f32448b = playingVideoAd;
    }

    @NotNull
    public final C1819b4 a() {
        return this.f32447a;
    }

    @NotNull
    public final on0 b() {
        return this.f32448b;
    }

    @NotNull
    public final C1819b4 c() {
        return this.f32447a;
    }

    @NotNull
    public final on0 d() {
        return this.f32448b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti1)) {
            return false;
        }
        ti1 ti1Var = (ti1) obj;
        return Intrinsics.areEqual(this.f32447a, ti1Var.f32447a) && Intrinsics.areEqual(this.f32448b, ti1Var.f32448b);
    }

    public final int hashCode() {
        return this.f32448b.hashCode() + (this.f32447a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f32447a + ", playingVideoAd=" + this.f32448b + ")";
    }
}
