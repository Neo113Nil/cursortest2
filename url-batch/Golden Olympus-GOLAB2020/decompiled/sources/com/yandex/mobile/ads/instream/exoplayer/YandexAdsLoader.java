package com.yandex.mobile.ads.instream.exoplayer;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.yandex.mobile.ads.impl.C2248ta;
import com.yandex.mobile.ads.impl.am2;
import com.yandex.mobile.ads.impl.bm2;
import com.yandex.mobile.ads.impl.el1;
import com.yandex.mobile.ads.impl.hn2;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class YandexAdsLoader extends el1 {

    @NotNull
    public static final String AD_TAG_URI = "yandex://ad_tag";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f35849a = new a(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lm0 f35850b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bm2 f35851c;

    @Metadata
    public static final class a {
        public /* synthetic */ a(int i4) {
            this();
        }

        private a() {
        }
    }

    public YandexAdsLoader(@NotNull Context context, @NotNull InstreamAdRequestConfiguration requestConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        this.f35850b = new C2248ta(context, new um2(context), new am2(requestConfiguration)).a();
        this.f35851c = new bm2();
    }

    public void handlePrepareComplete(@NotNull AdsMediaSource adsMediaSource, int i4, int i5) {
        Intrinsics.checkNotNullParameter(adsMediaSource, "adsMediaSource");
        this.f35850b.a(i4, i5);
    }

    public void handlePrepareError(@NotNull AdsMediaSource adsMediaSource, int i4, int i5, @NotNull IOException exception) {
        Intrinsics.checkNotNullParameter(adsMediaSource, "adsMediaSource");
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f35850b.a(i4, i5, exception);
    }

    public void release() {
        this.f35850b.a();
    }

    public final void requestAds(@Nullable ViewGroup viewGroup) {
        this.f35850b.a(viewGroup, CollectionsKt.emptyList());
    }

    public void setPlayer(@Nullable Player player) {
        this.f35850b.a(player);
    }

    public void setSupportedContentTypes(@NotNull int... contentTypes) {
        Intrinsics.checkNotNullParameter(contentTypes, "contentTypes");
    }

    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f35850b.a(videoAdPlaybackListener != null ? new hn2(videoAdPlaybackListener, this.f35851c) : null);
    }

    public void start(@NotNull AdsMediaSource adsMediaSource, @NotNull DataSpec adTagDataSpec, @NotNull Object adPlaybackId, @NotNull AdViewProvider adViewProvider, @NotNull AdsLoader.EventListener eventListener) {
        Intrinsics.checkNotNullParameter(adsMediaSource, "adsMediaSource");
        Intrinsics.checkNotNullParameter(adTagDataSpec, "adTagDataSpec");
        Intrinsics.checkNotNullParameter(adPlaybackId, "adPlaybackId");
        Intrinsics.checkNotNullParameter(adViewProvider, "adViewProvider");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f35850b.a(eventListener, adViewProvider, adPlaybackId);
    }

    public void stop(@NotNull AdsMediaSource adsMediaSource, @NotNull AdsLoader.EventListener eventListener) {
        Intrinsics.checkNotNullParameter(adsMediaSource, "adsMediaSource");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f35850b.b();
    }
}
