package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.z61;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mt {
    @NotNull
    public static z61 a(@NotNull lt nativeBannerView) {
        Intrinsics.checkNotNullParameter(nativeBannerView, "nativeBannerView");
        return new z61(new z61.a(nativeBannerView, t71.f32235d, MapsKt.emptyMap()).a(nativeBannerView.getAgeView()).b(nativeBannerView.getBodyView()).c(nativeBannerView.getCallToActionView()).d(nativeBannerView.getDomainView()).a(nativeBannerView.getFaviconView()).b(nativeBannerView.getFeedbackView()).c(nativeBannerView.getIconView()).d(nativeBannerView.getImageView()).a(nativeBannerView.getMediaView()).a(nativeBannerView.getRatingView()).f(nativeBannerView.getReviewCountView()).g(nativeBannerView.getSponsoredView()).h(nativeBannerView.getTitleView()).i(nativeBannerView.getWarningView()));
    }
}
