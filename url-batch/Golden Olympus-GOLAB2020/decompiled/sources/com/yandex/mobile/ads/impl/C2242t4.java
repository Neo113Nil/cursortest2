package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2242t4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z70 f32146a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final be2 f32147b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1824b9 f32148c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2311w4 f32149d;

    public C2242t4(@NotNull C2384z8 adStateDataController, @NotNull z70 fakePositionConfigurator, @NotNull be2 videoCompletedNotifier, @NotNull C1824b9 adStateHolder, @NotNull C2311w4 adPlaybackStateController) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(fakePositionConfigurator, "fakePositionConfigurator");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        this.f32146a = fakePositionConfigurator;
        this.f32147b = videoCompletedNotifier;
        this.f32148c = adStateHolder;
        this.f32149d = adPlaybackStateController;
    }

    public final void a(@NotNull Player player, boolean z4) {
        Intrinsics.checkNotNullParameter(player, "player");
        boolean b4 = this.f32147b.b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState a4 = this.f32149d.a();
            long contentPosition = player.getContentPosition();
            long contentDuration = player.getContentDuration();
            if (contentDuration == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = a4.getAdGroupIndexForPositionUs(timeUnit.toMicros(contentPosition), timeUnit.toMicros(contentDuration));
            }
        }
        boolean b5 = this.f32148c.b();
        if (b4 || z4 || currentAdGroupIndex == -1 || b5) {
            return;
        }
        AdPlaybackState a5 = this.f32149d.a();
        if (a5.getAdGroup(currentAdGroupIndex).timeUs == Long.MIN_VALUE) {
            this.f32147b.a();
        } else {
            this.f32146a.a(a5, currentAdGroupIndex);
        }
    }
}
