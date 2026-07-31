package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k21;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b21 extends k21 implements vc0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b21(@NotNull ed0 parentHtmlWebView, @NotNull wc0 htmlWebViewListener, @NotNull ad0 mobileAdsSchemeRewardListener, @NotNull mc0 onCloseButtonListener, @NotNull ad0 impressionListener, @NotNull k21.a htmlWebViewMraidListener, @NotNull z11 mraidController) {
        super(parentHtmlWebView, htmlWebViewListener, htmlWebViewMraidListener, mraidController);
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        Intrinsics.checkNotNullParameter(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        Intrinsics.checkNotNullParameter(mraidController, "mraidController");
        mraidController.a(onCloseButtonListener);
        mraidController.a((f11) mobileAdsSchemeRewardListener);
        mraidController.a((e11) impressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.vc0
    public final void a() {
        b().b();
    }
}
