package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f28700a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f28701b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28702c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x20 f28703d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bp f28704e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final q41 f28705f;

    public /* synthetic */ lp0(C2286v2 c2286v2, InterfaceC1912f1 interfaceC1912f1, int i4) {
        this(c2286v2, interfaceC1912f1, i4, new x20(), new sh2(), new s41());
    }

    @Nullable
    public final u20 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull f61 nativeAdPrivate, @NotNull C1792a1 adActivityEventController, @NotNull mr contentCloseListener, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull sv debugEventsReporter, @NotNull a20 divKitActionHandlerDelegate, @NotNull t42 timeProviderContainer, @Nullable q20 q20Var, @Nullable C2243t5 c2243t5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        try {
            this.f28703d.getClass();
            if (!x20.a(context) || q20Var == null) {
                return null;
            }
            return new u20(q20Var.b(), this.f28700a, new nq(new sp(adResponse, adActivityEventController, this.f28704e, contentCloseListener, this.f28705f, debugEventsReporter, timeProviderContainer), new nr(adResponse, adActivityEventController, adCompleteListener, nativeAdPrivate.b(), timeProviderContainer, q20Var), new kz1(c2243t5, adActivityEventController, this.f28705f, bz1.a(c2243t5))), this.f28701b, divKitActionHandlerDelegate, this.f28702c);
        } catch (Throwable unused) {
            return null;
        }
    }

    public lp0(@NotNull C2286v2 adConfiguration, @NotNull InterfaceC1912f1 adActivityListener, int i4, @NotNull x20 divKitIntegrationValidator, @NotNull bp closeAppearanceController, @NotNull q41 nativeAdControlViewProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(divKitIntegrationValidator, "divKitIntegrationValidator");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        this.f28700a = adConfiguration;
        this.f28701b = adActivityListener;
        this.f28702c = i4;
        this.f28703d = divKitIntegrationValidator;
        this.f28704e = closeAppearanceController;
        this.f28705f = nativeAdControlViewProvider;
    }
}
