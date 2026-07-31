package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vt1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2280uj implements eg0 {
    @Override // com.yandex.mobile.ads.impl.eg0
    @NotNull
    public final dg0 a(@NotNull C2348xi parentHtmlWebView, @NotNull vt1.b htmlWebViewListener, @NotNull ke2 videoLifecycleListener, @NotNull xj0 impressionListener) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        C2257tj c2257tj = new C2257tj(parentHtmlWebView);
        c2257tj.a(htmlWebViewListener);
        return c2257tj;
    }

    @Override // com.yandex.mobile.ads.impl.eg0
    @NotNull
    public final vc0 a(@NotNull ed0 parentHtmlWebView, @NotNull wc0 htmlWebViewListener, @NotNull ad0 rewardListener, @NotNull mc0 onCloseButtonListener, @NotNull ad0 impressionListener) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(rewardListener, "rewardListener");
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        C2234sj c2234sj = new C2234sj(parentHtmlWebView);
        c2234sj.a(htmlWebViewListener);
        return c2234sj;
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
        C2257tj c2257tj = new C2257tj(parentHtmlWebView);
        c2257tj.a(htmlWebViewListener);
        return c2257tj;
    }
}
