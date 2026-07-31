package com.yandex.mobile.ads.nativeads;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.t71;
import com.yandex.mobile.ads.impl.z61;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {
    @NotNull
    public static z61 a(@NotNull NativeAdViewBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        return new z61(new z61.a(binder.getNativeAdView(), t71.f32234c, MapsKt.emptyMap()).a(binder.getAgeView()).b(binder.getBodyView()).c(binder.getCallToActionView()).d(binder.getDomainView()).a(binder.getFaviconView()).b(binder.getFeedbackView()).c(binder.getIconView()).a((CustomizableMediaView) binder.getMediaView()).e(binder.getPriceView()).a(binder.getRatingView()).f(binder.getReviewCountView()).g(binder.getSponsoredView()).h(binder.getTitleView()).i(binder.getWarningView()));
    }
}
