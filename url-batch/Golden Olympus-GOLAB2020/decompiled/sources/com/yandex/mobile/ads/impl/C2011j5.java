package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2011j5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2033k3 f27478a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jn0 f27479b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1939g4 f27480c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2288v4 f27481d;

    public C2011j5(@NotNull C2361y8 adStateDataController, @NotNull C2033k3 adGroupIndexProvider, @NotNull jn0 instreamSourceUrlProvider) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(adGroupIndexProvider, "adGroupIndexProvider");
        Intrinsics.checkNotNullParameter(instreamSourceUrlProvider, "instreamSourceUrlProvider");
        this.f27478a = adGroupIndexProvider;
        this.f27479b = instreamSourceUrlProvider;
        this.f27480c = adStateDataController.a();
        this.f27481d = adStateDataController.c();
    }

    public final void a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        fn0 mediaFile = videoAd.g();
        C1819b4 c1819b4 = new C1819b4(this.f27478a.a(mediaFile.a()), videoAd.b().a() - 1);
        this.f27480c.a(c1819b4, videoAd);
        AdPlaybackState a4 = this.f27481d.a();
        if (a4.isAdInErrorState(c1819b4.a(), c1819b4.b())) {
            return;
        }
        AdPlaybackState withAdCount = a4.withAdCount(c1819b4.a(), videoAd.b().b());
        Intrinsics.checkNotNullExpressionValue(withAdCount, "withAdCount(...)");
        this.f27479b.getClass();
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        AdPlaybackState withAvailableAdMediaItem = withAdCount.withAvailableAdMediaItem(c1819b4.a(), c1819b4.b(), MediaItem.fromUri(Uri.parse(mediaFile.getUrl())));
        Intrinsics.checkNotNullExpressionValue(withAvailableAdMediaItem, "withAvailableAdMediaItem(...)");
        this.f27481d.a(withAvailableAdMediaItem);
    }
}
