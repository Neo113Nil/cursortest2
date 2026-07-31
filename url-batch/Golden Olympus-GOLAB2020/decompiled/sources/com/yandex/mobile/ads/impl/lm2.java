package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lm2 implements NativeAdMedia {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jt f28665a;

    public lm2(@NotNull jt media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f28665a = media;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm2) && Intrinsics.areEqual(this.f28665a, ((lm2) obj).f28665a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdMedia
    public final float getAspectRatio() {
        return this.f28665a.a();
    }

    public final int hashCode() {
        return this.f28665a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexNativeAdMediaAdapter(media=" + this.f28665a + ")";
    }
}
