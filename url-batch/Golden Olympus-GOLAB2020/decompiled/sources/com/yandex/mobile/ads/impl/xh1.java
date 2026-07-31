package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2288v4 f34566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ii1 f34567b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qr0 f34568c;

    public xh1(@NotNull C2288v4 adPlaybackStateController, @NotNull lj1 positionProviderHolder, @NotNull de2 videoDurationHolder, @NotNull ii1 playerStateChangedListener, @NotNull qr0 loadingAdGroupIndexProvider) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateChangedListener, "playerStateChangedListener");
        Intrinsics.checkNotNullParameter(loadingAdGroupIndexProvider, "loadingAdGroupIndexProvider");
        this.f34566a = adPlaybackStateController;
        this.f34567b = playerStateChangedListener;
        this.f34568c = loadingAdGroupIndexProvider;
    }

    public final void a(int i4, @NotNull Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (i4 == 2 && !player.isPlayingAd()) {
            AdPlaybackState a4 = this.f34566a.a();
            int a5 = this.f34568c.a(a4);
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
        this.f34567b.a(player.getPlayWhenReady(), i4);
    }
}
