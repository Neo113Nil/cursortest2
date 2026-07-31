package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2219s4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y70 f31582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ae2 f31583b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1800a9 f31584c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2288v4 f31585d;

    public C2219s4(@NotNull C2361y8 adStateDataController, @NotNull y70 fakePositionConfigurator, @NotNull ae2 videoCompletedNotifier, @NotNull C1800a9 adStateHolder, @NotNull C2288v4 adPlaybackStateController) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(fakePositionConfigurator, "fakePositionConfigurator");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        this.f31582a = fakePositionConfigurator;
        this.f31583b = videoCompletedNotifier;
        this.f31584c = adStateHolder;
        this.f31585d = adPlaybackStateController;
    }

    public final void a(@NotNull Player player, boolean z4) {
        Intrinsics.checkNotNullParameter(player, "player");
        boolean b4 = this.f31583b.b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState a4 = this.f31585d.a();
            long contentPosition = player.getContentPosition();
            long contentDuration = player.getContentDuration();
            if (contentDuration == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = a4.getAdGroupIndexForPositionUs(timeUnit.toMicros(contentPosition), timeUnit.toMicros(contentDuration));
            }
        }
        boolean b5 = this.f31584c.b();
        if (b4 || z4 || currentAdGroupIndex == -1 || b5) {
            return;
        }
        AdPlaybackState a5 = this.f31585d.a();
        if (a5.getAdGroup(currentAdGroupIndex).timeUs == Long.MIN_VALUE) {
            this.f31583b.a();
        } else {
            this.f31582a.a(a5, currentAdGroupIndex);
        }
    }
}
