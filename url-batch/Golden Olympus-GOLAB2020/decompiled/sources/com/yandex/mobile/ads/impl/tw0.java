package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jw0 f32715a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o21 f32716b;

    public /* synthetic */ tw0() {
        this(new jw0(), new o21());
    }

    @NotNull
    public final pv1 a(@NotNull CustomizableMediaView mediaView, @NotNull eu0 media, @NotNull xj0 impressionEventsObservable, @NotNull wb1 nativeWebViewController, @NotNull ww0 mediaViewRenderController) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Context context = mediaView.getContext();
        o21 o21Var = this.f32716b;
        Intrinsics.checkNotNull(context);
        o21Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        j21 mraidWebView = q21.f30646c.a(context).b(media);
        if (mraidWebView == null) {
            mraidWebView = new j21(context);
        }
        a21 k4 = mraidWebView.k();
        k4.a(impressionEventsObservable);
        k4.a((f11) nativeWebViewController);
        k4.a((re1) nativeWebViewController);
        this.f32715a.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        Context context2 = mediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!n80.a(context2, m80.f28942e)) {
            mediaView.removeAllViews();
        }
        mediaView.addView(mraidWebView, new FrameLayout.LayoutParams(-1, -1));
        l21 l21Var = new l21(mraidWebView);
        return new pv1(mediaView, l21Var, mediaViewRenderController, new lg2(l21Var));
    }

    public tw0(@NotNull jw0 mediaSubViewBinder, @NotNull o21 mraidWebViewFactory) {
        Intrinsics.checkNotNullParameter(mediaSubViewBinder, "mediaSubViewBinder");
        Intrinsics.checkNotNullParameter(mraidWebViewFactory, "mraidWebViewFactory");
        this.f32715a = mediaSubViewBinder;
        this.f32716b = mraidWebViewFactory;
    }
}
