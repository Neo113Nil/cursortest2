package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h90 f34932a;

    public /* synthetic */ y80(C2286v2 c2286v2) {
        this(c2286v2, new h90(c2286v2));
    }

    @NotNull
    public final C2256ti a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull pz1 nativeAdPrivate, @NotNull List preloadedDivKitDesigns, @NotNull ViewGroup container, @NotNull dt nativeAdEventListener, @NotNull ViewTreeObserver.OnPreDrawListener preDrawListener, @NotNull fe2 videoEventController) {
        Context context2;
        nq0 nq0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(preDrawListener, "preDrawListener");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        g90 a4 = this.f34932a.a(context, preloadedDivKitDesigns);
        if (a4 != null) {
            context2 = context;
            nq0Var = a4.a(context2, adResponse, nativeAdPrivate, nativeAdEventListener, videoEventController);
        } else {
            context2 = context;
            nq0Var = null;
        }
        return new C2256ti(new C2233si(context2, container, CollectionsKt.listOfNotNull(nq0Var), preDrawListener));
    }

    public y80(@NotNull C2286v2 adConfiguration, @NotNull h90 designProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(designProvider, "designProvider");
        this.f34932a = designProvider;
    }
}
