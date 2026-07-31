package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ix0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ri0 f27408a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xx0 f27409b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final u41 f27410c;

    public interface a {
        void a(@NotNull C2360y7<n61> c2360y7);
    }

    public static final class b implements nj0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediatedNativeAd f27412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ zq1 f27413c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f27414d;

        b(MediatedNativeAd mediatedNativeAd, zq1 zq1Var, a aVar) {
            this.f27412b = mediatedNativeAd;
            this.f27413c = zq1Var;
            this.f27414d = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.nj0
        public final void a(@NotNull String url, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // com.yandex.mobile.ads.impl.nj0
        public final void a(@NotNull Map<String, Bitmap> images) {
            Intrinsics.checkNotNullParameter(images, "images");
            ix0.a(ix0.this, this.f27412b, images, this.f27413c, this.f27414d);
        }
    }

    public /* synthetic */ ix0(Context context, ri0 ri0Var, xx0 xx0Var) {
        this(context, ri0Var, xx0Var, new u41(context));
    }

    public static final void a(ix0 ix0Var, MediatedNativeAd mediatedNativeAd, Map map, zq1 zq1Var, a aVar) {
        aVar.a(ix0Var.f27410c.a(mediatedNativeAd, map, zq1Var));
    }

    public ix0(@NotNull Context context, @NotNull ri0 imageLoadManager, @NotNull xx0 mediatedImagesDataExtractor, @NotNull u41 nativeAdConverter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageLoadManager, "imageLoadManager");
        Intrinsics.checkNotNullParameter(mediatedImagesDataExtractor, "mediatedImagesDataExtractor");
        Intrinsics.checkNotNullParameter(nativeAdConverter, "nativeAdConverter");
        this.f27408a = imageLoadManager;
        this.f27409b = mediatedImagesDataExtractor;
        this.f27410c = nativeAdConverter;
    }

    public final void a(@NotNull MediatedNativeAd mediatedNativeAd, @NotNull zq1 responseNativeType, @NotNull List<MediatedNativeAdImage> mediatedImages, @NotNull a listener) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(mediatedImages, "mediatedImages");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f27408a.a(this.f27409b.a(mediatedImages), new b(mediatedNativeAd, responseNativeType, listener));
    }
}
