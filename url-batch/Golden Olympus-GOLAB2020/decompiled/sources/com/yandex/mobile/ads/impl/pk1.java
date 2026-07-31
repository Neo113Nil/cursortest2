package com.yandex.mobile.ads.impl;

import com.yandex.div.core.view2.Div2View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q20 f30477a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Div2View f30478b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Cdo f30479c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final k20 f30480d;

    public pk1(@NotNull q20 divKitDesign, @NotNull Div2View preloadedDivView, @NotNull Cdo clickConnector, @NotNull k20 clickHandler) {
        Intrinsics.checkNotNullParameter(divKitDesign, "divKitDesign");
        Intrinsics.checkNotNullParameter(preloadedDivView, "preloadedDivView");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.f30477a = divKitDesign;
        this.f30478b = preloadedDivView;
        this.f30479c = clickConnector;
        this.f30480d = clickHandler;
    }

    @NotNull
    public final Cdo a() {
        return this.f30479c;
    }

    @NotNull
    public final k20 b() {
        return this.f30480d;
    }

    @NotNull
    public final q20 c() {
        return this.f30477a;
    }

    @NotNull
    public final Div2View d() {
        return this.f30478b;
    }
}
