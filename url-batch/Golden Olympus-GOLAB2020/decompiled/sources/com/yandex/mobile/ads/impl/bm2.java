package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bm2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<on0, VideoAd> f23870a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<VideoAd, on0> f23871b = new ConcurrentHashMap<>();

    @Nullable
    public final on0 a(@NotNull VideoAd yandexVideoAd) {
        Intrinsics.checkNotNullParameter(yandexVideoAd, "yandexVideoAd");
        on0 on0Var = this.f23871b.get(yandexVideoAd);
        if (on0Var == null) {
            po0.a("Incorrect state exception. The VideoAd provided to this specific InstreamAdPlayerListener is incorrect.\nPossible reasons: \n 1) Using the wrong instance of InstreamAdPlayerListener for callback notification\n 2) Notifying a callback for a VideoAd that has been released", new Object[0]);
        }
        return on0Var;
    }

    public final void b(@NotNull on0 coreVideoAd) {
        Intrinsics.checkNotNullParameter(coreVideoAd, "coreVideoAd");
        this.f23870a.remove(coreVideoAd);
    }

    public final void b(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f23871b.remove(videoAd);
    }

    @NotNull
    public final VideoAd a(@NotNull on0 coreVideoAd) {
        Intrinsics.checkNotNullParameter(coreVideoAd, "coreVideoAd");
        VideoAd videoAd = this.f23870a.get(coreVideoAd);
        if (videoAd != null) {
            return videoAd;
        }
        fn2 fn2Var = new fn2(coreVideoAd, new pb2());
        this.f23870a.put(coreVideoAd, fn2Var);
        this.f23871b.put(fn2Var, coreVideoAd);
        return fn2Var;
    }
}
