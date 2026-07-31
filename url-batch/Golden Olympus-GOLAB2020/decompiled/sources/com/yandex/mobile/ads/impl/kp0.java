package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f28298a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1792a1 f28299b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mr f28300c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bp f28301d;

    public kp0(@NotNull C2360y7<?> adResponse, @NotNull C1792a1 adActivityEventController, @NotNull mr contentCloseListener, @NotNull bp closeAppearanceController) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        this.f28298a = adResponse;
        this.f28299b = adActivityEventController;
        this.f28300c = contentCloseListener;
        this.f28301d = closeAppearanceController;
    }

    @NotNull
    public final sp a(@NotNull r41 nativeAdControlViewProvider, @NotNull sv debugEventsReporter, @NotNull t42 timeProviderContainer) {
        Intrinsics.checkNotNullParameter(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        return new sp(this.f28298a, this.f28299b, this.f28301d, this.f28300c, nativeAdControlViewProvider, debugEventsReporter, timeProviderContainer);
    }
}
