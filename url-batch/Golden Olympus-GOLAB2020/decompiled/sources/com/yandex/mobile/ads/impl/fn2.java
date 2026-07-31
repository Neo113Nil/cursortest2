package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import com.yandex.mobile.ads.video.playback.model.VideoAdInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fn2 implements VideoAd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final on0 f25876a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pb2 f25877b;

    public fn2(@NotNull on0 videoAd, @NotNull pb2 videoAdInfoConverter) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(videoAdInfoConverter, "videoAdInfoConverter");
        this.f25876a = videoAd;
        this.f25877b = videoAdInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2)) {
            return false;
        }
        fn2 fn2Var = (fn2) obj;
        return Intrinsics.areEqual(this.f25876a, fn2Var.f25876a) && Intrinsics.areEqual(this.f25877b, fn2Var.f25877b);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final VideoAdInfo getAdInfo() {
        pb2 pb2Var = this.f25877b;
        kl0 instreamAdInfo = this.f25876a.a();
        pb2Var.getClass();
        Intrinsics.checkNotNullParameter(instreamAdInfo, "instreamAdInfo");
        return new VideoAdInfo(instreamAdInfo.a(), instreamAdInfo.e(), instreamAdInfo.d(), instreamAdInfo.f(), instreamAdInfo.c(), instreamAdInfo.b());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final AdPodInfo getAdPodInfo() {
        return new al2(this.f25876a.b());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final long getDuration() {
        return this.f25876a.c();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final VideoAdExtensions getExtensions() {
        return new gn2(this.f25876a.d());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @Nullable
    public final String getInfo() {
        return this.f25876a.a().f();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final MediaFile getMediaFile() {
        return new fm2(this.f25876a.g());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final List<MediaFile> getMediaFiles() {
        List<fn0> f4 = this.f25876a.f();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(f4, 10));
        Iterator<T> it = f4.iterator();
        while (it.hasNext()) {
            arrayList.add(new fm2((fn0) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @Nullable
    public final SkipInfo getSkipInfo() {
        dd2 h4 = this.f25876a.h();
        if (h4 != null) {
            return new wm2(h4);
        }
        return null;
    }

    public final int hashCode() {
        return this.f25877b.hashCode() + (this.f25876a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "YandexVideoAd(videoAd=" + this.f25876a + ", videoAdInfoConverter=" + this.f25877b + ")";
    }
}
