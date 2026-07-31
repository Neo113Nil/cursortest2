package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class im2 implements NativeAdImage {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final et f27255a;

    public im2(@NotNull et image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f27255a = image;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im2) && Intrinsics.areEqual(this.f27255a, ((im2) obj).f27255a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    @Nullable
    public final Bitmap getBitmap() {
        return this.f27255a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getHeight() {
        return this.f27255a.b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getWidth() {
        return this.f27255a.d();
    }

    public final int hashCode() {
        return this.f27255a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f27255a + ")";
    }
}
