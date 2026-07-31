package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gm2 implements NativeAdAssets {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f26236a;

    public gm2(@NotNull ct assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f26236a = assets;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm2) && Intrinsics.areEqual(this.f26236a, ((gm2) obj).f26236a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getAge() {
        return this.f26236a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getBody() {
        return this.f26236a.b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getCallToAction() {
        return this.f26236a.c();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getDomain() {
        return this.f26236a.d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdImage getFavicon() {
        et e4 = this.f26236a.e();
        if (e4 != null) {
            return new im2(e4);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdImage getIcon() {
        et g4 = this.f26236a.g();
        if (g4 != null) {
            return new im2(g4);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdImage getImage() {
        et h4 = this.f26236a.h();
        if (h4 != null) {
            return new im2(h4);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdMedia getMedia() {
        jt i4 = this.f26236a.i();
        if (i4 != null) {
            return new lm2(i4);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getPrice() {
        return this.f26236a.j();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final Float getRating() {
        return this.f26236a.k();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getReviewCount() {
        return this.f26236a.l();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getSponsored() {
        return this.f26236a.m();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getTitle() {
        return this.f26236a.n();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getWarning() {
        return this.f26236a.o();
    }

    public final int hashCode() {
        return this.f26236a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean isFeedbackAvailable() {
        return this.f26236a.f();
    }

    @NotNull
    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f26236a + ")";
    }
}
