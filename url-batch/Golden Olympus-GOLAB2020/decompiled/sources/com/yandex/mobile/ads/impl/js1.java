package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class js1 implements s00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fs1 f27819a;

    public js1(@NotNull C2286v2 adConfiguration, @NotNull InterfaceC1912f1 adActivityListener, @NotNull fs1 rewardedDivKitDesignCreatorProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(rewardedDivKitDesignCreatorProvider, "rewardedDivKitDesignCreatorProvider");
        this.f27819a = rewardedDivKitDesignCreatorProvider;
    }

    @Override // com.yandex.mobile.ads.impl.s00
    @NotNull
    public final List<td0> a(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull C1792a1 eventController, @NotNull sv debugEventsReporter, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull ds1 closeVerificationController, @NotNull t42 timeProviderContainer, @NotNull a20 divKitActionHandlerDelegate, @Nullable q20 q20Var, @Nullable C2243t5 c2243t5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        ArrayList arrayList = new ArrayList();
        u20 a4 = this.f27819a.a(context, adResponse, nativeAdPrivate, eventController, adCompleteListener, closeVerificationController, timeProviderContainer, divKitActionHandlerDelegate, q20Var, c2243t5);
        if (a4 != null) {
            arrayList.add(a4);
        }
        return arrayList;
    }
}
