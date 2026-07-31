package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdMedia;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class iu0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final li0 f27391a;

    public iu0(@NotNull li0 imageAssetConverter) {
        Intrinsics.checkNotNullParameter(imageAssetConverter, "imageAssetConverter");
        this.f27391a = imageAssetConverter;
    }

    @Nullable
    public final mw0 a(@NotNull Map<String, Bitmap> imageValues, @Nullable MediatedNativeAdImage mediatedNativeAdImage, @Nullable MediatedNativeAdMedia mediatedNativeAdMedia) {
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        eu0 eu0Var = mediatedNativeAdMedia != null ? new eu0(null, mediatedNativeAdMedia.getAspectRatio()) : null;
        ej0 a4 = this.f27391a.a(imageValues, mediatedNativeAdImage);
        List mutableListOf = a4 != null ? CollectionsKt.mutableListOf(a4) : null;
        if (eu0Var == null && mutableListOf == null) {
            return null;
        }
        return new mw0(eu0Var, null, mutableListOf);
    }
}
