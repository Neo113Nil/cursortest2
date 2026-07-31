package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2035k5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2057l3 f28051a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jn0 f28052b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1963h4 f28053c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2311w4 f28054d;

    public C2035k5(@NotNull C2384z8 adStateDataController, @NotNull C2057l3 adGroupIndexProvider, @NotNull jn0 instreamSourceUrlProvider) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(adGroupIndexProvider, "adGroupIndexProvider");
        Intrinsics.checkNotNullParameter(instreamSourceUrlProvider, "instreamSourceUrlProvider");
        this.f28051a = adGroupIndexProvider;
        this.f28052b = instreamSourceUrlProvider;
        this.f28053c = adStateDataController.a();
        this.f28054d = adStateDataController.c();
    }

    public final void a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        fn0 mediaFile = videoAd.g();
        C1843c4 c1843c4 = new C1843c4(this.f28051a.a(mediaFile.a()), videoAd.b().a() - 1);
        this.f28053c.a(c1843c4, videoAd);
        AdPlaybackState a4 = this.f28054d.a();
        if (a4.isAdInErrorState(c1843c4.a(), c1843c4.b())) {
            return;
        }
        AdPlaybackState withAdCount = a4.withAdCount(c1843c4.a(), videoAd.b().b());
        Intrinsics.checkNotNullExpressionValue(withAdCount, "withAdCount(...)");
        this.f28052b.getClass();
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        AdPlaybackState withAdUri = withAdCount.withAdUri(c1843c4.a(), c1843c4.b(), Uri.parse(mediaFile.getUrl()));
        Intrinsics.checkNotNullExpressionValue(withAdUri, "withAdUri(...)");
        this.f28054d.a(withAdUri);
    }
}
