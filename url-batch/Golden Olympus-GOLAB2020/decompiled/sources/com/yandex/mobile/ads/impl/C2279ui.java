package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2279ui {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2165pi f33138a;

    public /* synthetic */ C2279ui(C2286v2 c2286v2) {
        this(c2286v2, new C2165pi(c2286v2));
    }

    @NotNull
    public final C2256ti a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull f61 nativeAdPrivate, @NotNull vo0 container, @NotNull p71 nativeAdEventListener, @NotNull ViewTreeObserver.OnPreDrawListener preDrawListener, @NotNull fe2 videoEventController) {
        Context context2;
        nq0 nq0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(preDrawListener, "preDrawListener");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        C2142oi a4 = this.f33138a.a(context, nativeAdPrivate);
        if (a4 != null) {
            context2 = context;
            nq0Var = a4.a(context2, adResponse, nativeAdPrivate, nativeAdEventListener, videoEventController);
        } else {
            context2 = context;
            nq0Var = null;
        }
        return new C2256ti(new C2233si(context2, container, CollectionsKt.listOfNotNull(nq0Var), preDrawListener));
    }

    public C2279ui(@NotNull C2286v2 adConfiguration, @NotNull C2165pi designProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(designProvider, "designProvider");
        this.f33138a = designProvider;
    }
}
