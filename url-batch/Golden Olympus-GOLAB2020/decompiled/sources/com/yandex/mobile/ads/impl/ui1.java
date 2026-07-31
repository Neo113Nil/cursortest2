package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ui1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1843c4 f33140a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final on0 f33141b;

    public ui1(@NotNull C1843c4 playingAdInfo, @NotNull on0 playingVideoAd) {
        Intrinsics.checkNotNullParameter(playingAdInfo, "playingAdInfo");
        Intrinsics.checkNotNullParameter(playingVideoAd, "playingVideoAd");
        this.f33140a = playingAdInfo;
        this.f33141b = playingVideoAd;
    }

    @NotNull
    public final C1843c4 a() {
        return this.f33140a;
    }

    @NotNull
    public final on0 b() {
        return this.f33141b;
    }

    @NotNull
    public final C1843c4 c() {
        return this.f33140a;
    }

    @NotNull
    public final on0 d() {
        return this.f33141b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui1)) {
            return false;
        }
        ui1 ui1Var = (ui1) obj;
        return Intrinsics.areEqual(this.f33140a, ui1Var.f33140a) && Intrinsics.areEqual(this.f33141b, ui1Var.f33141b);
    }

    public final int hashCode() {
        return this.f33141b.hashCode() + (this.f33140a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f33140a + ", playingVideoAd=" + this.f33141b + ")";
    }
}
