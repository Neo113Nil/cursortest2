package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wm2 implements SkipInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dd2 f34130a;

    public wm2(@NotNull dd2 skipInfo) {
        Intrinsics.checkNotNullParameter(skipInfo, "skipInfo");
        this.f34130a = skipInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm2) && Intrinsics.areEqual(this.f34130a, ((wm2) obj).f34130a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f34130a.a();
    }

    public final int hashCode() {
        return this.f34130a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexSkipInfo(skipInfo=" + this.f34130a + ")";
    }
}
