package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2311w4 f35142a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ji1 f35143b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rr0 f35144c;

    public yh1(@NotNull C2311w4 adPlaybackStateController, @NotNull mj1 positionProviderHolder, @NotNull ee2 videoDurationHolder, @NotNull ji1 playerStateChangedListener, @NotNull rr0 loadingAdGroupIndexProvider) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateChangedListener, "playerStateChangedListener");
        Intrinsics.checkNotNullParameter(loadingAdGroupIndexProvider, "loadingAdGroupIndexProvider");
        this.f35142a = adPlaybackStateController;
        this.f35143b = playerStateChangedListener;
        this.f35144c = loadingAdGroupIndexProvider;
    }

    public final void a(int i4, @NotNull Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (i4 == 2 && !player.isPlayingAd()) {
            AdPlaybackState a4 = this.f35142a.a();
            int a5 = this.f35144c.a(a4);
            if (a5 == -1) {
                return;
            }
            AdPlaybackState.AdGroup adGroup = a4.getAdGroup(a5);
            Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
            int i5 = adGroup.count;
            if (i5 != -1 && i5 != 0 && adGroup.states[0] != 0) {
                return;
            }
        }
        this.f35143b.a(player.getPlayWhenReady(), i4);
    }
}
