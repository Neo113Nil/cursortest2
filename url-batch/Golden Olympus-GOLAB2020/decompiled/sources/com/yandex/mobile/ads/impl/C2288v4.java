package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2288v4 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private AdsLoader.EventListener f33494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private AdPlaybackState f33495b;

    public C2288v4(@Nullable AdsLoader.EventListener eventListener) {
        this.f33494a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f33495b = NONE;
    }

    @NotNull
    public final AdPlaybackState a() {
        return this.f33495b;
    }

    public final void b() {
        this.f33494a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f33495b = NONE;
    }

    public final void a(@Nullable AdsLoader.EventListener eventListener) {
        this.f33494a = eventListener;
    }

    public final void a(@NotNull AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        this.f33495b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f33494a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
