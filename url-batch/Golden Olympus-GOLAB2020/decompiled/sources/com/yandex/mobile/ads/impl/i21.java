package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k21;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i21 extends k21 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i21(@NotNull j21 parentHtmlWebView, @NotNull jg0 htmlWebViewListener, @NotNull fe2 videoLifecycleListener, @NotNull a21 impressionListener, @NotNull a21 rewardListener, @NotNull a21 onCloseButtonListener, @NotNull k21.a htmlWebViewMraidListener, @NotNull z11 mraidController) {
        super(parentHtmlWebView, htmlWebViewListener, htmlWebViewMraidListener, mraidController);
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        Intrinsics.checkNotNullParameter(rewardListener, "rewardListener");
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        Intrinsics.checkNotNullParameter(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        Intrinsics.checkNotNullParameter(mraidController, "mraidController");
        mraidController.a(videoLifecycleListener);
        mraidController.a((e11) impressionListener);
        mraidController.a((f11) rewardListener);
        mraidController.a((re1) onCloseButtonListener);
    }
}
