package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s90 extends ca0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f31629a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f90 f31630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(@NotNull C2286v2 adConfiguration, @NotNull ViewGroup nativeAdView, @NotNull dt adEventListener, @NotNull fe2 videoEventController, @NotNull f90 feedItemBinder) {
        super(nativeAdView, 0);
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(feedItemBinder, "feedItemBinder");
        this.f31629a = nativeAdView;
        this.f31630b = feedItemBinder;
    }

    public final void a(@NotNull d90 feedItem) {
        Intrinsics.checkNotNullParameter(feedItem, "feedItem");
        f90 f90Var = this.f31630b;
        Context context = this.f31629a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f90Var.a(context, feedItem.a(), feedItem.c(), feedItem.b());
    }

    public final void a() {
        this.f31630b.b();
    }
}
