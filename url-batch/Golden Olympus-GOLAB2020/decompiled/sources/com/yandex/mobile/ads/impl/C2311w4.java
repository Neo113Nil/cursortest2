package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2311w4 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private AdsLoader.EventListener f33915a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private AdPlaybackState f33916b;

    public C2311w4(@Nullable AdsLoader.EventListener eventListener) {
        this.f33915a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f33916b = NONE;
    }

    @NotNull
    public final AdPlaybackState a() {
        return this.f33916b;
    }

    public final void b() {
        this.f33915a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f33916b = NONE;
    }

    public final void a(@Nullable AdsLoader.EventListener eventListener) {
        this.f33915a = eventListener;
    }

    public final void a(@NotNull AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        this.f33916b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f33915a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
