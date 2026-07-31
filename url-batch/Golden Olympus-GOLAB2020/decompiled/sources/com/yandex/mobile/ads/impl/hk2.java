package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hk2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mk2 f26787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final md2 f26788b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ck2 f26789c;

    public /* synthetic */ hk2(Context context, bb2 bb2Var) {
        this(context, bb2Var, new mk2(bb2Var), new md2(), new ck2(context, bb2Var));
    }

    @NotNull
    public final List<bb2> a(@NotNull List<bb2> videoAds) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        kk2 a4 = this.f26787a.a();
        if (a4 == null) {
            return videoAds;
        }
        if (!a4.a()) {
            this.f26788b.getClass();
            videoAds = md2.a(videoAds).a();
        }
        if (!a4.b()) {
            videoAds = CollectionsKt.take(videoAds, 1);
        }
        return this.f26789c.a(videoAds);
    }

    public hk2(@NotNull Context context, @NotNull bb2 wrapperAd, @NotNull mk2 wrapperConfigurationProvider, @NotNull md2 wrappersProviderFactory, @NotNull ck2 wrappedVideoAdCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(wrapperConfigurationProvider, "wrapperConfigurationProvider");
        Intrinsics.checkNotNullParameter(wrappersProviderFactory, "wrappersProviderFactory");
        Intrinsics.checkNotNullParameter(wrappedVideoAdCreator, "wrappedVideoAdCreator");
        this.f26787a = wrapperConfigurationProvider;
        this.f26788b = wrappersProviderFactory;
        this.f26789c = wrappedVideoAdCreator;
    }
}
