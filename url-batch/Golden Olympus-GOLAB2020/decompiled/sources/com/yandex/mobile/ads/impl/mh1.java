package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2396zk f29106a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2263u2 f29107b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2242t4 f29108c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2311w4 f29109d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1963h4 f29110e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ni1 f29111f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final r60 f29112g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final tf2 f29113h;

    /* renamed from: i, reason: collision with root package name */
    private int f29114i;

    /* renamed from: j, reason: collision with root package name */
    private int f29115j;

    public mh1(@NotNull C2396zk bindingControllerHolder, @NotNull li1 playerStateController, @NotNull C2384z8 adStateDataController, @NotNull be2 videoCompletedNotifier, @NotNull z70 fakePositionConfigurator, @NotNull C2263u2 adCompletionListener, @NotNull C2242t4 adPlaybackConsistencyManager, @NotNull C2311w4 adPlaybackStateController, @NotNull C1963h4 adInfoStorage, @NotNull ni1 playerStateHolder, @NotNull r60 playerProvider, @NotNull tf2 videoStateUpdateController) {
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
        this.f29106a = bindingControllerHolder;
        this.f29107b = adCompletionListener;
        this.f29108c = adPlaybackConsistencyManager;
        this.f29109d = adPlaybackStateController;
        this.f29110e = adInfoStorage;
        this.f29111f = playerStateHolder;
        this.f29112g = playerProvider;
        this.f29113h = videoStateUpdateController;
        this.f29114i = -1;
        this.f29115j = -1;
    }

    public final void a() {
        boolean z4;
        Player a4 = this.f29112g.a();
        if (!this.f29106a.b() || a4 == null) {
            return;
        }
        this.f29113h.a(a4);
        boolean c4 = this.f29111f.c();
        boolean isPlayingAd = a4.isPlayingAd();
        int currentAdGroupIndex = a4.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = a4.getCurrentAdIndexInAdGroup();
        this.f29111f.a(isPlayingAd);
        int i4 = isPlayingAd ? currentAdGroupIndex : this.f29114i;
        int i5 = this.f29115j;
        this.f29115j = currentAdIndexInAdGroup;
        this.f29114i = currentAdGroupIndex;
        C1843c4 c1843c4 = new C1843c4(i4, i5);
        on0 a5 = this.f29110e.a(c1843c4);
        if (c4) {
            AdPlaybackState a6 = this.f29109d.a();
            if ((a6.adGroupCount <= i4 || i4 == -1 || a6.getAdGroup(i4).timeUs != Long.MIN_VALUE || a4.isPlaying()) && (currentAdIndexInAdGroup == -1 || i5 < currentAdIndexInAdGroup)) {
                z4 = true;
                if (a5 != null && z4) {
                    this.f29107b.a(c1843c4, a5);
                }
                this.f29108c.a(a4, c4);
            }
        }
        z4 = false;
        if (a5 != null) {
            this.f29107b.a(c1843c4, a5);
        }
        this.f29108c.a(a4, c4);
    }
}
