package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f32107a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n41 f32108b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e51 f32109c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f91 f32110d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final z02 f32111e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final dj1 f32112f;

    public t02(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull n41 clickReporterCreator, @NotNull e51 nativeAdEventController, @NotNull v61 nativeAdViewAdapter, @NotNull f91 nativeOpenUrlHandlerCreator, @NotNull z02 socialMenuCreator, @NotNull dj1 popupLifecycleController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(clickReporterCreator, "clickReporterCreator");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        Intrinsics.checkNotNullParameter(socialMenuCreator, "socialMenuCreator");
        Intrinsics.checkNotNullParameter(popupLifecycleController, "popupLifecycleController");
        this.f32107a = adConfiguration;
        this.f32108b = clickReporterCreator;
        this.f32109c = nativeAdEventController;
        this.f32110d = nativeOpenUrlHandlerCreator;
        this.f32111e = socialMenuCreator;
        this.f32112f = popupLifecycleController;
    }

    public final void a(@NotNull View view, @NotNull k02 action) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        List<n02> c4 = action.c();
        if (c4.isEmpty()) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f32112f.a(this.f32111e.a(view, c4, new s02(new n62(new C1920f9(context, this.f32107a)), this.f32108b, c4, this.f32109c, this.f32110d, this.f32112f)), view);
    }
}
