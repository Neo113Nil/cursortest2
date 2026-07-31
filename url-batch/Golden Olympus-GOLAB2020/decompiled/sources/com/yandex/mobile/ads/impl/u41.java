package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.yandex.mobile.ads.impl.C2360y7;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a41 f32835a;

    public /* synthetic */ u41(Context context) {
        this(context, new a41(context));
    }

    @NotNull
    public final C2360y7<n61> a(@NotNull MediatedNativeAd mediatedNativeAd, @NotNull Map<String, Bitmap> imageValues, @NotNull zq1 responseNativeType) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        return new C2360y7.a().a((C2360y7.a) new n61(CollectionsKt.listOf(new u31(responseNativeType, this.f32835a.a(mediatedNativeAd.getMediatedNativeAdAssets(), imageValues), null, null, null, null, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null)), CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, new HashMap(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null)).a();
    }

    public u41(@NotNull Context context, @NotNull a41 nativeAdAssetsConverter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssetsConverter, "nativeAdAssetsConverter");
        this.f32835a = nativeAdAssetsConverter;
    }
}
