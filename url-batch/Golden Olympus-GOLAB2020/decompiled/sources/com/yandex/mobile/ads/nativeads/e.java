package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.f61;
import com.yandex.mobile.ads.impl.gm2;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.hm2;
import com.yandex.mobile.ads.impl.jm2;
import com.yandex.mobile.ads.impl.kt;
import com.yandex.mobile.ads.impl.mm2;
import com.yandex.mobile.ads.impl.nl2;
import com.yandex.mobile.ads.impl.nm2;
import com.yandex.mobile.ads.impl.t51;
import com.yandex.mobile.ads.impl.zq1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class e implements NativeAd, CustomClickable, com.yandex.mobile.ads.nativeads.video.a, h61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f61 f35900a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f35901b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mm2 f35902c;

    public /* synthetic */ e(f61 f61Var) {
        this(f61Var, new h(), new g(), new mm2());
    }

    @Override // com.yandex.mobile.ads.impl.h61
    @NotNull
    public final f61 a() {
        return this.f35900a;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@NotNull NativeAdImageLoadingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35900a.b(new jm2(listener));
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@NotNull NativeAdViewBinder viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        try {
            this.f35901b.getClass();
            this.f35900a.b(g.a(viewBinder));
        } catch (t51 e4) {
            throw new NativeAdException(e4.a(), e4);
        } catch (Throwable th) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof e) && Intrinsics.areEqual(((e) obj).f35900a, this.f35900a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NotNull
    public final NativeAdAssets getAdAssets() {
        return new gm2(this.f35900a.getAdAssets());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NotNull
    public final NativeAdType getAdType() {
        mm2 mm2Var = this.f35902c;
        zq1 responseNativeType = this.f35900a.getAdType();
        mm2Var.getClass();
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        int ordinal = responseNativeType.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? NativeAdType.CONTENT : NativeAdType.CONTENT : NativeAdType.MEDIA : NativeAdType.APP_INSTALL : NativeAdType.CONTENT;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @Nullable
    public final String getInfo() {
        return this.f35900a.getInfo();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    @Nullable
    public final com.yandex.mobile.ads.nativeads.video.b getNativeAdVideoController() {
        kt nativeAdVideoController = this.f35900a.getNativeAdVideoController();
        if (nativeAdVideoController != null) {
            return new nm2(nativeAdVideoController);
        }
        return null;
    }

    public int hashCode() {
        return this.f35900a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f35900a.loadImages();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@NotNull NativeAdImageLoadingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35900a.a(new jm2(listener));
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickable
    public final void setCustomClickHandler(@Nullable CustomClickHandler customClickHandler) {
        this.f35900a.a(customClickHandler != null ? new c(customClickHandler) : null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener) {
        this.f35900a.a(nativeAdEventListener instanceof ClosableNativeAdEventListener ? new nl2((ClosableNativeAdEventListener) nativeAdEventListener) : nativeAdEventListener != null ? new hm2(nativeAdEventListener) : null);
    }

    public e(@NotNull f61 nativeAdPrivate, @NotNull h nativePromoAdViewAdapter, @NotNull g nativeAdViewBinderAdapter, @NotNull mm2 nativeAdTypeConverter) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(nativePromoAdViewAdapter, "nativePromoAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeAdViewBinderAdapter, "nativeAdViewBinderAdapter");
        Intrinsics.checkNotNullParameter(nativeAdTypeConverter, "nativeAdTypeConverter");
        this.f35900a = nativeAdPrivate;
        this.f35901b = nativeAdViewBinderAdapter;
        this.f35902c = nativeAdTypeConverter;
    }
}
