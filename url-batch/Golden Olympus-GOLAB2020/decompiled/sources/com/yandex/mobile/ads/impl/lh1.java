package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2373yk f28582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2240t2 f28583b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2219s4 f28584c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2288v4 f28585d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1939g4 f28586e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final mi1 f28587f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final q60 f28588g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final sf2 f28589h;

    /* renamed from: i, reason: collision with root package name */
    private int f28590i;

    /* renamed from: j, reason: collision with root package name */
    private int f28591j;

    public lh1(@NotNull C2373yk bindingControllerHolder, @NotNull ki1 playerStateController, @NotNull C2361y8 adStateDataController, @NotNull ae2 videoCompletedNotifier, @NotNull y70 fakePositionConfigurator, @NotNull C2240t2 adCompletionListener, @NotNull C2219s4 adPlaybackConsistencyManager, @NotNull C2288v4 adPlaybackStateController, @NotNull C1939g4 adInfoStorage, @NotNull mi1 playerStateHolder, @NotNull q60 playerProvider, @NotNull sf2 videoStateUpdateController) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(fakePositionConfigurator, "fakePositionConfigurator");
        Intrinsics.checkNotNullParameter(adCompletionListener, "adCompletionListener");
        Intrinsics.checkNotNullParameter(adPlaybackConsistencyManager, "adPlaybackConsistencyManager");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(videoStateUpdateController, "videoStateUpdateController");
        this.f28582a = bindingControllerHolder;
        this.f28583b = adCompletionListener;
        this.f28584c = adPlaybackConsistencyManager;
        this.f28585d = adPlaybackStateController;
        this.f28586e = adInfoStorage;
        this.f28587f = playerStateHolder;
        this.f28588g = playerProvider;
        this.f28589h = videoStateUpdateController;
        this.f28590i = -1;
        this.f28591j = -1;
    }

    public final void a() {
        boolean z4;
        Player a4 = this.f28588g.a();
        if (!this.f28582a.b() || a4 == null) {
            return;
        }
        this.f28589h.a(a4);
        boolean c4 = this.f28587f.c();
        boolean isPlayingAd = a4.isPlayingAd();
        int currentAdGroupIndex = a4.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = a4.getCurrentAdIndexInAdGroup();
        this.f28587f.a(isPlayingAd);
        int i4 = isPlayingAd ? currentAdGroupIndex : this.f28590i;
        int i5 = this.f28591j;
        this.f28591j = currentAdIndexInAdGroup;
        this.f28590i = currentAdGroupIndex;
        C1819b4 c1819b4 = new C1819b4(i4, i5);
        on0 a5 = this.f28586e.a(c1819b4);
        if (c4) {
            AdPlaybackState a6 = this.f28585d.a();
            if ((a6.adGroupCount <= i4 || i4 == -1 || a6.getAdGroup(i4).timeUs != Long.MIN_VALUE || a4.isPlaying()) && (currentAdIndexInAdGroup == -1 || i5 < currentAdIndexInAdGroup)) {
                z4 = true;
                if (a5 != null && z4) {
                    this.f28583b.a(c1819b4, a5);
                }
                this.f28584c.a(a4, c4);
            }
        }
        z4 = false;
        if (a5 != null) {
            this.f28583b.a(c1819b4, a5);
        }
        this.f28584c.a(a4, c4);
    }
}
