package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.MediaFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fm2 implements MediaFile {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fn0 f25867a;

    public fm2(@NotNull fn0 mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        this.f25867a = mediaFile;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm2) && Intrinsics.areEqual(this.f25867a, ((fm2) obj).f25867a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f25867a.getAdHeight();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f25867a.getAdWidth();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    @Nullable
    public final String getApiFramework() {
        return this.f25867a.getApiFramework();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    @Nullable
    public final Integer getBitrate() {
        return this.f25867a.getBitrate();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    @Nullable
    public final String getMediaType() {
        return this.f25867a.getMediaType();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.gc2
    @NotNull
    public final String getUrl() {
        return this.f25867a.getUrl();
    }

    public final int hashCode() {
        return this.f25867a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexMediaFile(mediaFile=" + this.f25867a + ")";
    }
}
