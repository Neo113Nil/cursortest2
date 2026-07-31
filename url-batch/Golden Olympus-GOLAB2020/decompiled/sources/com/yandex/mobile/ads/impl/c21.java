package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k21;
import com.yandex.mobile.ads.impl.vt1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c21 extends k21 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(@NotNull C2348xi parentHtmlWebView, @NotNull vt1.b htmlWebViewListener, @NotNull ke2 videoLifecycleListener, @NotNull xj0 impressionListener, @NotNull k21.a htmlWebViewMraidListener, @NotNull z11 mraidController) {
        super(parentHtmlWebView, htmlWebViewListener, htmlWebViewMraidListener, mraidController);
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        Intrinsics.checkNotNullParameter(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        Intrinsics.checkNotNullParameter(mraidController, "mraidController");
        mraidController.a(videoLifecycleListener);
        mraidController.a(impressionListener);
    }
}
