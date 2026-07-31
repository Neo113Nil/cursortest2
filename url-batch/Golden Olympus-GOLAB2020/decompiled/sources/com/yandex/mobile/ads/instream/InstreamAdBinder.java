package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.bl1;
import com.yandex.mobile.ads.impl.bm2;
import com.yandex.mobile.ads.impl.hn2;
import com.yandex.mobile.ads.impl.jn2;
import com.yandex.mobile.ads.impl.rs;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.vl2;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.xl2;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class InstreamAdBinder extends bl1 implements w72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bm2 f35837a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rs f35838b;

    public InstreamAdBinder(@NotNull Context context, @NotNull InstreamAd instreamAd, @NotNull InstreamAdPlayer instreamAdPlayer, @NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        um2 um2Var = new um2(context);
        bm2 bm2Var = new bm2();
        this.f35837a = bm2Var;
        this.f35838b = new rs(context, um2Var, xs.a(instreamAd), new xl2(instreamAdPlayer, bm2Var), new jn2(videoPlayer));
    }

    public final void bind(@NotNull InstreamAdView instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        this.f35838b.a(instreamAdView, CollectionsKt.emptyList());
    }

    @Override // com.yandex.mobile.ads.impl.w72
    public void invalidateAdPlayer() {
        this.f35838b.invalidateAdPlayer();
    }

    public final void invalidateVideoPlayer() {
        this.f35838b.a();
    }

    public final void prepareAd() {
        this.f35838b.b();
    }

    public final void setInstreamAdListener(@Nullable InstreamAdListener instreamAdListener) {
        this.f35838b.a(instreamAdListener != null ? new vl2(instreamAdListener) : null);
    }

    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f35838b.a(videoAdPlaybackListener != null ? new hn2(videoAdPlaybackListener, this.f35837a) : null);
    }

    public final void unbind() {
        this.f35838b.e();
    }
}
