package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k21;
import com.yandex.mobile.ads.impl.vt1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d21 implements eg0 {
    @Override // com.yandex.mobile.ads.impl.eg0
    @NotNull
    public final dg0 a(@NotNull C2348xi parentHtmlWebView, @NotNull vt1.b htmlWebViewListener, @NotNull ke2 videoLifecycleListener, @NotNull xj0 impressionListener) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        c21 c21Var = new c21(parentHtmlWebView, htmlWebViewListener, videoLifecycleListener, impressionListener, new k21.a(htmlWebViewListener), new z11(parentHtmlWebView));
        c21Var.a(htmlWebViewListener);
        return c21Var;
    }

    @Override // com.yandex.mobile.ads.impl.eg0
    @NotNull
    public final vc0 a(@NotNull ed0 parentHtmlWebView, @NotNull wc0 htmlWebViewListener, @NotNull ad0 rewardListener, @NotNull mc0 onCloseButtonListener, @NotNull ad0 impressionListener) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(rewardListener, "rewardListener");
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        b21 b21Var = new b21(parentHtmlWebView, htmlWebViewListener, rewardListener, onCloseButtonListener, impressionListener, new k21.a(htmlWebViewListener), new z11(parentHtmlWebView));
        b21Var.a(htmlWebViewListener);
        return b21Var;
    }

    @Override // com.yandex.mobile.ads.impl.eg0
    @NotNull
    public final dg0 a(@NotNull j21 parentHtmlWebView, @NotNull jg0 htmlWebViewListener, @NotNull fe2 videoLifecycleListener, @NotNull a21 impressionListener, @NotNull a21 rewardListener, @NotNull a21 onCloseButtonListener) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        Intrinsics.checkNotNullParameter(rewardListener, "rewardListener");
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        i21 i21Var = new i21(parentHtmlWebView, htmlWebViewListener, videoLifecycleListener, impressionListener, rewardListener, onCloseButtonListener, new k21.a(htmlWebViewListener), new z11(parentHtmlWebView));
        i21Var.a(htmlWebViewListener);
        return i21Var;
    }
}
