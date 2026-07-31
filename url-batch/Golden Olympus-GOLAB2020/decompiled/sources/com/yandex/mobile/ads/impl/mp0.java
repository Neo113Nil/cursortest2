package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mp0 implements s00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f29200a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lp0 f29201b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r41 f29202c;

    public mp0(@NotNull C2286v2 adConfiguration, @NotNull InterfaceC1912f1 adActivityListener, @NotNull lp0 interstitialDivKitDesignCreatorProvider, @NotNull r41 nativeAdControlViewProviderById) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(interstitialDivKitDesignCreatorProvider, "interstitialDivKitDesignCreatorProvider");
        Intrinsics.checkNotNullParameter(nativeAdControlViewProviderById, "nativeAdControlViewProviderById");
        this.f29200a = adConfiguration;
        this.f29201b = interstitialDivKitDesignCreatorProvider;
        this.f29202c = nativeAdControlViewProviderById;
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
        sp a4 = new kp0(adResponse, eventController, contentCloseListener, new sh2()).a(this.f29202c, debugEventsReporter, timeProviderContainer);
        e01 c4 = this.f29200a.p().c();
        return CollectionsKt.filterNotNull(CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f29201b.a(context, adResponse, nativeAdPrivate, eventController, contentCloseListener, adCompleteListener, debugEventsReporter, divKitActionHandlerDelegate, timeProviderContainer, q20Var, c2243t5)), (Iterable) CollectionsKt.listOf((Object[]) new td0[]{new fj1(a4, c4, new iq()), new kq0(a4, c4, new nq1(), new iq()), new jq0(a4, c4, new nq1(), new iq())})));
    }
}
